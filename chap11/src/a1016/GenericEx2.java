package a1016;
class GenEx1{
	String msg = "GenEx1";
	String getMsg(){
		return msg;
	}
}
class GenEx2 extends GenEx1{
	String msg = "GenEx2";
	String getMsg(){
		return msg;
	}
}
class GenEx3 extends GenEx2{
	String msg = "GenEx3";
	String getMsg(){
		return msg;
	}
}
public class GenericEx2<T> {
	T v;
	GenericEx2(T n){ v = n;}
	void set(T n){ v = n;}
	T get(){ return v; }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenEx3 g3 = new GenEx3();
		/*
		 * <? super GenEx2> : GenEx2 클래스 부모객체 지정
		 */
		GenericEx2<? super GenEx2> g2 = new GenericEx2<GenEx1>(g3); //GenEx1의 모든 객체를 g3으로?
		GenEx3 test = (GenEx3)g2.get();
		Object test2 = g2.get();
		System.out.println("결과 :" + test.msg);       //결과 :GenEx3
		System.out.println("결과 :"+ test.getMsg());   //결과 :GenEx3
		/*
		 * <? extends GenEx2> : GenEx2 클래스 자손클래스의 타입으로 지정
		 */
		GenericEx2<? extends GenEx2> g4 = new GenericEx2<GenEx3>(g3);
		GenEx2 test3= g4.get();		//GenEx3 객체
		GenEx3 test4 = (GenEx3)g4.get();
		System.out.println("결과 :" + test3.msg);	//결과 GenEx2 
		System.out.println("결과 :"+ test3.getMsg()); //결과 GenEx3 //최종 오버라이딩된것이 호출
		System.out.println("결과 :" + test4.msg);	//결과 :GenEx3
		System.out.println("결과 :"+ test4.getMsg());	//결과 :GenEx3
		//<?> : 모든 타입 가능 
		GenericEx2<?> g5 = new GenericEx2<GenEx3>(g3);
		Object test5 = g5.get(); //모든타입이기에
	}

}
