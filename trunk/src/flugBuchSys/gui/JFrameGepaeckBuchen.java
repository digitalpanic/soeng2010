package flugBuchSys.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import flugBuchSys.app.BuchungAbsetzen;

public class JFrameGepaeckBuchen extends javax.swing.JFrame implements
		ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel jLabelGepackFrage;
	private JLabel jLabelGepackYes;
	private JButton jButtonWeiter;
	public static JTextField jTextFieldGepackstuecke;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrameGepaeckBuchen inst = new JFrameGepaeckBuchen(
						"Gepaeck Buchen");
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public JFrameGepaeckBuchen(String str) {
		super(str);
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabelGepackFrage = new JLabel();
				getContentPane().add(jLabelGepackFrage, "Center");
				jLabelGepackFrage
						.setText("Plant der Kunde zus‰tzliches Gep‰ck mitzunehmen?");
				jLabelGepackFrage.setBounds(12, 18, 355, 20);
			}
			{
				jLabelGepackYes = new JLabel();
				getContentPane().add(jLabelGepackYes);
				jLabelGepackYes.setText("Wenn ja, wieviele?");
				jLabelGepackYes.setBounds(12, 56, 170, 16);
			}
			{
				jTextFieldGepackstuecke = new JTextField();
				getContentPane().add(jTextFieldGepackstuecke);
				jTextFieldGepackstuecke.setBounds(158, 53, 46, 22);
				jTextFieldGepackstuecke.setText("0");
			}
			{
				jButtonWeiter = new JButton();
				getContentPane().add(jButtonWeiter);
				jButtonWeiter.setText("Weiter");
				jButtonWeiter.setBounds(284, 100, 99, 22);
				jButtonWeiter.addActionListener(this);
				jButtonWeiter.setActionCommand("Weiter");
			}
			pack();
			this.setSize(418, 180);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent ae) {


		if (ae.getActionCommand().equals("Weiter")) {

			// Vorhandene Daten werden in die Datenbank geschrieben, aber noch ohne commit
//			BuchungAbsetzen.DatenSpeichern();
			
			this.setVisible(false);
			new JFrameBuchungBestaetigung("Buchung abschlieﬂen");

		}
	}

}
