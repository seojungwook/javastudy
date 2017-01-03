package test;
/*�������� 6-1
 * SutdaCard Ŭ���� �����ϱ�
 * int num ī���� ����
 * boolean isKwang
 * 
 * 6-2
 * 
 */
class SutdaCard{
	int num;
	boolean isKwang;
	SutdaCard(){
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	String info(){
		return num + ((isKwang)?"K":"");
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info()); //3 
		System.out.println(card2.info()); //1K
	}

}
