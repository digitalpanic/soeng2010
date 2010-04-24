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
public class JFrameRouteAnlegen extends JFrameAnlegen implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JButton jButtonAnlegen = new JButton();

	private JTextField jTextFieldVon = new JTextField();
	private JTextField jTextFieldNach = new JTextField();
	private JTextField jTextFieldHinflug = new JTextField();
	private JTextField jTextFieldPreisEco = new JTextField();
	private JTextField jTextFieldPreisBuis = new JTextField();
	private JTextField jTextFieldPreisFirst = new JTextField();
	private JTextField jTextFieldPreisGepaeck = new JTextField();

	JTextField[] jTextFieldArr = { jTextFieldVon, jTextFieldNach,
			jTextFieldHinflug, jTextFieldPreisEco, jTextFieldPreisBuis,
			jTextFieldPreisFirst, jTextFieldPreisGepaeck, };

	private JLabel jLabelVon = new JLabel("Abflughafen:");
	private JLabel jLabelNach = new JLabel("Zielflughafen:");
	private JLabel jLabelHinflug = new JLabel("Hinflug: ");
	private JLabel jLabelPreisEco = new JLabel("Preis Economy:");
	private JLabel jLabelPreisBuis = new JLabel("Preis Business Class:");
	private JLabel jLabelPreisFirst = new JLabel("Preis First Class:");
	private JLabel jLabelPreisGepaeck = new JLabel("Preis fuer Zusatzgepaeck:");

	JLabel[] jLabelArr = { jLabelVon, jLabelNach, jLabelHinflug,
			jLabelPreisEco, jLabelPreisBuis, jLabelPreisFirst,
			jLabelPreisGepaeck };
	private JMenuBar Menu;
	private JMenu jMenu1;
	private JMenuItem jMenuItem1;

	private String strVon, strNach, strHinflug, strPreisEco, strPreisBuis,
			strPreisFirst, strPreisgepaeck;

	private String[] textArr = { strVon, strNach, strHinflug, strPreisEco,
			strPreisBuis, strPreisFirst, strPreisgepaeck };

	public JFrameRouteAnlegen(String str) {
		super(str);
		initGUI();

		jLabelVon.setName("VON");
		jLabelNach.setName("NACH");
		jLabelHinflug.setName("HINFLUG");
		jLabelPreisEco.setName("PREISECO");
		jLabelPreisBuis.setName("PREISBUIS");
		jLabelPreisFirst.setName("PREISFIRST");
		jLabelPreisGepaeck.setName("PREISGEPAECK");

	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
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
				}

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

				getContentPane().add(jButtonAnlegen);
				jButtonAnlegen.setText("Anlegen");
				jButtonAnlegen.setBounds(338, 303, 87, 27);
				jButtonAnlegen.setActionCommand("RouteAnlegen");
				jButtonAnlegen.addActionListener(this);
			}
			pack();
			this.setSize(464, 412);
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
		if ("RouteAnlegen".equals(ae.getActionCommand())) {
			// ROute Anlegen

			strVon = jTextFieldVon.getText();
			strNach = jTextFieldNach.getText();
			strHinflug = jTextFieldHinflug.getText();
			strPreisEco = jTextFieldPreisEco.getText();
			strPreisBuis = jTextFieldPreisBuis.getText();
			strPreisFirst = jTextFieldPreisFirst.getText();
			strPreisgepaeck = jTextFieldPreisGepaeck.getText();

			JOptionPane.showMessageDialog(null,
					"Die Route wurde erfolgreich angelegt",
					"Vorgang abgeschlossen", JOptionPane.INFORMATION_MESSAGE);
		}
		ActionEventHandler.actionperformed(ae, this);
	}

	public JButton getJButtonAnlegen() {
		return jButtonAnlegen;
	}

	public void setJButtonAnlegen(JButton buttonAnlegen) {
		jButtonAnlegen = buttonAnlegen;
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
