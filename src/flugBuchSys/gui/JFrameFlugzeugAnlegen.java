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



public class JFrameFlugzeugAnlegen extends JFrameAnlegen implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JTextField jTextFieldLuftfahrtkennzeichen = new JTextField();
	private JTextField jTextFieldKapEco = new JTextField();
	private JTextField jTextFieldKapBuis = new JTextField();
	private JTextField jTextFieldKapFirst = new JTextField();
	private JTextField jTextFieldFlugzeugname = new JTextField();
	private JTextField jTextFieldFlugzeugtyp = new JTextField();
	
	JTextField[] jTextFieldArr = {jTextFieldLuftfahrtkennzeichen,jTextFieldKapEco,
									jTextFieldKapBuis,jTextFieldKapFirst,jTextFieldFlugzeugname,jTextFieldFlugzeugtyp};
	
	private JMenuItem jMenuItem1;
	private JMenu jMenu1;
	private JMenuBar Menu;
	
	private JButton Fneu;
	
	private JLabel Luftfahrtkennzeichen = new JLabel ("Luftfahrtkennzeichen:");
	private JLabel KapEco = new JLabel ("Kapazitaet Economy Class:");
	private JLabel KapBuis = new JLabel ("Kapazitaet Business Class: ");
	private JLabel KapFirst = new JLabel ("Kapazitaet First Class:");
	private JLabel Flugzeugname = new JLabel ("Flugzeugname");
	private JLabel Flugzeugtyp = new JLabel ("Flugzeugtyp");

	private JLabel[] jLabelArr = {Luftfahrtkennzeichen,KapEco,KapBuis,
									KapFirst,Flugzeugname,Flugzeugtyp,};
	JFrame inst;
	
	private String strKapeco, strKapbuis, strKapfirst, strLuftfahrtkennzeichen, strFlugzeugname, strFlugzeugtyp ;
	private String[] textArr = { strLuftfahrtkennzeichen, strKapeco, strKapbuis, strKapfirst,  strFlugzeugname, strFlugzeugtyp };
	
	public JFrameFlugzeugAnlegen(String str) {
		super(str);
		initGUI();
	}
	
	private void initGUI() {
		
		Luftfahrtkennzeichen.setName("LUFTFAHRTKENNZEICHEN");
		KapEco.setName("KAPECO");
		KapBuis.setName("KAPBUIS");
		KapFirst.setName("KAPFIRST");
		Flugzeugname.setName("FLUGZEUGNAME");
		Flugzeugtyp.setName("FLUGZEUGTYP");
		
		
		
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
				
				{

					getContentPane().add(jTextFieldLuftfahrtkennzeichen);
					jTextFieldLuftfahrtkennzeichen.setBounds(186, 67, 129, 21);
				
					getContentPane().add(jTextFieldKapEco);
					jTextFieldKapEco.setBounds(186, 98, 129, 21);
				
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
					KapFirst.setText("KapFirst:");
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
				}
			{
				Fneu = new JButton();
				getContentPane().add(Fneu);
				Fneu.setText("Anlegen");
				Fneu.setBounds(345, 215, 121, 25);
				Fneu.addActionListener(this);
				Fneu.setActionCommand("FlugzeugAnlegen");

			}
			
			}

			pack();
			this.setSize(523, 365);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
			} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getActionCommand().equals("zurueck")) {
			dispose();
			JFrameFbsGUI open = new JFrameFbsGUI();
			open.setLocationRelativeTo(null);
			open.setVisible(true);
		}	
		if (arg0.getActionCommand().equals("FlugzeugAnlegen")) {
		strLuftfahrtkennzeichen = jTextFieldLuftfahrtkennzeichen.getText();
		strKapeco = jTextFieldKapEco.getText();
		strKapbuis = jTextFieldKapBuis.getText();
		strFlugzeugname = jTextFieldFlugzeugname.getText();
		strKapfirst = jTextFieldKapFirst.getText();
		strFlugzeugtyp = jTextFieldFlugzeugtyp.getText();
		//choice = arg0.getActionCommand();
		JOptionPane.showMessageDialog(
			    inst,
			    "Das Flugzeug wurde erfolgreich angelegt",
			    "Vorgang abgeschlossen",
			JOptionPane.INFORMATION_MESSAGE);
		}
		ActionEventHandler.actionperformed(arg0, this);
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

	public JButton getFneu() {
		return Fneu;
	}

	public void setFneu(JButton fneu) {
		Fneu = fneu;
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

	public JLabel getFlugzeugname() {
		return Flugzeugname;
	}

	public void setFlugzeugname(JLabel flugzeugname) {
		Flugzeugname = flugzeugname;
	}

	public JLabel getFlugzeugtyp() {
		return Flugzeugtyp;
	}

	public void setFlugzeugtyp(JLabel flugzeugtyp) {
		Flugzeugtyp = flugzeugtyp;
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

	public String getStrLuftfahrtkennzeichen() {
		return strLuftfahrtkennzeichen;
	}

	public void setStrLuftfahrtkennzeichen(String strLuftfahrtkennzeichen) {
		this.strLuftfahrtkennzeichen = strLuftfahrtkennzeichen;
	}

	public String getStrFlugzeugname() {
		return strFlugzeugname;
	}

	public void setStrFlugzeugname(String strFlugzeugname) {
		this.strFlugzeugname = strFlugzeugname;
	}

	public String getStrFlugzeugtyp() {
		return strFlugzeugtyp;
	}

	public void setStrFlugzeugtyp(String strFlugzeugtyp) {
		this.strFlugzeugtyp = strFlugzeugtyp;
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