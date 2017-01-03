package chap6;
/*6장 연습문제 풀이.
 * 
 * 
 * 자습문제 : 
 * 1. 앞의 Coin 클래스를 이용하여 두개의 동전 객체를 던져, 
 * 		먼저 세번 연속 "앞면"이 나온 동전이 승리하는 프로그램을 작성해라
 * 		단 던지기는 어느 한 동전이 경기를 이길 때까지 계속한다. 
 * 		동전을 던질 때마다 그 결과를 출력하라
 * 
 * 	문자열 비교 :
 * 		coin.side.equals("앞면")
 */
class Coin1{
	String side;
	Coin1(){
		this("앞면");
	}
	Coin1(String side){
		this.side=side;
	}
	void flip(){
		this.side //this 써도 되고 안써고 상관없음
		=((int)(Math.random()*2)==0)?"앞면":"뒷면"; 
	}
}
public class CoinEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt1 = 0, cnt2 = 0;
		Coin c1 = new Coin();
		Coin c2 = new Coin();
		while(true){
			c1.flip();
			c2.flip();
			System.out.println("동전 1 :"+ c1.side + ", 동전 2 : "+ c2.side);
			if(c1.side.equals("앞면")) cnt1++;
			else cnt1 = 0;
			if(c2.side.equals("앞면")) cnt2++;
			else cnt2 = 0;
			if(cnt1 ==3 || cnt2 ==3) break;
		}
		if(cnt1==3 && cnt2 ==3)
			System.out.println("비겼습니다");
		else if(cnt1 ==3)
			System.out.println("동전 1 승리");
		else 
			System.out.println("동전 2 승리");
	}

}
