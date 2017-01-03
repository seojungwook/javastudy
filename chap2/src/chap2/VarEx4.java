package chap2;
//char 와 int 형의 형변환

public class VarEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		int i = c;
		System.out.println("c=" + c);
		System.out.println("i=" + i);
		int i2 = 'A' + 1;
		System.out.println("i2=" + i2);
		char c2 = (char)i2;
		System.out.println("c2=" + c2);
		
//서로 다른 자료형의 연산의 결과는 큰 자료형을이다.		
//int 형보다 작은 자료형의 연산의 결과는 int형이다.
		char c3 = (char) (c2 + 1); //명시적 형변환
		System.out.println("c3=" + c3);
	}

}
