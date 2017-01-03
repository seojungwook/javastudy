package a1022;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

/*
 * GridLayout(r,c) : r��c���� ǥ ���·� ��ġ
 * GridLayout(r,c,g,g) : r��c���� ǥ ���·� ��ġ
 * 						���ΰ�g, ���ΰ�
 */
public class GridLayoutEx {
	public static void main(String[] args) {
		Frame f = new Frame("GridLayout ����");
		/*
		 * ���� �������� ���� ���� ������Ʈ�� �߰��� ���� ��켱���� ��ġ��.
		 * �ڵ����� ���� ������.
		 */
		f.setLayout(new GridLayout(3,2,5,5)); // 3��2�� 5,5 ��ǥ��
		f.add(new Button("1"));
		f.add(new Button("2"));
		f.add(new Button("3"));
		f.add(new Button("4"));
		f.add(new Button("5"));
		f.add(new Button("6"));
	//	f.add(new Button("7")); //�� ���� ���� ����. ��켱����
		f.setSize(300,300);
		f.setVisible(true);
		
	}
}
