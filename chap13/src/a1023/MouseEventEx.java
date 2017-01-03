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
 * ���콺 �̺�Ʈ ����
 * ������ : �̺�Ʈ �����ϴ� �ý���
 * ���콺�̺�Ʈ�� �����ʴ� 2��
 *  => MouseListener 	   : Ŭ��, ����Ŭ�� �̺�Ʈ
 *  => MouseMotionListener : drag, move �̺�Ʈ
 */
public class MouseEventEx extends Frame implements ActionListener {
	Label move = new Label("���콺 ��������", Label.CENTER);
	Button exit = new Button("����");
	MouseEventEx(){ //������
		super("���콺 Motion �׽�Ʈ"); //title ����
		//setTitle(String) : title �����ϴ� �޼���
		setLayout(null); //BorderLayout => ����
						// ��ġ�����ڰ� ����.
		//setBounds(x, y, width, height)
		//setLocation + setSize = setBounds
		move.setBounds(100, 50, 150, 20);
		exit.setBounds(250, 500, 150, 30);
		move.setBackground(Color.red);
		add(move);
		add(exit);
		this.setBounds(300,100,500,600); //�����̱⿡ this
		setVisible(true);
		/*
		 * ActionEvent �߻� ���
		 * 1. ��ư�� Ŭ��
		 * 2. TextField, TextArea�� ����Ű�� �Էµ� ���
		 * 3. List������Ʈ���� ����Ŭ����
		 * 4. Menu�� ���õǾ��� ��
		 */
		/*
		 * this �ڷ���
		 * 1. Frame
		 * 2. Object
		 * 3. MouseEventEx
		 * 4. ActionListener
		 * 
		 * this�� ActionListener Ÿ������ ����ȯ�� �����ϱ⿡ ����
		 * addActionListener(ActionListener)
		 */
		exit.addActionListener(this);
		//addMouseMotionListener(MouseMotionListener)
		
		//MouseMotionAdapter : MouseMotionListener�� ������ Ŭ����
		//class MouseMotionAdapter implements MouseMotionListener{...}
		
		this.addMouseMotionListener( 
			new MouseMotionAdapter(){
				//�̸����� ����Ŭ����
				public void mouseMoved(MouseEvent e){ //�������̵�
					//e.getPoint() ��ġ Point��ü
					Point p = e.getPoint(); //���콺�� ��ġ�� �Ѱ���
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
		System.out.println("���α׷� ����");
		System.exit(0);
	}
}
