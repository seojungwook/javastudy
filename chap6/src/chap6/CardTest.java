package chap6;
/*
 * ���� ��ġ�� ���� ������ ����
 * Ŭ��������    : Ŭ�������� ����, static int cv;
 * 			 Ŭ�������� �޸𸮿� �ε�� ���� �Ҵ�
 * 			 Ŭ������.������ �����ؾ� ��
 * 			 �޸��Ҵ���ġ : Ŭ���� ����(�޼��� ����)
 * 			 Ŭ������ ��� ��ü�� ���뺯���� ����
 * �ν��Ͻ����� : Ŭ�������� ����, int iv;
 * 			 ��üȭ�� ������ �Ҵ�
 * 			 ����������.������ �����ؾ���
 * 			 �޸��Ҵ���ġ : ������
 * ��������       : �޼��峻�� ����, int lv;
 * (�Ű���������) ������ ���� ����� �޸� �Ҵ�
 * 	ex)args	   ������ �����ؾ���
 * 			   �޸��Ҵ���ġ : ���ÿ���(�ݽ���)
 * 			   �ݵ�� �ʱ�ȭ �Ǿ�� ��.
 * 
 */

class Card{
	String kind; //�ν��Ͻ� ����
	int number; // �ν��Ͻ�����
	static int width= 100; //Ŭ��������
	static int height = 250; //Ŭ��������
	//toString():��ü�� ���ڿ�ȭ�� �����ϴ� �޼���
	public String toString(){
		return kind + ":" + number + "(" + width + "," +height + ")";
	}
}
public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ī��ũ�� : "+ Card.width+ ","+ Card.height);
		//c1 :��������
		Card c1 = new Card(); 
		c1.kind= "Heart";
		c1.number = 7;
		//c1 : c1.toString()�޼��尡 ȣ��, c1�� �ᵵ ����
		System.out.println("c1ī��:" +c1.toString());
		//c2 : ��������
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 1;
		System.out.println("c2ī��:" +c2.toString());
		System.out.println("c2ī���� ũ�� ����");
		c2.width =50;
		c2.height = 80;
		System.out.println("c2ī��:" +c1.toString());
		System.out.println("c2ī��:" +c2.toString());
		
	}

}
