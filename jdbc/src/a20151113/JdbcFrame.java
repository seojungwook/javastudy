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
		//JdbcFrame Ŭ������ JFrame ��ü��.
		//�⺻��ġ������ : BorderLayout
		//BorderLayout : ȭ���� 5���� ����� ��ġ
		add("North",tf);
		add("Center",ta);
		setSize(1000,800);
		setVisible(true);
		//Frame�� Close�ϸ� ���μ��� ���� ����
		setDefaultCloseOperation(JdbcFrame.EXIT_ON_CLOSE);
		
		//�ȿ� �ִ� ���ڿ��� Classȭ ��Ű�� �޼���
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//thin : ����Ŭ�� �⺻�� �Ǵ� ����
		//1521 : ��Ʈ��ȣ
		//orcl�̶�� �̸��� ������ ã��?
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		stmt = conn.createStatement();
		//TextField�� ActionEvent�� ���� �߻�?
		//EnterKey�� �ԷµǸ� ActionEvent�߻�
		ActionListener al = new ActionListener(){
			@Override //�̺�Ʈ�ڵ鷯
			public void actionPerformed(ActionEvent e) {
				try{
					ta.setText("");
					
					String sql = tf.getText();
					pstmt = conn.prepareStatement(sql);
					rs2 = pstmt.executeQuery();
					ResultSetMetaData rsmd = rs2.getMetaData();
					int colCnt = rsmd.getColumnCount();
					ta.append("��ȸ�� �÷� ��:" + colCnt + "\n");
					ta.append("�÷���" + "\t");
					ta.append("�÷�Ÿ��" + "\t");
					ta.append("NULL ���" + "\n");
					for(int i=1; i<=colCnt; i++){
						//���ڿ��� 10�ڸ�Ȯ���ϰ� ��������
						ta.append(rsmd.getColumnName(i) + "\t");
						ta.append(rsmd.getColumnTypeName(i) + "("+ rsmd.getPrecision(i)+")\t");
						ta.append(((rsmd.isNullable(i)==0)?"NOT NULL":"NULL")+ "\n");
					}
					ta.append("\n");
				
				ResultSet rs1 = stmt.executeQuery("select count(*) from (" + tf.getText() + ")");
				rs1.next();
				ta.append("��ȸ�Ǽ�: " +rs1.getString(1));
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
		//�̺�Ʈ ���
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
