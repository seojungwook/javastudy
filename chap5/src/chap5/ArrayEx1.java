package chap5;
//배열 예제 1

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 배열의 선언 : 참조변수 선언
	//	int arr[];
		//2. 배열의 생성 : 배열 객체 생성
	//	arr = new int[5];
		//1 + 2
		int arr[] = new int[5];
		
		/*
		 * new의 기능
		 * 1. 메모리 할당
		 * 2.각 방을  기본값으로 초기화
		 * 		숫자 : 0
		 * 		문자 : null
		 * 		boolean : false 
		 */
		//3. 배열의 사용
		arr[0] =10;
		arr[1] = 20;
		arr[2] = arr[0] + arr[1];
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}

}
