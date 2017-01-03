package a1012;
/*
 * Wrapper 클래스 : 기본형 8개를 클래스화 하기위한 클래스(Wrapper라는 이름의 클래스가 아냐)
 * 	기본형 
 * 	boolean  => Boolean
 * 	char     => Character
 * 	byte     => Byte
 * 	short    => Short
 * 	int		 => Integer
 * 	long	 => Long
 * 	float	 => Float
 * 	double   => Double
 * 
 * 	기본적으로 기본자료형과 참조자료형은 서로 형변환 불가
 * 	단 예외적으로 기본자료형과 Wrapper클래스는 형변환 가능(jdk5.0이후)
 * 
 *  기본형 => 참조형(객체화) : auto Boxing
 * 		   <=                : auto unBoxting
 */
public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println("i1==i2 ?" + (i1 == i2));
		System.out.println("i1.equals(i2) ?" + (i1.equals(i2)));
		System.out.println("i1==100 ?" + (i1 == 100)); // unBoxing
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		
		
		
		//기본형의 정보
		System.out.println("정수의 최대값 : " + Integer.MAX_VALUE);
		System.out.println("정수의 최소값 : " + Integer.MIN_VALUE);
		System.out.println("double 최대값 : " + Double.MAX_VALUE);
		System.out.println("double 최소값 : " + Double.MIN_VALUE);
		//크키
		System.out.println("int bit 수: "+ Integer.SIZE);
		//진법
		System.out.println("500의 2진수 : " + Integer.toBinaryString(500));
		System.out.println("500의 8진수 : " + Integer.toOctalString(500));
		System.out.println("500의 16진수 : " + Integer.toHexString(500));
		//기본형 <== String
		int pi = Integer.parseInt("123"); //cf. double => Double.parseDouble
		System.out.println(pi);
		//문자열 "764"를 8진수로 인식하여 정수변경
		pi = Integer.parseInt("764",8);
		System.out.println(pi);
		//16진수로 인식
		pi = Integer.parseInt("FF",16);
		System.out.println(pi);
		//Wrapper 객체 생성시 new 연산자 사용안해도 됨
		Integer i3 = 200;
		System.out.println(i3.toBinaryString(i3));
	}

}
