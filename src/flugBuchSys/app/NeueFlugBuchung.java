//package flugBuchSys.app;
//
//import javax.swing.JRadioButton;
//import javax.swing.JTextField;
//
//import flugBuchSys.gui.JFrameNeueBuchung;
//import flugBuchSys.gui.JFrameGepaeckBuchen;
//import flugBuchSys.odbc.UpdateQueries;
//
///**
// * Neue Buchung anlegen
// * 
// * �bernimmt die Daten aus dem JFrameNeueBuchung baut diese zu einem
// * Datanbankstatement zusammen und setzt dieses auf die Datenbank ab.
// * 
// * @author Florian Leicher
// * @version 1.0
// */
//public class NeueFlugBuchung {
//
//	/**
//	 * Setzt aus den Eingaben des Benutzers einen Insert Sting zusammen
//	 * 
//	 * @return Statement - Insert Sting f�r die Neue Buchung
//	 */
//	public static String GenerateInsertString() {
//		String  rueck = JFrameNeueBuchung.rueck;;
//		String strVon = JFrameNeueBuchung.jTextFieldVon.getText();
//		String strNach = JFrameNeueBuchung.jTextFieldNach.getText();
//		String strServiceKlasse = (String) JFrameNeueBuchung.jComboBoxServiceKlasse.getSelectedItem();
//		String strVorname = JFrameNeueBuchung.jTextFieldVorname.getText();
//		String strNachname = JFrameNeueBuchung.jTextFieldNachname.getText();
//		int personenzahl = Integer.parseInt(JFrameNeueBuchung.jTextFieldPersonenZahl.getText());
//		 
//		// Insert String zusammenbauen
//		String Statement = ("INSERT INTO RESERVIERUNG (KUNDENNUMMER, FLUGID, PASSAGIERE, RUECKFLUG, KLASSE, ACTIVE) VALUES ((SELECT KUNDENNUMMER FROM KUNDE WHERE VORNAME LIKE '%"
//				+ strVorname
//				+ "%' AND NACHNAME LIKE '%"
//				+ strNachname
//				+ "%'), (SELECT FLUGID FROM FLUG WHERE ROUTE = (SELECT ROUTEID FROM ROUTE WHERE VON = (SELECT FLUGHAFENID FROM FLUGHAFEN WHERE LANGTEXT LIKE '%"
//				+ strVon
//				+ "%') AND NACH = (SELECT FLUGHAFENID FROM FLUGHAFEN WHERE LANGTEXT LIKE '%"
//				+ strNach
//				+ "%'))), "
//				+ personenzahl
//				+ ", '"
//				+ rueck
//				+ "', '"
//				+ strServiceKlasse + "', 'J')");
//
//		// Insert String zur�ckgeben
//		return Statement;
//
//	}
//
//	/**
//	 * Setzt aus den Eingaben der Benutzer bez�glich der Passagiere einen String
//	 * zusammen und Setzt die aktuelle Kapazit�t der Klassen hoch
//	 * 
//	 * @return statementUpdate - update String
//	 */
//	public static String GenerateUpdateAuslString() {
//		String rueck = JFrameNeueBuchung.rueck;
//		String strVon = JFrameNeueBuchung.jTextFieldVon.getText();
//		 String strNach = JFrameNeueBuchung.jTextFieldNach.getText();
//		String strHinflug = JFrameNeueBuchung.jTextFieldAbflugDatum
//				.getText();
//		 String strRueckflug = JFrameNeueBuchung.jTextFieldRueckflugDatum
//				.getText();
//		String strServiceKlasse = (String) JFrameNeueBuchung.jComboBoxServiceKlasse
//				.getSelectedItem();
//		int personenzahl = Integer
//				.parseInt(JFrameNeueBuchung.jTextFieldPersonenZahl.getText());
//		
//		
//		
//		// Umbenennen derKlassen f�r die Datenbank
//		String Klasse = null;
//		if (strServiceKlasse == "First") {
//			Klasse = ("AUSLFIRST");
//		} else if (strServiceKlasse == "Economy") {
//			Klasse = ("AUSLECO");
//		} else if (strServiceKlasse == "Business") {
//			Klasse = ("AUSLBUIS");
//		}
//
//		// String zusammensetzen
//		String statementUpdate = ("UPDATE FLUG SET "
//				+ Klasse
//				+ " = "
//				+ Klasse
//				+ " + "
//				+ personenzahl
//				+ " WHERE ROUTE = (SELECT ROUTEID FROM ROUTE WHERE VON = (SELECT FLUGHAFENID FROM FLUGHAFEN WHERE LANGTEXT LIKE '%"
//				+ strVon
//				+ "%') AND NACH = (SELECT FLUGHAFENID FROM FLUGHAFEN WHERE LANGTEXT LIKE '%"
//				+ strNach + "%'))");
//		return statementUpdate;
//
//	}
//	
//	
//	public static void ExecuteBuchungInsert() {
//		String StatmentInsert = GenerateInsertString();
//		String StatementUpdate = GenerateUpdateAuslString();
//
//		UpdateQueries.update(StatmentInsert);
//		UpdateQueries.update(StatementUpdate);
//
//	}
//}
