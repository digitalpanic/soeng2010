package flugBuchSys.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JFrameLoginPanel extends javax.swing.JFrame implements
		ActionListener, KeyListener {

	private static final long serialVersionUID = 1L;
	private JButton jButton1;
	private JLabel PasswortLabel;
	private JLabel UserLabel;
	private JPasswordField passwordField;
	private JButton Abbrechen;
	private String contentNameField;
	private JTextField nameField;
	private String s;
	private JFrame frame;
	public static boolean admin;

	public JFrameLoginPanel(String strTitel) {
		super(strTitel);
		initGUI();
	}

	private void initGUI() {
		try {
			setPreferredSize(new Dimension(400, 300));
			this.setLayout(null);

			{
				nameField = new JTextField();
				this.add(nameField);
				nameField.setBounds(160, 61, 136, 23);
				nameField.addKeyListener(this);

			}
			{
				passwordField = new JPasswordField();
				this.add(passwordField);
				passwordField.setBounds(160, 114, 136, 23);
				passwordField.addKeyListener(this);
			}

			{
				jButton1 = new JButton();
				this.add(jButton1);
				jButton1.setText("Login");
				jButton1.setBounds(101, 180, 88, 23);
				jButton1.addActionListener(this);
				jButton1.setActionCommand("Login");
			}
			{
				Abbrechen = new JButton();
				this.add(Abbrechen);
				Abbrechen.setText("Abbrechen");
				Abbrechen.setBounds(200, 180, 100, 23);
				Abbrechen.addActionListener(this);
				Abbrechen.setActionCommand("Abbrechen");
			}
			{
				UserLabel = new JLabel();
				this.add(UserLabel);
				UserLabel.setText("Benutzername:");
				UserLabel.setBounds(22, 68, 120, 16);
			}
			{
				PasswortLabel = new JLabel();
				this.add(PasswortLabel);
				PasswortLabel.setText("Passwort:");
				PasswortLabel.setBounds(22, 121, 120, 16);
			}
			pack();
			this.setSize(400, 300);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE); 
			this.setVisible(true);					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void checkLogin() {
		contentNameField = nameField.getText();
		s = String.valueOf(passwordField.getPassword());
		if (contentNameField.equals("User") && (s.equals("User"))) {
			admin = false;
			dispose();
			JFrameFbsGUI open = new JFrameFbsGUI();
			open.setLocationRelativeTo(null);
			open.setVisible(true);
			System.out.println(admin);

		} else if (contentNameField.equals("Administrator")
				&& (s.equals("Admin"))) {
			admin = true;
			dispose();
			JFrameFbsGUI open = new JFrameFbsGUI();
			open.setLocationRelativeTo(null);
			open.setVisible(true);
			System.out.println(admin);
		} else {
			passwordField.setFocusable(false);
			nameField.setFocusable(false);
			JOptionPane
					.showMessageDialog(
							frame,
							"Sie haben einen falschen Benutzernamen oder ein falsches Passwort angegeben",
							"Login fehlerhaft", JOptionPane.ERROR_MESSAGE);
			passwordField.setFocusable(true);
			nameField.setFocusable(true);
		}
	}

	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Login")) {
			checkLogin();
		}
		if (ae.getActionCommand().equals("Abbrechen")) {
			dispose();
		}

	}

	
	public void keyPressed(KeyEvent e) {
	}

	
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == 10) {
			if (nameField.getText().length() > 0
					&& String.valueOf(passwordField.getPassword()).length() > 0) {
				checkLogin();
			}
		}
	}

	
	public void keyTyped(KeyEvent e) {
	}
}