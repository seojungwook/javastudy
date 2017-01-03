package chap5;
/*
 * 배열 정리
 * 1. 1차원 배열의 참조변수의 선언
 * 		int[] arr;
 * 2. 배열 객체를 생성
 * 		arr = new int[10]; //int변수를 10개 할당해서 arr 참조변수로 참조함
 * 		int[] arr = new int[10];
 * 3. 배열 초기화하기
 * 		(1) 첨자(index)사용하기
 * 			arr[0]=10;
 * 		(2) 선언시에 초기화
 * 			int [] arr = {10,20,30};
 * 		(3)	참조변수에 초기화
 * 			arr = new int[]{10,20,30};
 * 4. 2차원(다차원)은 1(n-1)차원배열의 참조변수의 배열
 * 5. 가변배열 : 동적으로 배열 객체를 생성함
 * 
 * java 인터프리터
 * 1. JVM 환경설정
 * 2. 바이트코드 검증, 로드
 * 3. main 메서드 실행
 * 
 * command line 에서 값 입력하기
 */
public class ArrayEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(args.length);
		for(int i=0; i<args.length; i++)
			System.out.println("args[" + i + "]=" + args[i]);
		
		
	}

}
