package a1013;

import a1013.Outer.InstanceInner;

//외부에 있는 내부클래스
class Outer{
	int iv = 10;
	int iv2 = 20;
	class InstanceInner{
		int iv = 100;
		void method1(){
			System.out.println("iv=" + iv);
			System.out.println("this.iv=" + this.iv);
			//내부클래스에서 외부클래스에 있는 멤버에 접근하기위해
			System.out.println("Outer.this.iv="
										+ Outer.this.iv); 
		}
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
	void myMethod(){
		class LocalInner{int iv=400;}
		LocalInner lc = new LocalInner();
		System.out.println(lc.iv);
	}
}
public class InnerEx3 {

	public static void main(String[] args) {
	//InstanceInner 클래스 객체화
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner(); //Outer.InstanceInner 
														//원래부터 내부클래스는 이렇게
		System.out.println("InstanceInner.iv= " + ii.iv);
		ii.method1();
	//StaticInner 클래스의 객체화
		Outer.StaticInner si = new Outer.StaticInner(); 
		System.out.println("StaticInner iv = "+si.iv); //객체화를 해주고
		System.out.println("StaticInner cv = "+Outer.StaticInner.cv); //객체화 필요없고 static이니까
		oc.myMethod();
	}
}
