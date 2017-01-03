package a1007;
/*
 * 1. 도형 클래스 : Figure
 * 	멤버변수 : 도형의 종류
 * 	생성자 : 도형의 종류를 입력받아 초기화
 * 	메서드 : 넓이 : double area();
 * 		  둘레 : double length();
 * 	Math.PI, Math.abs()
 * 2. 원클래스 : Circle => 도형클래스 상속
 * 멤버변수 : 원점x, 원점y,반지름
 * 생성자 : 멤버변수 3개를 입력받아 객체 생성
 * 메서드 : ?
 * 3. 사각형 : Rectangle => 도형클래스 상속 
 * 멤버변수 : 점x1, 점y1,점x2, 점y2
 * 생성자 : 멤버변수 4개를 입력받아 객체 생성
 * 메서드 : ?
 */
abstract class Figure{
	String type;
	int rectangle;
	Figure(String type){
		this.type = type;
		
	};

	abstract double area();
	abstract double length();
	public String toString(){
		return type;
	}
}

class Circle extends Figure{
	int x;
	int y;
	int r;
	Circle(int r, int x, int y){
		super("원");
		this.x= x;
		this.y= y;
		this.r =r;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		
		return (int) (r*r*Math.PI + 0.05)*10/10.0;
		
	}

	@Override
	double length() {
		// TODO Auto-generated method stub
		return (int) ((2*Math.PI*r) + 0.05)*10/10.0;
	}
	
}

class Rectangle extends Figure{
	int x1;
	int y1;
	int x2;
	int y2;
	Rectangle(int x1, int y1, int x2, int y2){
		super("사각형");
		this.x1= x1;
		this.y1= y1;
		this.x2= x2;
		this.y2= y2;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.abs(x2-x1)*Math.abs(y2-y1);
	}

	@Override
	double length() {
		// TODO Auto-generated method stub
		return 2*(Math.abs(x2-x1)+Math.abs(y2-y1));
	}
	
}
public class FigureEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure f[] = {
				new Circle(1,2,3), //반지름, x, y
				new Circle(10,20,30),
				new Rectangle(1,1,3,3),
				new Rectangle(10,10,30,30)
		};
		for(Figure a : f){ //개선된 for문 
			System.out.print(a + "넓이 : "+ a.area());
			System.out.println(", 둘레:"+ a.length());
			
		}
	}

}
