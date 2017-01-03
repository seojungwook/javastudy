package chap6;
/*
 * 직사각형2(Rectangle2) 클래스 만들기
 * 멤버변수 : 가로(width), 세로(height)
 * 멤버메서드
 * 		1. int area() : 넓이 구하기
 * 		2. int length() : 둘레구하기
 * 		3. boolean isSquare() : 정사각형 여부
 * 생성자 : 
 * 		1. 매개변수() : 가로 =1, 세로=1 로 초기화
 * 		2. 매개변수(int w, int h) : 가로 =w, 세로 =h로 초기화
 * 
 * 구동 클래스 만들기
 * 1. 직사각형2 클래스의 생성자로 객체 두개 생성
 * 2. 각각의 직사각형2클래스의 객체의 메서드의 결과를 화면에 출력하기
 */
class Rectangle1{
	int width;
	int height;
	int area(){return width*height;}
	int length(){return 2*(width+height);}
	boolean isSquare(){return width==height;}
	
	Rectangle1(){ 
		width = 1;
		height = 1;
	}
	Rectangle1(int w, int h){
		width = w;
		height = h;
	}
}

public class RectangleEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 r1 = new Rectangle1();
		System.out.println("첫번째 사각형");
		System.out.println("넓이 : "+r1.area() + " 둘레 : "+ r1.length() );
		System.out.println("정사각형 여부 : "+ ((r1.isSquare())?"정사각형":"직사각형")); //강사님
		System.out.println();
		Rectangle1 r2 = new Rectangle1(50,50);
		System.out.println("두번째 사각형");
		if(r2.isSquare())
			System.out.println("넓이 : "+r2.area() + " 둘레 : "+ r2.length()+ " 정사각형" );
		else
			System.out.println("넓이 : "+r2.area() + " 둘레 : "+ r2.length()+ " 직사각형");
	}

}
