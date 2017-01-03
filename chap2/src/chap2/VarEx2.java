package chap2;
/* 형변환(Casting) 예제
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
		int i2 = (int)b; // 형변환 연산자 생략 가능(자동 형변환)
		byte b2 = (byte)i; // 형변환 연산자 생략 불가(명시적 형변환)
		System.out.println("b2 = " + b2);
		System.out.println("i2 = " + i2);
	}

}
