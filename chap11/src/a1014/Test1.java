package a1014;
/*
 * ���� �ٸ� 9���� �ڿ���
 * 3, 29, 38, 12, 57, 74, 40, 85, 61
 * �̵� �� �ִ밪�� 85�̰� �� ���� 8��° ���̴�.
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 29, 38, 12, 57, 74, 40, 85, 61};
		int max =0;
		
		for(int i=0; i<arr.length;i++){
		
			if(max < arr[i]){
				max = arr[i];
				
			}
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i]==max){
				System.out.println("�̵� �� �ִ밪�� "+ max + "�̰� �̰��� "+ (i+1) + "��° ���̴�");
				break;
			}
		}
		
		
	}

}
