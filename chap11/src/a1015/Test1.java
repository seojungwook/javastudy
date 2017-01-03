package a1015;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. Shape 클래스를 상속받은 Circle 클래스
 * 		double r;
 * 		Shape 클래스를 상속받은 Rectangle 클래스를 구현하라
 * 			int width, height;
 * 		각각의 생성자는 알맞게 구현할것
 * 2. ShapeEx 구동클래스
 * 		main 메서드에서 
 * 		new Circle(5.0), new Rectangle(3,4), new Circle(1)로
 * 		객체를 생성하고,
 * 		sumArea() 메서드로 합계를 구하라.
 * 		sumArea() 메서드
 * 			기능 : 주어진 List에 담긴 도형들의 넓이를 모두 더한 값을 반환
 * 			반환타입 : double
 * 			매개변수 : List<Shape> list;
 * 		sumLength() 메서드로 둘레의 합계를 구하라
 * 			기능 : 주어진 List에담긴 도형들의 둘레를 모두 더한 값을 반환
 * 			반환타입 : double
 * 			매개변수 : List<Shape> list;
 */
abstract class Shape {  //추상클래스 : 객체생성불가
	int x, y;			//             자손클래스객체를 통해서 객체화 가능
	Shape(){this(0,0);}
	Shape(int x, int y){
		this.x = x;
		this.y = y;
	}
	abstract double calcArea();  //추상메서드 : 강제오버라이딩
	abstract double calcLength();
	String getLocation(){
		return "x: " + x + ", y: " + y;
	}
}
class Circle extends Shape{
	double r;
	Circle(double r){
		this.r= r;
	}

	@Override
	double calcArea() {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}

	@Override
	double calcLength() {
		// TODO Auto-generated method stub
		return 2*Math.PI*r;
	}

}
class Rectangle extends Shape{
	int width, height;
	Rectangle(int width, int height){
		this.width =width;
		this.height = height;
	}
	@Override
	double calcArea() {
		// TODO Auto-generated method stub
		return width*height;
	}
	@Override
	double calcLength() {
		// TODO Auto-generated method stub
		return (width+height)*2;
	}
	
}

public class Test1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Shape> list = new ArrayList<Shape>();
		list.add(new Circle(5.0));
		list.add(new Rectangle(3,4));
		list.add(new Circle(1));
		System.out.println("면적의 합: " +sumArea(list));
		System.out.println("면적의 합: " +Math.round(sumArea(list)*100)/100d);
		System.out.println("둘레의 합: "+sumLength(list));
		System.out.println("둘레의 합: "+String.format("%.2f", sumLength(list)));
			
	}
	private static double sumLength(List<Shape> list) {
		// TODO Auto-generated method stub
		double sum =0;
		for(Shape s : list)
			sum+= s.calcLength();
		return sum;
		
	}
	private static double sumArea(List<Shape> list) {
		// TODO Auto-generated method stub
			double sum =0;
			for(Shape s : list)
				sum+= s.calcArea();
			return sum;
	}
}	




