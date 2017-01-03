package chap3;
/*
 * 이항 연산자 : 피연산자 2개인 연산자
 * 나머지 연산자 : %
 * 	나머지 연산자의 결과는 피젯수(10)의 부호를 따른다.
 */
public class OpEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10 / 8 =" + (10/8));
		System.out.println("-10 / -8 =" + (-10/-8));
		System.out.println("10 / -8 =" + (10/-8));
		
		System.out.println("10 % 8 =" + (10%8));
		System.out.println("-10 % 8 =" + (-10%8));
		System.out.println("10 % -8 =" + (10%-8));
		System.out.println("-10 % -8 =" + (-10%-8));
	}

}
