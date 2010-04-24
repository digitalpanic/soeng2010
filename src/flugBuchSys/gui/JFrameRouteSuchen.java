package flugBuchSys.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import flugBuchSys.app.ActionEventHandler;

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
public class JFrameRouteSuchen extends JFrameSuchen implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JButton jButtonSuchen = new JButton();
	private JButton jButtonAendern = new JButton();
	private JButton jButtonLoeschen = new JButton();

	private JRadioButton jRadioButtonno = new JRadioButton("Nein");
	private JRadioButton jRadioButtonyes = new JRadioButton("Ja");

	private JTextField jTextFieldRouteID = new JTextField();
	private JTextField jTextFieldVon = new JTextField();
	private JTextField jTextFieldNach = new JTextField();
	private JTextField jTextFieldHinflug = new JTextField();
	private JTextField jTextFieldPreisEco = new JTextField();
	private JTextField jTextFieldPreisBuis = new JTextField();
	private JTextField jTextFieldPreisFirst = new JTextField();
	private JTextField jTextFieldPreisGepaeck = new JTextField();

	JTextField[] jTextFieldArr = { jTextFieldRouteID, jTextFieldVon,
			jTextFieldNach, jTextFieldHinflug, jTextFieldPreisEco,
			jTextFieldPreisBuis, jTextFieldPreisFirst, jTextFieldPreisGepaeck, };

	private JLabel jLabelRouteID = new JLabel("RouteID:");
	private JLabel jLabelVon = new JLabel("Abflughafen:");
	private JLabel jLabelNach = new JLabel("Zielflughafen:");
	private JLabel jLabelHinflug = new JLabel("Hinflug: ");
	private JLabel jLabelPreisEco = new JLabel("Preis Economy:");
	private JLabel jLabelPreisBuis = new JLabel("Preis Business Class:");
	private JLabel jLabelPreisFirst = new JLabel("Preis First Class:");
	private JLabel jLabelPreisGepaeck = new JLabel("Preis fuer Zusatzgepaeck:");
	private JLabel jLabelActive = new JLabel("Ist der Kunde noch aktiv?");

	JLabel[] jLabelArr = { jLabelRouteID, jLabelVon, jLabelNach, jLabelHinflug,
			jLabelPreisEco, jLabelPreisBuis, jLabelPreisFirst,
			jLabelPreisGepaeck, jLabelActive };

	private JMenuBar Menu;
	private JMenu jMenu1;
	private JMenuItem jMenuItem1;

	private String strRouteID, strVon, strNach, strHinflug, strPreisEco,
			strPreisBuis, strPreisFirst, strPreisgepaeck, strActive="*";

	private String[] textArr = { strRouteID, strVon, strNach, strHinflug,
			strPreisEco, strPreisBuis, strPreisFirst, strPreisgepaeck };

	public JFrameRouteSuchen(String str) {
		super(str);
		initGUI();
		jLabelRouteID.setName("ROUTEID");
		jLabelVon.setName("VON");
		jLabelNach.setName("NACH");
		jLabelHinflug.setName("HINFLUG");
		jLabelPreisEco.setName("PREISECO");
		jLabelPreisBuis.setName("PREISBUIS");
		jLabelPreisFirst.setName("PREISFIRST");
		jLabelPreisGepaeck.setName("PREISGEPAECK");
		jLabelActive.setName("ACTIVE");
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				Menu = new JMenuBar();
				setJMenuBar(Menu);
				{
					jMenu1 = new JMenu();
					Menu.add(jMenu1);
					jMenu1.setText("Zurueck");
					{
						jMenuItem1 = new JMenuItem();
						jMenu1.add(jMenuItem1);
						jMenuItem1.setText("zum Hauptmenu");
					}
					jMenuItem1.setActionCommand("zurueck");
					jMenuItem1.addActionListener(this);
				}

				getContentPane().add(jLabelRouteID, "Center");
				jLabelRouteID.setText("Route ID:");
				jLabelRouteID.setBounds(12, 23, 183, 21);

				getContentPane().add(jLabelVon);
				jLabelVon.setText("Abflughafen:");
				jLabelVon.setBounds(12, 56, 183, 16);

				getContentPane().add(jLabelNach);
				jLabelNach.setText("Zielflughafen:");
				jLabelNach.setBounds(12, 87, 184, 16);

				getContentPane().add(jLabelHinflug);
				jLabelHinflug.setText("Hinflug:");
				jLabelHinflug.setBounds(12, 118, 183, 16);

				getContentPane().add(jLabelPreisEco);
				jLabelPreisEco.setText("Preis Economy:");
				jLabelPreisEco.setBounds(12, 149, 183, 16);

				getContentPane().add(jLabelPreisBuis);
				jLabelPreisBuis.setText("Preis Business:");
				jLabelPreisBuis.setBounds(12, 180, 183, 16);

				getContentPane().add(jLabelPreisFirst);
				jLabelPreisFirst.setText("Preis First Class:");
				jLabelPreisFirst.setBounds(12, 211, 183, 16);

				getContentPane().add(jLabelPreisGepaeck);
				jLabelPreisGepaeck.setText("Preis fuer Zusatzgepaeck:");
				jLabelPreisGepaeck.setBounds(12, 242, 183, 16);

				getContentPane().add(jLabelActive);
				jLabelActive.setText("Ist die Route noch aktiv?");
				jLabelActive.setBounds(11, 282, 183, 23);

				getContentPane().add(jTextFieldRouteID);
				jTextFieldRouteID.setBounds(195, 22, 143, 23);

				getContentPane().add(jTextFieldVon);
				jTextFieldVon.setBounds(195, 53, 143, 23);

				getContentPane().add(jTextFieldNach);
				jTextFieldNach.setBounds(195, 84, 143, 23);

				getContentPane().add(jTextFieldPreisEco);
				jTextFieldPreisEco.setBounds(195, 146, 143, 23);

				getContentPane().add(jTextFieldHinflug);
				jTextFieldHinflug.setBounds(195, 115, 143, 23);

				getContentPane().add(jTextFieldPreisBuis);
				jTextFieldPreisBuis.setBounds(195, 177, 143, 23);

				getContentPane().add(jTextFieldPreisFirst);
				jTextFieldPreisFirst.setBounds(195, 208, 143, 23);

				getContentPane().add(jTextFieldPreisGepaeck);
				jTextFieldPreisGepaeck.setBounds(195, 239, 143, 23);

				{

					getContentPane().add(jRadioButtonyes);
					jRadioButtonyes.setBounds(197, 284, 52, 21);
					jRadioButtonyes.setActionCommand("Ja");
				}
				{
					getContentPane().add(jRadioButtonno);
					jRadioButtonno.setBounds(256, 285, 72, 21);
					jRadioButtonno.setActionCommand("Nein");

				}
				// Group the radio buttons.
				final ButtonGroup group = new ButtonGroup();
				group.add(jRadioButtonyes);
				group.add(jRadioButtonno);

				// Register a listener for the radio buttons.
				jRadioButtonyes.addActionListener(this);
				jRadioButtonno.addActionListener(this);

				getContentPane().add(jButtonSuchen);
				jButtonSuchen.setText("Suchen");
				jButtonSuchen.setBounds(350, 237, 87, 27);
				jButtonSuchen.setActionCommand("RouteSuchen");
				jButtonSuchen.addActionListener(this);

				getContentPane().add(jButtonAendern);
				jButtonAendern.setText("Aendern");
				jButtonAendern.setBounds(350, 275, 87, 27);
				jButtonAendern.setActionCommand("RouteAendern");
				jButtonAendern.addActionListener(this);

				getContentPane().add(jButtonLoeschen);
				jButtonLoeschen.setText("Loeschen");
				jButtonLoeschen.setBounds(350, 313, 87, 27);
				jButtonLoeschen.setActionCommand("RouteLoeschen");
				jButtonLoeschen.addActionListener(this);
			}
			pack();
			this.setSize(500, 580);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent ae) {
		if ("zurueck".equals(ae.getActionCommand())) {
			dispose();
			new JFrameFbsGUI();
		}
		if ("RouteSuchen".equals(ae.getActionCommand())) {
			strRouteID = jTextFieldRouteID.getText();
			strVon = jTextFieldVon.getText();
			strNach = jTextFieldNach.getText();
			strHinflug = jTextFieldHinflug.getText();
			strPreisEco = jTextFieldPreisEco.getText();
			strPreisBuis = jTextFieldPreisBuis.getText();
			strPreisFirst = jTextFieldPreisFirst.getText();
			strPreisgepaeck = jTextFieldPreisGepaeck.getText();
		}
		if ("RouteAendern".equals(ae.getActionCommand())) {

		}
		if ("RouteLoeschen".equals(ae.getActionCommand())) {

		}
		ActionEventHandler.actionperformed(ae, this);
	}

	public String getStrActive() {
		return strActive;
	}

	public void setStrActive(String strActive) {
		this.strActive = strActive;
	}

	public JLabel getJLabelActive() {
		return jLabelActive;
	}

	public JButton getJButtonSuchen() {
		return jButtonSuchen;
	}

	public void setJButtonSuchen(JButton buttonSuchen) {
		jButtonSuchen = buttonSuchen;
	}

	public JButton getJButtonAendern() {
		return jButtonAendern;
	}

	public void setJButtonAendern(JButton buttonAendern) {
		jButtonAendern = buttonAendern;
	}

	public JButton getJButtonLoeschen() {
		return jButtonLoeschen;
	}

	public void setJButtonLoeschen(JButton buttonLoeschen) {
		jButtonLoeschen = buttonLoeschen;
	}

	public JRadioButton getJRadioButtonno() {
		return jRadioButtonno;
	}

	public void setJRadioButtonno(JRadioButton radioButtonno) {
		jRadioButtonno = radioButtonno;
	}

	public JRadioButton getJRadioButtonyes() {
		return jRadioButtonyes;
	}

	public void setJRadioButtonyes(JRadioButton radioButtonyes) {
		jRadioButtonyes = radioButtonyes;
	}

	public JTextField getJTextFieldRouteID() {
		return jTextFieldRouteID;
	}

	public void setJTextFieldRouteID(JTextField textFieldRouteID) {
		jTextFieldRouteID = textFieldRouteID;
	}

	public JTextField getJTextFieldVon() {
		return jTextFieldVon;
	}

	public void setJTextFieldVon(JTextField textFieldVon) {
		jTextFieldVon = textFieldVon;
	}

	public JTextField getJTextFieldNach() {
		return jTextFieldNach;
	}

	public void setJTextFieldNach(JTextField textFieldNach) {
		jTextFieldNach = textFieldNach;
	}

	public JTextField getJTextFieldHinflug() {
		return jTextFieldHinflug;
	}

	public void setJTextFieldHinflug(JTextField textFieldHinflug) {
		jTextFieldHinflug = textFieldHinflug;
	}

	public JTextField getJTextFieldPreisEco() {
		return jTextFieldPreisEco;
	}

	public void setJTextFieldPreisEco(JTextField textFieldPreisEco) {
		jTextFieldPreisEco = textFieldPreisEco;
	}

	public JTextField getJTextFieldPreisBuis() {
		return jTextFieldPreisBuis;
	}

	public void setJTextFieldPreisBuis(JTextField textFieldPreisBuis) {
		jTextFieldPreisBuis = textFieldPreisBuis;
	}

	public JTextField getJTextFieldPreisFirst() {
		return jTextFieldPreisFirst;
	}

	public void setJTextFieldPreisFirst(JTextField textFieldPreisFirst) {
		jTextFieldPreisFirst = textFieldPreisFirst;
	}

	public JTextField getJTextFieldPreisGepaeck() {
		return jTextFieldPreisGepaeck;
	}

	public void setJTextFieldPreisGepaeck(JTextField textFieldPreisGepaeck) {
		jTextFieldPreisGepaeck = textFieldPreisGepaeck;
	}

	public JTextField[] getJTextFieldArr() {
		return jTextFieldArr;
	}

	public void setJTextFieldArr(JTextField[] textFieldArr) {
		jTextFieldArr = textFieldArr;
	}

	public JLabel getJLabelRouteID() {
		return jLabelRouteID;
	}

	public void setJLabelRouteID(JLabel labelRouteID) {
		jLabelRouteID = labelRouteID;
	}

	public JLabel getJLabelVon() {
		return jLabelVon;
	}

	public void setJLabelVon(JLabel labelVon) {
		jLabelVon = labelVon;
	}

	public JLabel getJLabelNach() {
		return jLabelNach;
	}

	public void setJLabelNach(JLabel labelNach) {
		jLabelNach = labelNach;
	}

	public JLabel getJLabelHinflug() {
		return jLabelHinflug;
	}

	public void setJLabelHinflug(JLabel labelHinflug) {
		jLabelHinflug = labelHinflug;
	}

	public JLabel getJLabelPreisEco() {
		return jLabelPreisEco;
	}

	public void setJLabelPreisEco(JLabel labelPreisEco) {
		jLabelPreisEco = labelPreisEco;
	}

	public JLabel getJLabelPreisBuis() {
		return jLabelPreisBuis;
	}

	public void setJLabelPreisBuis(JLabel labelPreisBuis) {
		jLabelPreisBuis = labelPreisBuis;
	}

	public JLabel getJLabelPreisFirst() {
		return jLabelPreisFirst;
	}

	public void setJLabelPreisFirst(JLabel labelPreisFirst) {
		jLabelPreisFirst = labelPreisFirst;
	}

	public JLabel getJLabelPreisGepaeck() {
		return jLabelPreisGepaeck;
	}

	public void setJLabelPreisGepaeck(JLabel labelPreisGepaeck) {
		jLabelPreisGepaeck = labelPreisGepaeck;
	}

	public JLabel getActive() {
		return jLabelActive;
	}

	public void setJLabelActive(JLabel labelActive) {
		jLabelActive = labelActive;
	}

	public JLabel[] getJLabelArr() {
		return jLabelArr;
	}

	public void setJLabelArr(JLabel[] labelArr) {
		jLabelArr = labelArr;
	}

	public JMenuBar getMenu() {
		return Menu;
	}

	public void setMenu(JMenuBar menu) {
		Menu = menu;
	}

	public JMenu getJMenu1() {
		return jMenu1;
	}

	public void setJMenu1(JMenu menu1) {
		jMenu1 = menu1;
	}

	public JMenuItem getJMenuItem1() {
		return jMenuItem1;
	}

	public void setJMenuItem1(JMenuItem menuItem1) {
		jMenuItem1 = menuItem1;
	}

	public String getStrRouteID() {
		return strRouteID;
	}

	public void setStrRouteID(String strRouteID) {
		this.strRouteID = strRouteID;
	}

	public String getStrVon() {
		return strVon;
	}

	public void setStrVon(String strVon) {
		this.strVon = strVon;
	}

	public String getStrNach() {
		return strNach;
	}

	public void setStrNach(String strNach) {
		this.strNach = strNach;
	}

	public String getStrHinflug() {
		return strHinflug;
	}

	public void setStrHinflug(String strHinflug) {
		this.strHinflug = strHinflug;
	}

	public String getStrPreisEco() {
		return strPreisEco;
	}

	public void setStrPreisEco(String strPreisEco) {
		this.strPreisEco = strPreisEco;
	}

	public String getStrPreisBuis() {
		return strPreisBuis;
	}

	public void setStrPreisBuis(String strPreisBuis) {
		this.strPreisBuis = strPreisBuis;
	}

	public String getStrPreisFirst() {
		return strPreisFirst;
	}

	public void setStrPreisFirst(String strPreisFirst) {
		this.strPreisFirst = strPreisFirst;
	}

	public String getStrPreisgepaeck() {
		return strPreisgepaeck;
	}

	public void setStrPreisgepaeck(String strPreisgepaeck) {
		this.strPreisgepaeck = strPreisgepaeck;
	}

	public String[] getTextArr() {
		return textArr;
	}

	public void setTextArr(String[] textArr) {
		this.textArr = textArr;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
}