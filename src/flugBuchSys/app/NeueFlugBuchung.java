package flugBuchSys.app;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

import flugBuchSys.gui.JFrameNeueBuchung;
import flugBuchSys.gui.JFrameGepaeckBuchen;
import flugBuchSys.odbc.UpdateQueries;

/**
 * Neue Buchung anlegen
 * 
 * Übernimmt die Daten aus dem JFrameNeueBuchung baut diese zu einem
 * Datanbankstatement zusammen und setzt dieses auf die Datenbank ab.
 * 
 * @author Florian Leicher
 * @version 1.0
 */
public class NeueFlugBuchung {

	// Eingaben der Benutzer für die Buchung holen
//	public static  String  rueck = JFrameNeueBuchung.rueck;;
//	public static String strVon = JFrameNeueBuchung.jTextFieldVon.getText();
//	public static String strNach = JFrameNeueBuchung.jTextFieldNach.getText();
//	public static String strHinflug = JFrameNeueBuchung.jTextFieldAbflugDatum
//			.getText();
//	public static String strRueckflug = JFrameNeueBuchung.jTextFieldRueckflugDatum
//			.getText();
//	public static String strServiceKlasse = (String) JFrameNeueBuchung.jComboBoxServiceKlasse
//			.getSelectedItem();
//	public static String strVorname = JFrameNeueBuchung.jTextFieldVorname.getText();
//	public static String strNachname = JFrameNeueBuchung.jTextFieldNachname.getText();
//	public static int personenzahl = Integer
//			.parseInt(JFrameNeueBuchung.jTextFieldPersonenZahl.getText());
	// Eingaben der Benutzer für die Gepaeckbuchung holen
//	static String JFrameGepaeckBuchen.RadioButtonGepaeckNo;
//	static int strGepanzahl = Integer.parseInt(JFrameGepaeckBuchen.jTextFieldGepackstuecke.getText());

	
	
//	static int personen = 1 + personenzahl;

	/**
	 * Setzt aus den Eingaben des Benutzers einen Insert Sting zusammen
	 * 
	 * @return Statement - Insert Sting für die Neue Buchung
	 */
	public static String GenerateInsertString() {
		String  rueck = JFrameNeueBuchung.rueck;;
		String strVon = JFrameNeueBuchung.jTextFieldVon.getText();
		String strNach = JFrameNeueBuchung.jTextFieldNach.getText();
		String strServiceKlasse = (String) JFrameNeueBuchung.jComboBoxServiceKlasse.getSelectedItem();
		String strVorname = JFrameNeueBuchung.jTextFieldVorname.getText();
		String strNachname = JFrameNeueBuchung.jTextFieldNachname.getText();
		int personenzahl = Integer.parseInt(JFrameNeueBuchung.jTextFieldPersonenZahl.getText());
		 
		// Insert String zusammenbauen
		String Statement = ("INSERT INTO RESERVIERUNG (KUNDENNUMMER, FLUGID, PASSAGIERE, RUECKFLUG, KLASSE, ACTIVE) VALUES ((SELECT KUNDENNUMMER FROM KUNDE WHERE VORNAME LIKE '%"
				+ strVorname
				+ "%' AND NACHNAME LIKE '%"
				+ strNachname
				+ "%'), (SELECT FLUGID FROM FLUG WHERE ROUTE = (SELECT ROUTEID FROM ROUTE WHERE VON = (SELECT FLUGHAFENID FROM FLUGHAFEN WHERE LANGTEXT LIKE '%"
				+ strVon
				+ "%') AND NACH = (SELECT FLUGHAFENID FROM FLUGHAFEN WHERE LANGTEXT LIKE '%"
				+ strNach
				+ "%'))), "
				+ personenzahl
				+ ", '"
				+ rueck
				+ "', '"
				+ strServiceKlasse + "', 'J')");

		// Insert String zurückgeben
		return Statement;

	}

	/**
	 * Setzt aus den Eingaben der Benutzer bezüglich der Passagiere einen String
	 * zusammen und Setzt die aktuelle Kapazität der Klassen hoch
	 * 
	 * @return statementUpdate - update String
	 */
	public static String GenerateUpdateAuslString() {
		String rueck = JFrameNeueBuchung.rueck;
		String strVon = JFrameNeueBuchung.jTextFieldVon.getText();
		 String strNach = JFrameNeueBuchung.jTextFieldNach.getText();
		String strHinflug = JFrameNeueBuchung.jTextFieldAbflugDatum
				.getText();
		 String strRueckflug = JFrameNeueBuchung.jTextFieldRueckflugDatum
				.getText();
		String strServiceKlasse = (String) JFrameNeueBuchung.jComboBoxServiceKlasse
				.getSelectedItem();
		int personenzahl = Integer
				.parseInt(JFrameNeueBuchung.jTextFieldPersonenZahl.getText());
		
		
		
		// Umbenennen derKlassen für die Datenbank
		String Klasse = null;
		if (strServiceKlasse == "First") {
			Klasse = ("AUSLFIRST");
		} else if (strServiceKlasse == "Economy") {
			Klasse = ("AUSLECO");
		} else if (strServiceKlasse == "Business") {
			Klasse = ("AUSLBUIS");
		}

		// String zusammensetzen
		String statementUpdate = ("UPDATE FLUG SET "
				+ Klasse
				+ " = "
				+ Klasse
				+ " + "
				+ personenzahl
				+ " WHERE ROUTE = (SELECT ROUTEID FROM ROUTE WHERE VON = (SELECT FLUGHAFENID FROM FLUGHAFEN WHERE LANGTEXT LIKE '%"
				+ strVon
				+ "%') AND NACH = (SELECT FLUGHAFENID FROM FLUGHAFEN WHERE LANGTEXT LIKE '%"
				+ strNach + "%'))");
		return statementUpdate;

	}

	/**
	 * Holt sich die Zusammengesetzten Strings und gibt diese an die Datenbank
	 * weiter
	 */
//	public static void ExecuteBuchungGepaeckInsert() {
//		System.out.println(strGepanzahl);
//	}
//	
	
	
	public static void ExecuteBuchungInsert() {
		String StatmentInsert = GenerateInsertString();
		String StatementUpdate = GenerateUpdateAuslString();

		UpdateQueries.update(StatmentInsert);
		UpdateQueries.update(StatementUpdate);

	}
}
