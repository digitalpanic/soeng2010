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
import javax.swing.JTable;
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
public class JFrameReservierungSuchen extends JFrameSuchen implements
		ActionListener {

	private static final long serialVersionUID = 1L;

	private JButton jButtonAnzeigen;

	private JTextField jTextFieldReservierungsID = new JTextField();
	private JTextField jTextFieldKundennummer = new JTextField();
	private JTextField jTextFieldGepaeck = new JTextField();
	private JTextField jTextFieldFlugID = new JTextField();

	JTextField[] jTextFieldArr = { jTextFieldReservierungsID,
			jTextFieldKundennummer, jTextFieldGepaeck, jTextFieldFlugID };

	private JLabel jLabelReservierungsID = new JLabel("RESERVIERUNGSID");
	private JLabel jLabelKundennummer = new JLabel("KUNDENNUMMER");
	private JLabel jLabelGepaeck = new JLabel("GEPAECK");
	private JLabel jLabelFlugID = new JLabel("FLUGID");

	JLabel[] jLabelArr = { jLabelReservierungsID, jLabelKundennummer,
			jLabelGepaeck, jLabelFlugID };

	private JTable jTableReservierung;
	private JMenuBar Menu;
	private JMenu jMenu1;
	private JMenuItem jMenuItem1;

	private JRadioButton jRadioButtonNein;
	private JRadioButton jRadioButtonJa;

	private String strReservierungsID, strKundennummer, strGepaeck = "*", strFlugID;

	private String[] textArr = { strReservierungsID, strKundennummer,
			strGepaeck, strFlugID };

	public JFrameReservierungSuchen(String str) {
		super(str);
		initGUI();

		jLabelReservierungsID.setName("RESERVIERUNGSID");
		jLabelKundennummer.setName("KUNDENNUMMER");
		jLabelGepaeck.setName("GEPAECK");
		jLabelFlugID.setName("FLUGID");
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
					jMenu1.setText("Zurück");
					{
						jMenuItem1 = new JMenuItem();
						jMenu1.add(jMenuItem1);
						jMenuItem1.setText("zum Hauptmenu");
					}
					jMenuItem1.setActionCommand("zurueck");
					jMenuItem1.addActionListener(this);
				}
			}

			{
				jButtonAnzeigen = new JButton();
				getContentPane().add(jButtonAnzeigen);
				jButtonAnzeigen.setText("Suchen");
				jButtonAnzeigen.setBounds(254, 215, 105, 28);
				jButtonAnzeigen.addActionListener(this);
				jButtonAnzeigen.setActionCommand("ReservierungSuchen");

				getContentPane().add(jLabelReservierungsID);
				jLabelReservierungsID.setText("Reservierungs ID:");
				jLabelReservierungsID.setBounds(19, 45, 132, 17);

				getContentPane().add(jLabelKundennummer);
				jLabelKundennummer.setText("Kundennummer:");
				jLabelKundennummer.setBounds(19, 91, 132, 19);

				getContentPane().add(jLabelFlugID);
				jLabelFlugID.setText("FLug ID:");
				jLabelFlugID.setBounds(19, 141, 132, 17);

				getContentPane().add(jLabelGepaeck);
				jLabelGepaeck.setText("Zusatzgepaeck:");
				jLabelGepaeck.setBounds(19, 182, 132, 17);

				getContentPane().add(jTextFieldReservierungsID);
				jTextFieldReservierungsID.setBounds(151, 43, 142, 23);

				getContentPane().add(jTextFieldKundennummer);
				jTextFieldKundennummer.setBounds(151, 91, 142, 23);

				getContentPane().add(jTextFieldFlugID);
				jTextFieldFlugID.setBounds(151, 139, 142, 23);

				{
					jRadioButtonJa = new JRadioButton();
					getContentPane().add(jRadioButtonJa);
					jRadioButtonJa.setText("Ja");
					jRadioButtonJa.setBounds(151, 182, 54, 20);
					jRadioButtonJa.setActionCommand("Ja");

					jRadioButtonNein = new JRadioButton();
					getContentPane().add(jRadioButtonNein);
					jRadioButtonNein.setText("Nein");
					jRadioButtonNein.setBounds(216, 182, 77, 20);
					jRadioButtonNein.setActionCommand("Nein");

					// Group the radio buttons.
					final ButtonGroup group = new ButtonGroup();
					group.add(jRadioButtonJa);
					group.add(jRadioButtonNein);

					// Register a listener for the radio buttons.
					jRadioButtonJa.addActionListener(this);
					jRadioButtonNein.addActionListener(this);
				}
			}
			pack();
			this.setSize(388, 394);
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
		if ("ReservierungSuchen".equals(ae.getActionCommand())) {
			strReservierungsID = jTextFieldReservierungsID.getText();
			strKundennummer = jTextFieldKundennummer.getText();
			strGepaeck = jTextFieldGepaeck.getText();
			strFlugID = jTextFieldFlugID.getText();

		}
		ActionEventHandler.actionperformed(ae, this);
	}
	
	public JButton getJButtonAnzeigen() {
		return jButtonAnzeigen;
	}

	public void setJButtonAnzeigen(JButton buttonAnzeigen) {
		jButtonAnzeigen = buttonAnzeigen;
	}

	public JTextField getJTextFieldReservierungsID() {
		return jTextFieldReservierungsID;
	}

	public void setJTextFieldReservierungsID(JTextField textFieldReservierungsID) {
		jTextFieldReservierungsID = textFieldReservierungsID;
	}

	public JTextField getJTextFieldKundennummer() {
		return jTextFieldKundennummer;
	}

	public void setJTextFieldKundennummer(JTextField textFieldKundennummer) {
		jTextFieldKundennummer = textFieldKundennummer;
	}

	public JTextField getJTextFieldGepaeck() {
		return jTextFieldGepaeck;
	}

	public void setJTextFieldGepaeck(JTextField textFieldGepaeck) {
		jTextFieldGepaeck = textFieldGepaeck;
	}

	public JTextField getJTextFieldFlugID() {
		return jTextFieldFlugID;
	}

	public void setJTextFieldFlugID(JTextField textFieldFlugID) {
		jTextFieldFlugID = textFieldFlugID;
	}

	public JTextField[] getJTextFieldArr() {
		return jTextFieldArr;
	}

	public void setJTextFieldArr(JTextField[] textFieldArr) {
		jTextFieldArr = textFieldArr;
	}

	public JLabel getJLabelReservierungsID() {
		return jLabelReservierungsID;
	}

	public void setJLabelReservierungsID(JLabel labelReservierungsID) {
		jLabelReservierungsID = labelReservierungsID;
	}

	public JLabel getJLabelKundennummer() {
		return jLabelKundennummer;
	}

	public void setJLabelKundennummer(JLabel labelKundennummer) {
		jLabelKundennummer = labelKundennummer;
	}

	public JLabel getJLabelGepaeck() {
		return jLabelGepaeck;
	}

	public void setJLabelGepaeck(JLabel labelGepaeck) {
		jLabelGepaeck = labelGepaeck;
	}

	public JLabel getJLabelFlugID() {
		return jLabelFlugID;
	}

	public void setJLabelFlugID(JLabel labelFlugID) {
		jLabelFlugID = labelFlugID;
	}

	public JLabel[] getJLabelArr() {
		return jLabelArr;
	}

	public void setJLabelArr(JLabel[] labelArr) {
		jLabelArr = labelArr;
	}

	public JTable getJTableReservierung() {
		return jTableReservierung;
	}

	public void setJTableReservierung(JTable tableReservierung) {
		jTableReservierung = tableReservierung;
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

	public JRadioButton getJRadioButtonNein() {
		return jRadioButtonNein;
	}

	public void setJRadioButtonNein(JRadioButton radioButtonNein) {
		jRadioButtonNein = radioButtonNein;
	}

	public JRadioButton getJRadioButtonJa() {
		return jRadioButtonJa;
	}

	public void setJRadioButtonJa(JRadioButton radioButtonJa) {
		jRadioButtonJa = radioButtonJa;
	}

	public String getStrReservierungsID() {
		return strReservierungsID;
	}

	public void setStrReservierungsID(String strReservierungsID) {
		this.strReservierungsID = strReservierungsID;
	}

	public String getStrKundennummer() {
		return strKundennummer;
	}

	public void setStrKundennummer(String strKundennummer) {
		this.strKundennummer = strKundennummer;
	}

	public String getStrGepaeck() {
		return strGepaeck;
	}

	public void setStrGepaeck(String strGepaeck) {
		this.strGepaeck = strGepaeck;
	}

	public String getStrFlugID() {
		return strFlugID;
	}

	public void setStrFlugID(String strFlugID) {
		this.strFlugID = strFlugID;
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