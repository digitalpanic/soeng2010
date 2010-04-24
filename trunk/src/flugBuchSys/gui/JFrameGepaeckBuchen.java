package flugBuchSys.gui;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import flugBuchSys.app.NeueFlugBuchung;
import flugBuchSys.app.NeueGepaeckBuchung;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class JFrameGepaeckBuchen extends javax.swing.JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel jLabelGepackFrage;
	private JLabel jLabelGepackYes;
	private JButton jButtonWeiter;
	private JButton jButtonAbbrechen;
//	private JRadioButton jRadioButtonGepaeckNo;
	public static JTextField jTextFieldGepackstuecke;
//	public static String kein;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrameGepaeckBuchen inst = new JFrameGepaeckBuchen("Gepaeck Buchen");
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
				jLabelGepackFrage.setText("Plant der Kunde zusätzliches Gepäck mitzunehmen?");
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
//			{
//				jRadioButtonGepaeckNo = new JRadioButton();
//				getContentPane().add(jRadioButtonGepaeckNo);
//				jRadioButtonGepaeckNo.setText("Keine zusätzlichen Gepäckstücke");
//				jRadioButtonGepaeckNo.setBounds(12, 90, 228, 20);
//			}
			{
				jButtonWeiter = new JButton();
				getContentPane().add(jButtonWeiter);
				jButtonWeiter.setText("Weiter");
				jButtonWeiter.setBounds(284, 100, 99, 22);
				jButtonWeiter.addActionListener(this);
				jButtonWeiter.setActionCommand("Weiter");
			}
//			{
//				jButtonAbbrechen = new JButton();
//				getContentPane().add(jButtonAbbrechen);
//				jButtonAbbrechen.setText("Abbrechen");
//				jButtonAbbrechen.setBounds(284, 220, 99, 22);
//				jButtonAbbrechen.addActionListener(this);
//				jButtonAbbrechen.setActionCommand("Abbrechen");
//			}
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
//		if (ae.getActionCommand().equals("J")){
//			kein = "0";
//		}		
		
	if (ae.getActionCommand().equals("Weiter")){
			NeueGepaeckBuchung.ExecuteGepaeckBuchungInsert();
			this.setVisible(false);
			new JFrameBuchungBestaetigung("Buchung abschließen");
			
		}
		
//		if (ae.getActionCommand().equals("Abbrechen")){
//			
//		}
	}

}
