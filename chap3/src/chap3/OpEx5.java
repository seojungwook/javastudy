package chap3;
/*
 *  shift ������
 *  	<<   : ���� shift ������
 *  	>>	 : ������ shift ������
 *  	>>>  : ������ shift ������
 */
public class OpEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println
		(Integer.toBinaryString(-8));
		System.out.println("-8<<2=" + (-8<<2));
		/*
		 *  -8  : 11111111111111111111111111111000
		 *  <<2 : 11111111111111111111111111100000  -32��� ���� 2�Ǻ��� -32
		 */
		System.out.println("-8>>2=" + (-8>>2));
		/*
		 *  -8  : 11111111111111111111111111111000
		 *  >>2 : 11111111111111111111111111111110  -2��� ���� 2�� ����
		 */
		System.out.println("-8>>>2=" + (-8>>>2));
		/*
		 * -8   : 11111111111111111111111111111000
		 * >>>2 : 00111111111111111111111111111110
		 */
	}

}
