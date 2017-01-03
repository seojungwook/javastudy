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
 * JFrame ����
 */
public class JFrameEx extends JFrame{
	JButton btn = new JButton("<html><font color = 'red'>JFrame ����</font></html>");
	JFrameEx(){
		//JFrame �⺻��ġ������ : BorderLayout
		//��ư�� �Ʒ��� ��ġ�ϱ�
		//add(Component)�� ��ġ�� �����Ǹ� Center
		add(btn,"South");
		btn.addActionListener( //�������̽�
			new ActionListener(){//ActionListener �������̽��� �߻�޼���� 1����
								//ActionAdapter Ŭ������ ����.( �߻�޼��尡 �Ѱ��ΰ��� Adapter Ŭ������ ����)
				@Override
				public void actionPerformed(ActionEvent e){ //@@�������̽��ϱ� ���⼭ �������̵��ؾ� ��ü����
					System.exit(0);
			}
		}
	);
	//border ���� : �׵θ� ����
	EtchedBorder eboder = new EtchedBorder();
	BevelBorder bboder = new BevelBorder(BevelBorder.RAISED); //�׵θ��� �ö���� ���� ����
	JLabel label1 = new JLabel("<html><font color = 'orange'>���̵�� �н����带 �Է�</font></html>");
	Icon cap = new ImageIcon("IU.jpg");
	Icon img1 = new ImageIcon("img1.jpg");
	Icon img2 = new ImageIcon("img2.jpg");
	//swing�� �Ǽ�����
	btn.setBorder(bboder);			//���� ����
	btn.setIcon(cap);//icon ����
	btn.setPressedIcon(img1);
	btn.setRolloverIcon(img2);
	btn.setToolTipText("���α׷� ����"); //ǳ������
	add(label1,"North");
	setLocation(100,200);
	setSize(300,500);
	//JFrame���� �����ϴ� ����
	//JFrame�� Close�� ����(x �ݱ��ư) :
	/* 	setDefaultCloseOperation(...)
	 * 1. JFrame.EXIT_ON_CLOSE :
	 * 		JFrame close�� ���α׷� ����
	 * 2. JFrame.DISPOSE_ON_CLOSE : 
	 * 		JFrame close�� �ڿ��� �ݳ�
	 * 3. JFrame.DO_NOTHING_ON_CLOSE :
	 * 		JFrame close�� �ƹ��ϵ� ����
	 * 4. JFrame.HIDE_ON_CLOSE : �⺻������
	 *  	JFrame close�� ������(JFrame)�� ����
	 * 
	 */
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
	}
	public static void main(String[] args) {
		new JFrameEx();
		}
	}

