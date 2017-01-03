package test;
/*class Exercise6_23{
	
	
	int max(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(i>j) max=i;
			}
		}
	}
}*/

public class Test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 :"+max(data));
		System.out.println("최대값 :"+max(null));
		System.out.println("최대값 :"+max(new int[]{}));
	}

	private static int max(int[] arr) {
		// TODO Auto-generated method stub
		
	if(arr==null) return -999999;
	if(arr.length == 0) return -999999;
	//if(arr==null||arr.length == 0) return -999999; //null이 있으면  무조건 null 먼저써야 돼
	int max = 0;
	for(int d : arr)
	//for(int d = 0; d<arr.length; d++)
		if(max<d)max =d;

	return max;
		
	}

}
