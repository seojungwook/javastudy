package a1006;
/*
 * 275p
 * 부모클래스의 멤버와 자손클래스의 멤버가 동일할 때
 *  참조변수의 자료형과 객체 자료형 관계
 *  멤버변수는 참조변수의 자료형을 따른다.(x 값)
 *  멤버메서드는 객체의 자료형(최종으로 오버라이딩된 )을 따른다.
 */
class Parent {
	int x = 10;
	void method(){
		System.out.println("Parent 메서드");
	}
}
class Child extends Parent {
	int x = 20;
	void method() {
		System.out.println("Child 메서드");
	}
}
public class BindingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		System.out.println(p.x);
		p.method();
		Child c = (Child)p;
		System.out.println(c.x);
		c.method();
	}

}
