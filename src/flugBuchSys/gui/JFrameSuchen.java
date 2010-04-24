package flugBuchSys.gui;

import java.awt.Component;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JFrameSuchen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTable jTable;

	public JFrameSuchen(String str) {
		super(str);
	}
	
	public JFrameSuchen() {
	}

	public JLabel[] getJLabelArr() {
		// TODO Auto-generated method stub
		return null;
	}

	public JTextField[] getJTextFieldArr() {
		// TODO Auto-generated method stub
		return null;
	}

	public JLabel getActive() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getStrActive() {
		// TODO Auto-generated method stub
		return null;
	}

	public Component getJLabelGepaeck() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setJTable(JTable table) {
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(25, 400, 450, 100);
		
		Container c1 = getContentPane();
		c1.add(scrollPane);
		jTable = table;
		
		jTable.setVisible(true);
	}

	public JTable getJTable() {
		return jTable;
	}
}
