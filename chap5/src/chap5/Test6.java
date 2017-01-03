package chap5;
/*
 * 거스름돈을 몇 개의 동전으로 지불할 수 있는지 계산하는 문제
 * 변수 money의 금액을 동전으로 바꾸었을 때 각각 몇개의 동전이 필요한지 계산해서 출력
 * 단, 가능한 한 적은 수의 동전으로 거슬러 주어야 한다.
 * 
 */
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2780;
		System.out.println("money=" + money);
		
		for(int i=0; i<coinUnit.length;i++){
		/*	int num= money;
			num/=coinUnit[i];
			money%=coinUnit[i];
			System.out.println(coinUnit[i]+"원 : "+ num);*/
			
			System.out.println(coinUnit[i]+"원 : "+money/coinUnit[i]);
			money%=coinUnit[i];
		}
	}

}
