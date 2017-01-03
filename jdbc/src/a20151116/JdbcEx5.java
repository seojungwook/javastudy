package a20151116;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * ����:
 * 1. dept2 ���̺��� �����Ͽ� deptcopy ���̺��� ����
 * 2. deptcopy ���̺�
 * 	dcode: 9001 dname : Ư��1�� pdept : 1006
 * 	area : '��������' �߰�
 * 	dcode: 9002 dname : Ư��2�� pdept : 1006
 * 	area : '��������' �߰�
 * 3. dcode 9002�� �μ��ڵ��� area �÷��� ���� ������� ����
 * 4. 9001�� �μ��� �����ϱ�
 * 5. ������ ���ܿ� ��� ���ڵ� ��ȸ ��� �߰�
 * 
 */
public class JdbcEx5 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
			// 1. dept2 ���̺��� �����Ͽ� deptcopy ���̺��� ����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			String sql = "create table deptcopy as select * from dept2"; 
			pstmt = conn.prepareStatement(sql);
		try{
			int result = pstmt.executeUpdate();
			deptcopySearch(conn, "create deptcopy ���� ��");
			System.out.println();
//			 2. deptcopy ���̺�
//			  	dcode: 9001 dname : Ư��1�� pdept : 1006
//			  	area : '��������' �߰�
//			  	dcode: 9002 dname : Ư��2�� pdept : 1006
//			  	area : '��������' �߰�
			sql = "insert into deptcopy values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "9001");
			pstmt.setString(2, "Ư��1��");
			pstmt.setString(3, "1006");
			pstmt.setString(4, "��������");
			result = pstmt.executeUpdate();
			pstmt.setString(1, "9002");
			pstmt.setString(2, "Ư��2��");
			pstmt.setString(3, "1006");
			pstmt.setString(4, "��������");
			result = pstmt.executeUpdate();
			deptcopySearch(conn, "9001, 9002�� �߰� ��");
			System.out.println();
			// 3. dcode 9002�� �μ��ڵ��� area �÷��� ���� ������� ����
			changeArea(conn);
			// 4. 9001�� �μ��� �����ϱ�
			sql = "delete from deptcopy where dcode=9001";
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeUpdate();
			deptcopySearch(conn, "9001�� �μ� ������ ��");
			
		} catch (SQLSyntaxErrorException e) {
			System.out.println(e.getMessage());
			sql = "drop table deptcopy";
			pstmt = conn.prepareStatement(sql);
			int result = pstmt.executeUpdate();
			System.out.println("deptcopy ���̺� ����");
			return;
		} 
	}

	private static void changeArea(Connection conn) throws SQLException {
		String sql = "update deptcopy set area = '�������' where dcode=9002";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.executeUpdate();
		deptcopySearch(conn, "9002�� area�� �������� ���� ��");
		System.out.println();
		
	}

	public static void deptcopySearch(Connection conn, String msg) throws SQLException {
		System.out.println("***" + msg);
		String sql = "select * from deptcopy";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		for(int i = 1; i<= rsmd.getColumnCount(); i++){
			System.out.print(rsmd.getColumnName(i)+ "\t");
		}
		System.out.println();
	
		while(rs.next()){
			for(int i =1; i<=rsmd.getColumnCount(); i++){
				System.out.print(rs.getString(i)+"\t");
			}
			System.out.println();
		}
	}
}
