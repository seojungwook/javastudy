package chap4;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int sum = 0;
		int tmp = num;
		while(tmp!=0){
			sum += tmp%10;
			tmp /= 10;
		}
		
		System.out.println("sum=" +sum);
	}

}
