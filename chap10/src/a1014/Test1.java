package a1014;

class Outer {
	class Inner {
		int iv=100;
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		Outer.Inner in = o.new Inner();
		System.out.println(in.iv);
	//	System.out.println(new Outer().new Inner().iv);
		
	}

}
