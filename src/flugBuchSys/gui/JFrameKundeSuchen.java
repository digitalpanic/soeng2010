package flugBuchSys.gui;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;


import flugBuchSys.app.ActionEventHandler;
import flugBuchSys.app.InterfaceSuchen;

//import flugBuchSys.app.ActionEventHandler;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI
 * Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose
 * whatever) then you should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details. Use of Jigloo implies
 * acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN
 * PURCHASED FOR THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR
 * ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class JFrameKundeSuchen extends JFrameSuchen implements ActionListener,
		MouseListener, KeyListener, ItemListener {

	private static final long serialVersionUID = 1L;
	
	public static JTextField jTextFieldKdnummer = new JTextField();
	public static JTextField jTextFieldAnrede = new JTextField();
	public static JTextField jTextFieldVorname = new JTextField();
	public static JTextField jTextFieldNachname = new JTextField();
	public static JTextField jTextFieldGebdatum = new JTextField();
	public static JTextField jTextFieldStrasse = new JTextField();
	public static JTextField jTextFieldHausnummer = new JTextField();
	public static JTextField jTextFieldOrt = new JTextField();
	public static JTextField jTextFieldPlz = new JTextField();
	public static JTextField jTextFieldZusatz = new JTextField();
	

	JTextField[] jTextFieldArr = { jTextFieldKdnummer, jTextFieldAnrede, jTextFieldVorname,
			jTextFieldNachname, jTextFieldGebdatum, jTextFieldStrasse,
			jTextFieldHausnummer, jTextFieldOrt, jTextFieldPlz, 
			jTextFieldZusatz };

	final ButtonGroup group = new ButtonGroup();
	private JButton binactive;
	private JButton bchange;
	private JButton Ksuchen;

	private JRadioButton neinButton;
	private JRadioButton jaButton;
	
	private String strActive = "*";

	private ButtonGroup buttonGroup1;
	
	private JLabel kdnummer = new JLabel("Kundennummer:");
	private JLabel anrede = new JLabel("Anrede:");;
	private JLabel vorname = new JLabel("Vorname:");
	private JLabel nachname = new JLabel("Nachname:");
	private JLabel gebdatum = new JLabel("Geburtsdatum:");
	private JLabel strasse = new JLabel("Straße:");
	private JLabel hausnummer = new JLabel("Hausnummer:");
	private JLabel ort = new JLabel("Ort:");
	private JLabel postleitzahl = new JLabel("Postleitzahl / ZIP-CODE:");
	private JLabel zusatz = new JLabel("Zusatz");
	private JLabel active = new JLabel("Ist der Kunde noch aktiv?");
	
	private JLabel[] jLabelArr = { kdnummer, anrede, vorname, nachname, gebdatum,
			strasse, hausnummer, ort, postleitzahl, zusatz, active };
	
	private JMenu jMenu1;
	private JMenuBar Menu;
	private JMenuItem jMenuItem1;

	private JFrame inst;

//	private JTable jTable = new JTable();
	
	private String choice;
	
	private String strKdnummer, strAnrede, strVorname, strNachname, strGebdatum, strStrasse,
			strHausnummer, strWohnort, strPlz, strZusatztext;

	private String[] textArr = { strKdnummer, strAnrede, strVorname, strNachname,
			strGebdatum, strStrasse, strHausnummer, strWohnort, strPlz, 
			strZusatztext, strActive };
	
	private JButton Weiter;
	private JMenuItem jMenuItem2;

	//private JFrameSuchen ;
	public static boolean gepaeck;
	public static boolean visible;

	public JFrameKundeSuchen(String strTitel) {
		super(strTitel);
		visible = true;
		initGUI();
		this.addMouseListener(this);
		
	}

	private void initGUI() {

		kdnummer.setName("KUNDENNUMMER");
		anrede.setName("ANREDE");
		vorname.setName("VORNAME");
		nachname.setName("NACHNAME");
		gebdatum.setName("GEBURTSDATUM");
		strasse.setName("STRASSE");
		hausnummer.setName("HAUSNUMMER");
		ort.setName("ORT");
		postleitzahl.setName("PLZ");
		zusatz.setName("ZUSATZ");
		active.setName("ACTIVE");

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
						if (JFrameFbsGUI.neuebuchung == true){
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
				
				getContentPane().add(jTextFieldAnrede);
				jTextFieldAnrede.addKeyListener(this);
				jTextFieldAnrede.setBounds(186, 36, 129, 21);
			
				getContentPane().add(jTextFieldVorname);
				jTextFieldVorname.setBounds(186, 67, 129, 21);
			
				getContentPane().add(jTextFieldNachname);
				jTextFieldNachname.setBounds(186, 98, 129, 21);
			
				getContentPane().add(anrede);
				anrede.setBounds(21, 35, 135, 22);
			
				getContentPane().add(vorname);
				vorname.setBounds(21, 66, 135, 22);
			
				getContentPane().add(nachname);
				nachname.setBounds(21, 97, 135, 22);
			
				getContentPane().add(strasse);
				strasse.setBounds(21, 159, 135, 22);
			
				getContentPane().add(jTextFieldGebdatum);
				jTextFieldGebdatum.setBounds(186, 129, 129, 21);
			
				getContentPane().add(jTextFieldHausnummer);
				jTextFieldHausnummer.setBounds(448, 160, 41, 21);
			
				getContentPane().add(hausnummer);
				hausnummer.setBounds(327, 164, 121, 16);
			
				getContentPane().add(jTextFieldStrasse);
				jTextFieldStrasse.setBounds(186, 162, 129, 21);
			
				getContentPane().add(jTextFieldPlz);
				jTextFieldPlz.setBounds(186, 193, 129, 21);
			
				getContentPane().add(jTextFieldOrt);
				jTextFieldOrt.setBounds(186, 223, 129, 21);
			
				getContentPane().add(postleitzahl);
				postleitzahl.setBounds(21, 188, 165, 22);
			
				
				getContentPane().add(gebdatum);
				gebdatum.setBounds(21, 131, 135, 16);
			
				getContentPane().add(ort);
				ort.setBounds(22, 224, 165, 16);
			
				getContentPane().add(zusatz);
				zusatz.setBounds(22, 286, 79, 16);
			
				getContentPane().add(jTextFieldKdnummer);
				jTextFieldKdnummer.setBounds(186, 253, 129, 21);
			
				getContentPane().add(jTextFieldZusatz);
				jTextFieldZusatz.setBounds(186, 284, 129, 21);
			
				getContentPane().add(kdnummer);
				kdnummer.setBounds(22, 255, 165, 16);
			}

			if (JFrameFbsGUI.neuebuchung == true)
			{				
				Weiter = new JButton("Weiter");
				getContentPane().add(Weiter);
				Weiter.setBounds(327, 252, 121, 25);
				Weiter.addActionListener(this);
				Weiter.setActionCommand("Weiter");
			}
			{
				Ksuchen = new JButton();
				getContentPane().add(Ksuchen);
				Ksuchen.setText("Suchen");
				Ksuchen.setBounds(327, 221, 121, 25);
				Ksuchen.addActionListener(this);
				Ksuchen.setActionCommand("KundeSuchen");

			}
			if (JFrameFbsGUI.neuebuchung == false)
			{
				bchange = new JButton();
				getContentPane().add(bchange);
				bchange.setText("Ändern");
				bchange.setBounds(327, 251, 121, 25);
				bchange.addActionListener(this);
				bchange.setActionCommand("KundeAendern");
			
				binactive = new JButton();
				getContentPane().add(binactive);
				binactive.setText("Loeschen");
				binactive.setBounds(327, 283, 121, 25);
				binactive.addActionListener(this);
				binactive.setActionCommand("KundeLoeschen");
				
				getContentPane().add(getActive());
				getActive().setBounds(22, 315, 164, 16);
				
				{
					jaButton = new JRadioButton("Ja");
					getContentPane().add(jaButton);
					jaButton.setBounds(186, 315, 52, 21);
					jaButton.setActionCommand("Ja");
				}
				{
					neinButton = new JRadioButton("Nein");
					getContentPane().add(neinButton);
					neinButton.setBounds(243, 315, 72, 21);
					neinButton.setActionCommand("Nein");

				}
				// Group the radio buttons.
				final ButtonGroup group = new ButtonGroup();
				group.add(jaButton);
				group.add(neinButton);

				// Register a listener for the radio buttons.
				jaButton.addActionListener(this);
				neinButton.addActionListener(this);

			}
/*
			for (int i = 0; i < jLabelArr.length; i++) {
				jLabelArr[i].setBounds(21, 35+(i*31), 135, 22);
			}
*/			
			
			pack();
			this.setSize(600, 600);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
			visible = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		  
	
	}
	
	
	public void actionPerformed(ActionEvent ae) {

		if ("zurueck".equals(ae.getActionCommand())) {
			visible = false;
			dispose();
			JFrameFbsGUI open = new JFrameFbsGUI();
			open.setLocationRelativeTo(null);
			open.setVisible(true);
		}
			if ("einschrittzurueck".equals(ae.getActionCommand())) {
				visible = false;
				this.setVisible(false);
				new JFrameFlugSuchen("neue Buchung vornehmen");
			}
			
		
		if (ae.getActionCommand().equals("Weiter")) {
			visible = false;
			this.setVisible(false);
			new JFrameNeueBuchung("Neue Buchung");		
		}
		
		
		if (ae.getActionCommand().equals("KundeAendern")) {
			int n = JOptionPane
					.showConfirmDialog(
							inst,
							"Sind Sie sicher das sie die Änderungen speichern möchten?",
							"Löschvorgang bestätigen!",
							JOptionPane.YES_NO_OPTION);
			if (n == 0) {
				// wenn ja in die Datenbank schreiben
			} else {
				// kehrt zurück zum Ausgangsbildschirm

			}
		}

		if (ae.getActionCommand().equals("KundeSuchen")) {
			// Anbindung der DB notwendig!!!!
			strAnrede = jTextFieldAnrede.getText();
			strVorname = jTextFieldVorname.getText();
			strNachname = jTextFieldNachname.getText();
			strGebdatum = jTextFieldGebdatum.getText();
			strStrasse = jTextFieldStrasse.getText();
			strHausnummer = jTextFieldHausnummer.getText();
			strPlz = jTextFieldPlz.getText();
			strWohnort = jTextFieldOrt.getText();
			strKdnummer = jTextFieldKdnummer.getText();
			strZusatztext = jTextFieldZusatz.getText();
			choice = ae.getActionCommand();
			
		}

		if (ae.getActionCommand().equals("KundeLoeschen")) {
			int n = JOptionPane.showConfirmDialog(inst,
					"Sind Sie sicher das sie den Kunden löschen möchten?",
					"Löschvorgang bestätigen!",
					// JOptionPane.WARNING_MESSAGE,
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (n == 0) {
				// wenn ja in die Datenbankschreiben
			} else {
				// kehrt zurück zum Ausgangsbildschirm
			}
		}
		
		if (ae.getActionCommand().equals("Ja")){
			setStrActive("J");
		}
		
		if (ae.getActionCommand().equals("Nein")){
			setStrActive("N");
		}
		
		// Meine Klasse und Methode!!!
		ActionEventHandler.actionperformed(ae, this);

		
	}
	
	
	

	
	public JTextField getJTextFieldKdnummer() {
		return jTextFieldKdnummer;
	}

	public void setJTextFieldKdnummer(JTextField textFieldKdnummer) {
		jTextFieldKdnummer = textFieldKdnummer;
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

	public JButton getBinactive() {
		return binactive;
	}

	public void setBinactive(JButton binactive) {
		this.binactive = binactive;
	}

	public JButton getBchange() {
		return bchange;
	}

	public void setBchange(JButton bchange) {
		this.bchange = bchange;
	}

	public JButton getKsuchen() {
		return Ksuchen;
	}

	public void setKsuchen(JButton ksuchen) {
		Ksuchen = ksuchen;
	}

	public JRadioButton getNeinButton() {
		return neinButton;
	}

	public void setNeinButton(JRadioButton neinButton) {
		this.neinButton = neinButton;
	}

	public JRadioButton getJaButton() {
		return jaButton;
	}

	public void setJaButton(JRadioButton jaButton) {
		this.jaButton = jaButton;
	}

	public String getStrActive() {
		return strActive;
	}

	public void setStrActive(String strActive) {
		this.strActive = strActive;
	}

	public ButtonGroup getButtonGroup1() {
		return buttonGroup1;
	}

	public void setButtonGroup1(ButtonGroup buttonGroup1) {
		this.buttonGroup1 = buttonGroup1;
	}

	public JLabel getKdnummer() {
		return kdnummer;
	}

	public void setKdnummer(JLabel kdnummer) {
		this.kdnummer = kdnummer;
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

	public JLabel getActive() {
		return active;
	}

	public void setActive(JLabel active) {
		this.active = active;
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

	public JFrame getInst() {
		return inst;
	}

	public void setInst(JFrame inst) {
		this.inst = inst;
	}


	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public String getStrKdnummer() {
		return strKdnummer;
	}

	public void setStrKdnummer(String strKdnummer) {
		this.strKdnummer = strKdnummer;
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

	public String getStrWohnort() {
		return strWohnort;
	}

	public void setStrWohnort(String strWohnort) {
		this.strWohnort = strWohnort;
	}

	public String getStrPlz() {
		return strPlz;
	}

	public void setStrPlz(String strPlz) {
		this.strPlz = strPlz;
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

	public static boolean isGepaeck() {
		return gepaeck;
	}

	public static void setGepaeck(boolean gepaeck) {
		JFrameKundeSuchen.gepaeck = gepaeck;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public ButtonGroup getGroup() {
		return group;
	}

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	

}
