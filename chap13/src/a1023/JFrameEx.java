package a1023;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * JFrame 예제
 */
public class JFrameEx extends JFrame{
	JButton btn = new JButton("<html><font color = 'red'>JFrame 예제</font></html>");
	JFrameEx(){
		//JFrame 기본배치관리자 : BorderLayout
		//버튼을 아래에 위치하기
		//add(Component)에 위치가 생략되면 Center
		add(btn,"South");
		btn.addActionListener( //인터페이스
			new ActionListener(){//ActionListener 인터페이스의 추상메서드는 1개임
								//ActionAdapter 클래스가 없다.( 추상메서드가 한개인것은 Adapter 클래스가 없어)
				@Override
				public void actionPerformed(ActionEvent e){ //@@인터페이스니까 여기서 오버라이딩해야 객체생성
					System.exit(0);
			}
		}
	);
	//border 설정 : 테두리 설정
	EtchedBorder eboder = new EtchedBorder();
	BevelBorder bboder = new BevelBorder(BevelBorder.RAISED); //테두리가 올라오는 듯한 느낌
	JLabel label1 = new JLabel("<html><font color = 'orange'>아이디와 패스워드를 입력</font></html>");
	Icon cap = new ImageIcon("IU.jpg");
	Icon img1 = new ImageIcon("img1.jpg");
	Icon img2 = new ImageIcon("img2.jpg");
	//swing의 악세서리
	btn.setBorder(bboder);			//보더 설정
	btn.setIcon(cap);//icon 설정
	btn.setPressedIcon(img1);
	btn.setRolloverIcon(img2);
	btn.setToolTipText("프로그램 종료"); //풍선도움말
	add(label1,"North");
	setLocation(100,200);
	setSize(300,500);
	//JFrame에만 존재하는 설정
	//JFrame이 Close시 설정(x 닫기버튼) :
	/* 	setDefaultCloseOperation(...)
	 * 1. JFrame.EXIT_ON_CLOSE :
	 * 		JFrame close시 프로그램 종료
	 * 2. JFrame.DISPOSE_ON_CLOSE : 
	 * 		JFrame close시 자원을 반납
	 * 3. JFrame.DO_NOTHING_ON_CLOSE :
	 * 		JFrame close시 아무일도 안함
	 * 4. JFrame.HIDE_ON_CLOSE : 기본설정값
	 *  	JFrame close시 윈도우(JFrame)만 숨김
	 * 
	 */
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
	}
	public static void main(String[] args) {
		new JFrameEx();
		}
	}

