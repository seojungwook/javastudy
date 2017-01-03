package a1006;

/*
 * 1. 모든 식료품(Food)는 가격(price)과 판매개수(sellcnt),
 * 	 보너스포인트(point)를 가지고 있습니다. 식료품 객체를 생성하기 위해서는 가격을 입력받아야 합니다.
 * 식료품의 종류로는 과일(Fruit), 음료(Drink), 과자(Snack)으로 나누어진다.
 * 	과일은 당도(brix)를, 음료는 용량(m1)를 과자는 무게(gram) 정보를 가지고 있습니다.
 * 과일에는 사과(Apple)과 복숭아(Peach)
 * 음료에는 콜라(Cock) 사이다(Sidar)
 * 과자는 비스킷(Biscuit)과 쿠키(Cookie)가 있습니다.
 * 사과 복숭아는 가격과 당도를 입력하여 객체를 생성하고, 콜라, 사이다는 가격, 용량을 
 * 과자는 가격, 무게를 입력하여 객체를 생성합니다.
 * 
 * 2. 식료품을 사러 시장에 갑니다. 
 * 고객은 돈과 장바구니를 가지고 갑니다.
 * 고객클래스 Buyer2
 * 돈 : money
 * 포인트 : point
 * 장바구니 : Food[] cart
 * 총구매개수 :cnt
 * 구입기능 : void buy(Food){...}
 * 			물건을 살때마다 가격만큼 보유금액에서 차감되고, 
 * 			식료품의 포인트만큼 포인트가 증가된다.
 * 			어떤 물건을 쌋는지 물품명과 가격, 판매 누적액을 화면에 출력하고,
 * 			객체의 구매개수가 증가된다. 장바구니에 해당 물건을 넣는다.
 * 			만약 돈이 부족하면 "잔액 부족"이라고 출력하고, 구매를 종료한다.
 * 확인기능 : summary() {}
 * 			cart에 있는 물품의 종류별 개수와 금액을 출력합니다.
 * 			총 구매 개수와 금액을 출력한다.
 */
class Food{
	int price;
	int sellcnt;
	int point;
	Food(int price){
		this.price = price;
		this.point = price/10;
	}
}

class Fruit extends Food{
	int brix;
	Fruit(int price, int brix){
		super(price);
		this.brix = brix;
		}
}

class Apple extends Fruit{
	Apple(int price, int brix){
		super(price, brix);
		
	}
	public String toString(){
		return "사과";
	}
}
class Peach extends Fruit{
	Peach(int price, int brix){
		super(price, brix);
	}
	public String toString(){
		return "복숭아";
	}
}
class Drink extends Food{
	int ml;
	Drink(int price, int ml){
		super(price);
		this.ml = ml;
		}
}

class Cock extends Drink{
	Cock(int price, int ml){
		super(price, ml);
	}
	public String toString(){
		return "콜라";
	}
}
class Sidar extends Drink{
	Sidar(int price, int ml){
		super(price, ml);
	}
	public String toString(){
		return "사이다";
	}
}

class Snack extends Food{
	int gram;
	Snack(int price, int gram){
		super(price);
		this.gram = gram;
	}
}

class Biscuit extends Snack{
	Biscuit(int price, int gram){
		super(price, gram);
	}
	public String toString(){
		return "비스킷";
	}
}
class Cookie extends Snack{
	Cookie(int price, int gram){
		super(price, gram);
	}
	public String toString(){
		return "쿠키";
	}
}
class Buyer2{
	int money= 10000;
	int point=0;
	Food cart[]= new Food[50];
	int cnt;
	
	 
	void buy (Food f){
		if (money<f.price){
			System.out.println("잔액이 부족합니다." + f + "을 구매 못했습니다.");
			return;
		}
		money -= f.price;
	
		point += f.point;
		f.sellcnt++;
		
		System.out.println(f+ "("+f.price+"원), " + "판매개수 : " +f.sellcnt);
		cart[cnt++] = f;
		
	}
	void summary(){
		int fruitcnt = 0, drinkcnt = 0, snackcnt = 0;
		int totAmt = 0;
		String fruitItem= "";
		String drinkItem= "";
		String snackItem= "";
	
		for(Food f : cart){
			if(f == null) break;
			totAmt+=f.price;
			if(f instanceof Fruit){
				fruitcnt++;
				fruitItem += f + " ";
			}
			if(f instanceof Drink){
				drinkcnt++;
				drinkItem += f + " ";
			}
			if(f instanceof Snack){
				snackcnt++;
				snackItem += f + " ";
			}
			
			//itemList += p + "  ";
		}
		System.out.println("총 물품구매액 : "+totAmt + " 포인트 : " +point);
		System.out.println("총 구매 개수 : "+ cnt);
		
		System.out.println("구매물품 목록 : "+fruitcnt+ " => 과일 목록 :"+ fruitItem );
		System.out.println("구매물품 목록 : "+drinkcnt+ " => 음료 목록 :"+ drinkItem);
		System.out.println("구매물품 목록 : "+snackcnt+ " => 스낵 목록 :"+ snackItem);
		System.out.println("총 구매 목록 :"+fruitItem + " " + drinkItem + " "+ snackItem);
		System.out.println("남은 잔액 : " + money );
	} 
}
public class Supermarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer2 b= new Buyer2();
		Apple apple = new Apple(1000, 15);
		Peach peach = new Peach(2000, 11);
		Cock cock = new Cock(1000, 15);
		Sidar sidar = new Sidar(1000, 15);
		Biscuit biscuit = new Biscuit(1000, 15);
		Cookie cookie = new Cookie(1000, 15);
		
		b.buy(apple); b.buy(apple);  b.buy(peach);
		 b.buy(cock);  b.buy(sidar);  b.buy(apple);
		 b.buy(cookie); b.buy(biscuit);
		 
		b.summary();
	}

}
