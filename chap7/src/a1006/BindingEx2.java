package a1006;
/*
 * 
 */
class Parent2{
	int x = 10;
	void method(){
		System.out.println(x);
		System.out.println(this.x);
	}
}
class Child2 extends Parent2{
	int x =20;
	void method(){
		System.out.println("x : " + x);
		System.out.println("this.x : " +this.x);
		System.out.println("super.x : " +super.x);
	}
}

public class BindingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent2 p = new Child2();
		System.out.println(p.x);
		p.method(); //최종메서드
		Child2 c = (Child2)p;
		System.out.println(c.x);
		c.method();
	}

}
