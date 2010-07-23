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
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

import flugBuchSys.app.ActionEventHandler;

public class JFrameFlugSuchen extends JFrameSuchen implements ActionListener {

	private static final long serialVersionUID = 1L;
	public static JTextField jTextFieldFlugID = new JTextField();
	public static JTextField jTextFieldFlugzeugID = new JTextField();
	public static JTextField jTextFieldRoute = new JTextField();
	public static JTextField jTextFieldStartDate = new JTextField();
	public static JTextField jTextFieldEndDate = new JTextField();
	public static JTextField jTextFieldAuslEco = new JTextField();
	public static JTextField jTextFieldAuslBuis = new JTextField();
	public static JTextField jTextFieldAuslFirst = new JTextField();
	

	JTextField[] jTextFieldArr = { jTextFieldFlugID, jTextFieldFlugzeugID,
			jTextFieldRoute, jTextFieldStartDate, jTextFieldEndDate,
			jTextFieldAuslEco, jTextFieldAuslBuis, jTextFieldAuslFirst };

	private JButton binactive;
	private JRadioButton neinButton;
	private JRadioButton jaButton;
	private JButton Flugsuchen;
	private JButton bchange;

	private JMenuItem jMenuItem1;
	private JMenu jMenu1;
	private JMenuBar Menu;

	private JLabel AuslFirst = new JLabel("Auslastung First Class:");
	private JLabel AuslBuis = new JLabel("Auslastung Business:");
	private JLabel AuslEco = new JLabel("Auslastung Economy:");
	private JLabel StartDate = new JLabel("Abflug:");
	private JLabel EndDate = new JLabel("Ankunft:");
	private JLabel Route = new JLabel("Route:");
	private JLabel FlugzeugID = new JLabel("Flugzeug ID:");
	private JLabel FlugID = new JLabel("Flug ID:");
	private JLabel Active = new JLabel("Ist die Route noch aktiv?");

	JLabel[] jLabelArr = { FlugID, FlugzeugID, Route, // ReservierungsID,
			StartDate, EndDate, AuslEco, AuslBuis, AuslFirst, Active };

	private JFrame inst;

	private String strflugid, strflugzeugid, strroute, // strreservierungsid,
			strstartdate, strenddate, strausleco, strauslbuis, strauslfirst;
	private String[] textArr = { strflugid, strflugzeugid, strroute, // strreservierungsid,
			strstartdate, strenddate, strausleco, strauslbuis, strauslfirst };

	private String strchoice;

	private String strActive = "*";

	private JButton Weiter;
	public static boolean visible = false;

	public JFrameFlugSuchen(String str) {
		super(str);
		visible = true;
		initGUI();
	}

	private void initGUI() {

		FlugID.setName("FLUGID");
		FlugzeugID.setName("FLUGZEUGID");
		Route.setName("ROUTE");
		StartDate.setName("STARTDATE");
		EndDate.setName("ENDDATE");
		AuslEco.setName("AUSLECO");
		AuslBuis.setName("AUSLBUIS");
		AuslFirst.setName("AUSLFIRST");
		Active.setName("ACTIVE");

		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setPreferredSize(new java.awt.Dimension(538, 550));
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

				getContentPane().add(jTextFieldFlugID);
				jTextFieldFlugID.setBounds(186, 36, 129, 21);

				getContentPane().add(jTextFieldFlugzeugID);
				jTextFieldFlugzeugID.setBounds(186, 67, 129, 21);

				getContentPane().add(jTextFieldRoute);
				jTextFieldRoute.setBounds(186, 98, 129, 21);

				getContentPane().add(FlugID);
				FlugID.setBounds(21, 35, 135, 22);

				getContentPane().add(FlugzeugID);
				FlugzeugID.setBounds(21, 66, 135, 22);

				getContentPane().add(Route);
				Route.setBounds(21, 97, 135, 22);

				getContentPane().add(EndDate);
				EndDate.setBounds(21, 187, 135, 22);

				getContentPane().add(jTextFieldStartDate);
				jTextFieldStartDate.setBounds(186, 160, 129, 21);

				getContentPane().add(StartDate);
				StartDate.setBounds(21, 159, 121, 16);

				getContentPane().add(jTextFieldEndDate);
				jTextFieldEndDate.setBounds(186, 191, 129, 21);

				getContentPane().add(jTextFieldAuslEco);
				jTextFieldAuslEco.setBounds(186, 222, 129, 21);

				getContentPane().add(jTextFieldAuslBuis);
				jTextFieldAuslBuis.setBounds(186, 253, 129, 21);

				getContentPane().add(AuslEco);
				AuslEco.setBounds(21, 222, 165, 22);
				/*
				 * getContentPane().add(ReservierungsID);
				 * ReservierungsID.setBounds(21, 131, 135, 16);
				 */
				getContentPane().add(AuslBuis);
				AuslBuis.setBounds(22, 255, 165, 16);

				getContentPane().add(jTextFieldAuslFirst);
				jTextFieldAuslFirst.setBounds(186, 284, 129, 21);

				getContentPane().add(AuslFirst);
				AuslFirst.setBounds(21, 284, 165, 16);
			}

			if (JFrameFbsGUI.neuebuchung == true) {
				Flugsuchen = new JButton("Suchen");
				getContentPane().add(Flugsuchen);
				Flugsuchen.setBounds(327, 221, 121, 25);
				Flugsuchen.addActionListener(this);
				Flugsuchen.setActionCommand("FlugSuchen");

				Weiter = new JButton("Weiter");
				getContentPane().add(Weiter);
				Weiter.setBounds(327, 251, 121, 25);
				Weiter.addActionListener(this);
				Weiter.setActionCommand("Weiter");
			}
			if (JFrameFbsGUI.neuebuchung == false) {
				getContentPane().add(Active);
				Active.setBounds(22, 315, 164, 16);

				jaButton = new JRadioButton("Ja");
				getContentPane().add(jaButton);
				jaButton.setBounds(186, 315, 52, 21);
				jaButton.setActionCommand("Ja");

				neinButton = new JRadioButton("Nein");
				getContentPane().add(neinButton);
				neinButton.setBounds(243, 315, 72, 21);
				neinButton.setActionCommand("Nein");

				// Group the radio buttons.
				final ButtonGroup group = new ButtonGroup();
				group.add(jaButton);
				group.add(neinButton);

				// Register a listener for the radio buttons.
				jaButton.addActionListener(this);
				neinButton.addActionListener(this);

				Flugsuchen = new JButton("Suchen");
				getContentPane().add(Flugsuchen);
				Flugsuchen.setBounds(327, 280, 121, 25);
				Flugsuchen.addActionListener(this);
				Flugsuchen.setActionCommand("FlugSuchen");
			}
			 {
//				{
//					bchange = new JButton("Aendern");
//					getContentPane().add(bchange);
//					bchange.setBounds(327, 281, 121, 25);
//					bchange.addActionListener(this);
//					bchange.setActionCommand("FlugAendern");
//				}
//				{
//					binactive = new JButton();
//					getContentPane().add(binactive);
//					binactive.setText("Loeschen");
//					binactive.setBounds(327, 311, 121, 25);
//					binactive.addActionListener(this);
//					binactive.setActionCommand("FlugLoeschen");
//				}
			}

			pack();
			this.setSize(500, 600);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			this.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getActionCommand().equals("zurueck")) {
			dispose();
			visible = false;
			JFrameFbsGUI open = new JFrameFbsGUI();
			open.setLocationRelativeTo(null);
			open.setVisible(true);
		}
		if (arg0.getActionCommand().equals("Weiter")) {
			this.setVisible(false);
			visible = false;
			new JFrameKundeSuchen("Kunde Suchen");
//			int n = JOptionPane.showConfirmDialog(inst,
//					"Ist der Kunde schon im System?", "Kunde vorhanden?",
//					JOptionPane.YES_NO_OPTION);
//			if (n == 0) {
//				new JFrameKundeSuchen("Kunde Suchen");
//				
//			} else {
//				new JFrameKundeAnlegen("Kunde Anlegen");
//				
			}

		if (arg0.getActionCommand().equals("FlugSuchen")) {
			strflugid = jTextFieldFlugID.getText();
			strflugzeugid = jTextFieldFlugzeugID.getText();
			strroute = jTextFieldRoute.getText();
			strenddate = jTextFieldEndDate.getText();
			strstartdate = jTextFieldStartDate.getText();
			strausleco = jTextFieldAuslEco.getText();
			strauslbuis = jTextFieldAuslBuis.getText();
			strauslfirst = jTextFieldAuslFirst.getText();
			strchoice = arg0.getActionCommand();
		}
		if (arg0.getActionCommand().equals("FlugAendern")) {
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
		if (arg0.getActionCommand().equals("Flug Loeschen")) {
			int m = JOptionPane.showConfirmDialog(inst,
					"Sind Sie sicher das sie die Route löschen möchten?",
					"Löschvorgang bestätigen!",
					// JOptionPane.WARNING_MESSAGE,
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (m == 0) {
				System.out.println("läuft auch");
			} else {
				// kehrt zurück zum Ausgangsbildschirm
			}

		}

		ActionEventHandler.actionperformed(arg0, this);

	}

	public JTextField getJTextFieldFlugID() {
		return jTextFieldFlugID;
	}

	public void setJTextFieldFlugID(JTextField textFieldFlugID) {
		jTextFieldFlugID = textFieldFlugID;
	}

	public JTextField getJTextFieldFlugzeugID() {
		return jTextFieldFlugzeugID;
	}

	public void setJTextFieldFlugzeugID(JTextField textFieldFlugzeugID) {
		jTextFieldFlugzeugID = textFieldFlugzeugID;
	}

	public JTextField getJTextFieldRoute() {
		return jTextFieldRoute;
	}

	public void setJTextFieldRoute(JTextField textFieldRoute) {
		jTextFieldRoute = textFieldRoute;
	}

	public JTextField getJTextFieldStartDate() {
		return jTextFieldStartDate;
	}

	public void setJTextFieldStartDate(JTextField textFieldStartDate) {
		jTextFieldStartDate = textFieldStartDate;
	}

	public JTextField getJTextFieldEndDate() {
		return jTextFieldEndDate;
	}

	public void setJTextFieldEndDate(JTextField textFieldEndDate) {
		jTextFieldEndDate = textFieldEndDate;
	}

	public JTextField getJTextFieldAuslEco() {
		return jTextFieldAuslEco;
	}

	public void setJTextFieldAuslEco(JTextField textFieldAuslEco) {
		jTextFieldAuslEco = textFieldAuslEco;
	}

	public JTextField getJTextFieldAuslBuis() {
		return jTextFieldAuslBuis;
	}

	public void setJTextFieldAuslBuis(JTextField textFieldAuslBuis) {
		jTextFieldAuslBuis = textFieldAuslBuis;
	}

	public JTextField getJTextFieldAuslFirst() {
		return jTextFieldAuslFirst;
	}

	public void setJTextFieldAuslFirst(JTextField textFieldAuslFirst) {
		jTextFieldAuslFirst = textFieldAuslFirst;
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

	public JButton getFlugsuchen() {
		return Flugsuchen;
	}

	public void setFlugsuchen(JButton flugsuchen) {
		Flugsuchen = flugsuchen;
	}

	public JButton getBchange() {
		return bchange;
	}

	public void setBchange(JButton bchange) {
		this.bchange = bchange;
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

	public JLabel getAuslFirst() {
		return AuslFirst;
	}

	public void setAuslFirst(JLabel auslFirst) {
		AuslFirst = auslFirst;
	}

	public JLabel getAuslBuis() {
		return AuslBuis;
	}

	public void setAuslBuis(JLabel auslBuis) {
		AuslBuis = auslBuis;
	}

	public JLabel getAuslEco() {
		return AuslEco;
	}

	public void setAuslEco(JLabel auslEco) {
		AuslEco = auslEco;
	}

	public JLabel getStartDate() {
		return StartDate;
	}

	public void setStartDate(JLabel startDate) {
		StartDate = startDate;
	}

	public JLabel getEndDate() {
		return EndDate;
	}

	public void setEndDate(JLabel endDate) {
		EndDate = endDate;
	}

	public JLabel getRoute() {
		return Route;
	}

	public void setRoute(JLabel route) {
		Route = route;
	}

	public JLabel getFlugzeugID() {
		return FlugzeugID;
	}

	public void setFlugzeugID(JLabel flugzeugID) {
		FlugzeugID = flugzeugID;
	}

	public JLabel getFlugID() {
		return FlugID;
	}

	public void setFlugID(JLabel flugID) {
		FlugID = flugID;
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

	public String getStrflugid() {
		return strflugid;
	}

	public void setStrflugid(String strflugid) {
		this.strflugid = strflugid;
	}

	public String getStrflugzeugid() {
		return strflugzeugid;
	}

	public void setStrflugzeugid(String strflugzeugid) {
		this.strflugzeugid = strflugzeugid;
	}

	public String getStrroute() {
		return strroute;
	}

	public void setStrroute(String strroute) {
		this.strroute = strroute;
	}

	public String getStrstartdate() {
		return strstartdate;
	}

	public void setStrstartdate(String strstartdate) {
		this.strstartdate = strstartdate;
	}

	public String getStrenddate() {
		return strenddate;
	}

	public void setStrenddate(String strenddate) {
		this.strenddate = strenddate;
	}

	public String getStrausleco() {
		return strausleco;
	}

	public void setStrausleco(String strausleco) {
		this.strausleco = strausleco;
	}

	public String getStrauslbuis() {
		return strauslbuis;
	}

	public void setStrauslbuis(String strauslbuis) {
		this.strauslbuis = strauslbuis;
	}

	public String getStrauslfirst() {
		return strauslfirst;
	}

	public void setStrauslfirst(String strauslfirst) {
		this.strauslfirst = strauslfirst;
	}

	public String[] getTextArr() {
		return textArr;
	}

	public void setTextArr(String[] textArr) {
		this.textArr = textArr;
	}

	public String getStrchoice() {
		return strchoice;
	}

	public void setStrchoice(String strchoice) {
		this.strchoice = strchoice;
	}

	public String getStrActive() {
		return strActive;
	}

	public void setStrActive(String strActive) {
		this.strActive = strActive;
	}

	public JButton getWeiter() {
		return Weiter;
	}

	public void setWeiter(JButton weiter) {
		Weiter = weiter;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

}