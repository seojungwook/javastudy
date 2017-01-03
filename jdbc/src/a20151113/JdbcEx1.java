package a20151113;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1. ����̹� ���� : ojdbc6.jar
 * 2. jdbc ����ϱ�
 * 	  (1) java.sql ��Ű�� �����
 * 	  (2) ����̹� ����
 * 			Class.forName(...)
 *    (3) Connection ��ü ���� (����)
 *    (4) Statement ��ü ���� (��������ϴ�)
 *    (5) sql ��� ���� 
 *    (6) ��� ��� Ȯ��
 */
public class JdbcEx1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. ����̹� �����ϱ�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2. Connection ��ü ����
		Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		System.out.println("����Ŭ ���� �Ϸ�");
		//3.Statement ��ü ���� : ��� ���� ��ü
		Statement stmt = conn.createStatement();
		//4.��� �����ϱ�
		ResultSet rs = stmt.executeQuery("select * from emp2");
		//5.��� Ȯ���ϱ�
		//ResultSetMetaData ���̺� ����
		ResultSetMetaData rsmd = rs.getMetaData();
		for(int i=1; i<=rsmd.getColumnCount();i++){
			System.out.print(rsmd.getColumnName(i) + "\t");
		}
		System.out.println();
		//������ ���� ��������
		while(rs.next()){
			System.out.print(rs.getInt(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.print(rs.getString(4) + "\t");
			System.out.print(rs.getString(5) + "\t");
			System.out.print(rs.getString(6) + "\t");
			System.out.print(rs.getString(7) + "\t");
			System.out.print(rs.getString(8) + "\t");
			System.out.print(rs.getString(9) + "\t");
			System.out.println(rs.getString(10));
			
		}
	}
}
