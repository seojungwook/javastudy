package a1014;
class Outer1{
	static class Inner{ // ����Ŭ������ ��ü��
		int iv =200;	// Outer1.Inner
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer1.Inner in = new Outer1.Inner();
		System.out.println(in.iv);
		
	//	System.out.println(new Outer1.Inner().iv);
	}

}
