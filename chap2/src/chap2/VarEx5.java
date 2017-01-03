package chap2;
/*
 * String 클래스
 * String 클래스는 유일하게  '+' 연산자의 사용이 가능하다
 * 	 String = String + 기본형
 * 
 * String 클래스만이 할당연산자(=)로 객체 생성이 가능하다.
 */
public class VarEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 100;
		String s = "abc";
		System.out.println("A" + 1 + 2 + 3);
		System.out.println(1 + 2 + 3 + "A");
		char c = 'A';
		System.out.println(c); //지역변수는 초기화가 필요함
		}

}
