package chap6;
/*
 * 1. 동전을 표현하는 Coin 클래스를 구현.
 * 	변수 :동전의 면(side)
 * 	메서드 : flip() void 타입으로
 * 		기능 : 동전을 던져 동전의 면을 변경한다.
 * 			  Math.random() 메서드를 이용하여 결정
 * 	생성자 : 객체 생성시 동전의 면을 입력해야 한다.
 * 			동전의 면이 입력되지 않는 경우는 앞면으로 정한다
 * 
 * 2. 구동클래스 CoinEx를 작성하라.
 * 	   이 클래스의 main 메서드에서 두개의 동전을 던져
 * 	   던진 후의 동전 면의 상태를 출력하라
 */
class Coin{
	String side;
	Coin(){
		this("앞면");
	}
	Coin(String side){
		this.side=side;
	}
	void flip(){
		this.side //this 써도 되고 안써고 상관없음
		=((int)(Math.random()*2)==0)?"앞면":"뒷면"; 
	}
	
/*	int side;
	void flip(){ 
		side = (int)(Math.random()*2);
		System.out.println(side);
		if(side==0) 
		System.out.println("앞면입니다");
		else
		System.out.println("뒷면입니다");
	}
	Coin(int c){
		
	}
	Coin(){
		side = 0;
		System.out.println(side);
		System.out.println("앞면입니다");
	}*/
}
public class CoinEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coin c1 = new Coin();
		System.out.println("c1 동전의 상태 :" + c1.side);
		Coin c2 = new Coin("뒷면");
		System.out.println("c2 동전의 상태 :" + c2.side);
		System.out.println("flip 한 후");
		c1.flip();
		c2.flip();
		System.out.println("c1 동전의 상태 :" + c1.side);
		System.out.println("c2 동전의 상태 :" + c2.side);
		
	}

}
