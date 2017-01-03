package a20151113;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * int executeUpdate() 예제
 * 	실행 후 수정된 레코드의 건수 리턴
 *	 DML, DDL 문장 실행함. 리턴되는 데이터값이 없다.
 *	DML : insert, update, delete // 롤백이 된다
 *	DDL : create, alter, drop
 */
public class JdbcEx2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.드라이버 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2.Connection 객체 생성
		Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		//3. Statement 객체 생성
		Statement stmt = conn.createStatement();
		String sql = "create table jdbctemp " + "(id number, text varchar2(30))";
		sql = "insert into jdbctemp values(1,'AAA')";
		sql = "update jdbctemp set text = '홍길동' where id=1";
		sql = "delete from jdbctemp where id=1";
		sql = "drop table jdbctemp";
		int result = stmt.executeUpdate(sql);
		System.out.println("1:결과 =" + result);
		//1. id가 1인 레코드의 text의 내용을 '홍길동'으로 수정하기
	}
}
