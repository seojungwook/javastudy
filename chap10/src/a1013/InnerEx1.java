package a1013;
/*
 * 내부 클래스 예제
 * 	1. 클래스 내부에 존재하는 클래스(클래스안의 클래스)
 * 	2. 참조자료형, 객체화 가능, Object의 하위클래스,
 * 	   멤버(생성자)도 소유함
 * 	3. 외부클래스의 멤버임. 외부클래스의 private멤버에 접근가능
 * 	내부 클래스의 종류
 * 	1. static 내부클래스 : static 멤버를 소유
 * 	2. instance 내부클래스 : static 멤버는 상수만가능
 * 	3. local 내부클래스 : method 내부에서 선언된 내부클래스
 * 						  method에서만 사용가능
 * 	4. 이름없는 내부클래스 : awt(GUI) 에서 다시 설명
 * 							 이벤트처리에 사용됨
 */
public class InnerEx1 { //외부클래스
	class InstanceInner{ //인스턴스내부클래스
		int iv =100;
		//static int cv = 10; //static멤버(클래스멤버) 소유불가능
		final static int MAX = 100; //단, 상수는 가능
									//cf. 상수풀에 만들어짐
	}
	static class StaticInner{ //static 내부클래스(static쓰고싶으면)
		int iv = 200;
		static int cv = 300;
	}
	void method(){
		class LocalInner{ //지역내부클래스 :선언된 메서드내에서만 접근 가능
			int iv = 300;
			final static int MAX =100; //상수가능
		}
		LocalInner ll= new LocalInner();
		System.out.println(ll.iv);
		System.out.println(LocalInner.MAX);

	}
	void method2(){
	//	LocalInner ll = new LocalInner(); //LocalInner()가 지역내부클래스에 
											//선언되었기에 여기선 사용불가
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerEx1 in = new InnerEx1();
		in.method(); //method()함수로 가서 그 함수를 객체화 //300 
															//100
		System.out.println(InstanceInner.MAX); //100 //상수라서 가능
		System.out.println(StaticInner.cv); //300
		StaticInner si = new StaticInner();
		System.out.println(si.iv); //200
		InstanceInner ii = in.new InstanceInner(); //인스턴스멤버 //외부클래스가 먼저 객체화되어야(in.)
		System.out.println(ii.iv);
	}

}
