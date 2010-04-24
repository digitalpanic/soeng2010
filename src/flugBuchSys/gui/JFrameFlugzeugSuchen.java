package flugBuchSys.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
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
public class JFrameFlugzeugSuchen extends JFrameSuchen implements
		ActionListener {

	private static final long serialVersionUID = 1L;

	private JTextField jTextFieldFlugzeugID = new JTextField();
	private JTextField jTextFieldLuftfahrtkennzeichen = new JTextField();
	private JTextField jTextFieldKapEco = new JTextField();
	private JTextField jTextFieldKapBuis = new JTextField();
	private JTextField jTextFieldKapFirst = new JTextField();
	private JTextField jTextFieldFlugzeugname = new JTextField();
	private JTextField jTextFieldFlugzeugtyp = new JTextField();

	JTextField[] jTextFieldArr = { jTextFieldFlugzeugID,
			jTextFieldLuftfahrtkennzeichen, jTextFieldKapEco,
			jTextFieldKapBuis, jTextFieldKapFirst, jTextFieldFlugzeugname,
			jTextFieldFlugzeugtyp };

	private JButton binactive;
	private JRadioButton neinButton;
	private JRadioButton jaButton;
	private JButton bchange;
	private JButton Fsuchen;

	private JMenuItem jMenuItem1;
	private JMenu jMenu1;
	private JMenuBar Menu;

	private JLabel FlugzeugID = new JLabel();
	private JLabel Luftfahrtkennzeichen = new JLabel();
	private JLabel KapEco = new JLabel();
	private JLabel KapBuis = new JLabel();
	private JLabel KapFirst = new JLabel();
	private JLabel Flugzeugtyp = new JLabel();
	private JLabel Flugzeugname = new JLabel();
	private JLabel Active = new JLabel();

	private JLabel[] jLabelArr = { FlugzeugID, Luftfahrtkennzeichen, KapEco,
			KapBuis, KapFirst, Flugzeugtyp, Flugzeugname, Active };

	private JFrame inst;

	private String planename, strFlugzeugId, strLuftfahrtkennzeichen,
			strKapeco, strKapbuis, strKapfirst, strFlugzeugtyp,
			strFlugzeugname, strActive="*";
	private String[] textArr = { strFlugzeugId, strLuftfahrtkennzeichen,
			strKapeco, strKapbuis, strKapfirst, strFlugzeugtyp,
			strFlugzeugname, strActive };
	private String choice;

	public JFrameFlugzeugSuchen(String str) {
		super(str);
		initGUI();
	}

	private void initGUI() {

		FlugzeugID.setName("FLUGZEUGID");
		Luftfahrtkennzeichen.setName("LUFTFAHRTKENNZEICHEN");
		KapEco.setName("KAPECO");
		KapBuis.setName("KAPBUIS");
		KapFirst.setName("KAPFIRST");
		Flugzeugname.setName("FLUGZEUGNAME");
		Flugzeugtyp.setName("FLUGZEUGTYP");
		Active.setName("ACTIVE");

		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setPreferredSize(new java.awt.Dimension(523, 365));
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
						jMenuItem1.addActionListener(this);
						jMenuItem1.setActionCommand("zurueck");
					}
				}

				getContentPane().add(jTextFieldFlugzeugID, "Center");
				jTextFieldFlugzeugID.setBounds(186, 36, 129, 21);

				getContentPane().add(jTextFieldLuftfahrtkennzeichen);
				jTextFieldLuftfahrtkennzeichen.setBounds(186, 67, 129, 21);

				getContentPane().add(jTextFieldKapEco);
				jTextFieldKapEco.setBounds(186, 98, 129, 21);

				getContentPane().add(FlugzeugID);
				FlugzeugID.setText("Flugzeug ID:");
				FlugzeugID.setBounds(21, 35, 135, 22);

				getContentPane().add(Luftfahrtkennzeichen);
				Luftfahrtkennzeichen.setText("Luftfahrtkennzeichen:");
				Luftfahrtkennzeichen.setBounds(21, 66, 135, 22);

				getContentPane().add(KapEco);
				KapEco.setText("Kapazitaet Economy:");
				KapEco.setBounds(21, 97, 135, 22);

				getContentPane().add(Flugzeugname);
				Flugzeugname.setText("Flugzeugname:");
				Flugzeugname.setBounds(21, 193, 135, 16);

				getContentPane().add(jTextFieldKapBuis);
				jTextFieldKapBuis.setBounds(186, 129, 129, 21);

				getContentPane().add(jTextFieldKapFirst);
				jTextFieldKapFirst.setBounds(186, 160, 129, 21);

				getContentPane().add(KapFirst);
				KapFirst.setText("Kapazitaet First:");
				KapFirst.setBounds(21, 162, 135, 16);

				getContentPane().add(jTextFieldFlugzeugname);
				jTextFieldFlugzeugname.setBounds(186, 191, 129, 21);

				getContentPane().add(jTextFieldFlugzeugtyp);
				jTextFieldFlugzeugtyp.setBounds(186, 222, 129, 21);

				getContentPane().add(Flugzeugtyp);
				Flugzeugtyp.setText("Flugzeugtyp:");
				Flugzeugtyp.setBounds(22, 224, 165, 22);

				getContentPane().add(KapBuis);
				KapBuis.setText("Kapazitaet Business:");
				KapBuis.setBounds(21, 131, 135, 16);

				getContentPane().add(Active);
				Active.setText("Ist das Flugzeug noch aktiv?");
				Active.setBounds(22, 255, 165, 22);

				jaButton = new JRadioButton();
				getContentPane().add(jaButton);
				jaButton.setText("Ja");
				jaButton.setBounds(186, 253, 52, 21);
				jaButton.setActionCommand("Ja");

				neinButton = new JRadioButton();
				getContentPane().add(neinButton);
				neinButton.setText("Nein");
				neinButton.setBounds(243, 253, 72, 21);
				neinButton.setActionCommand("Nein");

			}
			// Group the radio buttons.
			final ButtonGroup group = new ButtonGroup();
			group.add(jaButton);
			group.add(neinButton);

			// Register a listener for the radio buttons.
			jaButton.addActionListener(this);
			neinButton.addActionListener(this);

			{
				Fsuchen = new JButton();
				getContentPane().add(Fsuchen);
				Fsuchen.setText("Suchen");
				Fsuchen.setBounds(345, 142, 121, 25);
				Fsuchen.addActionListener(this);
				Fsuchen.setActionCommand("FlugzeugSuchen");

			}

			{
				bchange = new JButton();
				getContentPane().add(bchange);
				bchange.setText("Aendern");
				bchange.setBounds(345, 180, 121, 25);
				bchange.addActionListener(this);
				bchange.setActionCommand("FlugzeugAendern");

			}
			{
				binactive = new JButton();
				getContentPane().add(binactive);
				binactive.setText("Loeschen");
				binactive.setBounds(345, 215, 121, 25);
				binactive.addActionListener(this);
				binactive.setActionCommand("FlugzeugLoeschen");
			}

			pack();
			this.setSize(550, 600);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent arg0) {

		if (arg0.getActionCommand().equals("zurueck")) {
			dispose();
			JFrameFbsGUI open = new JFrameFbsGUI();
			open.setLocationRelativeTo(null);
			open.setVisible(true);
		}
		if (arg0.getActionCommand().equals("FlugzeugSuchen")) {
			strFlugzeugtyp = jTextFieldFlugzeugID.getText();
			strLuftfahrtkennzeichen = jTextFieldLuftfahrtkennzeichen.getText();
			strKapeco = jTextFieldKapEco.getText();
			strKapbuis = jTextFieldKapBuis.getText();
			strKapfirst = jTextFieldKapFirst.getText();
			strFlugzeugname = jTextFieldFlugzeugname.getText();
			strFlugzeugtyp = jTextFieldFlugzeugtyp.getText();
			choice = arg0.getActionCommand();
		}
		if (arg0.getActionCommand().equals("FlugzeugAendern")) {
			int n = JOptionPane
					.showConfirmDialog(
							inst,
							"Sind Sie sicher das sie die Änderungen speichern möchten?",
							"Löschvorgang bestätigen!",
							JOptionPane.YES_NO_OPTION);
			if (n == 0) {
				System.out.println("läuft");
			} else {
				// kehrt zurück zum Ausgangsbildschirm
			}
		}
		if (arg0.getActionCommand().equals("FlugzeugLoeschen")) {
			int n = JOptionPane.showConfirmDialog(inst,
					"Sind Sie sicher das sie das Flugzeug löschen möchten?",
					"Löschvorgang bestätigen!",
					// JOptionPane.WARNING_MESSAGE,
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (n == 0) {
				
			} else {
				// kehrt zurück zum Ausgangsbildschirm
			}

		}
		ActionEventHandler.actionperformed(arg0, this);
	}

	public JTextField getJTextFieldFlugzeugID() {
		return jTextFieldFlugzeugID;
	}

	public void setJTextFieldFlugzeugID(JTextField textFieldFlugzeugID) {
		jTextFieldFlugzeugID = textFieldFlugzeugID;
	}

	public JTextField getJTextFieldLuftfahrtkennzeichen() {
		return jTextFieldLuftfahrtkennzeichen;
	}

	public void setJTextFieldLuftfahrtkennzeichen(
			JTextField textFieldLuftfahrtkennzeichen) {
		jTextFieldLuftfahrtkennzeichen = textFieldLuftfahrtkennzeichen;
	}

	public JTextField getJTextFieldKapEco() {
		return jTextFieldKapEco;
	}

	public void setJTextFieldKapEco(JTextField textFieldKapEco) {
		jTextFieldKapEco = textFieldKapEco;
	}

	public JTextField getJTextFieldKapBuis() {
		return jTextFieldKapBuis;
	}

	public void setJTextFieldKapBuis(JTextField textFieldKapBuis) {
		jTextFieldKapBuis = textFieldKapBuis;
	}

	public JTextField getJTextFieldKapFirst() {
		return jTextFieldKapFirst;
	}

	public void setJTextFieldKapFirst(JTextField textFieldKapFirst) {
		jTextFieldKapFirst = textFieldKapFirst;
	}

	public JTextField getJTextFieldFlugzeugname() {
		return jTextFieldFlugzeugname;
	}

	public void setJTextFieldFlugzeugname(JTextField textFieldFlugzeugname) {
		jTextFieldFlugzeugname = textFieldFlugzeugname;
	}

	public JTextField getJTextFieldFlugzeugtyp() {
		return jTextFieldFlugzeugtyp;
	}

	public void setJTextFieldFlugzeugtyp(JTextField textFieldFlugzeugtyp) {
		jTextFieldFlugzeugtyp = textFieldFlugzeugtyp;
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

	public JButton getBchange() {
		return bchange;
	}

	public void setBchange(JButton bchange) {
		this.bchange = bchange;
	}

	public JButton getFsuchen() {
		return Fsuchen;
	}

	public void setFsuchen(JButton fsuchen) {
		Fsuchen = fsuchen;
	}

	public JMenuItem getJMenuItem1() {
		return jMenuItem1;
	}

	public void setJMenuItem1(JMenuItem menuItem1) {
		jMenuItem1 = menuItem1;
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

	public JLabel getFlugzeugID() {
		return FlugzeugID;
	}

	public void setFlugzeugID(JLabel flugzeugID) {
		FlugzeugID = flugzeugID;
	}

	public JLabel getLuftfahrtkennzeichen() {
		return Luftfahrtkennzeichen;
	}

	public void setLuftfahrtkennzeichen(JLabel luftfahrtkennzeichen) {
		Luftfahrtkennzeichen = luftfahrtkennzeichen;
	}

	public JLabel getKapEco() {
		return KapEco;
	}

	public void setKapEco(JLabel kapEco) {
		KapEco = kapEco;
	}

	public JLabel getKapBuis() {
		return KapBuis;
	}

	public void setKapBuis(JLabel kapBuis) {
		KapBuis = kapBuis;
	}

	public JLabel getKapFirst() {
		return KapFirst;
	}

	public void setKapFirst(JLabel kapFirst) {
		KapFirst = kapFirst;
	}

	public JLabel getFlugzeugtyp() {
		return Flugzeugtyp;
	}

	public void setFlugzeugtyp(JLabel flugzeugtyp) {
		Flugzeugtyp = flugzeugtyp;
	}

	public JLabel getFlugzeugname() {
		return Flugzeugname;
	}

	public void setFlugzeugname(JLabel flugzeugname) {
		Flugzeugname = flugzeugname;
	}

	public JLabel getActive() {
		return Active;
	}

	public void setActive(JLabel active) {
		Active = active;
	}

	public JLabel[] getJLabelArr() {
		return jLabelArr;
	}

	public void setJLabelArr(JLabel[] labelArr) {
		jLabelArr = labelArr;
	}

	public JFrame getInst() {
		return inst;
	}

	public void setInst(JFrame inst) {
		this.inst = inst;
	}

	public String getPlanename() {
		return planename;
	}

	public void setPlanename(String planename) {
		this.planename = planename;
	}

	public String getStrFlugzeugId() {
		return strFlugzeugId;
	}

	public void setStrFlugzeugId(String strFlugzeugId) {
		this.strFlugzeugId = strFlugzeugId;
	}

	public String getStrLuftfahrtkennzeichen() {
		return strLuftfahrtkennzeichen;
	}

	public void setStrLuftfahrtkennzeichen(String strLuftfahrtkennzeichen) {
		this.strLuftfahrtkennzeichen = strLuftfahrtkennzeichen;
	}

	public String getStrKapeco() {
		return strKapeco;
	}

	public void setStrKapeco(String strKapeco) {
		this.strKapeco = strKapeco;
	}

	public String getStrKapbuis() {
		return strKapbuis;
	}

	public void setStrKapbuis(String strKapbuis) {
		this.strKapbuis = strKapbuis;
	}

	public String getStrKapfirst() {
		return strKapfirst;
	}

	public void setStrKapfirst(String strKapfirst) {
		this.strKapfirst = strKapfirst;
	}

	public String getStrFlugzeugtyp() {
		return strFlugzeugtyp;
	}

	public void setStrFlugzeugtyp(String strFlugzeugtyp) {
		this.strFlugzeugtyp = strFlugzeugtyp;
	}

	public String getStrFlugzeugname() {
		return strFlugzeugname;
	}

	public void setStrFlugzeugname(String strFlugzeugname) {
		this.strFlugzeugname = strFlugzeugname;
	}

	public String getStrActive() {
		return strActive;
	}

	public void setStrActive(String strActive) {
		this.strActive = strActive;
	}

	public String[] getTextArr() {
		return textArr;
	}

	public void setTextArr(String[] textArr) {
		this.textArr = textArr;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

}