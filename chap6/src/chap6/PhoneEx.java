package chap6;
/*
 * ���� : 
 * 	��ȭ�� (Phone) Ŭ������ ���� Ŭ���� �����ϱ�
 * 	��ȭ�� (phone) Ŭ����
 * 		������� : ��ȭ��ȣ(phoneNo), serialNo,
 * 				static int sno
 * 		����޼���(���) : ��ȭ�ɱ�(send(String telNo))
 * 					  ��ȭ�ޱ�(receive(String telNo))
 * ���� Ŭ����
 * ������
 * 	010-123-4567 : serialNo = 1
 * 	010-456-8901 : serialNo = 2
 * 	010-789-2345 : serialNo = 3
 * 	010-789-2345 ���� 010-456-8901�� ��ȭ �Ŵ� ��
 * 	010-789-2345���� 010-123-4567�κ��� ��ȭ ����
 */

class Phone{
	String phoneNo;
	int serialNo;
	static int sno;
	void send(String telNo){ System.out.println(phoneNo +" ����  "+ telNo+" �� ��ȭ �Ŵ� ��");}
	void receive(String telNo){System.out.println(phoneNo +" ����  "+ telNo+" �κ��� ��ȭ ����");}
}
public class PhoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1 = new Phone();
		p1.phoneNo = "010-123-4567";
		p1.serialNo = ++Phone.sno;
		System.out.println(p1.phoneNo + " : serialNo= "+ p1.serialNo);
		
		Phone p2 = new Phone();
		p2.phoneNo = "010-456-8901";
		p2.serialNo = ++Phone.sno;
		System.out.println(p2.phoneNo + " : serialNo= "+ p2.serialNo);
		
		Phone p3 = new Phone();
		p3.phoneNo = "010-789-2345";
		p3.serialNo = ++Phone.sno;
		System.out.println(p3.phoneNo + " : serialNo= "+ p3.serialNo);
		
		p3.send
		(p2.phoneNo); //Ŭ������ send ����޼��� String telNo���ٰ� p2.phoneNo�� �־��
		p3.receive(p1.phoneNo);
		/*
		p1.serialNo=1;
		p2.serialNo=2;
		p3.serialNo=3;
		
		
		System.out.println(p1.phoneNo + " : "+ "serialNo = "+ p1.serialNo);
		System.out.println(p2.phoneNo + " : "+ "serialNo = "+ p2.serialNo);
		System.out.println(p3.phoneNo + " : "+ "serialNo = "+ p3.serialNo);
		p3.send(p2.phoneNo);
		p3.receive(p1.phoneNo);*/
		
	}

}
