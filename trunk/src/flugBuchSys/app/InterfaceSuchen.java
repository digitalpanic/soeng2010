package flugBuchSys.app;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import flugBuchSys.gui.JFrameFlugSuchen;
import flugBuchSys.gui.JFrameKundeSuchen;
import flugBuchSys.gui.JFrameSuchen;
import flugBuchSys.odbc.Statements;

public class InterfaceSuchen {

	public static String FlugID; 
	public static String FlugzeugID;  
	public static String Route;
	public static String Abflug;
	public static String Ankunft;
	public static String AuslEco;
	public static String AuslBuis;
	public static String AuslFirst;
	public static String Anrede;
	public static String Vorname;
	public static String Nachname;
	public static String Geburtsdatum;
	public static String Strasse;
	public static String Hausnummer;
	public static String Postleitzahl;
	public static String Ort;
	public static String Kundennummer;
	
	public static void suchen(JFrameSuchen jFrame, String table) {

		JLabel[] jLabArr = jFrame.getJLabelArr();
		JTextField[] strTextArr = jFrame.getJTextFieldArr();

		ArrayList arrListLabArrSel = new ArrayList();
		ArrayList arrListLabArrCond = new ArrayList();
		ArrayList arrListTexArrCond = new ArrayList();

		for (int i = 0; i < strTextArr.length; i++) {
			arrListLabArrSel.add(jLabArr[i].getName());
			if (!strTextArr[i].getText().equals("")) {
				arrListLabArrCond.add(jLabArr[i].getName());
				System.out.println(strTextArr[i].getText());
				arrListTexArrCond.add(strTextArr[i].getText());
			}
		}

		try {
			arrListLabArrCond.add(jFrame.getActive().getName());
			arrListTexArrCond.add(jFrame.getStrActive());
		} catch (Exception e) {

		}

		try {
			arrListLabArrCond.add(jFrame.getJLabelGepaeck().getName());
			arrListTexArrCond.add(jFrame.getStrActive());
		} catch (Exception e) {

		}

		/*
		 * Object[] strJlabArr = strLabArrSel.toArray(); Object[] strJtexArr =
		 * strTexArrSel.toArray();
		 * 
		 * Object[][] strCondition = { strLabArrSel.toArray(),
		 * strTexArrSel.toArray() }
		 */
		ArrayList arrListArrCondition = new ArrayList();
		arrListArrCondition.add(arrListLabArrCond);
		arrListArrCondition.add(arrListTexArrCond);

		// Das JTable initialisieren
		
		final JTable jt = Statements.transformSelect(table, arrListLabArrSel,
				arrListArrCondition);
		jFrame.setJTable(jt);
		jt.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent evt)
			{	new Application();
				int row = jt.getSelectedRow();
				if (JFrameFlugSuchen.visible == true){
					FlugID = (String.valueOf(jt.getValueAt(row, 0)));
					FlugzeugID = (String.valueOf(jt.getValueAt(row, 1)));
					Route = (String.valueOf(jt.getValueAt(row, 2)));
					Abflug = (String.valueOf(jt.getValueAt(row, 3)));
					Ankunft = (String.valueOf(jt.getValueAt(row, 4)));
					AuslEco = (String.valueOf(jt.getValueAt(row, 5)));
					AuslBuis = (String.valueOf(jt.getValueAt(row, 6)));
					AuslFirst = (String.valueOf(jt.getValueAt(row, 7)));
					
					JFrameFlugSuchen.jTextFieldFlugID.setText(FlugID);
					JFrameFlugSuchen.jTextFieldFlugzeugID.setText(FlugzeugID);
					JFrameFlugSuchen.jTextFieldRoute.setText(Application.von + " nach " + Application.nach);
					JFrameFlugSuchen.jTextFieldStartDate.setText(Abflug);
					JFrameFlugSuchen.jTextFieldEndDate.setText(Ankunft);
					JFrameFlugSuchen.jTextFieldAuslEco.setText(AuslEco);
					JFrameFlugSuchen.jTextFieldAuslBuis.setText(AuslBuis);
					JFrameFlugSuchen.jTextFieldAuslFirst.setText(AuslFirst);
					
				}
				if (JFrameKundeSuchen.visible == true){
				Anrede = (String.valueOf(jt.getValueAt(row, 1)));
				Vorname = (String.valueOf(jt.getValueAt(row, 2)));
				Nachname = (String.valueOf(jt.getValueAt(row, 3)));
				Geburtsdatum = (String.valueOf(jt.getValueAt(row, 4)));
				Strasse = (String.valueOf(jt.getValueAt(row, 5)));
				Hausnummer = (String.valueOf(jt.getValueAt(row, 6)));
				Postleitzahl = (String.valueOf(jt.getValueAt(row, 8)));
				Ort = (String.valueOf(jt.getValueAt(row, 7)));
				Kundennummer = (String.valueOf(jt.getValueAt(row, 0)));
				
				JFrameKundeSuchen.jTextFieldKdnummer.setText(Kundennummer);
				JFrameKundeSuchen.jTextFieldAnrede.setText(Anrede);
				JFrameKundeSuchen.jTextFieldVorname.setText(Vorname);
				JFrameKundeSuchen.jTextFieldNachname.setText(Nachname);
				JFrameKundeSuchen.jTextFieldGebdatum.setText(Geburtsdatum);
				JFrameKundeSuchen.jTextFieldStrasse.setText(Strasse);
				JFrameKundeSuchen.jTextFieldHausnummer.setText(Hausnummer);
				JFrameKundeSuchen.jTextFieldOrt.setText(Ort);
				JFrameKundeSuchen.jTextFieldPlz.setText(Postleitzahl);
				}
				
			}
		}
		);
		
		
	}
	
}