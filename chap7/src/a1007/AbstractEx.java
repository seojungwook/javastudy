package a1007;
/*
 * 추상클래스란 미완성 클래스
 * 	추상메서드를 가질 수 있는 클래스
 * 	객체화 불가
 * 	객체화를 하려면 반드시 상속을 통해서 자손클래스의 객체로 객체화가 가능
 * 	그외는 일반클래스처럼 생성자, 멤버변수, 멤버메서드를 멤버로 가질 수 있다.
 * 	업무의 표준화에 사용한다. 
 * 
 * 	추상메서드
 * 		선언부만 존재하는 메서드, 구현부가 없다.
 * 		자손클래스에서 반드시 오버라이딩해야 한다.@
 */
abstract class Player{ //추상클래스
	boolean pause; 
	int currentPos;
	Player(){
		currentPos = 0;
	}
	abstract void play(int pos); //추상메서드
	abstract void stop();		// 추상메서드
	void play(){ 				//오버로딩(이게 되어야 객체화?)
		play(currentPos);		//추상메서드 호출
	}
	void pause() {
		if(pause){
			pause = false;
			play(currentPos);
		}else {
			pause = true;
			stop();
		}
	}
}
class CDPlayer extends Player{  //그냥 만들면 abstract메서드를 사용하라고 에러남 

	@Override
	void play(int pos) {
		// TODO Auto-generated method stub
		System.out.println("CDPlayer play~~");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("CDPlayer stop!");
	}
	
}
class MP3Player extends Player{

	@Override
	void play(int pos) {
		// TODO Auto-generated method stub
		System.out.println("MP3Player play~~");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("MP3Player stop!");
	}
	
}
public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player[] player = new Player[2];
		player[0] = new CDPlayer();
		player[1] = new MP3Player();
		for(Player p : player){
			p.play();
			p.pause();
			p.stop(); //참조 오버라이딩된 메소드출력
			}
	}
}

/*
 * 1.추상클래스간의 상속은 자손클래스에서 추상메서드를 오버라이딩 하지 않을 수 있다.
 * 자손인 추상클래스를 상속받은 일반 클래스는 
 * 부모 추상클래스의 추상메서드와 자손추상클래스의 추상메서드를 모두 오버라이딩 해야한다. 
 */ 

abstract class Abs1 {
	abstract void method1();
}
abstract class Abs2 extends Abs1{ //이게 1.의 말이야
	
}
class Gclass extends Abs2{

	@Override
	void method1() {
		// TODO Auto-generated method stub
		
	}

}
