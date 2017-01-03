package chap4;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, i=-1, j=-1;
		while(true){
			sum+=i*j;
			j*=-1;
			i++;
			if(sum>=100) {
				System.out.println("i=" +i);
				System.out.println("sum=" +sum);
				break;
				
			}
		}
		/*int sum=0, i=1;
		while(sum<=100){
			if(i%2!=0) sum+=i;
			else sum-=i;
			i++;
		}
		System.out.println(i);
		System.out.println(sum);*/
	
		
	}

}
