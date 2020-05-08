package jp.co.sss.crud.util;

/**
 * SQL文の管理用クラス
 */
public class ConstantSQL {
	/** SQL文(全件検索) */
	public static String SQL_FIND_ALL = "SELECT emp_id, emp_name, gender, TO_CHAR(birthday, 'YYYY/MM/DD') AS birthday, dept_name FROM employee e INNER JOIN department d ON e.dept_id = d.dept_id";

	/** SQL文(登録) */
	public static String SQL_INSERT = "INSERT INTO employee VALUES(seq_emp.NEXTVAL, ?, ?, ?, ?)";
}
