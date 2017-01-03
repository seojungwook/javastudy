package a1014;


import java.util.ArrayList;
import java.util.List;

/*
 * 상점(Mart)에 있는 가전제품 중
 * TV, Computer, Audio가 있습니다
 * 그 중 Tv가 판매가 되면 상점의 물품 목록에서 제거 됩니다.
 * 고객이 반품을 하면 다시 물건 목록에 추가 됩니다.
 * 다음 클래스를 작성하시오.
 * 
 * 클래스 : Product
 * 		멤버변수 : String name : 가전제품명
 * 					int price : 가격
 * 					int point : 포인트
 * 		생성자 : (name, price) 두개의 변수를 초기화 필요
 * 				point는 가격의 5%로 한다.
 * 				단 소숫점 이하 버림 
 * 클래스 Mart
 * 	멤버변수 : List items : 판매대에 있는 가전제품 목록
 * 	Mart 생성시 세개의 제품을 초기 목록으로 가지고 있음
 * 	멤버메서드 : 
 * 		sell(Product) : 물건을 판매
 * 			기능 : 가전제품 목록에서 해당 물품이 제거됨
 * 				list.contains(Object obj) 메서드로 확인
 * 			매개변수 : Product
 * 			리턴타입 : void
 * 		refund(Product) : 물건이 반품됨
 * 			기능 : 가전제품 목록에 해당 물품이 추가됨
 * 			매개변수 : Product
 * 			리턴타입 : void
 * 		list() : 현재 보유중인 목록을 출력
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
			System.out.println(p + " 판매완료");
			
		}else {
			System.out.println("판매물품이 아닙니다.");
		}
	}
	void refund(Product p){
		
		items.add(p);
		System.out.println(p + "가 반납되었습니다");
		}
	void list(){
		System.out.println("제품목록 : " + items);
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
