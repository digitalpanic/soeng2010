package flugBuchSys.app;

import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import flugBuchSys.gui.JFrameAnlegen;
import flugBuchSys.gui.JFrameFlugzeugAnlegen;
import flugBuchSys.gui.JFrameSuchen;

import flugBuchSys.odbc.Statements;

public class InterfaceAnlegen {

	public static void anlegen(JFrameAnlegen jFrame, String table) {
		
		JLabel[] jLabArr = jFrame.getJLabelArr();
		JTextField[] strTextArr = jFrame.getJTextFieldArr();

		ArrayList arrListLabArrIns = new ArrayList();
		ArrayList arrListTexArrCond = new ArrayList();

		for (int i = 0; i < strTextArr.length; i++) {
			arrListLabArrIns.add(jLabArr[i].getName());
				arrListTexArrCond.add(strTextArr[i].getText());
				System.out.println(jLabArr[i].getText() + " --> " + strTextArr[i].getText());
			
		}

		arrListLabArrIns.add("ACTIVE");
		arrListTexArrCond.add("J");

		/*
		 * Object[] strJlabArr = strLabArrSel.toArray(); Object[] strJtexArr =
		 * strTexArrSel.toArray();
		 * 
		 * Object[][] strCondition = { strLabArrSel.toArray(),
		 * strTexArrSel.toArray() }
		 
		ArrayList arrListArrValue = new ArrayList();
		arrListArrValue.add(arrListTexArrCond);
*/
		
//		JTable jt = 
			Statements.transformInsert(table, arrListLabArrIns,
					arrListTexArrCond);

/*		JScrollPane scrollPane = new JScrollPane(jt);
		scrollPane.setBounds(25, 400, 450, 100);

		Container c1 = jFrame.getContentPane();
		c1.add(scrollPane);
*/	}

}
