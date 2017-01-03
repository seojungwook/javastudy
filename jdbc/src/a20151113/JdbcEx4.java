package a20151113;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Properties;

/*
 * 1. ResultSetMetaData 조회하기
 * 2. 외부 파일에서 db관련 저장된 설정 내용 사용
 * 		Properties 클래스 이용하기
 * Hashtable < Properties : Map 객체 : (키,값)쌍으로 여러개 저장
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
			System.out.println("조회된 컬럼 수:" + colCnt);
			System.out.printf("%-10s","컬럼명");
			System.out.printf("%-10s","컬럼타입");
			System.out.printf("%-10s\n","NULL 허용");
			for(int i=1; i<=colCnt; i++){
				//문자열로 10자리확보하고 왼쪽정렬
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
