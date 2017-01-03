package chap6;
/*
 * ����(width), ����(height)�� ������ ������ �ִ� ���簢��(Rectangle) Ŭ���� �����.
 * ��� �޼���� ����(area), �ѷ�(length)�� ������.
 */

class Rectangle{
	int width; //�������
	int height;
	// ���� ����� �������� �ʾƵ� ��� ���� ex)width, height
	int area(){ return width * height;}
	int length(){ return (width + height)*2;}
	
}
// ���� Ŭ���� : main �޼��带 �����ϰ� �ִ� Ŭ����
// ������ �̸��� public class�� �̸��̾�� �Ѵ�.
// ���� ������ �̸��� �ݵ�� RectangleEx.java�̾�� �Ѵ�. 
// �ϳ��� ���Ͽ��� �ϳ��� public class�� �����ؾ� �Ѵ�.
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
