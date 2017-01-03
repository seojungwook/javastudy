package chap5;

// 연습문제 137p
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};
		int sum =0;
		
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];	
		}
		
		//for(int i : arr)
		// sum += i;
		System.out.println("sum=" + sum);
	}

}
