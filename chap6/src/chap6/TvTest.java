package chap6;
/*
 * ���� 153p : ��ü������ ��� ����
 * 
 *  �߻�ȭ : Ŭ���� ���� ����
 *  		��ü�� �ְ����� �Ǵ����� �м��Ͽ�, �ʿ������� �����ϴ� ����
 *  	�Ӽ� : ����
 *  	��� : �޼���
 *  	------------���
 */
class Tv{	// Ŭ������ ����� ���� Ÿ��
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp(){++channel;}
	void channelDown(){--channel;}
}

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t;    //������������
		t = new Tv(); //��üȭ(�ν��Ͻ�ȭ)
		t.color = "����"; //t�� �����ϴ� ��ü�� ��� �� color�� "����"���ڿ� ����
		t.channel = 11; //t�� �����ϴ� ��ü�� ��� �� channel�� 11�� ����
		t.power = true;
		System.out.println(t.color +"," + t.channel + ","+ t.power);
		
		Tv t2= new Tv(); 
		/*
		 * new ������(��üȭ)
		 * 1. �������� �޸� �Ҵ�
		 * 2. ��������� �⺻������ �ʱ�ȭ
		 * 	  �⺻�� : ���� : 0, boolean : false
		 * 		     �׿� : null
		 * 3. ������ ȣ��
		 * 
		 */
		System.out.println(t.color +"," + t.channel + ","+ t.power);
		System.out.println(t2.color +"," + t2.channel + ","+ t2.power);
		t2 = t;
		/*
		 * �ϳ��� ��ü�� �������� ���������� ���� ����
		 * ������ �ϳ��� ���������� �ϳ��� ��ü�� ���� ����
		 */
		System.out.println(t2.color +"," + t2.channel + ","+ t2.power);
		t2.channelDown();
		System.out.println(t.color +"," + t.channel + ","+ t.power);
	}

}
