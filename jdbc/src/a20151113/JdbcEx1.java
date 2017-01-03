package a20151113;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1. 드라이버 설정 : ojdbc6.jar
 * 2. jdbc 사용하기
 * 	  (1) java.sql 패키지 사용함
 * 	  (2) 드라이버 선택
 * 			Class.forName(...)
 *    (3) Connection 객체 생성 (연결)
 *    (4) Statement 객체 생성 (명령전달하는)
 *    (5) sql 명령 실행 
 *    (6) 명령 결과 확인
 */
public class JdbcEx1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. 드라이버 선택하기
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2. Connection 객체 생성
		Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		System.out.println("오라클 접속 완료");
		//3.Statement 객체 생성 : 명령 전달 객체
		Statement stmt = conn.createStatement();
		//4.명령 실행하기
		ResultSet rs = stmt.executeQuery("select * from emp2");
		//5.결과 확인하기
		//ResultSetMetaData 테이블 정보
		ResultSetMetaData rsmd = rs.getMetaData();
		for(int i=1; i<=rsmd.getColumnCount();i++){
			System.out.print(rsmd.getColumnName(i) + "\t");
		}
		System.out.println();
		//데이터 정보 가져오기
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
