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
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JdbcFrame extends JFrame implements ActionListener{
	JTextField tf;
	JTextArea ta;
	Connection conn;
	Statement stmt;
	
	ResultSet rs,rs2;
	
	PreparedStatement pstmt = null;
	JdbcFrame() throws SQLException, ClassNotFoundException{
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
		
		//안에 있는 문자열을 Class화 시키는 메서드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//thin : 오라클에 기본이 되는 서버
		//1521 : 포트번호
		//orcl이라는 이름을 가지고 찾는?
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		stmt = conn.createStatement();
		//TextField에 ActionEvent는 언제 발생?
		//EnterKey가 입력되면 ActionEvent발생
		ActionListener al = new ActionListener(){
			@Override //이벤트핸들러
			public void actionPerformed(ActionEvent e) {
				try{
					ta.setText("");
					
					String sql = tf.getText();
					pstmt = conn.prepareStatement(sql);
					rs2 = pstmt.executeQuery();
					ResultSetMetaData rsmd = rs2.getMetaData();
					int colCnt = rsmd.getColumnCount();
					ta.append("조회된 컬럼 수:" + colCnt + "\n");
					ta.append("컬럼명" + "\t");
					ta.append("컬럼타입" + "\t");
					ta.append("NULL 허용" + "\n");
					for(int i=1; i<=colCnt; i++){
						//문자열로 10자리확보하고 왼쪽정렬
						ta.append(rsmd.getColumnName(i) + "\t");
						ta.append(rsmd.getColumnTypeName(i) + "("+ rsmd.getPrecision(i)+")\t");
						ta.append(((rsmd.isNullable(i)==0)?"NOT NULL":"NULL")+ "\n");
					}
					ta.append("\n");
				
				ResultSet rs1 = stmt.executeQuery("select count(*) from (" + tf.getText() + ")");
				rs1.next();
				ta.append("조회건수: " +rs1.getString(1));
				ta.append("\n");
				rs = stmt.executeQuery(tf.getText());
				
				//ResultSetMetaData rsmd = rs.getMetaData();
		
				for(int i=1; i<=rsmd.getColumnCount();i++){
					ta.append(rsmd.getColumnName(i)+"\t");
				}
				ta.append("\n");
				
				while(rs.next()){
					
					for(int i=1; i<=rsmd.getColumnCount();i++){
						ta.append(rs.getString(i)+"\t");
						}
					ta.append("\n");
					}
			}catch(Exception e1){
				e1.printStackTrace();
				}
			}
		};
		//이벤트 등록
		tf.addActionListener(al);
	}
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		new JdbcFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
