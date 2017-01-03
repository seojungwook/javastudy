package a20151116;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * �ڹٿ��� Stored procedure�� ����ϱ�
 * CallableStatement ��ü�� �����.
 * Statement > PreparedStatement > CallableStatement ����Ŭ����
 * Statement : sql�� ��� ���� ��ü
 * 			   sql�� ����(select) : executeQuery(sql)
 * 						 (DML,DDL) : executeUpdate(sql) 
 * PreparedStatement : sql ������ �̸� db�� ������ �Ͽ� ���� �غ��Ű�� ��ü
 * 						? �ɺ��� ����Ͽ� �Ķ����ó���� ����
 * 			   sql�� ����(select) : executeQuery()   ---- sql�� ����(�־�Ǳ���)
 * 						 (DML,DDL) : executeUpdate() 
 * CallableStatement : ���� ���ν����� ������ �� �ִ� ��� ���� ��ü��.
 * 
 */
public class JdbcEx6 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		//up_sal(?) : ����� �Է¹޾� �ش� ����� �޿��� �λ��ϴ� ���� ���ν��� 
		CallableStatement cstmt = conn.prepareCall("{call up_sal(?)}"); //(?) �� �Ű����� �־� 7900
		cstmt.setInt(1, 7900);
		cstmt.execute();
		cstmt.setInt(1, 7902);
		cstmt.execute();
		//7934�� ����� ������Ű��
		cstmt = conn.prepareCall("{call empcopy_del(?)}");
		cstmt.setInt(1, 7934);
		cstmt.execute();
		cstmt = conn.prepareCall("{call update_20(?)}");
		cstmt.setInt(1, 20);
		cstmt.execute();
		cstmt = conn.prepareCall("{call empcopy_insert(?,?,?,?,?)}");
		cstmt.setInt(1,4000);
		cstmt.setString(2,"ȫ�浿");
		cstmt.setString(3,"CLERK");
		cstmt.setInt(4,7900);
		cstmt.setInt(5,3500);
		cstmt.execute();
		
	}
}
