package a20151113;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * int executeUpdate() ����
 * 	���� �� ������ ���ڵ��� �Ǽ� ����
 *	 DML, DDL ���� ������. ���ϵǴ� �����Ͱ��� ����.
 *	DML : insert, update, delete // �ѹ��� �ȴ�
 *	DDL : create, alter, drop
 */
public class JdbcEx2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.����̹� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2.Connection ��ü ����
		Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		//3. Statement ��ü ����
		Statement stmt = conn.createStatement();
		String sql = "create table jdbctemp " + "(id number, text varchar2(30))";
		sql = "insert into jdbctemp values(1,'AAA')";
		sql = "update jdbctemp set text = 'ȫ�浿' where id=1";
		sql = "delete from jdbctemp where id=1";
		sql = "drop table jdbctemp";
		int result = stmt.executeUpdate(sql);
		System.out.println("1:��� =" + result);
		//1. id�� 1�� ���ڵ��� text�� ������ 'ȫ�浿'���� �����ϱ�
	}
}
