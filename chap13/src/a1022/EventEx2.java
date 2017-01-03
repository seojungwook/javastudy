package a1022;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 이벤트 예제 2
 * 
 * 이벤트 처리 단계
 * 1. 이벤트 소스결정
 * 2. 결정된 이벤트 소스를 리스너 등록
 * 		addXXXListener(XXXListener 1)
 * 3. XXXListener 인터페이스 안에 있는 핸들러(추상메서드)를 구현
 * 	  1) 직접 인터페이스를 구현 => 필요없는 핸들러까지도 구현필요
 *    2) Adapter클래스를 사용하여 내부클래스로 구현.(훨씬 많아)
 *    	ActionListener는 Adapter클래스가 없다.
 */
public class EventEx2 extends Frame{
	Button b1;
	TextField tf;
	TextArea ta;
	EventEx2(){
		b1 = new Button("종료");
		tf = new TextField(20); //20자크기
		ta = new TextArea(10,20); //10줄 20자
		add("North",tf);
		add("Center",ta);
		add("South",b1);
		// 내 프레임의 윈도우가 변경이 되면 이벤트 처리해
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.out.println(tf.getText());
				System.exit(0);
			}
		});
		FocusListener fl = new FocusAdapter(){
			public void focusGained(FocusEvent e){
				tf.requestFocus(); //tf로 focus 이동
			}
		};
		tf.addFocusListener(fl); // tf => tf 포커스 이동
		ta.addFocusListener(fl); // ta => tf , 포커스를 받을 수 없는 이유가 tf로 바로 보내기에 
		//ActionListener 인터페이스의 추상메서드는 1개임
		//ActionAdapter 클래스가 없다.( 추상메서드가 한개인것은 Adapter 클래스가 없어)
		ActionListener al = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText()+"\n"); //ta로 텍스트 옮겨
				tf.setText(""); //tf에 있는 것 지워
				if(e.getSource()==b1) System.exit(0); //b1이 눌려졌냐? 그럼 종료
			}
		};
		/* 
		 * ActionEvent가 발생되는 경우
		 * 1. 버튼이 눌렸을 때
		 * 2. TextField, TextArea에 엔터키가 입력된 경우
		 * 3. List컴포넌트에서 더블클릭시
		 * 4. Menu가 선택되었을 때
		 */
		tf.addActionListener(al);
		b1.addActionListener(al); //b1이 눌리면 al에 있는 actionPerformed 실행해
		setSize(300,300);
		setVisible(true);
		tf.requestFocus();
	}
	public static void main(String[] args) {
		new EventEx2();
	}
}
