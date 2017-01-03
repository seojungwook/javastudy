package chap3;
/*
 * 이항 연산자
 * 비트 연산자 : &(AND), |(OR), ^(XOR), ~(not)
 */
public class OpEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(6&3);
		/*
		 * 6 : 0110
		 * 3 : 0011
		 * & : 0010
		 */
		System.out.println(6|3);
		/*
		 * 6 : 0110
		 * 3 : 0011
		 * | : 0111
		 */
		System.out.println(6^3);
		/*
		 * 6 : 0110
		 * 3 : 0011
		 * ^ : 0101
		 */
		System.out.println(~10);
		/*
		 *  10 : 00001010
		 */
	}

}
