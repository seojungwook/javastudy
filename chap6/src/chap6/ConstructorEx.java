package chap6;
/*
 * 생성자 예제
 * 생성자란 : 객체화시 반드시 호출되는 메서드
 * 		     생성자 없이 객체생성은 불가하다.
 * 		     기능은 주로 인스턴스 변수의 초기화를 담당함
 * 		=> 객체생성에 관여하는 특별한 메서드
 * 		     생성자도 오버로딩이 가능하다.
 * 		     생성자의 이름은 클래스명과 같다.
 * 		     리턴타입이 없다.
 * 기본생성자란?
 * 		개발자가 생성자를 구현하지 않으면 컴파일러가 알아서 추가하는 생성자
 * 		public 클래스명(){}
 */
class Data1{ //기본생성자가 제공되는 클래스
	int value;
}
class Data2{ //기본생성자가 제공되지 않는 클래스
	int value;
	Data2(int x){ //생성자
		value = x;
	}
}
public class ConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data1 d1 = new Data1();
		/*
		 * new 연산자 기능
		 * 1. 힙영역에 메모리 할당
		 * 2. 멤버변수를 기본값으로 초기화
		 * 3. 생성자 호출
		 */
		d1.value = 10;
		System.out.println(d1.value);
		Data2 d2 = new Data2(100);
		System.out.println(d2.value);
	}

}
