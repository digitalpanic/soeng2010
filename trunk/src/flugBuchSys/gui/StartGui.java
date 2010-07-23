package flugBuchSys.gui;

import javax.swing.*;

public class StartGui {

	public static void main(String[] args) {

		Thread splashThread = new Thread(new JWindowSplashScreen());
		splashThread.start();

		while (splashThread.isAlive() == true) {
			// nichts tun
		}
		JFrameFbsGUI bucky = new JFrameFbsGUI();
		bucky.setSize(800, 600);
		bucky.setLocationRelativeTo(null);
		bucky.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		bucky.setVisible(true);
	}

}