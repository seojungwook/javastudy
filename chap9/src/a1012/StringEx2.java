package a1012;
/*
 * String 클래스의 멤버 메서드
 */
public class StringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("ABCDEFGH");
		//charAt(4) : 4번인덱스(5번째)의 문자 리턴
		System.out.println(s.charAt(4));
		//compareTo() : 두 문자열의 크기 비교
		//				정렬에서 사용되는 메서드
		//				A - a = -32
		System.out.println(s.compareTo("abc"));
		//IgnoreCase : 대소문자 구분없이 비교해
		System.out.println(s.compareToIgnoreCase("abcdefgh"));
		//concat : 두 문자열을 연결하기 
		// == s + "abc"
		System.out.println(s.concat("abc"));
		//endWith : s문자열이 "FGH"로 종료?
		System.out.println(s.endsWith("FGH"));
		//statsWith : s문자열이 "ABC"로 시작?
		System.out.println(s.startsWith("ABC"));
		//equals : 내용 비교
		System.out.println(s.equals("ABCDEFGH"));
		//대소문자 구분없이 비교
		System.out.println(s.equalsIgnoreCase("abcdefgh"));
		s = new String("This is a String");
		//indexOf('i') : 'i'문자의 인덱스 리턴
		System.out.println(s.indexOf('i'));
		System.out.println(s.indexOf("is"));
		//indexOf('i',7) : 7번인덱스 이후에 'i'문자의 인덱스
		System.out.println(s.indexOf('i',7)); //13
		System.out.println(s.indexOf("is",5)); //5
		System.out.println(s.indexOf("is",6));// -1 , 값이 없다는 얘기
		//lastIndexOf : 뒤우선 검색
		System.out.println(s.lastIndexOf("is")); //5
		
		System.out.println(s.length()); // 16
		//문자열 치환
		System.out.println(s.replace('i', 'Q'));
		
		System.out.println(s.replace("is", "QR"));
		//부분 문자열
		//substring(5) :5번 인덱스부터 끝까지를 부분문자열로 가져와
		System.out.println(s.substring(5));
		//substring(5,13) :5번 인덱스부터 12번까지를 부분문자열로 가져와
		System.out.println(s.substring(5,13));
		//대소문자 변환
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		s = "자바, JSP, Spring, My Batis, HTML, JavaScript";
		//split(",") : ,를 기준으로 문자열 분리
		String tokens[] = s.split(",");
		for(String t : tokens)
			System.out.println(t);
		//trim():공백을 제거
		for(String t : tokens)
			System.out.println(t.trim());
		// String <= 기본자료형
		//	+ 연산자, valueOf(기본자료형) =>StringEx1예제참조
		//	기본자료형 <= 문자열 ; String 클래스에서는 없다.
		System.out.println(Integer.parseInt("123")+5);
		System.out.println(Double.parseDouble("12.3")+5);
		//format 메서드 : 형식을 지정해서 String로 변환
		String sf = String.format("%.2f", 12.34567);
		System.out.println(sf);
		//%.1f : 형식제어문자 => printf함수와 사용을 같이함
	}

}
