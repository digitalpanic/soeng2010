package flugBuchSys.app;

import java.awt.event.ActionEvent;

import flugBuchSys.gui.JFrameGepaeckBuchen;
import flugBuchSys.gui.JFrameNeueBuchung;
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
public class NeueGepaeckBuchung {



	// static String kein = JFrameGepaeckBuchen.kein;
	// TODO Einlesen!

	public static String GenerateUpdateString() {
		int gepaeckstuecke = Integer.parseInt(JFrameGepaeckBuchen.jTextFieldGepackstuecke.getText());
		String strVorname = JFrameNeueBuchung.jTextFieldVorname.getText();
		String strNachname = JFrameNeueBuchung.jTextFieldNachname.getText();
		String strVon = JFrameNeueBuchung.jTextFieldVon.getText();
		String strNach = JFrameNeueBuchung.jTextFieldNach.getText();
		String Statement = "UPDATE RESERVIERUNG SET GEPAECK = "
				+ gepaeckstuecke
				+ " WHERE KUNDENNUMMER = (SELECT KUNDENNUMMER FROM KUNDE WHERE VORNAME LIKE '%"
				+ strVorname
				+ "%' AND NACHNAME LIKE '%"
				+ strNachname
				+ "%') AND FLUGID = (SELECT FLUGID FROM FLUG WHERE ROUTE = (SELECT ROUTEID FROM ROUTE WHERE VON = (SELECT FLUGHAFENID FROM FLUGHAFEN WHERE LANGTEXT LIKE '%"
				+ strVon
				+ "%') AND NACH = (SELECT FLUGHAFENID FROM FLUGHAFEN WHERE LANGTEXT LIKE '%"
				+ strNach + "%')))";
		return Statement;
	}

	public static void ExecuteGepaeckBuchungInsert() {
		String StatmentInsert = GenerateUpdateString();
		// System.out.println(StatmentInsert);
		UpdateQueries.update(StatmentInsert);

	}

}
