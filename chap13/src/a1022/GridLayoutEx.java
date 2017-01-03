package a1022;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

/*
 * GridLayout(r,c) : r행c열의 표 형태로 배치
 * GridLayout(r,c,g,g) : r행c열의 표 형태로 배치
 * 						가로갭g, 세로갭
 */
public class GridLayoutEx {
	public static void main(String[] args) {
		Frame f = new Frame("GridLayout 예제");
		/*
		 * 셀의 개수보다 많은 수의 컴포넌트를 추가될 때는 행우선으로 배치됨.
		 * 자동으로 열이 증가함.
		 */
		f.setLayout(new GridLayout(3,2,5,5)); // 3행2열 5,5 갭표시
		f.add(new Button("1"));
		f.add(new Button("2"));
		f.add(new Button("3"));
		f.add(new Button("4"));
		f.add(new Button("5"));
		f.add(new Button("6"));
	//	f.add(new Button("7")); //더 붙일 수도 있음. 행우선으로
		f.setSize(300,300);
		f.setVisible(true);
		
	}
}
