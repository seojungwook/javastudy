package a1023;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/*
 * JTable ���� 1
 */
public class JTableEx1 extends JFrame{
	String[] cols = {"�̸�", "����", "����"};
	Object[][] datas = {
			{"ȫ�浿", "����", "30"},
			{"���", "����", "50"},
			{"�̸���", "������","25"}
	};
	JTableEx1(){
		JTable table= new JTable(datas,cols);
		//JTable�� �ݵ�� JScrollPane �߰��Ǿ ȭ�鿡 ��µǾ���
		JScrollPane pane = new JScrollPane(table);
		add(pane,"Center");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTableEx1();
	}
}
