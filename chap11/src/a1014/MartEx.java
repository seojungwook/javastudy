package a1014;


import java.util.ArrayList;
import java.util.List;

/*
 * ����(Mart)�� �ִ� ������ǰ ��
 * TV, Computer, Audio�� �ֽ��ϴ�
 * �� �� Tv�� �ǸŰ� �Ǹ� ������ ��ǰ ��Ͽ��� ���� �˴ϴ�.
 * ���� ��ǰ�� �ϸ� �ٽ� ���� ��Ͽ� �߰� �˴ϴ�.
 * ���� Ŭ������ �ۼ��Ͻÿ�.
 * 
 * Ŭ���� : Product
 * 		������� : String name : ������ǰ��
 * 					int price : ����
 * 					int point : ����Ʈ
 * 		������ : (name, price) �ΰ��� ������ �ʱ�ȭ �ʿ�
 * 				point�� ������ 5%�� �Ѵ�.
 * 				�� �Ҽ��� ���� ���� 
 * Ŭ���� Mart
 * 	������� : List items : �ǸŴ뿡 �ִ� ������ǰ ���
 * 	Mart ������ ������ ��ǰ�� �ʱ� ������� ������ ����
 * 	����޼��� : 
 * 		sell(Product) : ������ �Ǹ�
 * 			��� : ������ǰ ��Ͽ��� �ش� ��ǰ�� ���ŵ�
 * 				list.contains(Object obj) �޼���� Ȯ��
 * 			�Ű����� : Product
 * 			����Ÿ�� : void
 * 		refund(Product) : ������ ��ǰ��
 * 			��� : ������ǰ ��Ͽ� �ش� ��ǰ�� �߰���
 * 			�Ű����� : Product
 * 			����Ÿ�� : void
 * 		list() : ���� �������� ����� ���
 */

class Product{
	String name;
	int price;
	int point;
	Product(String name, int price){
		this.name=name;
		this.price = price;
		point = (int) (price*0.05);
	}
	@Override
	public String toString() {
		return name + " " + price ;
	}
}
class Mart {
	List items = new ArrayList();
	Mart(){
		items.add(new Product("TV",100));
		items.add(new Product("Computer",200));
		items.add(new Product("Audio",50));
	}
	void sell(Product p){
		if(items.contains(p)) {
			items.remove(p);
			System.out.println(p + " �ǸſϷ�");
			
		}else {
			System.out.println("�ǸŹ�ǰ�� �ƴմϴ�.");
		}
	}
	void refund(Product p){
		
		items.add(p);
		System.out.println(p + "�� �ݳ��Ǿ����ϴ�");
		}
	void list(){
		System.out.println("��ǰ��� : " + items);
		}
}
public class MartEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mart mart = new Mart();
		mart.list();
		Object tv= mart.items.get(0);
		mart.sell((Product)tv);
		mart.list();
		mart.sell((Product)mart.items.get(0));
		mart.list();
		mart.sell((Product)mart.items.get(0));
		mart.list();
		mart.refund((Product)tv);
		mart.refund(new Product("Computer",200));
		mart.list();
	}

}
