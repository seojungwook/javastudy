package chap6;
/*
 * 1. ������ ǥ���ϴ� Coin Ŭ������ ����.
 * 	���� :������ ��(side)
 * 	�޼��� : flip() void Ÿ������
 * 		��� : ������ ���� ������ ���� �����Ѵ�.
 * 			  Math.random() �޼��带 �̿��Ͽ� ����
 * 	������ : ��ü ������ ������ ���� �Է��ؾ� �Ѵ�.
 * 			������ ���� �Էµ��� �ʴ� ���� �ո����� ���Ѵ�
 * 
 * 2. ����Ŭ���� CoinEx�� �ۼ��϶�.
 * 	   �� Ŭ������ main �޼��忡�� �ΰ��� ������ ����
 * 	   ���� ���� ���� ���� ���¸� ����϶�
 */
class Coin{
	String side;
	Coin(){
		this("�ո�");
	}
	Coin(String side){
		this.side=side;
	}
	void flip(){
		this.side //this �ᵵ �ǰ� �Ƚ�� �������
		=((int)(Math.random()*2)==0)?"�ո�":"�޸�"; 
	}
	
/*	int side;
	void flip(){ 
		side = (int)(Math.random()*2);
		System.out.println(side);
		if(side==0) 
		System.out.println("�ո��Դϴ�");
		else
		System.out.println("�޸��Դϴ�");
	}
	Coin(int c){
		
	}
	Coin(){
		side = 0;
		System.out.println(side);
		System.out.println("�ո��Դϴ�");
	}*/
}
public class CoinEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coin c1 = new Coin();
		System.out.println("c1 ������ ���� :" + c1.side);
		Coin c2 = new Coin("�޸�");
		System.out.println("c2 ������ ���� :" + c2.side);
		System.out.println("flip �� ��");
		c1.flip();
		c2.flip();
		System.out.println("c1 ������ ���� :" + c1.side);
		System.out.println("c2 ������ ���� :" + c2.side);
		
	}

}
