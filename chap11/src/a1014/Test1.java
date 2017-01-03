package a1014;
/*
 * 서로 다른 9개의 자연수
 * 3, 29, 38, 12, 57, 74, 40, 85, 61
 * 이들 중 최대값은 85이고 이 값은 8번째 수이다.
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 29, 38, 12, 57, 74, 40, 85, 61};
		int max =0;
		
		for(int i=0; i<arr.length;i++){
		
			if(max < arr[i]){
				max = arr[i];
				
			}
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i]==max){
				System.out.println("이들 중 최대값은 "+ max + "이고 이값은 "+ (i+1) + "번째 수이다");
				break;
			}
		}
		
		
	}

}
