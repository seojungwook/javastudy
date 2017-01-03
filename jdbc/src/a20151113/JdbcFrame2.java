package a20151113;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JdbcFrame2 extends JFrame{
	JTextField tf;
	JTextArea ta;
	Connection conn;
	ResultSet rs;
	PreparedStatement pstmt;
	JdbcFrame2() throws SQLException, ClassNotFoundException{
		tf = new JTextField();
		ta = new JTextArea();
		//JdbcFrame 클래스는 JFrame 객체임.
		//기본배치관리자 : BorderLayout
		//BorderLayout : 화면은 5개로 나누어서 배치
		add("North",tf);
		add("Center",ta);
		setSize(1000,800);
		setVisible(true);
		//Frame을 Close하면 프로세스 종료 설정
		setDefaultCloseOperation(JdbcFrame.EXIT_ON_CLOSE);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		
		//TextField에 ActionEvent는 언제 발생?
		//EnterKey가 입력되면 ActionEvent발생
		ActionListener al = new ActionListener(){
			@Override //이벤트핸들러
			public void actionPerformed(ActionEvent e) {
			
				try{
				//1. PreparedStatement 객체 생성하기
				pstmt = conn.prepareStatement(tf.getText());
				//2. executeUpdate 구문 실행
				int result = pstmt.executeUpdate();
				//3. 결과를 ta에 출력하기
				ta.setText("결과:" + result);
				pstmt.close();
				}catch (SQLException e1){
					e1.printStackTrace();
				}
			}
		};
		//이벤트 등록
		tf.addActionListener(al);
	}
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		new JdbcFrame2();
	}
}
