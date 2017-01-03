package a1007;
/*
 * 인터페이스 예제
 * 1. 인터페이스의 멤버는 추상메서드와 상수만 가능하다.
 * 	    멤버가 없을 수도 있다.
 * 2. 객체화 불가 => 구현클래스로 객체화 가능 ( 추상클래스는 하위 클래스에서 객채화)
 * 3. 클래스와 인터페이스간은 구현이라 한다.
 * 	    다중구현이 가능하다.
 * 4. 인터페이스간에도 상속이 가능하다.
 * 	    인터페이스간의 상속은 다중상속이 가능하다.
 * interface 인터페이스명 {
 * 		(public static final)(무조건 이렇게! 이렇게 쓰기에 안써도되지만 자기가 써) 자료형 상수명=100;  
 * 		(public abstract) 리턴타입 추상메서드(매개변수);  
 * }
 */
interface Movable{
	public static final int Max = 100; //public static final을 생략해도 무조건 상수
	public abstract void move(int x, int y);
	
}
interface Attackable{
	public abstract void attack(Unit u);
}
interface Fightable extends Movable, Attackable{  // 인터페이스간의 다중 상속
	
}
class Unit {
	int currentHp, x, y;
}
//Fighter : 구현클래스 : 인터페이스를 구현한 클래스
//implements : 구현(다중구현도 가능)
class Fighter extends Unit implements Fightable{

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("이동 중 ~~");
	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		System.out.println("싸우자!");
	}
	
}
public class FighterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f = new Fighter();
		System.out.println(Movable.Max);
		f.move(20, 30);
		f.attack(f);
		f. currentHp =10;
		Unit u = f;
		// u.move(); //Unit의 멤버가 아니기때문에 오류
		u.x= 100;
		u.y=200;
		u.currentHp=10;
		Movable m =f;
		System.out.println(m.Max);
		if (m instanceof Fighter){
			System.out.println("m 객체는 Fighter 객체다");
		}
		if (m instanceof Unit){ //m 참조형 변수가 Unit 객체니?? but m 객체는 Movable에 있는것만 사용
			System.out.println("m 객체는 Unit형 객체다");
			u= (Unit)m;
		}
		if(m instanceof Fightable){
			System.out.println("m 객체는 Fightable형 객체다");
			Fightable f2= (Fightable)m;
			f2.attack(u);
			f2.move(10, 20);
			System.out.println(f2.Max);
			//f2.x=10; // Fightable 멤버 아님
		}
		if(m instanceof Movable){
			System.out.println("m 객체는 Movable형 객체다");
			m.move(10,20);
			System.out.println(m.Max);
		}
		
		if(m instanceof Attackable){
			System.out.println("m 객체는 Attackable형 객체다");
			Attackable at = (Attackable)m;
			at.attack(u);
			//at.move(1,1); // Atackable 멤버 아님
		}
		if(m instanceof Object){
			System.out.println("m 객체는 Object형 객체다");
			Object o = m;
			
		}
	}

}
