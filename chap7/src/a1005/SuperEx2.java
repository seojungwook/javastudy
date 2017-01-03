package a1005;

class Parent2{
	int x=10;
	Parent2(int x){
		this.x = x;
	}
	//Parent2(){}
}
class Child2 extends Parent2 {
	int x=20;
	Child2(){
	//	super(); //부모클래스의 생성자 호출, 부모클래스의 생성자에 매개변수가 없는것이 없기 때문에 이건 안돼
		super(100); //생략할 수 없다. 이유는 부모클래스의 생성자가 매개변수가 있기 때문에
	}
	void method(){
		int x = 30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}
public class SuperEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c = new Child2();
		c.method();
	}

}
