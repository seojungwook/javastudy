package a1023;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/*
 * JTable 예제 1
 */
public class JTableEx1 extends JFrame{
	String[] cols = {"이름", "직업", "나이"};
	Object[][] datas = {
			{"홍길동", "의적", "30"},
			{"김삿갓", "시인", "50"},
			{"이몽룡", "공무원","25"}
	};
	JTableEx1(){
		JTable table= new JTable(datas,cols);
		//JTable은 반드시 JScrollPane 추가되어서 화면에 출력되야함
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
