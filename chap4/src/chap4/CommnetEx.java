package chap4;
/**
 * 주석 예제
 * 주석이란 : 컴파일 제외 부분. 기계어 처리가 안됨
 * 1. // : 한줄 주석
 * 2. /* * / : 여러줄 주석
 * 3. /** * / : 문서화 주석
 * 				HTML로 문서화 가능
 * 				클래스 밖, 메서드 밖에서만 유효함
 * 문서화 방법
 * cmd.exe를 실행 후 해당 자바소스 위치에서 
 * javadoc *.java : 현재폴더의 모든 java소스를 문서화
 * javadoc 자바소스명.java : 자바소스명.java소스를 문서화
 * 
 * index.html로 문서화 조회 가능
 */
public class CommnetEx {
	
	/**
	 * 
	 * @param args
	 * maint 메서드 : Java application 프로그램의 시작
	 * 				메서드임.
	 * 				기능은 Hello, Java를 출력함
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 화면에 출력하는 부분
		 */
		System.out.println("Hello, java");
	}

}
