package flugBuchSys.gui;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
//
//import flugBuchSys.app.NeueFlugBuchung;


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
public class JFrameMitreisendeGrid extends javax.swing.JFrame implements ActionListener {
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabelNamenPassagiere;
	private JLabel jLabelNamenPassagiere2;
	private JLabel jLabelNamenPassagiere3;
	private JTextField jTextField1;
	private JTextField jTextField11;
	private JTextField jTextField2;
	private JTextField jTextField22;
	private JTextField jTextField3;
	private JTextField jTextField33;
	private JTextField jTextField4;
	private JTextField jTextField44;
	private JTextField jTextField5;
	private JTextField jTextField55;
	private JButton jButtonWeiter;
	private JButton jButtonZurueck;
	
	

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrameMitreisendeGrid inst = new JFrameMitreisendeGrid();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public JFrameMitreisendeGrid() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GridLayout thisLayout = new GridLayout(0,3);
			thisLayout.setHgap(5);
			thisLayout.setVgap(5);
			thisLayout.setColumns(3);
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			
			jLabelNamenPassagiere = new JLabel();
			getContentPane().add(jLabelNamenPassagiere);
			jLabelNamenPassagiere.setText("<html><body>Namen der<br>zusätzlichen Passagiere</body></html>");
			jLabelNamenPassagiere2 = new JLabel();
			getContentPane().add(jLabelNamenPassagiere2);
			jLabelNamenPassagiere2.setText("Nachname");
			jLabelNamenPassagiere3 = new JLabel();
			getContentPane().add(jLabelNamenPassagiere3);
			jLabelNamenPassagiere3.setText("Vorname");
			System.out.println();
			
			if (JFrameNeueBuchung.mitreisende >= 1)
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("PAX 1");
				
					jTextField1 = new JTextField();
					getContentPane().add(jTextField1);
					jTextField1.setText(JFrameNeueBuchung.jTextFieldNachname.getText());
					
					jTextField11 = new JTextField();
					getContentPane().add(jTextField11);
					jTextField11.setText(JFrameNeueBuchung.jTextFieldVorname.getText());
			}
			if (JFrameNeueBuchung.mitreisende >= 2)
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("PAX 2");
				
				jTextField2 = new JTextField();
				getContentPane().add(jTextField2);
				jTextField2.setText("");
				
				jTextField22 = new JTextField();
				getContentPane().add(jTextField22);
				jTextField22.setText("");
				
				
			}
			if (JFrameNeueBuchung.mitreisende >= 3)
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("PAX 3");
				
				jTextField3 = new JTextField();
				getContentPane().add(jTextField3);
				jTextField3.setText("");
				
				jTextField33 = new JTextField();
				getContentPane().add(jTextField33);
				jTextField33.setText("");
								
			}
			if (JFrameNeueBuchung.mitreisende >= 4)
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("PAX 4");
				
				jTextField4 = new JTextField();
				getContentPane().add(jTextField4);
				jTextField4.setText("");
				
				jTextField44 = new JTextField();
				getContentPane().add(jTextField44);
				jTextField44.setText("");
			}
			
			if (JFrameNeueBuchung.mitreisende >= 5)
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("PAX 5");
				
				jTextField5 = new JTextField();
				getContentPane().add(jTextField5);
				jTextField5.setText("");
				
				jTextField55 = new JTextField();
				getContentPane().add(jTextField55);
				jTextField55.setText("");
			}
			
			jLabel6 = new JLabel();
			getContentPane().add(jLabel6);
			jLabel6.setText("");
			{
			jButtonWeiter = new JButton();
			getContentPane().add(jButtonWeiter);
			jButtonWeiter.setText("Weiter");
			jButtonWeiter.addActionListener(this);
			jButtonWeiter.setActionCommand("Gepaeckbuchen");
			}{
			jButtonZurueck = new JButton();
			getContentPane().add(jButtonZurueck);
			jButtonZurueck.setText("Zurück");
			jButtonZurueck.addActionListener(this);
			jButtonZurueck.setActionCommand("Zurueck");
			
			}
			
			pack();
			setSize(600, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	public void actionPerformed(ActionEvent ae) {
		
			if (ae.getActionCommand().equals("Gepaeckbuchen")) {
			this.setVisible(false);
			new JFrameGepaeckBuchen(null);
			}
			if (ae.getActionCommand().equals("Zurueck")){
			this.setVisible(false);
			new JFrameNeueBuchung(null);}
}
	}
