package a1007;

class Product {
	int price;
	
	Product(int price){
		this.price = price;
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

class Buyer{
	int money= 1000;
	Product[] cart = new Product[3];
	int i =0;
	
	void buy(Product p){
		if (money<p.price){
			System.out.println("잔액이 부족합니다." + p + "을 구매 못했습니다.");
			return;
		}
		money -= p.price;
		add(p);
	}
	
	void add(Product p) {
		if(i>=cart.length){
			Product[] temp = new Product[cart.length *2];
			System.arraycopy(cart, 0, temp, 0, cart.length);
			for(int j=0; j<cart.length; j++){
		temp[j]= cart[j];
	}
			cart = temp;
		} 
		cart[i++] =p;
	}
	void summary(){
		String itemList = "";
		int totAmt = 0;
		for(int i=0; i<this.i; i++){
			itemList +=cart[i] + ",";
			totAmt += cart[i].price;
		}
		System.out.println("구입한 물건: " + itemList);
		System.out.println("사용한 금액: "+ totAmt);
		System.out.println("남은 금액 : "+ money);
	}
}	
public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b=new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b. summary();
	}

}
