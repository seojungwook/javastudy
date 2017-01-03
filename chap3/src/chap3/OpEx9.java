package chap3;
/*
 * 대입(할달)연산자 : = 
 *  A = B; B의 값을 A의 값에 대입
 *  A : 반드시 값을 저장할 수 있어야 한다.(변수여야 한다.)
 *      lvalue는 반드시 변수여야 한다.
 *  B : 변수, 상수, 리터럴, 수식이 가능하다 
 * 		rvalue
 */
public class OpEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100 + 200;
		int a = 10, b = 20;
		
		//+=
		num += a; //num = num + a;
		System.out.println("num = " + num);
		//-=
		num -= b; 
		System.out.println("num = " + num);
		//*=
		System.out.println("num = " + (num*=2));
		// /=
		System.out.println("num = " + (num/=2));
		//num = num +(a+b)
		System.out.println("num = " + (num+=a + b));
		
	}

}
