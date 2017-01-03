package chap6;
/*
 * 메서드 예제
 * 
 * 		메서드 구성
 * 		[접근제어자 제어자] 리턴타입 메서드명(매개변수목록) => 선언부
 * 		{    => 구현부
 * 		}
 * 
 * 		리턴타입 : 메서드 종료 후 넘겨지는 갑의 자료형
 * 				리턴타입이 void인 경우는 리턴값이 없다. ex)void main
 * 		매개변수 : 매서드 호출시 초기화되는 값
 * 				매개변수가 없는 경우는 () 표현함.
 * 		return : 메서드 종료함.
 * 				 리턴타입이 void가 아닌 경우는 return 리턴값; 으로 구현한다.
 * 				 리턴타입이 void인 경우는 return을 생략 가능함.
 * 				 메서드의 끝 '}'를 만나면 메서드가 종료된다
 */
class Math1{
	//int a, int b 매개변수(add를 사용할 때는 값을 두개 넣어라)
	int add(int a, int b) //선언부
	{ return a + b; } //구현부 : 기능
	int sub(int a, int b){ return a - b; }
	int mul(int a, int b){ return a * b; }
	int div(int a, int b){ return a / b; }
}
public class MathEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math1 m1 = new Math1(); //객체화
		System.out.println(m1.add(10, 10)); //메서드 호출
		System.out.println(m1.sub(100, 50));
		System.out.println(m1.mul(10, 10));
		System.out.println(m1.div(100, 10));
	}

}
