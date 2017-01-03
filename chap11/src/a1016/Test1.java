package a1016;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 77, 38, 41, 53, 92, 85};
		int m=0;
		for(int i=0; i<arr.length; i++){
			if(m < arr[i]){
				m = arr[i];
			}
		}
		int sum =0;
		int min =m;
			for(int i=0; i<arr.length; i++){
				if(arr[i]%2==1){
					sum += arr[i];
					if(min > arr[i]){
						min=arr[i];
				}
			}
		}
		System.out.print("합계 : " + sum + " 최소값 :" + min);
	} 
}
