package a1022;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/*
 * FlowLayout(Panel의 기본?) : 옆으로 배치
 */
public class FlowLayoutEx {
	public static void main(String[] args) {
		Frame f = new Frame("FlowLayout 예제");
		Button b1 = new Button("Button 1");
		Button b2 = new Button("Button 2");
		Button b3 = new Button("Button 3");
		Button b4 = new Button("Button 4");
		Button b5 = new Button("Button 5");
	//	f.setLayout(new FlowLayout(FlowLayout.LEFT));
		f.setLayout(new FlowLayout(FlowLayout.CENTER));
		f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);
		f.setSize(300,300);
		f.setVisible(true);
	}
}
