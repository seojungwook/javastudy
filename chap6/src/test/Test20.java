package test;

/*class Exercise6_20{
	Exercise6_20(){
		
	}
	
	int[] shuffle(int[] original){
		for(int i=0; i<original.length; i++){
			int num = (int)(Math.random()*10)+1;
				original[i]= num;
		}
		return original;
		
		/*	for(int i=0; i<1000;i++){
			for(int j=0; j<100;j++){
			int num= original[i];
			original[i] = original[j];
			original[j] = num;
			}
		}return i;
	}
		
}*/

public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}



private static int[] shuffle(int[] original){
	for(int i=0; i<20; i++){
		int a = (int)(Math.random()*9);
		int b = (int)(Math.random()*9);
		int t = original[a];
		original[a] =original[b];
		original[b]=t;
		}
	return original;
	}
}
