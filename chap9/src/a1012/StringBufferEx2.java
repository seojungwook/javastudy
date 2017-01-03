package a1012;
/*
 * StringBuffer 클래스 
 * 동적인 문자열, 객체 생성시 16바이트정도의 버퍼를 가진다.
 * 
 * StringBuilder(jdk5.0 이후) 클래스와 메서드가 동일하다.
 * StringBuffer : 멤버메서드가 스레드에 동기화되어 있다. (스레드에 동기화 되어있으면 실행속도가 느려)
 * StringBuilder : 멤버메서드가 스레드에 동기화되어 있지 않다.
 */
public class StringBufferEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("abc").append(123).append(true);
		System.out.println(sb);
		
		//1번인덱스부터 3번앞까지(2번인덱스) 삭제
		sb.delete(1, 3);
		System.out.println(sb);
		sb.deleteCharAt(4); 	//4번인덱스 문자 제거
		System.out.println(sb);
		sb.insert(5, "@@"); 	//5번인덱스에 @@문자 추가
		System.out.println(sb);
		sb.insert(6, 7.89); 
		System.out.println(sb);
		sb = new StringBuffer("ABCDEFG");
		sb.replace(0, 3, "abc"); // 0번인덱스부터 2번인덱스의 문자를 abc변경
		System.out.println(sb);
		sb.reverse(); 			//문자열의 순서 바꾸기
		System.out.println(sb);
	}

}
