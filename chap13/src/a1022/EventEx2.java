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
 * �̺�Ʈ ���� 2
 * 
 * �̺�Ʈ ó�� �ܰ�
 * 1. �̺�Ʈ �ҽ�����
 * 2. ������ �̺�Ʈ �ҽ��� ������ ���
 * 		addXXXListener(XXXListener 1)
 * 3. XXXListener �������̽� �ȿ� �ִ� �ڵ鷯(�߻�޼���)�� ����
 * 	  1) ���� �������̽��� ���� => �ʿ���� �ڵ鷯������ �����ʿ�
 *    2) AdapterŬ������ ����Ͽ� ����Ŭ������ ����.(�ξ� ����)
 *    	ActionListener�� AdapterŬ������ ����.
 */
public class EventEx2 extends Frame{
	Button b1;
	TextField tf;
	TextArea ta;
	EventEx2(){
		b1 = new Button("����");
		tf = new TextField(20); //20��ũ��
		ta = new TextArea(10,20); //10�� 20��
		add("North",tf);
		add("Center",ta);
		add("South",b1);
		// �� �������� �����찡 ������ �Ǹ� �̺�Ʈ ó����
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.out.println(tf.getText());
				System.exit(0);
			}
		});
		FocusListener fl = new FocusAdapter(){
			public void focusGained(FocusEvent e){
				tf.requestFocus(); //tf�� focus �̵�
			}
		};
		tf.addFocusListener(fl); // tf => tf ��Ŀ�� �̵�
		ta.addFocusListener(fl); // ta => tf , ��Ŀ���� ���� �� ���� ������ tf�� �ٷ� �����⿡ 
		//ActionListener �������̽��� �߻�޼���� 1����
		//ActionAdapter Ŭ������ ����.( �߻�޼��尡 �Ѱ��ΰ��� Adapter Ŭ������ ����)
		ActionListener al = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText()+"\n"); //ta�� �ؽ�Ʈ �Ű�
				tf.setText(""); //tf�� �ִ� �� ����
				if(e.getSource()==b1) System.exit(0); //b1�� ��������? �׷� ����
			}
		};
		/* 
		 * ActionEvent�� �߻��Ǵ� ���
		 * 1. ��ư�� ������ ��
		 * 2. TextField, TextArea�� ����Ű�� �Էµ� ���
		 * 3. List������Ʈ���� ����Ŭ����
		 * 4. Menu�� ���õǾ��� ��
		 */
		tf.addActionListener(al);
		b1.addActionListener(al); //b1�� ������ al�� �ִ� actionPerformed ������
		setSize(300,300);
		setVisible(true);
		tf.requestFocus();
	}
	public static void main(String[] args) {
		new EventEx2();
	}
}
