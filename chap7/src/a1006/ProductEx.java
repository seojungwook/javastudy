package a1006;
/*281p
 * Buyer�� ���� ������ ������ǰ(Product)�� �緯 ��.
 * Tv, Audio, Computer�� Product Ÿ������ ����ȯ�� ������
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
	Product[] cart = new Product[5]; //�ּҰ� �����Ϸ��� īƮ �迭 ����
	int index; 
	void buy (Product p){
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+ " ����");
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
		System.out.println("�� ��ǰ���ž� : "+ sum);
		System.out.println("���Ź�ǰ ��� : "+itemList);
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
		System.out.println("������ �ܾ� :" + b.money);
		System.out.println("���� ����Ʈ :" + b.bonusPoint);
		b.summary();
	}

}
