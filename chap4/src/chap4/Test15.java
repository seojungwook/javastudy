package chap4;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 13231;
		int tmp = number;
		
		int result = 0;
		while(tmp !=0){
			result *= 10;
			result += tmp%10;
			tmp/=10;
			
		}
		if(number == result)
			System.out.println(number + "�� ȸ���� �Դϴ�.");
		else
			System.out.println(number + "�� ȸ������ �ƴմϴ�.");
	}

}
