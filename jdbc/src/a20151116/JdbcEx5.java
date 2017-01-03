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
 * 문제:
 * 1. dept2 테이블을 복사하여 deptcopy 테이블을 생성
 * 2. deptcopy 테이블에
 * 	dcode: 9001 dname : 특판1팀 pdept : 1006
 * 	area : '서울지사' 추가
 * 	dcode: 9002 dname : 특판2팀 pdept : 1006
 * 	area : '서울지사' 추가
 * 3. dcode 9002인 부서코드의 area 컬럼의 값을 울산지사 변경
 * 4. 9001번 부서를 제거하기
 * 5. 각각의 스텝에 모든 레코드 조회 기능 추가
 * 
 */
public class JdbcEx5 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
			// 1. dept2 테이블을 복사하여 deptcopy 테이블을 생성
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			String sql = "create table deptcopy as select * from dept2"; 
			pstmt = conn.prepareStatement(sql);
		try{
			int result = pstmt.executeUpdate();
			deptcopySearch(conn, "create deptcopy 실행 후");
			System.out.println();
//			 2. deptcopy 테이블에
//			  	dcode: 9001 dname : 특판1팀 pdept : 1006
//			  	area : '서울지사' 추가
//			  	dcode: 9002 dname : 특판2팀 pdept : 1006
//			  	area : '서울지사' 추가
			sql = "insert into deptcopy values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "9001");
			pstmt.setString(2, "특판1팀");
			pstmt.setString(3, "1006");
			pstmt.setString(4, "서울지사");
			result = pstmt.executeUpdate();
			pstmt.setString(1, "9002");
			pstmt.setString(2, "특판2팀");
			pstmt.setString(3, "1006");
			pstmt.setString(4, "서울지사");
			result = pstmt.executeUpdate();
			deptcopySearch(conn, "9001, 9002번 추가 후");
			System.out.println();
			// 3. dcode 9002인 부서코드의 area 컬럼의 값을 울산지사 변경
			changeArea(conn);
			// 4. 9001번 부서를 제거하기
			sql = "delete from deptcopy where dcode=9001";
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeUpdate();
			deptcopySearch(conn, "9001번 부서 제거한 후");
			
		} catch (SQLSyntaxErrorException e) {
			System.out.println(e.getMessage());
			sql = "drop table deptcopy";
			pstmt = conn.prepareStatement(sql);
			int result = pstmt.executeUpdate();
			System.out.println("deptcopy 테이블 제거");
			return;
		} 
	}

	private static void changeArea(Connection conn) throws SQLException {
		String sql = "update deptcopy set area = '울산지사' where dcode=9002";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.executeUpdate();
		deptcopySearch(conn, "9002번 area를 울산지사로 변경 후");
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
