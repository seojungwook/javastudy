package a1012;
/*
 * String 클래스
 * 클래스 중 유일하게 대입연산자로 객체생성이 가능
 * 또 + 연산자를 사용할 수 있는 클래스
 * String = String +기본자료형
 */
public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc"; //대입연산자로 객체생성, 클래스영역의 상수풀에 만들어주는데 이 영역은 
		String s2 = "abc";	//영역이 좁아서 무조건 새로 만들기보다 있는지 없는지 검사해서 만드는데 
							//있으면 그대로 재사용
		 
		if(s1 == s2)
			System.out.println("s1과 s1는 같은 객체임");
		else
			System.out.println("s1과 s2는 다른 객체임");
		if(s1.equals(s2)) //내용비교
			System.out.println("s1과 s2는 같은 내용임");
		else
			System.out.println("s1과 s2는 다른 내용임");
		String s3 = new String("abc"); //힙영역에 객체 생성
		String s4 = new String("abc"); //힙영역에 객체 생성
		if(s3 == s4)
			System.out.println("s3과 s4는 같은 객체임");
		else
			System.out.println("s3과 s4는 다른 객체임");
		if(s3.equals(s4)) //내용비교
			System.out.println("s3과 s4는 같은 내용임");
		else
			System.out.println("s3과 s4는 다른 내용임");
		//+연산자를 이용하여 String 변경
		String s5 = 1 + 2 + 3 + "번";
		System.out.println(s5);
		String s6 = "번호" + 1 + 2 + 3 +"번";
	//	String s6 = "번호" + (1 + 2 + 3) +"번"; //번호6번
		System.out.println(s6);
		//기본형을 String변경 메서드 : valueof()
		String s7 = String.valueOf(123);
		System.out.println(s7);
	}

}
