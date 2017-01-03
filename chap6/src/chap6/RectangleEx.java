package chap6;
/*
 * 가로(width), 세로(height)의 변수를 가지고 있는 직사각형(Rectangle) 클래스 만들기.
 * 멤버 메서드는 넓이(area), 둘레(length)를 가진다.
 */

class Rectangle{
	int width; //멤버변수
	int height;
	// 같은 멤버는 선언하지 않아도 사용 가능 ex)width, height
	int area(){ return width * height;}
	int length(){ return (width + height)*2;}
	
}
// 구동 클래스 : main 메서드를 포함하고 있는 클래스
// 파일의 이름은 public class의 이름이어야 한다.
// 현재 파일의 이름은 반드시 RectangleEx.java이어야 한다. 
// 하나의 파일에는 하나의 public class만 존재해야 한다.
public class RectangleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 10;
		System.out.println(r1.area());
		System.out.println(r1.length());
	}

}
