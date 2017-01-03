package chap6;
/*
 * 선언 위치에 따른 변수의 종류
 * 클래스변수    : 클래스내에 선언, static int cv;
 * 			 클래스정보 메모리에 로드시 변수 할당
 * 			 클래스명.변수명 접근해야 함
 * 			 메모리할당위치 : 클래스 영역(메서드 영역)
 * 			 클래스의 모든 객체의 공통변수로 사용됨
 * 인스턴스변수 : 클래스내에 선언, int iv;
 * 			 객체화시 변수가 할당
 * 			 참조변수명.변수명 접근해야함
 * 			 메모리할당위치 : 힙영역
 * 지역변수       : 메서드내에 선언, int lv;
 * (매개변수포함) 변수의 선언문 실행시 메모리 할당
 * 	ex)args	   변수명 접근해야함
 * 			   메모리할당위치 : 스택영역(콜스택)
 * 			   반드시 초기화 되어야 함.
 * 
 */

class Card{
	String kind; //인스턴스 변수
	int number; // 인스턴스변수
	static int width= 100; //클래스변수
	static int height = 250; //클래스변수
	//toString():객체의 문자열화에 관여하는 메서드
	public String toString(){
		return kind + ":" + number + "(" + width + "," +height + ")";
	}
}
public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("카드크기 : "+ Card.width+ ","+ Card.height);
		//c1 :지역변수
		Card c1 = new Card(); 
		c1.kind= "Heart";
		c1.number = 7;
		//c1 : c1.toString()메서드가 호출, c1만 써도 무방
		System.out.println("c1카드:" +c1.toString());
		//c2 : 지역변수
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 1;
		System.out.println("c2카드:" +c2.toString());
		System.out.println("c2카드의 크기 변경");
		c2.width =50;
		c2.height = 80;
		System.out.println("c2카드:" +c1.toString());
		System.out.println("c2카드:" +c2.toString());
		
	}

}
