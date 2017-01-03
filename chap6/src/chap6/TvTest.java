package chap6;
/*
 * 교재 153p : 객체생성과 사용 예제
 * 
 *  추상화 : 클래스 생성 과정
 *  		객체를 주관적인 판단으로 분석하여, 필요정보를 추출하는 과정
 *  	속성 : 변수
 *  	기능 : 메서드
 *  	------------멥버
 */
class Tv{	// 클래스는 사용자 정의 타입
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp(){++channel;}
	void channelDown(){--channel;}
}

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t;    //참조변수선언
		t = new Tv(); //객체화(인스턴스화)
		t.color = "검정"; //t가 참조하는 객체의 멤버 중 color에 "검정"문자열 대입
		t.channel = 11; //t가 참조하는 객체의 멤버 중 channel에 11을 대입
		t.power = true;
		System.out.println(t.color +"," + t.channel + ","+ t.power);
		
		Tv t2= new Tv(); 
		/*
		 * new 연산자(객체화)
		 * 1. 힙영역에 메모리 할당
		 * 2. 멤버변수를 기본값으로 초기화
		 * 	  기본값 : 숫자 : 0, boolean : false
		 * 		     그외 : null
		 * 3. 생성자 호출
		 * 
		 */
		System.out.println(t.color +"," + t.channel + ","+ t.power);
		System.out.println(t2.color +"," + t2.channel + ","+ t2.power);
		t2 = t;
		/*
		 * 하나의 객체는 여러개의 참조변수로 참조 가능
		 * 하지만 하나의 참조변수는 하나의 객체만 참조 가능
		 */
		System.out.println(t2.color +"," + t2.channel + ","+ t2.power);
		t2.channelDown();
		System.out.println(t.color +"," + t.channel + ","+ t.power);
	}

}
