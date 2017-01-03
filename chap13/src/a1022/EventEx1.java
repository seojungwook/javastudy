package a1022;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
 *  이벤트 예제
 * 	1. 이벤트 소스 : 이벤트 발생 대상. 컴포넌트, 키보드, 마우스, 메뉴 등
 * 	2. 이벤트 리스너 : 이벤트를 감시하는 시스템
 *  				   ActionEvent(마우스 클릭됐는지, 메뉴가 선택됐는지 등) : ActionListener
 *  				   KeyEvent  : KeyListener
 *  				   WindowEvent : WindowListener
 *  		이벤트 등록은 리스너에 등록하는 것임.
 *  		리스너에 등록하는 메서드
 *  		addXXXListener(XXXListener l)
 *  		리스너에 등록시 해당리스너와 이름이 같은 인터페이스타입으로 등록함.
 *  3. 이벤트 핸들러 : 리스너인터페이스 내부에 추상메서드로 정해져있음.
 */
//EventEx1 : 배치관리자는 BorderLayout
public class EventEx1 extends Frame implements ActionListener, WindowListener{
	EventEx1(){
		Button b = new Button("종료");
		/*
		 * ActionListener에 ActionEvent 등록
		 * b버튼이 눌려지면 this에 있는 이벤트 핸들러를 호출
		 * ActionListener 인터페이스 안의 멤버인 actionPerformed 메서드가 핸들러
		 */
		b.addActionListener(this);
		Panel p = new Panel();
		//p 배치관리자 : FlowLayout
		p.add(b); // 가운데붙여
		add(p,"South"); 
		setSize(300,300);
		setVisible(true);
		/*
		 * WindowEvent WindowListener에 등록
		 */
/*
 * Adapter 클래스 : Listener 내부의 추상메서드를 구현만 한 클래스
 * class WindowAdapter implements WindowListener{
 * 		WindowListener의 추상메서드들을 {} 형태로 구현만 했음
 * }
 * Adapter 클래스를 이용한 내부클래스로 이벤트 처리
  */
	//	addWindowListener(this);
		WindowListener wl = new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		};
		addWindowListener(wl);
	}
	public static void main(String[] args) {
		new EventEx1();
	}
	@Override
	//윈도우가 open될 때
	public void windowOpened(WindowEvent e) {}
	@Override
	//윈도우가 closing 하는 중
	public void windowClosing(WindowEvent e) {
		System.out.println("프로그램 종료");
		System.exit(0);
	}
	@Override
	//윈도우가 close 이후
	public void windowClosed(WindowEvent e) {}
	@Override
	//윈도우가 아이콘화 될 때
	public void windowIconified(WindowEvent e) {}
	@Override
	// 윈도우가 아이콘화이후 다시 화면에 보여지게 될때
	public void windowDeiconified(WindowEvent e) {}
	@Override
	//윈도우가 활성화 되었을 때
	public void windowActivated(WindowEvent e) {}
	@Override
	//윈도우가 비활성화 되었을 때
	public void windowDeactivated(WindowEvent e) {}
	@Override
	//ActionEvent의 핸들러
	public void actionPerformed(ActionEvent e) {
		System.out.println("프로그램 종료");
		System.exit(0);
	}
}
