package a1019;

import java.util.HashMap;

class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	int pos = 0;
	HashMap jokbo = new HashMap();
	
	SutdaDeck(){
		for(int i=0; i<cards.length; i++){
			int num = i%10 + 1;
			boolean isKwang = i<10 &&(num==1 || num ==3 || num==8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
		registerJokbo();
		}
		void registerJokbo(){
			String [] s = {"KK","1010","99","88","77","66","55","44","33","22","11","12",
							"21","14","41","19","91","110","101","410","104","46","64"};
			int [] x = {4000, 3100, 3090, 3080, 3070, 3060, 3050, 3040, 3030, 3020, 3010,
						2060, 2060, 2050, 2050, 2040, 2040, 2030, 2030, 2020, 2020, 2010, 2010};
			for(int i=0; i<s.length; i++){
				jokbo.put(s[i],x[i]);
			}
	}
		
		int getPoint(Player p){
			if(p==null) return 0;
			
			SutdaCard c1 = p.c1;
			SutdaCard c2 = p.c2;
			
			Integer result = 0;
			
			if(c1.isKwang&&c2.isKwang){
				result =(Integer) jokbo.get("KK");
			}else {  
				result = (Integer) jokbo.get(""+c1.num+c2.num);
			
			if(result == null){
				result = new Integer((c1.num + c2.num)%10+1000);
			}
			}
			p.point = result.intValue();
			return result.intValue();
		}
		
		SutdaCard pick() throws Exception{
			SutdaCard c = null;
			
			if(0<- pos && pos < CARD_NUM){
				c= cards[pos];
				cards[pos++] = null;
			}else {
				throw new Exception("남아있는 카드가 없습니다");
			}
			return c;
		}
		void shuffle() {
			for(int x=0; x < CARD_NUM * 2; x++) {
			int i = (int)(Math.random() * CARD_NUM);
			int j = (int)(Math.random() * CARD_NUM);
			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
}
class Player {
	String name;
	SutdaCard c1;
	SutdaCard c2;
	int point; 
	Player(String name, SutdaCard c1, SutdaCard c2) {
		this.name = name ;
		this.c1 = c1 ;
		this.c2 = c2 ;
	}
	public String toString() {
		return "["+name+"]"+ c1.toString() +","+ c2.toString();
	}
} 
class SutdaCard1 {
	int num;
	boolean isKwang;
	SutdaCard1() {
		this(1, true);
	}
	SutdaCard1(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}
public class Test12 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SutdaDeck deck = new SutdaDeck();
		
		deck.shuffle();
		Player p1 = new Player("타짜", deck.pick(), deck.pick());
		Player p2 = new Player("고수", deck.pick(), deck.pick());
		
		System.out.println(p1 + " " + deck.getPoint(p1));
		System.out.println(p2 + " " + deck.getPoint(p2));
		
	}

}
