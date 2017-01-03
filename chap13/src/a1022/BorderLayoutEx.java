package a1022;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

/*
 * Frame Ŭ���� ����
 * Container > Frame
 * Frame�� �⺻��ġ�����ڴ� BorderLayout��.
 * BorderLayout�� ȭ���� 5����Ѵ�.
 */
public class BorderLayoutEx {
	public static void main(String[] args) {
		Frame f = new Frame("BorderLayout ����");
		//��ġ������ ����
		//10,5 : ���� ���� 10: ���ΰ�, 5 : ���ΰ�
		f.setLayout(new BorderLayout(10,5));
		Button north = new Button("North");
		Button south = new Button("South");
		Button east = new Button("east");
		Button west = new Button("west");
		Button center = new Button("Center");
		//f.add(Component, "��ġ");
		//f.add("��ġ", Component);
		f.add(BorderLayout.NORTH, north);
		f.add(south,"South");
		f.add(east,"East");
		f.add("West",west);
		f.add("Center",center);
		f.setSize(300,300); //Frame ũ�⼳��
		f.setLocation(100, 100); //Frame ��ġ����
		f.setVisible(true); //ȭ�鿡 ���
		
	}
}
