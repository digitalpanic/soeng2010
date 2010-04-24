package flugBuchSys.app;

import java.awt.event.ActionEvent;

import flugBuchSys.gui.JFrameFlugAnlegen;
import flugBuchSys.gui.JFrameFlugSuchen;
import flugBuchSys.gui.JFrameFlugzeugAnlegen;
import flugBuchSys.gui.JFrameFlugzeugSuchen;
import flugBuchSys.gui.JFrameKundeAnlegen;
import flugBuchSys.gui.JFrameKundeSuchen;
import flugBuchSys.gui.JFrameRouteAnlegen;
import flugBuchSys.gui.JFrameRouteSuchen;
import flugBuchSys.gui.JFrameReservierungSuchen;

public class ActionEventHandler {

	public static void actionperformed(ActionEvent ae,
			JFrameKundeSuchen jFrameKundeSuchen) {

		String table = "Kunde";

		if (ae.getActionCommand().equals("KundeSuchen")) {
			ActionEventHandlerSuchen.suchen(jFrameKundeSuchen, table);
		}

		if (ae.getActionCommand().equals("KundeLoeschen")) {
			ActionEventHandlerAendern.loeschen(jFrameKundeSuchen, table);
		}

	}

	public static void actionperformed(ActionEvent ae,
			JFrameKundeAnlegen jFrameKundeAnlegen) {

		String table = "Kunde";

		if (ae.getActionCommand().equals("KundeAnlegen")) {
			ActionEventHandlerAnlegen.anlegen(jFrameKundeAnlegen, table);
		}

	}

	public static void actionperformed(ActionEvent ae,
			JFrameFlugSuchen jFrameFlugSuchen) {

		String table = "Flug";

		if (ae.getActionCommand().equals("FlugSuchen")) {
			ActionEventHandlerSuchen.suchen(jFrameFlugSuchen, table);
		}

		if (ae.getActionCommand().equals("FlugLoeschen")) {
			ActionEventHandlerAendern.loeschen(jFrameFlugSuchen, table);
		}
	}

	public static void actionperformed(ActionEvent ae,
			JFrameFlugAnlegen jFrameFlugAnlegen) {
		String table = "Flug";

		System.out.println(ae.getActionCommand());

		if (ae.getActionCommand().equals("FlugAnlegen")) {
			ActionEventHandlerAnlegen.anlegen(jFrameFlugAnlegen, table);
		}
	}

	public static void actionperformed(ActionEvent ae,
			JFrameFlugzeugSuchen jFrameFlugzeugSuchen) {

		String table = "Flugzeuge";

		if (ae.getActionCommand().equals("FlugzeugSuchen")) {
			ActionEventHandlerSuchen.suchen(jFrameFlugzeugSuchen, table);
		}

		if (ae.getActionCommand().equals("FlugzeugLoeschen")) {
			ActionEventHandlerAendern.loeschen(jFrameFlugzeugSuchen, table);
		}
	}

	public static void actionperformed(ActionEvent ae,
			JFrameFlugzeugAnlegen jFrameFlugzeugAnlegen) {

		String table = "Flugzeuge";

		if (ae.getActionCommand().equals("FlugzeugAnlegen")) {
			ActionEventHandlerAnlegen.anlegen(jFrameFlugzeugAnlegen, table);
		}
	}

	public static void actionperformed(ActionEvent ae,
			JFrameRouteSuchen jFrameRouteSuchen) {

		String table = "Route";

		if (ae.getActionCommand().equals("RouteSuchen")) {
			ActionEventHandlerSuchen.suchen(jFrameRouteSuchen, table);
		}

		if (ae.getActionCommand().equals("RouteLoeschen")) {
			ActionEventHandlerAendern.loeschen(jFrameRouteSuchen, table);
		}

	}

	public static void actionperformed(ActionEvent ae,
			JFrameRouteAnlegen jFrameRouteAnlegen) {

		String table = "Route";

		if (ae.getActionCommand().equals("RouteAnlegen")) {
			ActionEventHandlerAnlegen.anlegen(jFrameRouteAnlegen, table);
		}

	}

	public static void actionperformed(ActionEvent ae,
			JFrameReservierungSuchen jFrameReservierungSuchen) {

		String table = "Reservierung";

		if (ae.getActionCommand().equals("ReservierungSuchen")) {
			System.out.println("Leider noch nicht implementiert.");
			//ActionEventHandlerSuchen.suchen(jFrameReservierungSuchen, table);
		}

	}

}