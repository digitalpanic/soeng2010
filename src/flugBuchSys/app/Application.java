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
	
	



//
//  package flugBuchSys.app;
//
//
///*
// * DB-Anbindung
// * 
// * User = "Zimmer"
// * PW = "Semesterarbeit"
// * 
// */
//
//import java.awt.event.*;
//
//import flugBuchSys.gui.JFrameKundeSuchen;
//import flugBuchSys.gui.JFrameSuchen;
//
///*
// public class FrameWindow extends JFrame implements ActionListener,
// TextListener {
// */
//public class Application implements ActionListener, KeyListener {
//
//	private static int xPosition = 100;
//	private static int yPosition = 50;
//	private static int breite = 500;
//	private static int hoehe = 60;
//
//	private static final long serialVersionUID = 1L;
//	private static Application guiWindow = new Application();
//	private static JFrameKundeSuchen jFrameKundeSuchen = new JFrameKundeSuchen("*** Flugbuchungsystem ***");
//
//
//	private static JFrameSuchen jFrameSuchenKunde = new JFrameSuchen();
//
//
//	public void actionPerformed(final ActionEvent ae) {
//
//		System.out.println("actionperformed: ---> " + ae.getSource());
//
//	}
//
//	// KeyEvent Methoden
//	public void keyReleased(KeyEvent arg0) {
//		System.out.println(arg0.getKeyChar());
//	}
//
//	public void keyPressed(KeyEvent e) {
//	}
//
//	public void keyTyped(KeyEvent e) {
//	}
//
//	public void textValueChanged(TextEvent arg0) {
//		System.out.println("textValueChanged");
//	}
//
//	/*
//	 * Getter- / Setter- Methoden
//	 */
//
//	public int getXPosition() {
//		return xPosition;
//	}
//
//	public void setXPosition(int position) {
//		xPosition = position;
//	}
//
//	public int getYPosition() {
//		return yPosition;
//	}
//
//	public void setYPosition(int position) {
//		yPosition = position;
//	}
//
//	public int getBreite() {
//		return breite;
//	}
//
//	public void setBreite(int breite) {
//		Application.breite = breite;
//	}
//
//	public int getHoehe() {
//		return hoehe;
//	}
//
//	public void setHoehe(int hoehe) {
//		Application.hoehe = hoehe;
//	}
//
//	public Application getGuiWindow() {
//		return guiWindow;
//	}
//
//	public void setGuiWindow(Application guiWindow) {
//		Application.guiWindow = guiWindow;
//	}
//
//	public JFrameSuchen getJFrameSuchenKunde() {
//		return jFrameSuchenKunde;
//	}
//
//	public void setJFrameSuchenKunde(JFrameSuchen frameSuchenKunde) {
//		jFrameSuchenKunde = frameSuchenKunde;
//	}
//
//	public long getSerialVersionUID() {
//		return serialVersionUID;
//	}
//
//	public static void main(final String[] args) {
//		// final Application guiWindow = new Application();
//		//jFrameKunde.launchFrame(xPosition, yPosition, breite, hoehe);
//		// jFrameSuchenKunde.launchFrame(xPosition, yPosition, breite, hoehe);
//
//	}
//}
