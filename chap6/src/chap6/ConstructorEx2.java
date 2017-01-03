package chap6;
/*
 * 생성자 오버로딩 및 생성자 사용
 */

class Card2{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
	Card2(){
		kind = "Spade";
		number = 1;
	}
	Card2(String k, int n){
		kind = k;
		number = n;
	}
	public Card2(int a){
		kind = "Spade";	
		number = a;
	}
	public Card2(String k){
		kind = k;
		number =1;
	}
	
}
public class ConstructorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card2 c1 = new Card2();
		System.out.println("c1 : " +c1.kind + ","+c1.number);
		Card2 c2 = new Card2("Heart",1);
		System.out.println("c2 : " +c2.kind + ","+c2.number);
		Card2 c3 = new Card2(10);
		System.out.println("c3 : " +c3.kind + ","+c3.number);
		//결과 : c3 : Spade, 10
		Card2 c4 = new Card2("Clover");
		System.out.println("c4 : " +c4.kind + ","+c4.number);
	}

}
