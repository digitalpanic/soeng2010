package flugBuchSys.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import flugBuchSys.app.ActionEventHandler;
import flugBuchSys.odbc.UpdateQueries;

public class JFrameKundeAnlegen extends JFrameAnlegen implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JTextField jTextFieldAnrede = new JTextField();
	private JTextField jTextFieldVorname = new JTextField();
	private JTextField jTextFieldNachname = new JTextField();
	private JTextField jTextFieldGebdatum = new JTextField();
	private JTextField jTextFieldStrasse = new JTextField();
	private JTextField jTextFieldHausnummer = new JTextField();
	private JTextField jTextFieldOrt = new JTextField();
	private JTextField jTextFieldPlz = new JTextField();
	private JTextField jTextFieldZusatz = new JTextField();

	JTextField[] jTextFieldArr = { jTextFieldAnrede, jTextFieldVorname,
			jTextFieldNachname, jTextFieldGebdatum, jTextFieldStrasse,
			jTextFieldHausnummer, jTextFieldOrt, jTextFieldPlz,
			jTextFieldZusatz };

	private JButton Kneu;

	private JLabel anrede = new JLabel("Anrede:");;
	private JLabel vorname = new JLabel("Vorname:");
	private JLabel nachname = new JLabel("Nachname:");
	private JLabel gebdatum = new JLabel("Geburtsdatum:");
	private JLabel strasse = new JLabel("Straﬂe:");
	private JLabel hausnummer = new JLabel("Hausnummer:");
	private JLabel ort = new JLabel("Ort:");
	private JLabel postleitzahl = new JLabel("Postleitzahl / ZIP-CODE:");
	private JLabel zusatz = new JLabel("Zusatz");

	private JLabel[] jLabelArr = { anrede, vorname, nachname, gebdatum,
			strasse, hausnummer, ort, postleitzahl, zusatz };

	private JMenu jMenu1;
	private JMenuBar Menu;
	private JMenuItem jMenuItem1;

	private String choice;
	private String strAnrede, strVorname, strNachname, strGebdatum, strStrasse,
			strHausnummer, strPlz, strWohnort, strZusatztext;

	private String[] textArr = { strAnrede, strVorname, strNachname,
			strGebdatum, strStrasse, strHausnummer, strWohnort, strPlz,
			strZusatztext };

	private JButton Weiter;
	private JMenuItem jMenuItem2;

	public JFrameKundeAnlegen(String Titel) {
		super(Titel);
		initGUI();
		// this.addMouseListener (this);

		anrede.setName("ANREDE");
		vorname.setName("VORNAME");
		nachname.setName("NACHNAME");
		gebdatum.setName("GEBURTSDATUM");
		strasse.setName("STRASSE");
		hausnummer.setName("HAUSNUMMER");
		ort.setName("ORT");
		postleitzahl.setName("PLZ");
		zusatz.setName("ZUSATZ");

	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setPreferredSize(new java.awt.Dimension(538, 425));
			{
				Menu = new JMenuBar();
				setJMenuBar(Menu);
				{
					jMenu1 = new JMenu();
					Menu.add(jMenu1);
					jMenu1.setText("Zurueck");
					{
						if (JFrameFbsGUI.neuebuchung == true) {
							jMenuItem2 = new JMenuItem();
							jMenu1.add(jMenuItem2);
							jMenuItem2.setText("zur Flugauswahl");
							jMenuItem2.setActionCommand("einschrittzurueck");
							jMenuItem2.addActionListener(this);
						}
						jMenuItem1 = new JMenuItem();
						jMenu1.add(jMenuItem1);
						jMenuItem1.setText("zum Hauptmenu");
					}
					jMenuItem1.setActionCommand("zurueck");
					jMenuItem1.addActionListener(this);

				}
			}

			{

				getContentPane().add(jTextFieldAnrede, "Center");
				jTextFieldAnrede.setBounds(186, 36, 129, 21);

				getContentPane().add(jTextFieldVorname);
				jTextFieldVorname.setBounds(186, 67, 129, 21);

				getContentPane().add(jTextFieldNachname);
				jTextFieldNachname.setBounds(186, 98, 129, 21);

				getContentPane().add(anrede);
				anrede.setText("Anrede:");
				anrede.setBounds(21, 35, 135, 22);

				getContentPane().add(vorname);
				vorname.setText("Vorname:");
				vorname.setBounds(21, 66, 135, 22);

				getContentPane().add(nachname);
				nachname.setText("Nachname:");
				nachname.setBounds(21, 97, 135, 22);

				getContentPane().add(strasse);
				strasse.setText("Straﬂe:");
				strasse.setBounds(21, 159, 135, 22);

				getContentPane().add(jTextFieldGebdatum);
				jTextFieldGebdatum.setBounds(186, 129, 129, 21);

				getContentPane().add(jTextFieldHausnummer);
				jTextFieldHausnummer.setBounds(448, 160, 41, 21);

				getContentPane().add(hausnummer);
				hausnummer.setText("Hausnummer:");
				hausnummer.setBounds(327, 164, 121, 16);

				getContentPane().add(jTextFieldStrasse);
				jTextFieldStrasse.setBounds(186, 162, 129, 21);

				getContentPane().add(jTextFieldPlz);
				jTextFieldPlz.setBounds(186, 193, 129, 21);

				getContentPane().add(jTextFieldOrt);
				jTextFieldOrt.setBounds(186, 223, 129, 21);

				getContentPane().add(postleitzahl);
				postleitzahl.setText("Postleitzahl / ZIP-CODE:");
				postleitzahl.setBounds(21, 188, 165, 22);

				getContentPane().add(gebdatum);
				gebdatum.setText("Geburtsdatum:");
				gebdatum.setBounds(21, 131, 135, 16);

				getContentPane().add(ort);
				ort.setText("Ort:");
				ort.setBounds(22, 224, 165, 16);

				getContentPane().add(zusatz);
				zusatz.setText("Zusatz");
				zusatz.setBounds(22, 286, 79, 16);

				getContentPane().add(jTextFieldZusatz);
				jTextFieldZusatz.setBounds(186, 284, 129, 21);
			}

			if (JFrameFbsGUI.neuebuchung == true) {
				Weiter = new JButton("Weiter");
				getContentPane().add(Weiter);
				Weiter.setBounds(327, 214, 174, 25);
				Weiter.addActionListener(this);
				Weiter.setActionCommand("Weiter");
			}

			{
				Kneu = new JButton();
				getContentPane().add(Kneu);
				Kneu.setText("Kunden Anlegen");
				Kneu.setBounds(327, 245, 174, 26);
				Kneu.addActionListener(this);
				Kneu.setActionCommand("KundeAnlegen");

			}

			pack();
			this.setSize(530, 373);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent ae) {
		if ("zurueck".equals(ae.getActionCommand())) {
			dispose();
			JFrameFbsGUI open = new JFrameFbsGUI();
			open.setLocationRelativeTo(null);
			open.setVisible(true);
		}
		if ("einschrittzurueck".equals(ae.getActionCommand())) {
			this.setVisible(false);
			new JFrameFlugSuchen("neue Buchung vornehmen");
		}

		if (ae.getActionCommand().equals("Weiter")) {
			this.setVisible(false);
			new JFrameNeueBuchung("Neue Buchung");
//			int n = JOptionPane.showConfirmDialog(null,
//					"Plant der Kunde Zusatzgep‰ck (Sperrgep‰ck) mitzunehmen?",
//					"Sperrgep‰ck?", JOptionPane.YES_NO_OPTION);
//			if (n == 0) {
//				JFrameKundeSuchen.gepaeck = true;
//			} else {
//				JFrameKundeSuchen.gepaeck = false;
//
//			}
		}

		if (ae.getActionCommand().equals("KundeAnlegen")) {
			strAnrede = jTextFieldAnrede.getText();
			strVorname = jTextFieldVorname.getText();
			strNachname = jTextFieldNachname.getText();
			strGebdatum = jTextFieldGebdatum.getText();
			strStrasse = jTextFieldStrasse.getText();
			strHausnummer = jTextFieldHausnummer.getText();
			strPlz = jTextFieldPlz.getText();
			strWohnort = jTextFieldOrt.getText();
			strZusatztext = jTextFieldZusatz.getText();
			choice = ae.getActionCommand();
			JOptionPane.showMessageDialog(null,
					"Der Kunde wurde erfolgreich angelegt",
					"Vorgang abgeschlossen", JOptionPane.INFORMATION_MESSAGE);
		}
		ActionEventHandler.actionperformed(ae, this);
	}

	public JTextField getJTextFieldAnrede() {
		return jTextFieldAnrede;
	}

	public void setJTextFieldAnrede(JTextField textFieldAnrede) {
		jTextFieldAnrede = textFieldAnrede;
	}

	public JTextField getJTextFieldVorname() {
		return jTextFieldVorname;
	}

	public void setJTextFieldVorname(JTextField textFieldVorname) {
		jTextFieldVorname = textFieldVorname;
	}

	public JTextField getJTextFieldNachname() {
		return jTextFieldNachname;
	}

	public void setJTextFieldNachname(JTextField textFieldNachname) {
		jTextFieldNachname = textFieldNachname;
	}

	public JTextField getJTextFieldGebdatum() {
		return jTextFieldGebdatum;
	}

	public void setJTextFieldGebdatum(JTextField textFieldGebdatum) {
		jTextFieldGebdatum = textFieldGebdatum;
	}

	public JTextField getJTextFieldStrasse() {
		return jTextFieldStrasse;
	}

	public void setJTextFieldStrasse(JTextField textFieldStrasse) {
		jTextFieldStrasse = textFieldStrasse;
	}

	public JTextField getJTextFieldHausnummer() {
		return jTextFieldHausnummer;
	}

	public void setJTextFieldHausnummer(JTextField textFieldHausnummer) {
		jTextFieldHausnummer = textFieldHausnummer;
	}

	public JTextField getJTextFieldOrt() {
		return jTextFieldOrt;
	}

	public void setJTextFieldOrt(JTextField textFieldOrt) {
		jTextFieldOrt = textFieldOrt;
	}

	public JTextField getJTextFieldPlz() {
		return jTextFieldPlz;
	}

	public void setJTextFieldPlz(JTextField textFieldPlz) {
		jTextFieldPlz = textFieldPlz;
	}

	public JTextField getJTextFieldZusatz() {
		return jTextFieldZusatz;
	}

	public void setJTextFieldZusatz(JTextField textFieldZusatz) {
		jTextFieldZusatz = textFieldZusatz;
	}

	public JTextField[] getJTextFieldArr() {
		return jTextFieldArr;
	}

	public void setJTextFieldArr(JTextField[] textFieldArr) {
		jTextFieldArr = textFieldArr;
	}

	public JButton getKneu() {
		return Kneu;
	}

	public void setKneu(JButton kneu) {
		Kneu = kneu;
	}

	public JLabel getAnrede() {
		return anrede;
	}

	public void setAnrede(JLabel anrede) {
		this.anrede = anrede;
	}

	public JLabel getVorname() {
		return vorname;
	}

	public void setVorname(JLabel vorname) {
		this.vorname = vorname;
	}

	public JLabel getNachname() {
		return nachname;
	}

	public void setNachname(JLabel nachname) {
		this.nachname = nachname;
	}

	public JLabel getGebdatum() {
		return gebdatum;
	}

	public void setGebdatum(JLabel gebdatum) {
		this.gebdatum = gebdatum;
	}

	public JLabel getStrasse() {
		return strasse;
	}

	public void setStrasse(JLabel strasse) {
		this.strasse = strasse;
	}

	public JLabel getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(JLabel hausnummer) {
		this.hausnummer = hausnummer;
	}

	public JLabel getOrt() {
		return ort;
	}

	public void setOrt(JLabel ort) {
		this.ort = ort;
	}

	public JLabel getPostleitzahl() {
		return postleitzahl;
	}

	public void setPostleitzahl(JLabel postleitzahl) {
		this.postleitzahl = postleitzahl;
	}

	public JLabel getZusatz() {
		return zusatz;
	}

	public void setZusatz(JLabel zusatz) {
		this.zusatz = zusatz;
	}

	public JLabel[] getJLabelArr() {
		return jLabelArr;
	}

	public void setJLabelArr(JLabel[] labelArr) {
		jLabelArr = labelArr;
	}

	public JMenu getJMenu1() {
		return jMenu1;
	}

	public void setJMenu1(JMenu menu1) {
		jMenu1 = menu1;
	}

	public JMenuBar getMenu() {
		return Menu;
	}

	public void setMenu(JMenuBar menu) {
		Menu = menu;
	}

	public JMenuItem getJMenuItem1() {
		return jMenuItem1;
	}

	public void setJMenuItem1(JMenuItem menuItem1) {
		jMenuItem1 = menuItem1;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public String getStrAnrede() {
		return strAnrede;
	}

	public void setStrAnrede(String strAnrede) {
		this.strAnrede = strAnrede;
	}

	public String getStrVorname() {
		return strVorname;
	}

	public void setStrVorname(String strVorname) {
		this.strVorname = strVorname;
	}

	public String getStrNachname() {
		return strNachname;
	}

	public void setStrNachname(String strNachname) {
		this.strNachname = strNachname;
	}

	public String getStrGebdatum() {
		return strGebdatum;
	}

	public void setStrGebdatum(String strGebdatum) {
		this.strGebdatum = strGebdatum;
	}

	public String getStrStrasse() {
		return strStrasse;
	}

	public void setStrStrasse(String strStrasse) {
		this.strStrasse = strStrasse;
	}

	public String getStrHausnummer() {
		return strHausnummer;
	}

	public void setStrHausnummer(String strHausnummer) {
		this.strHausnummer = strHausnummer;
	}

	public String getStrPlz() {
		return strPlz;
	}

	public void setStrPlz(String strPlz) {
		this.strPlz = strPlz;
	}

	public String getStrWohnort() {
		return strWohnort;
	}

	public void setStrWohnort(String strWohnort) {
		this.strWohnort = strWohnort;
	}

	public String getStrZusatztext() {
		return strZusatztext;
	}

	public void setStrZusatztext(String strZusatztext) {
		this.strZusatztext = strZusatztext;
	}

	public String[] getTextArr() {
		return textArr;
	}

	public void setTextArr(String[] textArr) {
		this.textArr = textArr;
	}

	public JButton getWeiter() {
		return Weiter;
	}

	public void setWeiter(JButton weiter) {
		Weiter = weiter;
	}

	public JMenuItem getJMenuItem2() {
		return jMenuItem2;
	}

	public void setJMenuItem2(JMenuItem menuItem2) {
		jMenuItem2 = menuItem2;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

}