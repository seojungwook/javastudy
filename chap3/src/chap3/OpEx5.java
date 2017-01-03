package chap3;
/*
 *  shift 연산자
 *  	<<   : 왼쪽 shift 연산자
 *  	>>	 : 오른쪽 shift 연산자
 *  	>>>  : 오른쪽 shift 연산자
 */
public class OpEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println
		(Integer.toBinaryString(-8));
		System.out.println("-8<<2=" + (-8<<2));
		/*
		 *  -8  : 11111111111111111111111111111000
		 *  <<2 : 11111111111111111111111111100000  -32라는 값의 2의보수 -32
		 */
		System.out.println("-8>>2=" + (-8>>2));
		/*
		 *  -8  : 11111111111111111111111111111000
		 *  >>2 : 11111111111111111111111111111110  -2라는 값의 2의 보수
		 */
		System.out.println("-8>>>2=" + (-8>>>2));
		/*
		 * -8   : 11111111111111111111111111111000
		 * >>>2 : 00111111111111111111111111111110
		 */
	}

}
