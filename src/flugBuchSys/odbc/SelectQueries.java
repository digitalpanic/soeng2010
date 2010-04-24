package flugBuchSys.odbc;

import java.sql.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 * Diese Klasse Baut eine Verbindung zur Datenbank auf und Setzt ein Select
 * Statement ab.
 * 
 * Der Code beruht auf einer Übungsaufgabe aus der Vorlesung
 * SoftwareengeneeringI bei Prof. Dr. Zimmer WS2009 / 2010.
 * 
 * @author Florian Leicher - Gruppe 15
 * 
 */
public class SelectQueries {
	private static JTable SQLTable = null;

	// constructor: JTable auf Basis der SQL Query erstellen
	public SelectQueries(String SQLquery) {
		SQLTable = genSQLTable(SQLquery);
	}

	// JTable mit neuer SQL-Abfrage updaten
	public void updateTable(String SQLquery) {
		SQLTable = genSQLTable(SQLquery);
	}

	public JTable getSQLTable() {
		return SQLTable;
	}

	// Anhand des Ergebnisses der SQL-Abfrage wird eine neue JTable erstellt
	private static JTable genSQLTable(String SQLquery) {
		int columnCount = 0;
		int cnt = 1;

		// Initialisieren der JTable als View
		JTable tableview = new JTable();
		tableview.enableInputMethods(false);
		tableview.setDragEnabled(false);
		tableview.setColumnSelectionAllowed(false);
		tableview.setRowSelectionAllowed(true);
		tableview.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		// Initialisieren des DataModel
		DefaultTableModel model = (DefaultTableModel) tableview.getModel();

		// Initialisieren der Arraylist für die Erstellung des DataModel
		ArrayList<Object> rowData = new ArrayList<Object>();

		// // Initialisieren der Datenbankverbindung
		String sDbDriver = Statements.sDbDriver, sDbUrl = Statements.sDbUrl, sUsr = Statements.sUsr, sPwd = Statements.sPwd;

		// Initialisieren der Connection 'cn' mit 'null'.
		// Dies Muss hier geschehen, damit diese auch aus dem 'catch-Block'
		// beendet werden kann falls dies erfolderlich ist
		Connection cn = null;

		try {
			// Datenbank Connectionstring zusammenbauen und Verbindung zur
			// Datenbank aufbauen
			Class.forName(sDbDriver);
			cn = DriverManager.getConnection(sDbUrl, sUsr, sPwd);
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(SQLquery);

			// Größe des Ergebnisses herausfinden
			ResultSetMetaData rsmd = rs.getMetaData();
			columnCount = rsmd.getColumnCount();

			// Spalten zum DataModel hinzufügen
			for (int column = 1; column <= columnCount; column++) {
				model.addColumn(rsmd.getColumnLabel(column));
			}
			// Zeilen zum DataModel hinzufügen
			Object[] objects = new Object[columnCount];
			while (rs.next()) {
				cnt = 0;
				while (cnt < columnCount) {
					objects[cnt] = rs.getObject(cnt + 1);
					rowData.add(rs.getObject(cnt + 1));
					cnt++;
				}
				model.addRow(objects);
			}
			// Beenden der Verbindung
			cn.close();
			st.close();

			// Fehlerbehandlung
		} catch (SQLException e) {
			// Ausgabe der Fehlermeldung bei fehlerhaftem SQL
			JOptionPane.showMessageDialog(new JFrame(), e);
			System.out.println(e);
			try {
				// Veruschen die Verbindung zu beenden
				cn.close();
				// Verbindung abgebaut
			} catch (SQLException sqlexc) {
				// Verbindung konnte nicht geschlossen werden.
			} catch (NullPointerException nulexc) {
				// Es wurde keine Verbindung geoeffnet.
			}

		} catch (ClassNotFoundException ex) {
			JOptionPane.showMessageDialog(new JFrame(), ex);
		}
		// Das model mit der JTable verlinken
		tableview.setModel(model);
		System.out.println(tableview);
		return tableview;

	}
}