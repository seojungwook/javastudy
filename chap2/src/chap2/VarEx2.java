package chap2;
/* ����ȯ(Casting) ����
 *
 */
public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 10;
		short s = b;
		b = (byte) s;
		char c = (char) b;
		int i = 300;
		System.out.println("b = " + b);
		System.out.println("i = " + i);
		int i2 = (int)b; // ����ȯ ������ ���� ����(�ڵ� ����ȯ)
		byte b2 = (byte)i; // ����ȯ ������ ���� �Ұ�(����� ����ȯ)
		System.out.println("b2 = " + b2);
		System.out.println("i2 = " + i2);
	}

}
