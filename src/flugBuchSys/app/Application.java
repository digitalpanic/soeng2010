package flugBuchSys.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import flugBuchSys.odbc.Statements;

import oracle.sql.*;

public class Application {

	public static String von;
	public static String nach;

	// // Initialisieren der Datenbankverbindung
	String sDbDriver = Statements.sDbDriver, sDbUrl = Statements.sDbUrl, sUsr = Statements.sUsr, sPwd = Statements.sPwd;
	Connection cn = null;{
	try 
	{
		// Datenbank Connectionstring zusammenbauen und Verbindung zur
		// Datenbank aufbauen
		try {
			Class.forName(sDbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cn = DriverManager.getConnection(sDbUrl, sUsr, sPwd);
		Statement st = cn.createStatement();
		String query = "SELECT FLUGHAFEN.LANGTEXT FROM FLUGHAFEN WHERE FLUGHAFENID = (SELECT ROUTE.VON FROM ROUTE WHERE ROUTEID = " + InterfaceSuchen.Route + ")";
		ResultSet rs = st.executeQuery(query);
		while (rs.next()){
			von = rs.getString("LANGTEXT");
			//System.out.println(von);
			
		}
		Statement st2 = cn.createStatement();
		String query2 = "SELECT FLUGHAFEN.LANGTEXT FROM FLUGHAFEN WHERE FLUGHAFENID = (SELECT ROUTE.NACH FROM ROUTE WHERE ROUTEID = " + InterfaceSuchen.Route + ")";
		ResultSet rs2 = st2.executeQuery(query2);
		while (rs2.next()){
			nach = rs2.getString("LANGTEXT");
			//System.out.println(nach);
			
		}
	

		// Beenden der Verbindung
		cn.close();
		st.close();

	}catch (SQLException e) {
		// Ausgabe der Fehlermeldung bei fehlerhaftem SQL
		JOptionPane.showMessageDialog(new JFrame(), e);
		System.out.println(e);
	}
		}
}