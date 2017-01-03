package chap5;

/*
 * 5-6�� ������ ������ �߰��� ���α׷�. Ŀ�ǵ�������κ��� �Ž��� �� �ݾ��� �Ϸ¹޾� ���. ������ ������ ������ �Ž������� ������ �� ������ '�����ϴ�'���
 *  ����ϰ� ����. ������ ���� ������, �Ž��ҵ��� ������ ��ŭ ���������� ���� ���� ������ ������ ȭ�鿡 ���.
 */
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=1){
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		//3170���� ���������� (���ڿ��� ���ڷ� ��ȯ
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
			
			System.out.println(coinUnit[i] + "��: "+coinNum);
			
		}
		
		if(money>0){
			System.out.println("�Ž������� �����մϴ�");
			System.exit(0);
		}
		
		System.out.println("=���� ������ ���� =");
		
		for(int i =0;i<coinUnit.length;i++){
			System.out.println(coinUnit[i]+"��:"+coin[i]);
		}
	}

}
