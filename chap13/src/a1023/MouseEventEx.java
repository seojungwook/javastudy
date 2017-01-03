package a1023;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/*
 * 마우스 이벤트 예제
 * 리스너 : 이벤트 감시하는 시스템
 * 마우스이벤트의 리스너는 2개
 *  => MouseListener 	   : 클릭, 더블클릭 이벤트
 *  => MouseMotionListener : drag, move 이벤트
 */
public class MouseEventEx extends Frame implements ActionListener {
	Label move = new Label("마우스 따라쟁이", Label.CENTER);
	Button exit = new Button("종료");
	MouseEventEx(){ //생성자
		super("마우스 Motion 테스트"); //title 설정
		//setTitle(String) : title 설정하는 메서드
		setLayout(null); //BorderLayout => 제거
						// 배치관리자가 없다.
		//setBounds(x, y, width, height)
		//setLocation + setSize = setBounds
		move.setBounds(100, 50, 150, 20);
		exit.setBounds(250, 500, 150, 30);
		move.setBackground(Color.red);
		add(move);
		add(exit);
		this.setBounds(300,100,500,600); //내것이기에 this
		setVisible(true);
		/*
		 * ActionEvent 발생 방법
		 * 1. 버튼을 클릭
		 * 2. TextField, TextArea에 엔터키가 입력된 경우
		 * 3. List컴포넌트에서 더블클릭시
		 * 4. Menu가 선택되었을 때
		 */
		/*
		 * this 자료형
		 * 1. Frame
		 * 2. Object
		 * 3. MouseEventEx
		 * 4. ActionListener
		 * 
		 * this가 ActionListener 타입으로 형변환이 가능하기에 들어옴
		 * addActionListener(ActionListener)
		 */
		exit.addActionListener(this);
		//addMouseMotionListener(MouseMotionListener)
		
		//MouseMotionAdapter : MouseMotionListener를 구현한 클래스
		//class MouseMotionAdapter implements MouseMotionListener{...}
		
		this.addMouseMotionListener( 
			new MouseMotionAdapter(){
				//이름없는 내부클래스
				public void mouseMoved(MouseEvent e){ //오버라이딩
					//e.getPoint() 위치 Point객체
					Point p = e.getPoint(); //마우스의 위치를 넘겨줘
					move.setLocation(p);
				}
			}
		);
	}
	public static void main(String[] args) {
		new MouseEventEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 종료");
		System.exit(0);
	}
}
