package a1005;
/*
 * 상속 : extends로 표현.
 * class 자손클래스 extends 부모클래스 {
 * 		......
 * }
 * 단일상속만 가능 : 자손클래스의 부모클래스는 한개만 가능하다
 * 				extends 이후의 부모클래스는 한개만 가능하다.
 * 객체화 : 자손클래스의 객체생성시 부모클래스의 객체를 먼저 생성한다.
 * 			자손클래스의 객체는 부모클래스의 객체를 포함한다.(내안에 부모있다.)
 * 자바에서는 Object 클래스를 모든 클래스가 상속받는다.
 * 모든 객체안에는 Object클래스의 객체를 포함한다. 227p
 */
class Tv extends Object{
	boolean power;
	int channel;
	void power() {power = !power;}
	void channelUp(){++channel;}
	void channelDown(){--channel;}
}

class CaptionTv extends Tv{
	boolean caption;
	void displayCaption(String text){
		if(caption)
			System.out.println(text);
	}
}
public class CaptionTvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv ctv = new CaptionTv();
		/* => 자손클래스의 객체화시 
		 * 	  부모클래스의 객체를 먼저 생성한다!
		 * 상속관계에서 new 연산자
		 * 1. 부모클래스의 객체를 생성, 기본값 초기화
		 * 2. 자손클래스의 객체를 생성, 기본값 초기화
		 * 3. 생성자호출(부모클래스의 생성자를 먼저 실행)
		 * 
		 */
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true;
		ctv.displayCaption("Hello, World");
	}

}
