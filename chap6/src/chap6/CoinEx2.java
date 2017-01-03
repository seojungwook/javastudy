package chap6;
/*6�� �������� Ǯ��.
 * 
 * 
 * �ڽ����� : 
 * 1. ���� Coin Ŭ������ �̿��Ͽ� �ΰ��� ���� ��ü�� ����, 
 * 		���� ���� ���� "�ո�"�� ���� ������ �¸��ϴ� ���α׷��� �ۼ��ض�
 * 		�� ������� ��� �� ������ ��⸦ �̱� ������ ����Ѵ�. 
 * 		������ ���� ������ �� ����� ����϶�
 * 
 * 	���ڿ� �� :
 * 		coin.side.equals("�ո�")
 */
class Coin1{
	String side;
	Coin1(){
		this("�ո�");
	}
	Coin1(String side){
		this.side=side;
	}
	void flip(){
		this.side //this �ᵵ �ǰ� �Ƚ�� �������
		=((int)(Math.random()*2)==0)?"�ո�":"�޸�"; 
	}
}
public class CoinEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt1 = 0, cnt2 = 0;
		Coin c1 = new Coin();
		Coin c2 = new Coin();
		while(true){
			c1.flip();
			c2.flip();
			System.out.println("���� 1 :"+ c1.side + ", ���� 2 : "+ c2.side);
			if(c1.side.equals("�ո�")) cnt1++;
			else cnt1 = 0;
			if(c2.side.equals("�ո�")) cnt2++;
			else cnt2 = 0;
			if(cnt1 ==3 || cnt2 ==3) break;
		}
		if(cnt1==3 && cnt2 ==3)
			System.out.println("�����ϴ�");
		else if(cnt1 ==3)
			System.out.println("���� 1 �¸�");
		else 
			System.out.println("���� 2 �¸�");
	}

}
