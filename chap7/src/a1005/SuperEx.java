package a1005;
/*
 * 228p
 * super 참조변수 : 부모객체를 참조하는 참조변수
 * super 생성자 : 상속관계의 클래스의 객체 생성시 부모클래스의 생성자를 호출
 * 				개발자가 super()을 호출하지 않으면 컴파일러가 스스로 super();을 추가한다.
 * 				부모클래스의 생성자 중 매개변수가 있는 생성자만 존재하면 반드시 자손클래스의 
 * 				생성자에서 부모클래스의 생성자에 맞도록 super(...) 호출해야 한다.
 * 
 * this, super 모두 인스턴스 멤버에서만 사용 가능하다. Object 클래스가 상위에 있기때문에 super는 모든 클래스에 있어.	
 * 											단지 매개변수가 없는 것은 스스로 생성
 */

class Parent {
	int x =10;
}
class Child extends Parent{
	int x = 20;
	void method(){
		int x = 30;
		System.out.println(x);
		System.out.println(this.x); //힙영역의 객체로 돌아가서 가장 가까운 x 값
		System.out.println(super.x); //부모객체로 바로
	}
}
public class SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.method();
	}

}
