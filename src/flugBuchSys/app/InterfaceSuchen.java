package flugBuchSys.app;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

import flugBuchSys.gui.JFrameSuchen;
import flugBuchSys.odbc.Statements;

public class InterfaceSuchen {

	
	public static void suchen(JFrameSuchen jFrame, String table) {

		JLabel[] jLabArr = jFrame.getJLabelArr();
		JTextField[] strTextArr = jFrame.getJTextFieldArr();

		ArrayList arrListLabArrSel = new ArrayList();
		ArrayList arrListLabArrCond = new ArrayList();
		ArrayList arrListTexArrCond = new ArrayList();

		for (int i = 0; i < strTextArr.length; i++) {
			arrListLabArrSel.add(jLabArr[i].getName());
			if (!strTextArr[i].getText().equals("")) {
				arrListLabArrCond.add(jLabArr[i].getName());
				System.out.println(strTextArr[i].getText());
				arrListTexArrCond.add(strTextArr[i].getText());
			}
		}

		try {
			arrListLabArrCond.add(jFrame.getActive().getName());
			arrListTexArrCond.add(jFrame.getStrActive());
		} catch (Exception e) {

		}

		try {
			arrListLabArrCond.add(jFrame.getJLabelGepaeck().getName());
			arrListTexArrCond.add(jFrame.getStrActive());
		} catch (Exception e) {

		}

		/*
		 * Object[] strJlabArr = strLabArrSel.toArray(); Object[] strJtexArr =
		 * strTexArrSel.toArray();
		 * 
		 * Object[][] strCondition = { strLabArrSel.toArray(),
		 * strTexArrSel.toArray() }
		 */
		ArrayList arrListArrCondition = new ArrayList();
		arrListArrCondition.add(arrListLabArrCond);
		arrListArrCondition.add(arrListTexArrCond);

		// Das JTable initialisieren
		
		JTable jt = Statements.transformSelect(table, arrListLabArrSel,
				arrListArrCondition);
		jFrame.setJTable(jt);
		jt.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent evt)
			{
				
				System.out.println("maus wurde geklickt");
			}
		}
		);
		
		
	}
	
}