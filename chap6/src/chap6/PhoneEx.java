package chap6;
/*
 * 문제 : 
 * 	전화기 (Phone) 클래스와 구동 클래스 구현하기
 * 	전화기 (phone) 클래스
 * 		멤버변수 : 전화번호(phoneNo), serialNo,
 * 				static int sno
 * 		멤버메서드(기능) : 전화걸기(send(String telNo))
 * 					  전화받기(receive(String telNo))
 * 구동 클래스
 * 결과출력
 * 	010-123-4567 : serialNo = 1
 * 	010-456-8901 : serialNo = 2
 * 	010-789-2345 : serialNo = 3
 * 	010-789-2345 에서 010-456-8901로 전화 거는 중
 * 	010-789-2345에게 010-123-4567로부터 전화 왔음
 */

class Phone{
	String phoneNo;
	int serialNo;
	static int sno;
	void send(String telNo){ System.out.println(phoneNo +" 에서  "+ telNo+" 로 전화 거는 중");}
	void receive(String telNo){System.out.println(phoneNo +" 에게  "+ telNo+" 로부터 전화 왔음");}
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
		(p2.phoneNo); //클래스의 send 멤버메서드 String telNo에다가 p2.phoneNo을 넣어라
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
