package chap6;
/*	멤버메서드
 * 		클래스메서드
 * 		인스턴스메서드
 */
class Math2{
	long a,b; //인스턴스 변수 (객체화가 필요(객체화가 되어야 메모리 할당))
	long add(){return a+b;} // 인스턴스메서드(객체화 필요)
	//클래스메서드 :객체화 필요 없음 클래스명.메서드명(.
	static long add(long x,long y){ 
		return x + y; 
	}
}
public class MathEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math2.add(100L, 200L));
		Math2 math = new Math2();
		math.a = 10;
		math.b = 20;
		System.out.println(math.add());
	}

}
