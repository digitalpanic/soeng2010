package flugBuchSys.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import flugBuchSys.app.NeueFlugBuchung;
import flugBuchSys.app.NeueGepaeckBuchung;

public class JFrameBuchungBestaetigung extends javax.swing.JFrame implements
		ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton jButtonBuchungBestaetigen;
	private JButton jButtonAbbrechen;
	private JButton jButtonzurueck;
	
	public JLabel jLabelInfo;
	public JLabel jLabelVorname;
	public JTextField jTextFieldVorname;
	public JLabel jLabelNachname;
	public JTextField jTextFieldNachname;
	public JLabel jLabelVon;
	public JTextField jTextFieldVon;
	public JLabel jLabelNach;
	public JTextField jTextFieldNach;
	public JLabel jLabelGepaeck;
	public JTextField jTextFieldGepaeck;
	public JLabel jLabelPassagiere;
	public JTextField jTextFieldPassagiere;
	public JLabel jLabelDatumAb;
	public JTextField jTextFieldDatumAb;
	public JLabel jLabelDatumRueck;
	public JTextField jTextFieldDatumRueck;
	public JLabel jTextLabelAbschluss;
	public JTextField jTextFieldKlasse;
	public JLabel jTextLabelKlasse;	
//	public String gepaeckstuecke = Integer.toString(JFrameNeueBuchung.gepaeckstuecke);
//	public String personenzahl = Integer.toString(NeueFlugBuchung.personenzahl);
	public JFrameBuchungBestaetigung(String str) {
		super(str);
		initGUI();
	}

	// ich wei� nicht wie du es anzeigen lassen willst aber hier sollten alle
	// relevanten Flugdaten (Name, Ablugszeit, Zusatzgep�ck
	// usw nochmal aufgelistet sein und erst dann sollte alles gebucht werden.
	// So w�re zumindest meine Intention.

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
//			{
//				jButtonBuchungBestaetigen = new JButton();
//				getContentPane().add(jButtonBuchungBestaetigen, "Center");
//				jButtonBuchungBestaetigen.setText("Buchen");
//				jButtonBuchungBestaetigen.setBounds(354, 459, 116, 27);
//				jButtonBuchungBestaetigen.addActionListener(this);
//				jButtonBuchungBestaetigen.setActionCommand("buchen");
			
			String  rueck = JFrameNeueBuchung.rueck;;
			String strVon = JFrameNeueBuchung.jTextFieldVon.getText();
			String strNach = JFrameNeueBuchung.jTextFieldNach.getText();
			String strServiceKlasse = (String) JFrameNeueBuchung.jComboBoxServiceKlasse.getSelectedItem();
			String strVorname = JFrameNeueBuchung.jTextFieldVorname.getText();
			String strNachname = JFrameNeueBuchung.jTextFieldNachname.getText();
			int personenzahl = Integer.parseInt(JFrameNeueBuchung.jTextFieldPersonenZahl.getText());
			int gepaeckstuecke = Integer.parseInt(JFrameGepaeckBuchen.jTextFieldGepackstuecke.getText());
			
			
			
			
			
//			}
			{
				jButtonAbbrechen = new JButton();
				getContentPane().add(jButtonAbbrechen);
				jButtonAbbrechen.setText("Best�tigen");
				jButtonAbbrechen.setBounds(354, 503, 116, 28);
				jButtonAbbrechen.addActionListener(this);
				jButtonAbbrechen.setActionCommand("Best�tigen");
			}
			{
				jLabelInfo = new JLabel();
				getContentPane().add(jLabelInfo);
				jLabelInfo.setText("Zusammenfassung");
				jLabelInfo.setBounds(17, 11, 235, 16);
			}
			{
				jLabelVorname = new JLabel();
				getContentPane().add(jLabelVorname);
				jLabelVorname.setText("Vorname:");
				jLabelVorname.setBounds(17, 50, 235, 16);
			}
			{
				jTextFieldVorname = new JTextField();
				getContentPane().add(jTextFieldVorname);
				jTextFieldVorname.setBounds(158, 50, 200, 22);
				jTextFieldVorname.setEditable(false);
				jTextFieldVorname.setText(strVorname);
			}
			{
				jLabelNachname = new JLabel();
				getContentPane().add(jLabelNachname);
				jLabelNachname.setText("Nachname:");
				jLabelNachname.setBounds(17, 90, 235, 16);
			}
			{
				jTextFieldNachname = new JTextField();
				getContentPane().add(jTextFieldNachname);
				jTextFieldNachname.setBounds(158, 90, 200, 22);
				jTextFieldNachname.setEditable(false);
				jTextFieldNachname.setText(strNachname);
			}
			{
				jLabelVon = new JLabel();
				getContentPane().add(jLabelVon);
				jLabelVon.setText("Von:");
				jLabelVon.setBounds(17, 130, 235, 16);
			}
			{
				jTextFieldVon = new JTextField();
				getContentPane().add(jTextFieldVon);
				jTextFieldVon.setBounds(158, 130, 200, 22);
				jTextFieldVon.setEditable(false);
				jTextFieldVon.setText(strVon);
			}
			{
				jLabelNach = new JLabel();
				getContentPane().add(jLabelNach);
				jLabelNach.setText("Nach:");
				jLabelNach.setBounds(17, 170, 235, 16);
			}
			{
				jTextFieldNach = new JTextField();
				getContentPane().add(jTextFieldNach);
				jTextFieldNach.setBounds(158, 170, 200, 22);
				jTextFieldNach.setEditable(false);
				jTextFieldNach.setText(strNach);
			}
			{
				jLabelDatumAb = new JLabel();
				getContentPane().add(jLabelDatumAb);
				jLabelDatumAb.setText("Abflugsdatum:");
				jLabelDatumAb.setBounds(17, 210, 235, 16);
			}
			{
				jTextFieldDatumAb = new JTextField();
				getContentPane().add(jTextFieldDatumAb);
				jTextFieldDatumAb.setBounds(158, 210, 200, 22);
				jTextFieldDatumAb.setEditable(false);
				jTextFieldDatumAb.setText(strVon);
			}
			{
				jLabelDatumRueck = new JLabel();
				getContentPane().add(jLabelDatumRueck);
				jLabelDatumRueck.setText("R�ckflugdatum:");
				jLabelDatumRueck.setBounds(17, 250, 235, 16);
			}
			{
				jTextFieldDatumRueck = new JTextField();
				getContentPane().add(jTextFieldDatumRueck);
				jTextFieldDatumRueck.setBounds(158, 250, 200, 22);
				jTextFieldDatumRueck.setEditable(false);
				if (rueck == "J"){
					jTextFieldDatumRueck.setText(rueck);
				} else{
					jTextFieldDatumRueck.setText("Kein R�ckflug gebucht");
				}
			}
			{
				jLabelGepaeck = new JLabel();
				getContentPane().add(jLabelGepaeck);
				jLabelGepaeck.setText("Anzahl Gep�ckst�cke:");
				jLabelGepaeck.setBounds(17, 290, 235, 16);
			}
			{
				jTextFieldGepaeck = new JTextField();
				getContentPane().add(jTextFieldGepaeck);
				jTextFieldGepaeck.setBounds(158, 290, 200, 22);
				jTextFieldGepaeck.setEditable(false);
				jTextFieldGepaeck.setText(Integer.toString(gepaeckstuecke));
			}
			{
				jLabelPassagiere = new JLabel();
				getContentPane().add(jLabelPassagiere);
				jLabelPassagiere.setText("Anzahl Passagiere:");
				jLabelPassagiere.setBounds(17, 330, 235, 16);
			}
			{
				jTextFieldPassagiere = new JTextField();
				getContentPane().add(jTextFieldPassagiere);
				jTextFieldPassagiere.setBounds(158, 330, 200, 22);
				jTextFieldPassagiere.setEditable(false);
				jTextFieldPassagiere.setText(Integer.toString(personenzahl));
			}
			
			{
				jTextLabelKlasse = new JLabel();
				getContentPane().add(jTextLabelKlasse);
				jTextLabelKlasse.setText("Gew�hlte Serviceklasse:");
				jTextLabelKlasse.setBounds(17, 370, 235, 16);
			}
			{
				jTextFieldKlasse = new JTextField();
				getContentPane().add(jTextFieldKlasse);
				jTextFieldKlasse.setBounds(158, 370, 200, 22);
				jTextFieldKlasse.setEditable(false);
				jTextFieldKlasse.setText(strServiceKlasse);
			}	
			
			{
				jTextLabelAbschluss = new JLabel();
				getContentPane().add(jTextLabelAbschluss);
				jTextLabelAbschluss.setText("Wir w�nschen Ihnen einen Angenehmen Flug!");
				jTextLabelAbschluss.setBounds(17, 410, 400, 16);
			}
			
			
			
			
//			jButtonzurueck = new JButton();
//			getContentPane().add(jButtonzurueck);
//			jButtonzurueck.setText("Zur�ck");
//			jButtonzurueck.setBounds(354, 534, 116, 28);
//			jButtonzurueck.addActionListener(this);
//			jButtonzurueck.setActionCommand("zurueck");
//			pack();
			this.setSize(526, 619);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent ae) {

		if ("Best�tigen".equals(ae.getActionCommand())) {
//			int n = JOptionPane
//					.showConfirmDialog(
//							null,
//							"Sind Sie sicher dass Sie die Buchung nicht beenden m�chten? Alle Eingaben gehen hiermit verloren!",
//							"Buchungsvorgang abbrechen?",
//							JOptionPane.YES_NO_OPTION);
//			if (n == 0) {


				
			
				dispose();				
				JFrameFbsGUI open = new JFrameFbsGUI();
				open.setLocationRelativeTo(null);
				open.setVisible(true);
//			} else {
//				// kehrt zur�ck zum Ausgangsbildschirm
//			}

		}
//		if ("buchen".equals(ae.getActionCommand())) {
//			dispose();
//			System.out.println("Der Buchungsvorgang wurde abgeschlossen");
//		}
//		if ("zurueck".equals(ae.getActionCommand())) {
//			this.setVisible(false);
//			new JFrameKundeSuchen("Kunde f�r Buchung ausw�hlen");
//		}
	}
	
	
}
