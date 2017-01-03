package chap5;

/*
 * 5-6에 동전의 개수를 추가한 프로그램. 커맨드라인으로부터 거슬러 줄 금액을 일력받아 계산. 보유한 동전의 개수로 거스름돈을 지불할 수 없으면 '부족하다'라고
 *  출력하고 종료. 지불할 돈이 있으면, 거스롬돈을 지불한 만큼 가진돈에서 빼고 남은 동전의 개수를 화면에 출력.
 */
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=1){
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		//3170원을 정수형으로 (문자열을 숫자로 변환
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money="+money);
		
		int[] coinUnit = {500, 100, 50, 10};
		int[] coin = {5, 5, 5, 5};
		
		for(int i =0;i<coinUnit.length;i++){
			int coinNum = 0;
			
			coinNum = money/coinUnit[i];
			
			if(coin[i]<coinNum){
				coinNum=coin[i];
				coin[i]=0;
			}
			else coin[i] -= coinNum;
			
			money -= coinNum * coinUnit[i];
			
			System.out.println(coinUnit[i] + "원: "+coinNum);
			
		}
		
		if(money>0){
			System.out.println("거스름돈이 부족합니다");
			System.exit(0);
		}
		
		System.out.println("=남은 동전의 개수 =");
		
		for(int i =0;i<coinUnit.length;i++){
			System.out.println(coinUnit[i]+"원:"+coin[i]);
		}
	}

}
