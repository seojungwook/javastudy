package a1013;
/*
 * Math클래스 : 수치계산 관련 메서드들의 모임
 * 	final 클래스이고, 객체생성불가(생성자의 접근제어자 private)
 * 	=> 모든 멤버가 static 이므로 Math.멤버명 호출가능
 * 	상수멤버가 존재
 * 	PI : 원주율
 * 	E  : 자연로그
 */
public class MathEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//삼각함수
		//각도의 단위가 도가 아니고 라디안 단위
		System.out.println(Math.sin(Math.PI/2));  //1.0
		System.out.println(Math.toDegrees(Math.PI/2));  //90.0
		System.out.println(Math.toRadians(60));  //1.0471975511965976
		System.out.println(Math.cos(Math.toRadians(60))); //0.5000000000000001
		
		System.out.println(Math.log(Math.E)); //1
		System.out.println(Math.sqrt(25)); //5
		//근사정수
		System.out.println(Math.ceil(3.4)); //나보다 큰 근사정수 //4.0 (double)
		System.out.println(Math.ceil(-3.4)); // -3.0
		System.out.println(Math.floor(3.4)); //나보다 작은 근사정수 //3.0
		System.out.println(Math.floor(-3.4)); //-4.0
		System.out.println(Math.rint(3.4)); // 나랑 가까운 정수 // 3.0
		System.out.println(Math.rint(-3.4)); // -3.0
		//제곱
		System.out.println(Math.pow(2, 3)); //8
		//반올림
		System.out.println(Math.round(3.7)); //4
		System.out.println(Math.round(-3.7)); //-4
		//절대값
		System.out.println(Math.abs(-3.4)); //3.4
		//큰값, 작은값
		System.out.println(Math.max(10, 20)); //20
		System.out.println(Math.min(10, 20)); //10
		
	}
}
