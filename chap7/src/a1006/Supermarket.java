package a1006;

/*
 * 1. ��� �ķ�ǰ(Food)�� ����(price)�� �ǸŰ���(sellcnt),
 * 	 ���ʽ�����Ʈ(point)�� ������ �ֽ��ϴ�. �ķ�ǰ ��ü�� �����ϱ� ���ؼ��� ������ �Է¹޾ƾ� �մϴ�.
 * �ķ�ǰ�� �����δ� ����(Fruit), ����(Drink), ����(Snack)���� ����������.
 * 	������ �絵(brix)��, ����� �뷮(m1)�� ���ڴ� ����(gram) ������ ������ �ֽ��ϴ�.
 * ���Ͽ��� ���(Apple)�� ������(Peach)
 * ���ῡ�� �ݶ�(Cock) ���̴�(Sidar)
 * ���ڴ� ��Ŷ(Biscuit)�� ��Ű(Cookie)�� �ֽ��ϴ�.
 * ��� �����ƴ� ���ݰ� �絵�� �Է��Ͽ� ��ü�� �����ϰ�, �ݶ�, ���̴ٴ� ����, �뷮�� 
 * ���ڴ� ����, ���Ը� �Է��Ͽ� ��ü�� �����մϴ�.
 * 
 * 2. �ķ�ǰ�� �緯 ���忡 ���ϴ�. 
 * ���� ���� ��ٱ��ϸ� ������ ���ϴ�.
 * ��Ŭ���� Buyer2
 * �� : money
 * ����Ʈ : point
 * ��ٱ��� : Food[] cart
 * �ѱ��Ű��� :cnt
 * ���Ա�� : void buy(Food){...}
 * 			������ �춧���� ���ݸ�ŭ �����ݾ׿��� �����ǰ�, 
 * 			�ķ�ǰ�� ����Ʈ��ŭ ����Ʈ�� �����ȴ�.
 * 			� ������ ������ ��ǰ��� ����, �Ǹ� �������� ȭ�鿡 ����ϰ�,
 * 			��ü�� ���Ű����� �����ȴ�. ��ٱ��Ͽ� �ش� ������ �ִ´�.
 * 			���� ���� �����ϸ� "�ܾ� ����"�̶�� ����ϰ�, ���Ÿ� �����Ѵ�.
 * Ȯ�α�� : summary() {}
 * 			cart�� �ִ� ��ǰ�� ������ ������ �ݾ��� ����մϴ�.
 * 			�� ���� ������ �ݾ��� ����Ѵ�.
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
		return "���";
	}
}
class Peach extends Fruit{
	Peach(int price, int brix){
		super(price, brix);
	}
	public String toString(){
		return "������";
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
		return "�ݶ�";
	}
}
class Sidar extends Drink{
	Sidar(int price, int ml){
		super(price, ml);
	}
	public String toString(){
		return "���̴�";
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
		return "��Ŷ";
	}
}
class Cookie extends Snack{
	Cookie(int price, int gram){
		super(price, gram);
	}
	public String toString(){
		return "��Ű";
	}
}
class Buyer2{
	int money= 10000;
	int point=0;
	Food cart[]= new Food[50];
	int cnt;
	
	 
	void buy (Food f){
		if (money<f.price){
			System.out.println("�ܾ��� �����մϴ�." + f + "�� ���� ���߽��ϴ�.");
			return;
		}
		money -= f.price;
	
		point += f.point;
		f.sellcnt++;
		
		System.out.println(f+ "("+f.price+"��), " + "�ǸŰ��� : " +f.sellcnt);
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
		System.out.println("�� ��ǰ���ž� : "+totAmt + " ����Ʈ : " +point);
		System.out.println("�� ���� ���� : "+ cnt);
		
		System.out.println("���Ź�ǰ ��� : "+fruitcnt+ " => ���� ��� :"+ fruitItem );
		System.out.println("���Ź�ǰ ��� : "+drinkcnt+ " => ���� ��� :"+ drinkItem);
		System.out.println("���Ź�ǰ ��� : "+snackcnt+ " => ���� ��� :"+ snackItem);
		System.out.println("�� ���� ��� :"+fruitItem + " " + drinkItem + " "+ snackItem);
		System.out.println("���� �ܾ� : " + money );
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
