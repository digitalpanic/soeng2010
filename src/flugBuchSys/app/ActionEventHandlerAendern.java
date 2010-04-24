package flugBuchSys.app;

import java.util.ArrayList;

import javax.swing.JTable;

import flugBuchSys.gui.JFrameSuchen;
import flugBuchSys.odbc.Statements;

public class ActionEventHandlerAendern {

	public static void loeschen(JFrameSuchen jFrameKundeSuchen, String table) {
		JTable jt = jFrameKundeSuchen.getJTable();

		int row = jt.getSelectedRow();

		ArrayList arrListCol = new ArrayList();
		ArrayList arrListVal = new ArrayList();

		for (int i = 0; i < jt.getColumnCount(); i++) {
			if (jt.getValueAt(row, i) != null) {
				arrListCol.add(jt.getColumnName(i));
				arrListVal.add(jt.getValueAt(row, i));
			}
		}

		ArrayList condition = new ArrayList();

		condition.add(arrListCol);
		condition.add(arrListVal);

		String column = "ACTIVE";
		String value = "N";

		Statements.transformUpdate(column, table, value, condition);
	}
}
