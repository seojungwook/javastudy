package chap6;
/*
 * ���簢��2(Rectangle2) Ŭ���� �����
 * ������� : ����(width), ����(height)
 * ����޼���
 * 		1. int area() : ���� ���ϱ�
 * 		2. int length() : �ѷ����ϱ�
 * 		3. boolean isSquare() : ���簢�� ����
 * ������ : 
 * 		1. �Ű�����() : ���� =1, ����=1 �� �ʱ�ȭ
 * 		2. �Ű�����(int w, int h) : ���� =w, ���� =h�� �ʱ�ȭ
 * 
 * ���� Ŭ���� �����
 * 1. ���簢��2 Ŭ������ �����ڷ� ��ü �ΰ� ����
 * 2. ������ ���簢��2Ŭ������ ��ü�� �޼����� ����� ȭ�鿡 ����ϱ�
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
		System.out.println("ù��° �簢��");
		System.out.println("���� : "+r1.area() + " �ѷ� : "+ r1.length() );
		System.out.println("���簢�� ���� : "+ ((r1.isSquare())?"���簢��":"���簢��")); //�����
		System.out.println();
		Rectangle1 r2 = new Rectangle1(50,50);
		System.out.println("�ι�° �簢��");
		if(r2.isSquare())
			System.out.println("���� : "+r2.area() + " �ѷ� : "+ r2.length()+ " ���簢��" );
		else
			System.out.println("���� : "+r2.area() + " �ѷ� : "+ r2.length()+ " ���簢��");
	}

}
