package chap6;
/*	181p 필기, 185p
 *  클래스 멤버와 인스턴스 멤버간의 호출 예제
 */
public class MemberCall {
	int iv =10; //인스턴스 변수
	static int cv = 20; //클래스 변수
	int iv2 = iv; //인스턴스 변수
	//static int cv2 = iv; //객체화가 되어야 에러가 안나
	static int cv2 = new MemberCall().iv;
	static void staticMethod1(){ //클래스 메서드
		System.out.println(cv);
		//System.out.println(iv);
		System.out.println(new MemberCall().iv);
	}
	void instanceMethod1(){
		System.out.println(cv); //클래스 변수는 이미 할당(객체화) 받았기에
		System.out.println(iv); //같은 인스턴스 멤버이기에
	}
	
	static void staticMethod2(){ //클래스 메서드
		staticMethod1(); 
		//instanceMethod1();
		new MemberCall().instanceMethod1();
	}
	
	void instanceMethod2(){
		staticMethod1();
		instanceMethod1();
	}
}
