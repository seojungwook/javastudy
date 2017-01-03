package a1007;

class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck(){
		int cnt=0;
		for(int i=0; i<10;i++){
			if(i==0 || i==2 || i==7)
			cards[i]= new SutdaCard(i+1,true);
			else
			cards[i]= new SutdaCard(i+1,false);
		}
		for(int i=10;i<20;i++){
			cards[i]= new SutdaCard(i%10+1, false);
		}
	}
		//cards[i] = new Sutdacard ((i%10)+1, ((i==0 || i==2 || i==7)?true:fasle));	//한줄로 한것
	
	void shuffle(){
//		for(int i=0; i<cards.length; i++){
//		SutdaCard num= cards[i];
//		cards[i] = cards[i+1];
//		cards[i+1] = num; }
		for(int i=0; i<100; i++){
			int a = (int)(Math.random()*20);
			int b = (int)(Math.random()*20);
			SutdaCard t = cards[a];
			cards[a] = cards[b];
			cards[b] = t;
			
		}
		
		
	}
	SutdaCard pick(int index){
		return cards[index];
	}
	SutdaCard pick(){
		 int c = (int)(Math.random()*20);
		 return cards[c];
	}
	
}
class SutdaCard {
	final int num;
	final boolean isKwang;
	SutdaCard(){
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString(){
		return num + (isKwang?"K":"");
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
	
		deck.shuffle();
		for(int i=0; i<deck.cards.length; i++)
			System.out.print(deck.cards[i]+",");
		System.out.println();
		System.out.println(deck.pick(0));
			
	}

}
