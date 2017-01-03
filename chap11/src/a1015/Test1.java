package a1015;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. Shape Ŭ������ ��ӹ��� Circle Ŭ����
 * 		double r;
 * 		Shape Ŭ������ ��ӹ��� Rectangle Ŭ������ �����϶�
 * 			int width, height;
 * 		������ �����ڴ� �˸°� �����Ұ�
 * 2. ShapeEx ����Ŭ����
 * 		main �޼��忡�� 
 * 		new Circle(5.0), new Rectangle(3,4), new Circle(1)��
 * 		��ü�� �����ϰ�,
 * 		sumArea() �޼���� �հ踦 ���϶�.
 * 		sumArea() �޼���
 * 			��� : �־��� List�� ��� �������� ���̸� ��� ���� ���� ��ȯ
 * 			��ȯŸ�� : double
 * 			�Ű����� : List<Shape> list;
 * 		sumLength() �޼���� �ѷ��� �հ踦 ���϶�
 * 			��� : �־��� List����� �������� �ѷ��� ��� ���� ���� ��ȯ
 * 			��ȯŸ�� : double
 * 			�Ű����� : List<Shape> list;
 */
abstract class Shape {  //�߻�Ŭ���� : ��ü�����Ұ�
	int x, y;			//             �ڼ�Ŭ������ü�� ���ؼ� ��üȭ ����
	Shape(){this(0,0);}
	Shape(int x, int y){
		this.x = x;
		this.y = y;
	}
	abstract double calcArea();  //�߻�޼��� : �����������̵�
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
		System.out.println("������ ��: " +sumArea(list));
		System.out.println("������ ��: " +Math.round(sumArea(list)*100)/100d);
		System.out.println("�ѷ��� ��: "+sumLength(list));
		System.out.println("�ѷ��� ��: "+String.format("%.2f", sumLength(list)));
			
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




