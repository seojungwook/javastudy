package a1006;
/*
 * 패키지는 클래스(인터페이스- 아직배우진 않았어)들의 모임
 * 모든 클래스 이름은 패키지명을 포함한다. ex)a1006.PackageEx
 * 패키지명.클래스명 으로 사용한다.
 * package 구문은 반드시 파일의 첫 줄에 기술한다.
 * => 하나의 파일에 존재하는 모든 클래스는 하나의 패키지에 속한다.
 * 패키지명을 생략할 수 있다.
 * 1. 사용하는 클래스가 동일한 패키지의 클래스인 경우
 * 2. java.lang 패키지에 속한 클래스는인경우(String, System 등)
 * 3. import 구문에 설정된 클래스인 경우
 */

class Pack{
	void method(){
		System.out.println("a1006.Pack 클래스의 메서드");
	}
}
public class PackageEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Date today = new java.util.Date();
		System.out.println(today);
		Pack p1 = new Pack();
		p1.method();
		b1006.Pack p2 = new b1006.Pack();
		p2.method();
	}
}
