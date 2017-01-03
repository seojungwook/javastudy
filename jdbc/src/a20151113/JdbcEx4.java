package a20151113;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Properties;

/*
 * 1. ResultSetMetaData ��ȸ�ϱ�
 * 2. �ܺ� ���Ͽ��� db���� ����� ���� ���� ���
 * 		Properties Ŭ���� �̿��ϱ�
 * Hashtable < Properties : Map ��ü : (Ű,��)������ ������ ����
 */
public class JdbcEx4 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Properties pro = null;
		FileInputStream fis = null;
		try{
			pro = new Properties();
			fis = new FileInputStream("jdbc.properties");
			pro.load(fis);
			String driver = pro.getProperty("driver");
			String url = pro.getProperty("url");
			String user = pro.getProperty("user");
			String pw = pro.getProperty("passwd");
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,pw);
			String sql = "select * from student";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int colCnt = rsmd.getColumnCount();
			System.out.println("��ȸ�� �÷� ��:" + colCnt);
			System.out.printf("%-10s","�÷���");
			System.out.printf("%-10s","�÷�Ÿ��");
			System.out.printf("%-10s\n","NULL ���");
			for(int i=1; i<=colCnt; i++){
				//���ڿ��� 10�ڸ�Ȯ���ϰ� ��������
				System.out.printf("%-10s",rsmd.getColumnName(i));
				System.out.printf("%s(%d)\t",
						rsmd.getColumnTypeName(i),rsmd.getPrecision(i));
				System.out.printf("%-10s\n",(rsmd.isNullable(i)==0)?"NOT NULL":"NULL");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
