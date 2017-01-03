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
 * 멀티 채팅 클라이언트 프로그램
 * 1. 서버 접속, 사용자ID정보 함께 보내기
 * 2. 메세지서버 전송
 * 3. 서버로부터 수신된 메세지를 처리를 위해서 스레드가 필요
 * 4. /bye 메세지 입력시 종료
 * 	  /to userId 입력하면 귓속말처리가 됨.
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
		super("채팅 프로그램");
		c1 = new CardLayout(); //사진처럼(포개지는?) 추가되는 Layout
		setLayout(c1);
		Panel connect = new Panel();
		connect.setLayout(new BorderLayout());
		connect.add("North", new Label("채팅접속화면",Label.CENTER));
		//conn_sub :FlowLayout => GridLayout 변경
		Panel conn_sub = new Panel();
		conn_sub.setLayout(new GridLayout(8,1));
		conn_sub.add(new Label("서버 IP",Label.CENTER));
		tfIp = new TextField("127.0.0.1",15);
		conn_sub.add(tfIp);
		conn_sub.add(new Label("사용자 ID",Label.CENTER));
		tfName = new TextField("홍길동", 15);
		conn_sub.add(tfName); //여기부터 녹음
		connect.add("Center", conn_sub);
		btnConnect = new Button("서버접속");
		connect.add("South", btnConnect);
		btnConnect.addActionListener(this);
		
		Panel chat = new Panel();
		chat.setLayout(new BorderLayout());
		chat.add("North", new Label("채팅프로그램 ver1.0"));
		taList = new TextArea();
		chat.add("Center", taList);
		
		Panel chat_sub = new Panel();
		tfInput = new TextField("",25);
		btnExit = new Button("종료");
		btnSend = new Button("전송");
		chat_sub.add(tfInput);
		chat_sub.add(btnExit);
		chat_sub.add(btnSend);
		tfInput.addActionListener(this);
		btnExit.addActionListener(this);
		btnSend.addActionListener(this);
		chat.add("South", chat_sub);
		add(connect,"접속창");
		add(chat,"채팅창");
		c1.show(this, "접속창");
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
		if(obj == btnConnect){//이벤트소스가 서버접속버튼눌렸나?
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
		c1.show(this, "채팅창");
		setTitle(userId + "채팅창");
		tfInput.requestFocus();
	}
	class ReceiveDataThread extends Thread{ //내안의 컴포너트(taList가 외부클래스에 있는 멤버라서?)를 써야하기에 내부클래스로
		String recvData;
		public void run(){
			try{
				while(true){
					recvData = (String)ois.readObject();
					taList.append(recvData + "\n");//내부클래스이기때문에 이게 가능
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
