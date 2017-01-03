package chap4;
/*
 *  1부터 100까지의 합을 구하기
 */
public class LoopEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for문을 이용하기
		int i, sum=0;
		System.out.print("for문  : 1~100까지의 합 : ");
		for(i=1;i<=100;i++){
			sum += i;
		}
		System.out.println(sum);
		sum = 0;
		i=1;
		
		System.out.print("while문 : 1~100까지의 합 : ");
		while(i<=100){
			sum += i;
			i++;
		}
		System.out.println(sum);
		sum = 0;
		i=1;
		System.out.print("do while문 : 1~100까지의 합 : ");
		do{
			sum +=i;
			i++;
		}while(i<=100);
		System.out.println(sum);
		
		
		System.out.print("for문  : 1~100까지의 짝수의 합 : ");
		sum = 0;
		for(i=2;i<=100;i++){
			if(i%2==0){
				sum += i;
			}
		}
		System.out.println(sum);
		
		System.out.print("for문  : 1~100까지의 홀수의 합 : ");
		sum = 0;
		for(i=1;i<=100;i++){
			if(i%2==1){
				sum += i;
			}
		}
		System.out.println(sum);
		//문제 : 1부터 100까지 수 중 2의 배수도 아니고 3의 배수도 아닌 수의 합
		System.out.print("1부터 100까지 수 중 2의 배수도 아니고 3의 배수도 아닌 수의 합 : ");
		sum =0;
		for(i=1;i<=100;i++){
			if(i%2!=0 && i%3!=0 )
				sum+=i;
		}
		System.out.println(sum);
		
		System.out.print("1부터 100까지 수 중 2의 배수도 아니고 3의 배수도 아닌 수의 합 : ");
		sum=0;
		for(i=1;i<=100;i++){
			if(i%2==0) continue;
			if(i%3==0) continue;
			sum+= i;
		}
		System.out.println(sum);
	}
}
		


