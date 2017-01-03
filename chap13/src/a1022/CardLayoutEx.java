package a1022;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * CardLayout 예제.
 */
public class CardLayoutEx {
	public static void main(String[] args) {
		Frame f = new Frame("CardLayout 예제");
		CardLayout c = new CardLayout();
		//원래 BorderLayout을 Frame CardLayout 으로 배치관리자 설정
		f.setLayout(c); 
		Panel p1 = new Panel();
		p1.setBackground(Color.lightGray);
		p1.add(new Label("Card 1"));
		Panel p2 = new Panel();
		p2.setBackground(Color.ORANGE);
		p2.add(new Label("Card 2"));
		Panel p3 = new Panel();
		p3.setBackground(Color.CYAN);
		p3.add(new Label("Card 3"));
		f.add(p1, "1"); f.add(p2, "2"); f.add(p3, "3");
		//이벤트 설정
		MouseListener ml = new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){ //mouseClicked 이벤트 핸들러
				 //e.BUTTON3_MASK : 오른쪽버튼
				if(e.getModifiers() == e.BUTTON3_MASK)
					c.previous(f);
				else
					c.next(f);
			}
		};
		//MouseListener : 마우스버튼의 관련 이벤트(ex 클릭되었는지)를 감시하는 리스터
		p1.addMouseListener(ml); //이벤트 등록
						//( p1이라는 패널에 마우스가 클릭됐으면 ml에 있는 이벤트 핸들러가 호출)
		p2.addMouseListener(ml);
		p3.addMouseListener(ml);
		f.setSize(200, 200);
		f.setVisible(true);
		c.show(f, "1"); //초기등록
		
	}
}
