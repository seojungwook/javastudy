package a20151116;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 자바에서 Stored procedure를 사용하기
 * CallableStatement 객체를 사용함.
 * Statement > PreparedStatement > CallableStatement 하위클래스
 * Statement : sql문 명령 전달 객체
 * 			   sql문 실행(select) : executeQuery(sql)
 * 						 (DML,DDL) : executeUpdate(sql) 
 * PreparedStatement : sql 문장을 미리 db에 전송을 하여 실행 준비시키는 객체
 * 						? 심볼을 사용하여 파라미터처리가 가능
 * 			   sql문 실행(select) : executeQuery()   ---- sql이 없어(있어도되긴해)
 * 						 (DML,DDL) : executeUpdate() 
 * CallableStatement : 저장 프로시저를 실행할 수 있는 명령 전달 객체임.
 * 
 */
public class JdbcEx6 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		//up_sal(?) : 사번을 입력받아 해당 사원의 급여를 인상하는 저장 프로시저 
		CallableStatement cstmt = conn.prepareCall("{call up_sal(?)}"); //(?) 에 매개변수 넣어 7900
		cstmt.setInt(1, 7900);
		cstmt.execute();
		cstmt.setInt(1, 7902);
		cstmt.execute();
		//7934번 사원을 퇴직시키기
		cstmt = conn.prepareCall("{call empcopy_del(?)}");
		cstmt.setInt(1, 7934);
		cstmt.execute();
		cstmt = conn.prepareCall("{call update_20(?)}");
		cstmt.setInt(1, 20);
		cstmt.execute();
		cstmt = conn.prepareCall("{call empcopy_insert(?,?,?,?,?)}");
		cstmt.setInt(1,4000);
		cstmt.setString(2,"홍길동");
		cstmt.setString(3,"CLERK");
		cstmt.setInt(4,7900);
		cstmt.setInt(5,3500);
		cstmt.execute();
		
	}
}
