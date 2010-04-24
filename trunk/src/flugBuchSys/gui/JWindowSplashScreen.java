package flugBuchSys.gui;

import java.awt.Graphics;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JWindow;

public class JWindowSplashScreen extends JWindow implements Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void run() {
		setSize(400, 200);
		setLocationRelativeTo(null);
		setVisible(true);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			dispose();
		}
		dispose();
	}

	public void paint(Graphics g) {
		Image splashImage;

		try {
			splashImage = getToolkit().getImage(
					new URL("http://www.digitalpanic.de/splashscreen.gif"));
			g.drawImage(splashImage, 0, 0, this);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}