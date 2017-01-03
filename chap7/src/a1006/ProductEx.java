package a1006;
/*281p
 * Buyer가 돈을 가지고 전자제품(Product)을 사러 감.
 * Tv, Audio, Computer를 Product 타입으로 형변환이 가능함
 */
class Product {
	int price;
	int bonusPoint;
	Product(int price){
		this.price = price;
		this.bonusPoint = price/10;
	}
}
class Tv extends Product {
	Tv() { super(100);}
	public String toString(){
		return "Tv";
	}
}
class Audio extends Product{
	Audio() { super(50); }
	public String toString(){
		return "Audio";
	}
}
class Computer extends Product{
	Computer(){super(200);}
	public String toString(){
		return "Computer";
	}
}
class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] cart = new Product[5]; //주소값 저장하려고 카트 배열 선언
	int index; 
	void buy (Product p){
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+ " 구입");
		cart[index++] = p;
	}
	void summary(){
		int sum = 0;
		String itemList= "";
		for(Product p : cart){
			if(p == null) break;
			sum += p.price;
			itemList += p + ",";
		}
		System.out.println("총 물품구매액 : "+ sum);
		System.out.println("구매물품 목록 : "+itemList);
	}
}
public class ProductEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b =new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio aud = new Audio();
		b.buy(tv);b.buy(com);b.buy(aud);
		System.out.println("구매후 잔액 :" + b.money);
		System.out.println("보유 포인트 :" + b.bonusPoint);
		b.summary();
	}

}
