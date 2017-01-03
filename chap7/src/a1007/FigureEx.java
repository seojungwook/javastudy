package a1007;
/*
 * 1. ���� Ŭ���� : Figure
 * 	������� : ������ ����
 * 	������ : ������ ������ �Է¹޾� �ʱ�ȭ
 * 	�޼��� : ���� : double area();
 * 		  �ѷ� : double length();
 * 	Math.PI, Math.abs()
 * 2. ��Ŭ���� : Circle => ����Ŭ���� ���
 * ������� : ����x, ����y,������
 * ������ : ������� 3���� �Է¹޾� ��ü ����
 * �޼��� : ?
 * 3. �簢�� : Rectangle => ����Ŭ���� ��� 
 * ������� : ��x1, ��y1,��x2, ��y2
 * ������ : ������� 4���� �Է¹޾� ��ü ����
 * �޼��� : ?
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
		super("��");
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
		super("�簢��");
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
				new Circle(1,2,3), //������, x, y
				new Circle(10,20,30),
				new Rectangle(1,1,3,3),
				new Rectangle(10,10,30,30)
		};
		for(Figure a : f){ //������ for�� 
			System.out.print(a + "���� : "+ a.area());
			System.out.println(", �ѷ�:"+ a.length());
			
		}
	}

}
