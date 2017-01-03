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
		//JdbcFrame Ŭ������ JFrame ��ü��.
		//�⺻��ġ������ : BorderLayout
		//BorderLayout : ȭ���� 5���� ����� ��ġ
		add("North",tf);
		add("Center",ta);
		setSize(1000,800);
		setVisible(true);
		//Frame�� Close�ϸ� ���μ��� ���� ����
		setDefaultCloseOperation(JdbcFrame.EXIT_ON_CLOSE);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		
		//TextField�� ActionEvent�� ���� �߻�?
		//EnterKey�� �ԷµǸ� ActionEvent�߻�
		ActionListener al = new ActionListener(){
			@Override //�̺�Ʈ�ڵ鷯
			public void actionPerformed(ActionEvent e) {
			
				try{
				//1. PreparedStatement ��ü �����ϱ�
				pstmt = conn.prepareStatement(tf.getText());
				//2. executeUpdate ���� ����
				int result = pstmt.executeUpdate();
				//3. ����� ta�� ����ϱ�
				ta.setText("���:" + result);
				pstmt.close();
				}catch (SQLException e1){
					e1.printStackTrace();
				}
			}
		};
		//�̺�Ʈ ���
		tf.addActionListener(al);
	}
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		new JdbcFrame2();
	}
}
