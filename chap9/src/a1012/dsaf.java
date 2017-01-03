package a1012;

public class dsaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		operate(a,b);
		System.out.println(a+","+b);
	}

	private static void operate(StringBuffer a, StringBuffer b) {
		// TODO Auto-generated method stub
		a.append(a);
		b=a;
		System.out.println(b);
		System.out.println(a);
	}
}
