package flugBuchSys.odbc;

import java.util.ArrayList;
import javax.swing.JTable;

/**
 * Klasse, welche die Verschiedenen Parameter der Abfragen in den entsprechenden
 * SQL-String umwandelt
 * 
 * @author Florian Leicher - Gruppe 15
 * @version 1.0
 */
public class Statements {

	// Globale festlegung der Parameter für die Datenbank, damit diese nicht in
	// jeder Verbindungsklasse einzeln gelesen werden müssen
	public static String sDbDriver = "oracle.jdbc.driver.OracleDriver";
	public static String sDbUrl = "jdbc:oracle:thin:@localhost:1521:XE";


	 //public static String sDbUrl = "jdbc:oracle:thin:@localhost:1521:XE";

	public static String sUsr = "SOENG";
	public static String sPwd = "inderinc277";

	public static String selectQry = null;

	/**
	 * Aufruf von SelectQueries.java.
	 * 
	 * Diese Methode nimmt erhält den neu zusammengesetzten Select String und
	 * gibt diesen an die SelectQuery.java Klasse weiter.
	 * 
	 * @param query
	 *            SQL-Abfrage
	 * @return
	 */
	public static JTable execSelectQuery(String query) {
		SelectQueries q = new SelectQueries(query);
		return q.getSQLTable();
	}

	/**
	 * Aufruf von UpdateQueries.java.
	 * 
	 * Diese Methode nimmt erhält den neu zusammengesetzten Select String und
	 * gibt diesen an die SelectQuery.java Klasse weiter.
	 * 
	 * @param query
	 *            SQL-Abfrage
	 */
	public static void execUpdateInsertQuery(String query) {
		UpdateQueries.update(query);
		// UpdateQueries q = new UpdateQueries(query);
	}

	/**
	 * Diese Methode wandelt die Übergebenen Parameter um und erstellt ein
	 * SELECT-Statement.
	 * 
	 * @param table
	 *            Tabellenname
	 * @param strLabArrSel
	 *            Spaltennamen
	 * @param arrListArrCondition
	 *            Werte nach denen Gesucht werden soll
	 * @return
	 */
	public static JTable transformSelect(String table, ArrayList strLabArrSel,
			ArrayList arrListArrCondition) {
		// String welcher die SQL-Abrfrage darstellt

		// Vordefinierte Strings welche Komponenten der SQL-Abfrage darstellen
		String stmtSel = "SELECT ";
		String stmtFrm = " FROM ";
		String stmtWhr = " WHERE 1=1 AND ";
		// Temporäre Strings
		String tmpColumn = "";
		String tmpValue = "";

		// Array column in String umwandeln und für eine SQL-Abfrage optimieren
		for (int i = 0; i < strLabArrSel.size(); i++) {
			tmpColumn = tmpColumn + strLabArrSel.get(i).toString() + ", ";
		}
		tmpColumn = tmpColumn.substring(0, tmpColumn.length() - 2);

		// Array value in String umwandeln und für die SQL-Abfrage optimieren
		for (int i = 0; i < ((ArrayList) arrListArrCondition.get(0)).size(); i++) {
			//
			// Casten
			String tmpCastParam = ((ArrayList) arrListArrCondition.get(0)).get(
					i).toString();

			String tmpCastValue = ((ArrayList) arrListArrCondition.get(1)).get(i).toString();

			// System.out.println(tmpCastParam + " = " +
			// tmpCastValue.getText());

			// Ersetzen der Wildcard '*' durch '%'
			tmpCastValue = tmpCastValue.replace('*', '%');
			// Unterscheidung ob eine Wildcard benutzt wurde
			// Wenn eine Wildcard benutzt wurde, wird anstelle von '=' ein
			// 'LIKE' verwendet
			if (tmpCastValue.contains("%")) {
				tmpValue = tmpValue + tmpCastParam + " LIKE " + "'"
						+ tmpCastValue + "'" + " AND ";
			}
			// Wenn keine Wildcard benutzt wurde, wird ein ganz normales '='
			// verwendet.
			else {
				tmpValue = tmpValue + tmpCastParam + " = " + "'" + tmpCastValue
						+ "'" + " AND ";
			}

		}

		// Entfernen der letzten vier stellen (' AND')
		tmpValue = tmpValue.substring(0, tmpValue.length() - 4);

		// Abfrage zusammenbauen
		selectQry = (stmtSel + tmpColumn + stmtFrm + table + stmtWhr + tmpValue);

		System.out.println(selectQry);

		// Abfrage absetzen
		return execSelectQuery(selectQry);
	}

	/**
	 * Diese Methode wandelt die Übergebenen Parameter um und erstellt ein
	 * INSERT-Statement.
	 * 
	 * @param table
	 *            Tabellenname
	 * @param column
	 *            Spaltennamen
	 * @param value
	 *            Werte nach denen Gesucht werden soll
	 */
	public static void transformInsert(String table, ArrayList strLabArrSel,
			ArrayList arrListArrValue) {
		// Sting welcher die SQL-Abrfrage darstellt
		String insertQry = null;
		// Vordefinierte Strings welche Komponenten der SQL-Abfrage darstellen
		String stmtIns = "INSERT INTO ";
		String stmtVal = " VALUES ";
		// Temporäre Strings
		String tmpColumns = "";
		String tmpValues = "";

		// Array column in String umwandeln und für eine SQL-Abfrage optimieren
		for (int i = 0; i < strLabArrSel.size(); i++) {
			tmpColumns = tmpColumns + strLabArrSel.get(i).toString() + ", ";
		}

		// Die letzen zwei Zeichen entfernen (', ')
		tmpColumns = tmpColumns.substring(0, tmpColumns.length() - 2);
		// colums in Klammern setzen
		tmpColumns = ("(" + tmpColumns + ")");

		// Array values in String umwandeln und für eine SQL-Abfrage optimieren
		for (int i = 0; i < arrListArrValue.size(); i++) {
			tmpValues = tmpValues + "'" + arrListArrValue.get(i) + "', ";
		}

		// Die letzen zwei Zeichen entfernen (', ')
		tmpValues = tmpValues.substring(0, tmpValues.length() - 2);
		// values in Klammern setzen
		tmpValues = ("(" + tmpValues + ")");

		// SQL-Sting zusammensetzten
		insertQry = (stmtIns + "SOENG." + table + " " + tmpColumns + stmtVal + tmpValues);
		// insertQry = (stmtIns + "SOENG." + "Kunde" + " " + "'ANREDE'" +
		// stmtVal + "'Frau'");
		System.out.println(insertQry);

		// SQL-Abfrage absetzen
		execUpdateInsertQuery(insertQry);
		// SYSOUT des ergebnises
		System.out.println(UpdateQueries.result);
	}

	/**
	 * Diese Methode wandelt die Übergebenen Parameter um und erstellt ein
	 * UPDATE-Statement.
	 * 
	 * @param column
	 * @param table
	 * @param value
	 * @param condition
	 */
	public static void transformUpdate(String column, String table,
			String value, ArrayList arrListArrCondition) {
		// Sting welcher die SQL-Abrfrage darstellt
		String updateQry = null;

		// Vordefinierte Strings welche Komponenten der SQL-Abfrage darstellen
		String stmtUpd = "UPDATE ";
		String stmtSet = " SET ";
		String stmtCon = " WHERE 1=1 AND ";
		String tmpValue = "";

		// Temporäre Strings
		String tmpCondition = "";

		// Array condition in String umwandeln und für die SQL-Abfrage
		// optimieren

		// Array value in String umwandeln und für die SQL-Abfrage optimieren
		for (int i = 0; i < ((ArrayList) arrListArrCondition.get(0)).size(); i++) {
			//
			// Casten

				String tmpCastParam = ((ArrayList) arrListArrCondition.get(0))
						.get(i).toString();
				String tmpCastValue = ((ArrayList) arrListArrCondition.get(1))
						.get(i).toString();

				tmpCondition = tmpCondition + tmpCastParam + " = " + "'" + tmpCastValue
						+ "'" + " AND ";
		}

		// Entfernen der letzten vier stellen (' AND')
		tmpCondition = tmpCondition.substring(0, tmpCondition.length() - 4);

		// Abfrage zusammenbauen
		updateQry = (stmtUpd + table + stmtSet + column + " = '" + value + "'"
				+ stmtCon + tmpCondition);

		System.out.println(updateQry);

		// Abfrage absetzen
		execUpdateInsertQuery(updateQry);

		// SYSOUT des ergebnises
		System.out.println(UpdateQueries.result);
	}

}