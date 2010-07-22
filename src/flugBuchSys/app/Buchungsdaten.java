package flugBuchSys.app;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

import flugBuchSys.gui.JFrameNeueBuchung;
import flugBuchSys.gui.JFrameGepaeckBuchen;
import flugBuchSys.odbc.UpdateQueries;

public class Buchungsdaten {

	// Eingaben der Benutzer für die Buchung holen
	public static String  rueck = JFrameNeueBuchung.rueck;;
	public static String strVon = JFrameNeueBuchung.jTextFieldVon.getText();
	public static String strNach = JFrameNeueBuchung.jTextFieldNach.getText();
	public static String strHinflug = JFrameNeueBuchung.jTextFieldAbflugDatum.getText();
	public static String strRueckflug = JFrameNeueBuchung.jTextFieldRueckflugDatum.getText();
	public static String strServiceKlasse = (String) JFrameNeueBuchung.jComboBoxServiceKlasse.getSelectedItem();
	public static String strVorname = JFrameNeueBuchung.jTextFieldVorname.getText();
	public static String strNachname = JFrameNeueBuchung.jTextFieldNachname.getText();
	public static int personenzahl = Integer.parseInt(JFrameNeueBuchung.jTextFieldPersonenZahl.getText());
	// Eingaben der Benutzer für die Gepaeckbuchung holen
	static int gepaeckstuecke = Integer.parseInt(JFrameGepaeckBuchen.jTextFieldGepackstuecke.getText());

	public static String GenerateInsertString() {
	// Insert String zusammenbauen
	String Statement = ("INSERT INTO RESERVIERUNG (KUNDENNUMMER, FLUGID, PASSAGIERE, RUECKFLUG, KLASSE, ACTIVE, GEPAECK) VALUES ((SELECT KUNDENNUMMER FROM KUNDE WHERE VORNAME LIKE '%"
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
			+ strServiceKlasse + "', 'J', "+gepaeckstuecke+")");

	// Insert String zurückgeben
	return Statement;

}
	public static void DatenSpeichern (){
		UpdateQueries.update(GenerateInsertString());
	}
	
	
}
