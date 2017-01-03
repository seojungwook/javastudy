package a1013;
/*
 * 내부클래스 예제 2
 * 1. 내부클래스는 외부클래스의 멤버의 성격을 가진다.
 * 	  static 내부클래스는 클래스 멤버로 
 *    instance내부클래스는 인스턴스 멤버의 성격을 띤다.
 */
public class InnerEx2 {
	private int outeriv = 10;
	static int outercv = 20;
	class InstanceInner{
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	static class StaticInner{
		//int siv = outeriv;
		int siv = new InnerEx2().outeriv; //객체화 되어야 사용
		static int scv = outercv;
	} //static 내부클래스
	static StaticInner cv = new StaticInner();
	InstanceInner iv = new InstanceInner();
//	static InstanceInner cv2 = new InstanceInner(); //객체화해야 가능
	static void staticMethod(){
		StaticInner obj = new StaticInner();
		//외부클래스를 객체화시킨 후 내부클래스 객체화
		InstanceInner obj2 = new InnerEx2().new InstanceInner(); 
	}
	void instanceMethod(){
		StaticInner obj = new StaticInner();
		InstanceInner obj2 = new InstanceInner();
	}
	void method(int piv){
		//piv = 1000;
		int lv = 0; //지역변수
		final int LV = 30; //상수
		/*
		 * 원래는 지역내부클래스에서 외부메서드의 지역변수는 호출불가
		 * => jdk7.0이후에 상수화된다면(변경없음)면 접근 허가
		 */
		class LocalInner{ //지역내부클래스에서 외부클래스로 접근가능
			int liv = outeriv;
			int liv2 = outercv; //지역내부클래스에서 static로 접근가능
			int liv3 = lv; //상수화 되어야 한다.(어디서든 변경되면 안돼)
			int liv4 = LV;
			void method(){
			//	lv = 200; //상수화되어야하기에 이거면 에러
				System.out.println(piv + ","+LV);
				System.out.println(liv + "," + liv2 +","+liv3+","+liv4);
			}
			
		}
		LocalInner ll = new LocalInner();// 문제1 답 - 객체화가 필요하기에
		ll.method();					//	문제1 답
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제1 LocalInner 내부클래스의 method() 호출
		InnerEx2 in = new InnerEx2(); // 문제1답
		in.method(500); 				// 문제1 답
		//문제2 Instanceinner의 멤버변수의 값 출력하기
		InstanceInner ii = in.new InstanceInner(); //문제2
		System.out.println("instanceInner 클래스의 멤버 변수 :"+ii.iiv +","+ ii.iiv2);
		//문제3 Static의 멤버변수의 값 출력하기
		
		System.out.println("StaticInner 클래스의 멤버 변수 :"+
		new StaticInner().siv +","+ new StaticInner().scv);
	}

}
