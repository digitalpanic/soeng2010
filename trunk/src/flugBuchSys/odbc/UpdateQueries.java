package flugBuchSys.odbc;

import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import oracle.jdbc.driver.*;

/**
 * Diese Klasse Baut eine Verbindung zur Datenbank auf und Setzt ein UPDATE oder
 * INSERT Statement ab.
 * 
 * @author Florian Leicher - Gruppe 15
 * 
 */
public class UpdateQueries extends Object {
	public static String result = null;
	public static Connection cn = null;
	public static Statement st = null;

	public static String update(String SQLquery) {
		// Initialisieren der Datenbankverbindung
		String sDbDriver = Statements.sDbDriver, sDbUrl = Statements.sDbUrl, sUsr = Statements.sUsr, sPwd = Statements.sPwd;
		
		// Versuchen die Vebindung aufzubauen und das Update durchzuführen
		try {
			// Verbindung initialisieren
			// DriverManager.registerDriver(new OracleDriver());
			try {
				Class.forName(sDbDriver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			cn = DriverManager.getConnection(sDbUrl, sUsr, sPwd);
			cn.setAutoCommit(false);

			// Updatestatement absetzen
			Statement st = cn.createStatement();
			st.executeQuery(SQLquery);

			// Verbindungs beenden

			result = "Erfolg";
		}
		
		// Fehlerbehandlung
		catch (SQLException e) {
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
		}
		// Rückgabe ob Erfolg oder Fehler
		return result;
	}
	
	public static void commit(){
		try {
			cn.commit();
			//cn.close();
		} catch (SQLException e) {
			System.out.println("Commit konnte leider nicht ausgeführt werden!");
			e.printStackTrace();
		}
	}
	
	
	public static void rollback(){
		// Versuch des Rollback
		try {
			cn.rollback();
			//cn.close();
		} catch (SQLException e) {
			System.out.println("Fehler beim Rollback");
			e.printStackTrace();
			
		}
	}
}