package flugBuchSys.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import flugBuchSys.app.ActionEventHandler;

public class JFrameFlugAnlegen extends JFrameAnlegen implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField jTextFieldFlugzeugID = new JTextField();
	private JTextField jTextFieldRoute = new JTextField();
	private JTextField jTextFieldReservierungsID = new JTextField();
	private JTextField jTextFieldStartDate = new JTextField();
	private JTextField jTextFieldEndDate = new JTextField();
	private JTextField jTextFieldAuslEco = new JTextField();
	private JTextField jTextFieldAuslBuis = new JTextField();
	private JTextField jTextFieldAuslFirst = new JTextField();

	JTextField[] jTextFieldArr = { jTextFieldFlugzeugID, jTextFieldRoute,
			jTextFieldReservierungsID, jTextFieldStartDate, jTextFieldEndDate,
			jTextFieldAuslEco, jTextFieldAuslBuis, jTextFieldAuslFirst };
	private String flugid, flugzeugid, flugroute, reservierungsid, startdate,
			enddate, ausleco, auslbuis, auslfirst;
	// werden diese Strings überhaupt gebraucht???
	private JButton Fluganlegen;

	private JLabel FlugzeugID = new JLabel("Flugzeug ID:");
	private JLabel Route = new JLabel("Route:");
	private JLabel ReservierungsID = new JLabel("Reservierungs ID:");
	private JLabel StartDate = new JLabel("Abflug:");
	private JLabel EndDate = new JLabel("Ankunft:");
	private JLabel AuslEco = new JLabel("Auslastung Economy:");
	private JLabel AuslBuis = new JLabel("Auslastung Business:");
	private JLabel AuslFirst = new JLabel("Auslastung First Class:");

	JLabel[] jLabelArr = { FlugzeugID, Route, ReservierungsID, StartDate,
			EndDate, AuslEco, AuslBuis, AuslFirst };

	private String strflugid, strflugzeugid, strroute, strreservierungsid,
			strstartdate, strenddate, strausleco, strauslbuis, strauslfirst;

	private String[] textArr = { strflugid, strflugzeugid, strroute,
			strreservierungsid, strstartdate, strenddate, strausleco,
			strauslbuis, strauslfirst };

	private JMenuItem jMenuItem1;
	private JMenu jMenu1;
	private JMenuBar Menu;
	private JFrame inst;

	public JFrameFlugAnlegen(String str) {
		super(str);
		initGUI();
	}

	private void initGUI() {

		AuslFirst.setName("AUSLFIRST");
		AuslBuis.setName("AUSLBUIS");
		ReservierungsID.setName("RESERVIERUNGSID");
		AuslEco.setName("AUSLECO");
		StartDate.setName("STARTDATE");
		EndDate.setName("ENDDATE");
		Route.setName("ROUTE");
		FlugzeugID.setName("FLUGZEUGID");

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
						jMenuItem1 = new JMenuItem();
						jMenu1.add(jMenuItem1);
						jMenuItem1.setText("zum Hauptmenu");
						jMenuItem1.addActionListener(this);
						jMenuItem1.setActionCommand("zurueck");
					}
				}
			}
			{

				getContentPane().add(jTextFieldFlugzeugID);
				jTextFieldFlugzeugID.setBounds(186, 67, 129, 21);

				getContentPane().add(jTextFieldRoute);
				jTextFieldRoute.setBounds(186, 98, 129, 21);

				getContentPane().add(FlugzeugID);
				FlugzeugID.setText("Flugzeug ID:");
				FlugzeugID.setBounds(21, 66, 135, 22);

				getContentPane().add(Route);
				Route.setText("Route:");
				Route.setBounds(21, 97, 135, 22);

				getContentPane().add(EndDate);
				EndDate.setText("Ankunft:");
				EndDate.setBounds(21, 187, 135, 22);

				getContentPane().add(jTextFieldReservierungsID);
				jTextFieldReservierungsID.setBounds(186, 129, 129, 21);

				getContentPane().add(jTextFieldStartDate);
				jTextFieldStartDate.setBounds(186, 160, 129, 21);

				getContentPane().add(StartDate);
				StartDate.setText("Abflug:");
				StartDate.setBounds(21, 159, 121, 16);

				getContentPane().add(jTextFieldEndDate);
				jTextFieldEndDate.setBounds(186, 191, 129, 21);

				getContentPane().add(jTextFieldAuslEco);
				jTextFieldAuslEco.setBounds(186, 222, 129, 21);

				getContentPane().add(jTextFieldAuslBuis);
				jTextFieldAuslBuis.setBounds(186, 253, 129, 21);

				getContentPane().add(AuslEco);
				AuslEco.setText("Auslastung Economy:");
				AuslEco.setBounds(21, 222, 165, 22);

				getContentPane().add(ReservierungsID);
				ReservierungsID.setText("Reservierungs ID:");
				ReservierungsID.setBounds(21, 131, 135, 16);

				getContentPane().add(AuslBuis);
				AuslBuis.setText("Auslastung Business:");
				AuslBuis.setBounds(22, 255, 165, 16);

				getContentPane().add(jTextFieldAuslFirst);
				jTextFieldAuslFirst.setBounds(186, 284, 129, 21);

				getContentPane().add(AuslFirst);
				AuslFirst.setText("Auslastung First Class:");
				AuslFirst.setBounds(21, 284, 165, 16);

				Fluganlegen = new JButton();
				getContentPane().add(Fluganlegen);
				Fluganlegen.setText("Flug Anlegen");
				Fluganlegen.setBounds(327, 283, 121, 25);
				Fluganlegen.addActionListener(this);
				Fluganlegen.setActionCommand("FlugAnlegen");

			}
			pack();
			this.setSize(538, 425);
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
		if (arg0.getActionCommand().equals("FlugAnlegen")) {
			// Flug Anlegen
			strflugzeugid = jTextFieldFlugzeugID.getText();
			strroute = jTextFieldRoute.getText();
			strreservierungsid = jTextFieldReservierungsID.getText();
			strenddate = jTextFieldEndDate.getText();
			strstartdate = jTextFieldStartDate.getText();
			strausleco = jTextFieldAuslEco.getText();
			strauslbuis = jTextFieldAuslBuis.getText();
			strauslfirst = jTextFieldAuslFirst.getText();
			JOptionPane.showMessageDialog(inst, "Der Flug wurde angelegt",
					"Vorgang abgeschlossen", JOptionPane.INFORMATION_MESSAGE);
		}
		ActionEventHandler.actionperformed(arg0, this);
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

	public JTextField getJTextFieldReservierungsID() {
		return jTextFieldReservierungsID;
	}

	public void setJTextFieldReservierungsID(JTextField textFieldReservierungsID) {
		jTextFieldReservierungsID = textFieldReservierungsID;
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

	public String getFlugid() {
		return flugid;
	}

	public void setFlugid(String flugid) {
		this.flugid = flugid;
	}

	public String getFlugzeugid() {
		return flugzeugid;
	}

	public void setFlugzeugid(String flugzeugid) {
		this.flugzeugid = flugzeugid;
	}

	public String getFlugroute() {
		return flugroute;
	}

	public void setFlugroute(String flugroute) {
		this.flugroute = flugroute;
	}

	public String getReservierungsid() {
		return reservierungsid;
	}

	public void setReservierungsid(String reservierungsid) {
		this.reservierungsid = reservierungsid;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public String getAusleco() {
		return ausleco;
	}

	public void setAusleco(String ausleco) {
		this.ausleco = ausleco;
	}

	public String getAuslbuis() {
		return auslbuis;
	}

	public void setAuslbuis(String auslbuis) {
		this.auslbuis = auslbuis;
	}

	public String getAuslfirst() {
		return auslfirst;
	}

	public void setAuslfirst(String auslfirst) {
		this.auslfirst = auslfirst;
	}

	public JButton getFluganlegen() {
		return Fluganlegen;
	}

	public void setFluganlegen(JButton fluganlegen) {
		Fluganlegen = fluganlegen;
	}

	public JLabel getFlugzeugID() {
		return FlugzeugID;
	}

	public void setFlugzeugID(JLabel flugzeugID) {
		FlugzeugID = flugzeugID;
	}

	public JLabel getRoute() {
		return Route;
	}

	public void setRoute(JLabel route) {
		Route = route;
	}

	public JLabel getReservierungsID() {
		return ReservierungsID;
	}

	public void setReservierungsID(JLabel reservierungsID) {
		ReservierungsID = reservierungsID;
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

	public JLabel getAuslEco() {
		return AuslEco;
	}

	public void setAuslEco(JLabel auslEco) {
		AuslEco = auslEco;
	}

	public JLabel getAuslBuis() {
		return AuslBuis;
	}

	public void setAuslBuis(JLabel auslBuis) {
		AuslBuis = auslBuis;
	}

	public JLabel getAuslFirst() {
		return AuslFirst;
	}

	public void setAuslFirst(JLabel auslFirst) {
		AuslFirst = auslFirst;
	}

	public JLabel[] getJLabelArr() {
		return jLabelArr;
	}

	public void setJLabelArr(JLabel[] labelArr) {
		jLabelArr = labelArr;
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

	public String getStrreservierungsid() {
		return strreservierungsid;
	}

	public void setStrreservierungsid(String strreservierungsid) {
		this.strreservierungsid = strreservierungsid;
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

	public JFrame getInst() {
		return inst;
	}

	public void setInst(JFrame inst) {
		this.inst = inst;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

}