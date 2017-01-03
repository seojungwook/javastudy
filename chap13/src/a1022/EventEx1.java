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
 *  �̺�Ʈ ����
 * 	1. �̺�Ʈ �ҽ� : �̺�Ʈ �߻� ���. ������Ʈ, Ű����, ���콺, �޴� ��
 * 	2. �̺�Ʈ ������ : �̺�Ʈ�� �����ϴ� �ý���
 *  				   ActionEvent(���콺 Ŭ���ƴ���, �޴��� ���õƴ��� ��) : ActionListener
 *  				   KeyEvent  : KeyListener
 *  				   WindowEvent : WindowListener
 *  		�̺�Ʈ ����� �����ʿ� ����ϴ� ����.
 *  		�����ʿ� ����ϴ� �޼���
 *  		addXXXListener(XXXListener l)
 *  		�����ʿ� ��Ͻ� �ش縮���ʿ� �̸��� ���� �������̽�Ÿ������ �����.
 *  3. �̺�Ʈ �ڵ鷯 : �������������̽� ���ο� �߻�޼���� ����������.
 */
//EventEx1 : ��ġ�����ڴ� BorderLayout
public class EventEx1 extends Frame implements ActionListener, WindowListener{
	EventEx1(){
		Button b = new Button("����");
		/*
		 * ActionListener�� ActionEvent ���
		 * b��ư�� �������� this�� �ִ� �̺�Ʈ �ڵ鷯�� ȣ��
		 * ActionListener �������̽� ���� ����� actionPerformed �޼��尡 �ڵ鷯
		 */
		b.addActionListener(this);
		Panel p = new Panel();
		//p ��ġ������ : FlowLayout
		p.add(b); // ����ٿ�
		add(p,"South"); 
		setSize(300,300);
		setVisible(true);
		/*
		 * WindowEvent WindowListener�� ���
		 */
/*
 * Adapter Ŭ���� : Listener ������ �߻�޼��带 ������ �� Ŭ����
 * class WindowAdapter implements WindowListener{
 * 		WindowListener�� �߻�޼������ {} ���·� ������ ����
 * }
 * Adapter Ŭ������ �̿��� ����Ŭ������ �̺�Ʈ ó��
  */
	//	addWindowListener(this);
		WindowListener wl = new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.out.println("���α׷� ����");
				System.exit(0);
			}
		};
		addWindowListener(wl);
	}
	public static void main(String[] args) {
		new EventEx1();
	}
	@Override
	//�����찡 open�� ��
	public void windowOpened(WindowEvent e) {}
	@Override
	//�����찡 closing �ϴ� ��
	public void windowClosing(WindowEvent e) {
		System.out.println("���α׷� ����");
		System.exit(0);
	}
	@Override
	//�����찡 close ����
	public void windowClosed(WindowEvent e) {}
	@Override
	//�����찡 ������ȭ �� ��
	public void windowIconified(WindowEvent e) {}
	@Override
	// �����찡 ������ȭ���� �ٽ� ȭ�鿡 �������� �ɶ�
	public void windowDeiconified(WindowEvent e) {}
	@Override
	//�����찡 Ȱ��ȭ �Ǿ��� ��
	public void windowActivated(WindowEvent e) {}
	@Override
	//�����찡 ��Ȱ��ȭ �Ǿ��� ��
	public void windowDeactivated(WindowEvent e) {}
	@Override
	//ActionEvent�� �ڵ鷯
	public void actionPerformed(ActionEvent e) {
		System.out.println("���α׷� ����");
		System.exit(0);
	}
}
