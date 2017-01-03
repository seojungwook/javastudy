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
 * CardLayout ����.
 */
public class CardLayoutEx {
	public static void main(String[] args) {
		Frame f = new Frame("CardLayout ����");
		CardLayout c = new CardLayout();
		//���� BorderLayout�� Frame CardLayout ���� ��ġ������ ����
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
		//�̺�Ʈ ����
		MouseListener ml = new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){ //mouseClicked �̺�Ʈ �ڵ鷯
				 //e.BUTTON3_MASK : �����ʹ�ư
				if(e.getModifiers() == e.BUTTON3_MASK)
					c.previous(f);
				else
					c.next(f);
			}
		};
		//MouseListener : ���콺��ư�� ���� �̺�Ʈ(ex Ŭ���Ǿ�����)�� �����ϴ� ������
		p1.addMouseListener(ml); //�̺�Ʈ ���
						//( p1�̶�� �гο� ���콺�� Ŭ�������� ml�� �ִ� �̺�Ʈ �ڵ鷯�� ȣ��)
		p2.addMouseListener(ml);
		p3.addMouseListener(ml);
		f.setSize(200, 200);
		f.setVisible(true);
		c.show(f, "1"); //�ʱ���
		
	}
}
