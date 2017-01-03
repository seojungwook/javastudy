package chap6;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

/*1. �� Ŭ������ �����϶�
 * 1)����������� �ۼ��϶�.
 * 		������, ���� x��ǥ, ���� y��ǥ, ���� ��ȣ no, ���� ��ȣ�� ���������ִ� count (static����)
 * 2)������ 3�� ������.
 * 		a. �Ű����� ���� ��ü �����ϸ�
 * 			������ 1, �߾��� (1,1) ��ü����
 * 		b. �Ű������� 1��(r)�̸�
 *  		�������� r�̰� �߾����� (1,1)�� ��ü ����
 * 		c. �Ű������� 3��(r,x,y)�̸� 
 * 			������ r, �߾����� (x,y)�� ��ü ����
 * 3) ���� �޼ҵ���� ������
 * 		a. area: ���� ���̸� ����ϴ� �޼ҵ� 
 * 				Math.PI - ������
 * 		b. move : ���� �̵���Ű�� �޼ҵ� (x+ mx, y+ my)
 * 		c. scale : ���� Ȯ�� ����ϴ� �޼ҵ� (r = r x 3)
 * 		d. toString : ���� �߽����� �������� ����ϴ� �޼ҵ�
 * 
 * 2. ���� Ŭ����(CircleEx) �����϶�
 * 	1) �� �����ڵ��� �̿��Ͽ� �� ��ü���� ������ �����϶�
 * 	2) �� ���� ��ȣ, ������, x��ǥ, y��ǥ�� ����ϱ�
 */
class Circle{
	int r,x,y,no;
	static int count;
	
	Circle(){
		this(1, 1, 1);
	}
	Circle(int r, int x, int y){
		this.r= r;
		this.x = x;
		this.y = y;
		this.no = ++count; // �� �κ� ���Ѱ�@@@@@@@@
	}
	Circle(int r){
		this(r, 1, 1);
	}
	double area(){
		return r*r*Math.PI;
	}
	void move(int a){ // ���� �Ű����� �ΰ��ε� ĵ���� ������ �ϳ��� �ٲ��
		 x+=a; 
		 y+=a;
	}
	void scale(int m){
		r*=m;
	}
	public String toString(){
		return "��ȣ: " +no +" ������ : " + r + "  (" + x + ","+y + ")";
	}
	
}
public class CircleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		System.out.println(c1);
		Circle c2 = new Circle(50);
		System.out.println(c2);
		Circle c3 = new Circle(100,10,20);
		System.out.println(c3);
		System.out.println("��ȣ:" + c1.no + " ���� ="+ c1.area());
		System.out.println("��ȣ:" + c2.no + " ���� ="+ c2.area());
		System.out.println("��ȣ:" + c3.no + " ���� ="+ c3.area());
		System.out.println("10��ŭ �̵� ��");
		c1.move(10);
		System.out.println(c1);
		System.out.println("ũ�⸦ 2��� ���� ��");
		c1.scale(2);
		System.out.println(c1);
		System.out.println("��ȣ:" + c1.no + " ���� ="+ c1.area());
		
		//Canvas�� �� �׸���
			MyCanvas canvas = new MyCanvas(c1,c2,c3);
			Frame f = new Frame(); //������ ȭ��(����ִ� ȭ��)
			canvas.setBackground(Color.yellow);// ��� ��ȭ��
			f.add(canvas); //��� ��ȭ���� �ٿ�
			f.setLocation(300, 300); //Frame ��ġ
			f.setSize(500, 500); 	 //Frame (������)ũ��
			f.setVisible(true); 	 //ȭ�� ǥ��(paint()�� �ڵ����� ����)
			for(int i =0; i<8; i++){
				try{
					Thread.sleep(1000);//1000�и���ũ = 1��
				} catch(InterruptedException e) { //���� ���� (�߿��Ѱ� �ƴѵ�)
					e.printStackTrace(); 
				}
				c1.move(i*3);
				c1.scale(2);
				canvas.repaint();
			}
	}

}
//Canvas : ��ȭ��
class MyCanvas extends Canvas{
	Circle c1, c2, c3;
	MyCanvas(Circle c1, Circle c2, Circle c3){
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}
	//Graphics : �׸� �׸��� ����
	@Override
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.fillOval(c2.x, c2.y, c2.r, c2.r); // �տ��� ��ǥ �ΰ�, �ڿ� �ΰ� - �ϳ��� ���� , �������� ����
		g.setColor(Color.GREEN);
		g.fillOval(c3.x, c3.y, c3.r, c3.r);
		g.setColor(Color.red);
		g.fillOval(c1.x, c1.y, c1.r, c1.r);
	}
}
