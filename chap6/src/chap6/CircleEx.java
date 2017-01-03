package chap6;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

/*1. 원 클래스를 생성하라
 * 1)멤버변수들을 작성하라.
 * 		반지름, 원점 x좌표, 원점 y좌표, 원의 번호 no, 원의 번호를 생성시켜주는 count (static으로)
 * 2)생성자 3개 만들어라.
 * 		a. 매개변수 없이 객체 생성하면
 * 			반지름 1, 중앙점 (1,1) 객체생성
 * 		b. 매개변수가 1개(r)이면
 *  		반지름이 r이고 중아점이 (1,1)인 객체 생성
 * 		c. 매개변수가 3개(r,x,y)이면 
 * 			반지금 r, 중앙점이 (x,y)인 객체 생성
 * 3) 다음 메소드들을 만들어라
 * 		a. area: 원의 넓이를 계산하는 메소드 
 * 				Math.PI - 원주율
 * 		b. move : 원을 이동시키는 메소드 (x+ mx, y+ my)
 * 		c. scale : 원을 확대 축소하는 메소드 (r = r x 3)
 * 		d. toString : 현재 중심점과 반지름을 출력하는 메소드
 * 
 * 2. 구동 클래스(CircleEx) 생성하라
 * 	1) 각 생성자들을 이용하여 원 객체들을 여러개 생성하라
 * 	2) 각 원의 번호, 반지름, x좌표, y좌표를 출력하기
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
		this.no = ++count; // 이 부분 못한것@@@@@@@@
	}
	Circle(int r){
		this(r, 1, 1);
	}
	double area(){
		return r*r*Math.PI;
	}
	void move(int a){ // 원래 매개변수 두개인데 캔버스 때문에 하나로 바꿨어
		 x+=a; 
		 y+=a;
	}
	void scale(int m){
		r*=m;
	}
	public String toString(){
		return "번호: " +no +" 반지름 : " + r + "  (" + x + ","+y + ")";
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
		System.out.println("번호:" + c1.no + " 넓이 ="+ c1.area());
		System.out.println("번호:" + c2.no + " 넓이 ="+ c2.area());
		System.out.println("번호:" + c3.no + " 넓이 ="+ c3.area());
		System.out.println("10만큼 이동 후");
		c1.move(10);
		System.out.println(c1);
		System.out.println("크기를 2배로 변경 후");
		c1.scale(2);
		System.out.println(c1);
		System.out.println("번호:" + c1.no + " 넓이 ="+ c1.area());
		
		//Canvas에 원 그리기
			MyCanvas canvas = new MyCanvas(c1,c2,c3);
			Frame f = new Frame(); //윈도우 화면(띄워주는 화면)
			canvas.setBackground(Color.yellow);// 노란 도화지
			f.add(canvas); //노란 도화지를 붙여
			f.setLocation(300, 300); //Frame 위치
			f.setSize(500, 500); 	 //Frame (윈도우)크기
			f.setVisible(true); 	 //화면 표시(paint()가 자동으로 실행)
			for(int i =0; i<8; i++){
				try{
					Thread.sleep(1000);//1000밀리세크 = 1초
				} catch(InterruptedException e) { //설명 안함 (중요한거 아닌듯)
					e.printStackTrace(); 
				}
				c1.move(i*3);
				c1.scale(2);
				canvas.repaint();
			}
	}

}
//Canvas : 도화지
class MyCanvas extends Canvas{
	Circle c1, c2, c3;
	MyCanvas(Circle c1, Circle c2, Circle c3){
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}
	//Graphics : 그림 그리는 도구
	@Override
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.fillOval(c2.x, c2.y, c2.r, c2.r); // 앞에는 좌표 두개, 뒤에 두개 - 하나는 가로 , 나머지는 세로
		g.setColor(Color.GREEN);
		g.fillOval(c3.x, c3.y, c3.r, c3.r);
		g.setColor(Color.red);
		g.fillOval(c1.x, c1.y, c1.r, c1.r);
	}
}
