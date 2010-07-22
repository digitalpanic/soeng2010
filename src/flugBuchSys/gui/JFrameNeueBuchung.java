package flugBuchSys.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import flugBuchSys.app.NeueFlugBuchung;

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
public class JFrameNeueBuchung extends javax.swing.JFrame implements
		ActionListener {
	public JRadioButton jRadioButtonHinUndRueck;
	public JRadioButton jRadioButtonHinflug;
	public JLabel jLabelWohin;
	public JSeparator jSeparator2;
	public JSeparator jSeparator1;
	public JLabel jLabelRueckflug;
	public JLabel jLabelAblfugdatum;
	public static JTextField jTextFieldNach;
	public JLabel jLabelNach;
	public JLabel jLabelVon;
	public JButton jButtonWeiter;
	public static JTextField jTextFieldPersonenZahl;
	public JLabel jLabelWerFliegt;
	public JSeparator jSeparator4;
	public JLabel jLabelKlassenFrage;
	public static JComboBox jComboBoxServiceKlasse;
	public JSeparator jSeparator3;
	public static JTextField jTextFieldRueckflugDatum;
	public static JTextField jTextFieldAbflugDatum;
	public static JTextField jTextFieldVon;
	public ButtonGroup buttonGroup1;
	public JLabel jLabelFlugArt;

	String[] items = { "Economy", "Business", "First" };
	public String choice;
	public Object strVon;
	public String strNach;
	public Object strHinflug;
	public String strRueckflug;
	public Object strServiceKlasse;
	public String strPersonenzahl;
	public static String rueck;
	public String strrueck;
	public static JTextField jTextFieldNachname;
	public static JTextField jTextFieldVorname;
	public JLabel jLabelPersonenangaben;
	public JSeparator jSeparator5;
	public JButton jButtonAbbruch;
	public static int mitreisende;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrameNeueBuchung inst = new JFrameNeueBuchung(
						"Neue Buchung anlegen");
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public JFrameNeueBuchung(String string) {
		super(string);
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setPreferredSize(new java.awt.Dimension(428, 662));
			{
				jRadioButtonHinUndRueck = new JRadioButton();
				getContentPane().add(jRadioButtonHinUndRueck, "Center");
				jRadioButtonHinUndRueck.setText("Hin- und Rückflug");
				jRadioButtonHinUndRueck.setBounds(23, 30, 138, 27);
				jRadioButtonHinUndRueck.setActionCommand("J");

				jRadioButtonHinflug = new JRadioButton();
				getContentPane().add(jRadioButtonHinflug);
				jRadioButtonHinflug.setText("Nur Hinflug");
				jRadioButtonHinflug.setBounds(172, 33, 112, 20);
				jRadioButtonHinflug.setActionCommand("N");
			}
			// Group the radio buttons.
			final ButtonGroup group = new ButtonGroup();
			group.add(jRadioButtonHinUndRueck);
			group.add(jRadioButtonHinflug);

			// Register a listener for the radio buttons.
			jRadioButtonHinUndRueck.addActionListener(this);
			jRadioButtonHinflug.addActionListener(this);

			{
				jLabelFlugArt = new JLabel();
				getContentPane().add(jLabelFlugArt);
				jLabelFlugArt.setText("Wie möchte der Kunde reisen?");
				jLabelFlugArt.setBounds(17, 11, 235, 16);
			}
			{
				jLabelWohin = new JLabel();
				getContentPane().add(jLabelWohin);
				jLabelWohin.setText("Wohin möchte der Kunde fliegen?");
				jLabelWohin.setBounds(17, 77, 251, 16);
			}
			{
				jTextFieldVon = new JTextField();
				getContentPane().add(jTextFieldVon);
				jTextFieldVon.setBounds(23, 136, 113, 22);
			}
			{
				jLabelVon = new JLabel();
				getContentPane().add(jLabelVon);
				jLabelVon.setText("Von:");
				jLabelVon.setBounds(23, 105, 113, 16);
			}
			{
				jLabelNach = new JLabel();
				getContentPane().add(jLabelNach);
				jLabelNach.setText("Nach:");
				jLabelNach.setBounds(160, 105, 108, 16);
			}
			{
				jTextFieldNach = new JTextField();
				getContentPane().add(jTextFieldNach);
				jTextFieldNach.setBounds(160, 136, 108, 22);
				jTextFieldNach.setSize(113, 22);
			}
			{
				jLabelAblfugdatum = new JLabel();
				getContentPane().add(jLabelAblfugdatum);
				jLabelAblfugdatum.setText("Hinflug am:");
				jLabelAblfugdatum.setBounds(23, 182, 113, 16);
			}
			{
				jLabelRueckflug = new JLabel();
				getContentPane().add(jLabelRueckflug);
				jLabelRueckflug.setText("Rückflug am:");
				jLabelRueckflug.setBounds(160, 182, 108, 16);
			}
			{
				jSeparator1 = new JSeparator();
				getContentPane().add(jSeparator1);
				jSeparator1.setBounds(0, 61, 382, 10);
				jSeparator1.setSize(400, 10);
			}
			{
				jSeparator2 = new JSeparator();
				getContentPane().add(jSeparator2);
				jSeparator2.setBounds(-2, 169, 388, 10);
			}
			{
				jTextFieldAbflugDatum = new JTextField();
				getContentPane().add(jTextFieldAbflugDatum);
				jTextFieldAbflugDatum.setText("01.02.2010");
				jTextFieldAbflugDatum.setEditable(false);
				jTextFieldAbflugDatum.setBounds(23, 217, 113, 22);
			}
			{
				jTextFieldRueckflugDatum = new JTextField();
				getContentPane().add(jTextFieldRueckflugDatum);
				jTextFieldRueckflugDatum.setText("08.02.2010");
				jTextFieldRueckflugDatum.setEditable(false);
				jTextFieldRueckflugDatum.setBounds(160, 217, 113, 22);
			}
			{
				jSeparator3 = new JSeparator();
				getContentPane().add(jSeparator3);
				jSeparator3.setBounds(0, 258, 10, 10);
				jSeparator3.setSize(400, 10);
			}
			{

				jComboBoxServiceKlasse = new JComboBox(items);
				getContentPane().add(jComboBoxServiceKlasse);
				jComboBoxServiceKlasse.setBounds(23, 297, 113, 22);
				jComboBoxServiceKlasse.addActionListener(this);

			}
			{
				jLabelKlassenFrage = new JLabel();
				getContentPane().add(jLabelKlassenFrage);
				jLabelKlassenFrage
						.setText("In welcher Klasse möchte der Kunde reisen?");
				jLabelKlassenFrage.setBounds(23, 270, 314, 16);
			}
			{
				jSeparator4 = new JSeparator();
				getContentPane().add(jSeparator4);
				jSeparator4.setBounds(0, 335, 10, 10);
				jSeparator4.setSize(400, 10);
			}
			{
				jLabelWerFliegt = new JLabel();
				getContentPane().add(jLabelWerFliegt);
				jLabelWerFliegt.setText("Wieviele Personen fliegen?");
				jLabelWerFliegt.setBounds(23, 351, 245, 16);
			}
			{
				jTextFieldPersonenZahl = new JTextField();
				getContentPane().add(jTextFieldPersonenZahl);
				jTextFieldPersonenZahl.setBounds(23, 379, 31, 22);
			}
			{
				jButtonWeiter = new JButton();
				getContentPane().add(jButtonWeiter);
				jButtonWeiter.setText("Weiter");
				jButtonWeiter.setBounds(311, 552, 79, 22);
				jButtonWeiter.addActionListener(this);
				jButtonWeiter.setActionCommand("Weiter");
			}
			{
				jButtonAbbruch = new JButton();
				getContentPane().add(jButtonAbbruch);
				jButtonAbbruch.setText("Abbrechen");
				jButtonAbbruch.setBounds(311, 585, 79, 22);
			}
			{
				jSeparator5 = new JSeparator();
				getContentPane().add(jSeparator5);
				jSeparator5.setBounds(0, 424, 10, 10);
				jSeparator5.setSize(400, 10);
			}
			{
				jLabelPersonenangaben = new JLabel();
				getContentPane().add(jLabelPersonenangaben);
				jLabelPersonenangaben.setText("Angaben zur Person:");
				jLabelPersonenangaben.setBounds(23, 446, 229, 16);
			}
			{
				jTextFieldVorname = new JTextField();
				getContentPane().add(jTextFieldVorname);
				jTextFieldVorname.setBounds(23, 491, 97, 22);
				// jTextFieldVorname.setText("Vorname");
			}
			{
				jTextFieldNachname = new JTextField();
				getContentPane().add(jTextFieldNachname);
				// jTextFieldNachname.setText("Nachname");
				jTextFieldNachname.setBounds(166, 491, 118, 22);
			}

			pack();
			this.setSize(428, 662);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("J")) {
			rueck = "J";
		} else if (ae.getActionCommand().equals("N")) {
			rueck = "N";
		}

		if (ae.getActionCommand().equals("Weiter")) {
			NeueFlugBuchung.ExecuteBuchungInsert();
			this.setVisible(false);
			mitreisende = Integer.parseInt(JFrameNeueBuchung.jTextFieldPersonenZahl.getText());
			if (mitreisende == 1) {
			new JFrameGepaeckBuchen(null);}
			else if (mitreisende > 1){
				JFrameMitreisendeGrid open = new JFrameMitreisendeGrid();
				open.setLocationRelativeTo(null);
				open.setVisible(true);
			}
		}
		if (ae.getActionCommand().equals("Abbrechen")) {
			dispose();
			JFrameFbsGUI open = new JFrameFbsGUI();
			open.setLocationRelativeTo(null);
			open.setVisible(true);
		}

	}

}
