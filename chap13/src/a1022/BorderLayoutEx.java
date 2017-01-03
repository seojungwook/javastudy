package a1022;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

/*
 * Frame 클래스 예제
 * Container > Frame
 * Frame의 기본배치관리자는 BorderLayout임.
 * BorderLayout은 화면을 5등분한다.
 */
public class BorderLayoutEx {
	public static void main(String[] args) {
		Frame f = new Frame("BorderLayout 예제");
		//배치관리자 설정
		//10,5 : 갭을 설정 10: 가로갭, 5 : 세로갭
		f.setLayout(new BorderLayout(10,5));
		Button north = new Button("North");
		Button south = new Button("South");
		Button east = new Button("east");
		Button west = new Button("west");
		Button center = new Button("Center");
		//f.add(Component, "위치");
		//f.add("위치", Component);
		f.add(BorderLayout.NORTH, north);
		f.add(south,"South");
		f.add(east,"East");
		f.add("West",west);
		f.add("Center",center);
		f.setSize(300,300); //Frame 크기설정
		f.setLocation(100, 100); //Frame 위치지정
		f.setVisible(true); //화면에 출력
		
	}
}
