package a1013;

public class Test8 {

	static double round(double d, int n){
		double pow = Math.pow(10, n);
		d=d*pow;
		
		return Math.round(d)/pow;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(round(3.1415,1));
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));
		
	}

}
