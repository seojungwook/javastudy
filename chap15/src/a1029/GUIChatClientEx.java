package a1029;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * ��Ƽ ä�� Ŭ���̾�Ʈ ���α׷�
 * 1. ���� ����, �����ID���� �Բ� ������
 * 2. �޼������� ����
 * 3. �����κ��� ���ŵ� �޼����� ó���� ���ؼ� �����尡 �ʿ�
 * 4. /bye �޼��� �Է½� ����
 * 	  /to userId �Է��ϸ� �ӼӸ�ó���� ��.
 */
public class GUIChatClientEx extends Frame implements ActionListener{
	static int port = 6000;
	Socket client = null;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	String userId;
	Button btnExit, btnSend, btnConnect;
	TextArea taList;
	TextField tfIp, tfName, tfInput;
	CardLayout c1; 
	GUIChatClientEx(){
		super("ä�� ���α׷�");
		c1 = new CardLayout(); //����ó��(��������?) �߰��Ǵ� Layout
		setLayout(c1);
		Panel connect = new Panel();
		connect.setLayout(new BorderLayout());
		connect.add("North", new Label("ä������ȭ��",Label.CENTER));
		//conn_sub :FlowLayout => GridLayout ����
		Panel conn_sub = new Panel();
		conn_sub.setLayout(new GridLayout(8,1));
		conn_sub.add(new Label("���� IP",Label.CENTER));
		tfIp = new TextField("127.0.0.1",15);
		conn_sub.add(tfIp);
		conn_sub.add(new Label("����� ID",Label.CENTER));
		tfName = new TextField("ȫ�浿", 15);
		conn_sub.add(tfName); //������� ����
		connect.add("Center", conn_sub);
		btnConnect = new Button("��������");
		connect.add("South", btnConnect);
		btnConnect.addActionListener(this);
		
		Panel chat = new Panel();
		chat.setLayout(new BorderLayout());
		chat.add("North", new Label("ä�����α׷� ver1.0"));
		taList = new TextArea();
		chat.add("Center", taList);
		
		Panel chat_sub = new Panel();
		tfInput = new TextField("",25);
		btnExit = new Button("����");
		btnSend = new Button("����");
		chat_sub.add(tfInput);
		chat_sub.add(btnExit);
		chat_sub.add(btnSend);
		tfInput.addActionListener(this);
		btnExit.addActionListener(this);
		btnSend.addActionListener(this);
		chat.add("South", chat_sub);
		add(connect,"����â");
		add(chat,"ä��â");
		c1.show(this, "����â");
		setSize(350,300);
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new GUIChatClientEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try{
		Object obj = e.getSource();
		if(obj == btnConnect){//�̺�Ʈ�ҽ��� �������ӹ�ư���ȳ�?
			init();
		}else if(obj == btnExit){
			System.exit(0);
		}else if(obj == btnSend || obj == tfInput){
			String sendData = tfInput.getText();
			oos.writeObject(sendData);
			oos.flush();
			tfInput.setText("");
			tfInput.requestFocus();
		}
	}catch(IOException ioe){
		ioe.printStackTrace();
	}
}
	private void init() throws UnknownHostException, IOException {
		String ipAddr = tfIp.getText();
		client = new Socket(ipAddr, port);
		oos = new ObjectOutputStream(client.getOutputStream());
		ois = new ObjectInputStream(client.getInputStream());
		userId = tfName.getText();
		oos.writeObject(userId);
		oos.flush();
		ReceiveDataThread rt = new ReceiveDataThread();
		rt.start();
		c1.show(this, "ä��â");
		setTitle(userId + "ä��â");
		tfInput.requestFocus();
	}
	class ReceiveDataThread extends Thread{ //������ ������Ʈ(taList�� �ܺ�Ŭ������ �ִ� �����?)�� ����ϱ⿡ ����Ŭ������
		String recvData;
		public void run(){
			try{
				while(true){
					recvData = (String)ois.readObject();
					taList.append(recvData + "\n");//����Ŭ�����̱⶧���� �̰� ����
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
