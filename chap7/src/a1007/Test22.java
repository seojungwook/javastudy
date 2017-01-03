package a1007;

abstract class Shape{
	Point p;
	
	Shape(){
		this(new Point(0,0));
	}
	Shape(Point p){
		this.p=p;
	}
	
	abstract double calcArea();
	Point getPosition(){
		return p;
	}
	void setPosition(Point p){
		this.p=p;
	}
}
class Point{
	int x;
	int y;
	Point(){
	this(0,0);
	}
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	public String toString(){
		return "[" + x+","+y+"]";
	}
}
public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println("면적의 합 : "+ sumArea(arr));
	}
	private static double sumArea(Shape[] arr){
		double total = 0;
		for(Shape s:)
	}

}
