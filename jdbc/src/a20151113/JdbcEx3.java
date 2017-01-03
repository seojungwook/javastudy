package a20151113;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * PreparedStatement ����
 * Statement�� ���� �������̽���.
 */
public class JdbcEx3 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			String sql = "create table login " 
					+ " (id varchar2(10) primary key, "
					+ " passwd varchar2(10))";
			pstmt = conn.prepareStatement(sql);
			int result = pstmt.executeUpdate();
			pstmt.close();
			sql = "insert into login values(?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "hongkd");
			pstmt.setString(2, "ȫ�浿");
			result = pstmt.executeUpdate();
			pstmt.setString(1, "kimsg");
			pstmt.setString(2, "���");
			result = pstmt.executeUpdate();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
