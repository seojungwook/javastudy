package a1014;

class Outer2{
	int value=10;
	
	class Inner{
		int value=20;
		void method1(){
			int value=30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer2.this.value);
		}
	}
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 o2 = new Outer2();
		Outer2.Inner inner = o2.new Inner();
		inner.method1();
	}

}
