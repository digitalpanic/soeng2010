package flugBuchSys.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import java.awt.Dimension;

public class JFrameFbsGUI extends javax.swing.JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JMenuBar jMenuBar1;
	private JMenu FlugzeugMenu;
	private JSeparator jSeparator1;
	private JMenuItem Flugzeug_Suchen;
	private JMenuItem Flug_Suchen;
	private JMenuItem Kunde_Suchen;
	private JMenuItem Exit_Button;
	private JMenu FlugMenu;
	private JMenu KundenMenu;
	private JMenu RoutenMenu;
	private JMenu jMenu1;
	private JMenuItem buchung;
	private JMenuItem Route_Suchen;
	public static boolean neuebuchung;

	/**
	 * This method initializes this
	 * 
	 */
	private void initialize() {
		this.setSize(new Dimension(576, 389));
		this.setJMenuBar(jMenuBar1);

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrameFbsGUI inst = new JFrameFbsGUI();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);

			}
		});
	}

	public JFrameFbsGUI() {
		super();
		initialize();
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setPreferredSize(new java.awt.Dimension(800, 600));
			this.setFont(new java.awt.Font("Arial Black", 0, 10));
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			this.setTitle("DispoFly");

			// new JFrameLoginPanel("Anmeldung").setVisible(false);
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				jMenuBar1.setPreferredSize(new java.awt.Dimension(4, 30));
				{
					jMenu1 = new JMenu();
					jMenuBar1.add(jMenu1);
					jMenu1.setText("Datei");
					jMenu1.setFont(new java.awt.Font("Euphemia", 0, 16));
					jMenu1.setPreferredSize(new java.awt.Dimension(51, 6));

					{
						buchung = new JMenuItem();
						jMenu1.add(buchung);
						buchung.setText("Neue Buchung");
						buchung.addActionListener(this);
						buchung.setActionCommand("neue Buchung");

					}

					{
						jSeparator1 = new JSeparator();
						jMenu1.add(jSeparator1);
						jSeparator1.setPreferredSize(new java.awt.Dimension(51,
								2));
					}
					{
						Exit_Button = new JMenuItem();
						jMenu1.add(Exit_Button);
						Exit_Button.setText("Beenden");
						Exit_Button.addActionListener(this);
						Exit_Button.setActionCommand("exit");
					}
				}
				{
					KundenMenu = new JMenu();
					jMenuBar1.add(KundenMenu);
					KundenMenu.setText("Kunde");
					KundenMenu.setFont(new java.awt.Font("Euphemia", 0, 16));
					KundenMenu.setSize(69, 29);
					KundenMenu.setPreferredSize(new java.awt.Dimension(59, 6));

					{
						Kunde_Suchen = new JMenuItem();
						KundenMenu.add(Kunde_Suchen);
						Kunde_Suchen.setText("Kunde Suchen");
						Kunde_Suchen.addActionListener(this);
						Kunde_Suchen.setActionCommand("Kunde suchen");

					}

				}
				{
					FlugMenu = new JMenu();
					jMenuBar1.add(FlugMenu);
					FlugMenu.setText("Flug");
					FlugMenu.setFont(new java.awt.Font("Euphemia", 0, 16));
					FlugMenu.setSize(69, 29);
					FlugMenu.setPreferredSize(new java.awt.Dimension(45, 6));
					{

						{
							Flug_Suchen = new JMenuItem();
							FlugMenu.add(Flug_Suchen);
							Flug_Suchen.setText("Flug Suchen");
							Flug_Suchen.addActionListener(this);
							Flug_Suchen.setActionCommand("Flug suchen");
						}
						{

						}
					}
					{
						// if (JFrameLoginPanel.admin == true)
						{
							FlugzeugMenu = new JMenu();
							jMenuBar1.add(FlugzeugMenu);
							FlugzeugMenu.setText("Flugzeug");
							FlugzeugMenu.setFont(new java.awt.Font("Euphemia",
									0, 16));
							FlugzeugMenu
									.setPreferredSize(new java.awt.Dimension(
											80, 6));

							{
								Flugzeug_Suchen = new JMenuItem();
								FlugzeugMenu.add(Flugzeug_Suchen);
								Flugzeug_Suchen.setText("Flugzeug Suchen");
								Flugzeug_Suchen.addActionListener(this);
								Flugzeug_Suchen
										.setActionCommand("Flugzeug suchen");
							}

						}
					}
					{
						RoutenMenu = new JMenu();
						jMenuBar1.add(RoutenMenu);
						RoutenMenu.setText("Route");
						RoutenMenu
								.setFont(new java.awt.Font("Euphemia", 0, 16));
						RoutenMenu.setSize(69, 29);
						RoutenMenu.setPreferredSize(new java.awt.Dimension(55,
								6));
						{
							Route_Suchen = new JMenuItem();
							RoutenMenu.add(Route_Suchen);
							Route_Suchen.setText("Route Suchen");
							Route_Suchen.addActionListener(this);
							Route_Suchen.setActionCommand("Route suchen");

						}
					}

					pack();
					this.setSize(800, 600);
					this.setLocationRelativeTo(null);
					this.setVisible(true);

					pack();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("neue Buchung")) {
			neuebuchung = true;
			new JFrameFlugSuchen("Neue Buchung anlegen");
			dispose();
		}

		if (ae.getActionCommand().equals("exit")) {
			System.exit(0);
		}
		if (ae.getActionCommand().equals("Kunde anlegen")) {
			dispose();
			new JFrameKundeAnlegen("Kunde Anlegen");
		}
		if (ae.getActionCommand().equals("Kunde suchen")) {
			dispose();
			new JFrameKundeSuchen("Kunde Suchen");
		}
		if (ae.getActionCommand().equals("Kunde bearbeiten")) {
			dispose();
			new JFrameKundeSuchen("Kunde Bearbeiten");
		}
		if (ae.getActionCommand().equals("Flug anlegen")) {
			dispose();
			new JFrameFlugAnlegen("Flug Anlegen");
		}
		if (ae.getActionCommand().equals("Flug suchen")) {
			dispose();
			neuebuchung = false;
			new JFrameFlugSuchen("Flug Suchen");
		}
		if (ae.getActionCommand().equals("Flug bearbeiten")) {
			dispose();
			new JFrameFlugSuchen("Flug bearbeiten");
		}
		if (ae.getActionCommand().equals("Flugzeug anlegen")) {
			dispose();
			new JFrameFlugzeugAnlegen("Flugzeug Anlegen");
		}
		if (ae.getActionCommand().equals("Flugzeug suchen")) {
			dispose();
			new JFrameFlugzeugSuchen("Flugzeug Suchen");
		}
		if (ae.getActionCommand().equals("Flugzeug bearbeiten")) {
			dispose();
			new JFrameFlugzeugSuchen("Flugzeug Bearbeiten");
		}
		if (ae.getActionCommand().equals("Route suchen")) {
			dispose();
			new JFrameRouteSuchen("Route Suchen");
		}
		if (ae.getActionCommand().equals("Route bearbeiten")) {
			dispose();
			new JFrameRouteSuchen("Route bearbeiten");
		}
		if (ae.getActionCommand().equals("Route anlegen")) {
			dispose();
			new JFrameRouteAnlegen("Route Anlegen");
		}
		if (ae.getActionCommand().equals("Reservierung suchen")) {
			this.setVisible(false);
			new JFrameReservierungSuchen("Reservierung anzeigen");
		}
	}
}