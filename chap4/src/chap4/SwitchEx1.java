package chap4;
/*
 * switch ���� ����
 * 	switch(���ǰ�){
 * 		case ��1 : ����1��;
 * 		case ��2 : ����2��;
 * 		...
 * 		default : ����n��;
 * }
 * 	break : �ش� switch������ ���
 * 	���ǰ����� ����� ������ �ڷ����� byte, short, int, char, String(jdk 7.0����) �� �����ϴ�.
 * 	
 * 	��� switch ������ if�� ���氡���ϴ�.
 * 	������ ��� if���� switch �������� ���� �Ǵ� ���� �ƴϴ�.
 */
public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 100;
		switch(score/10){
		case 10:
		case 9 : System.out.println("A����");
			break;
		case 8 : System.out.println("B����");
			break;
		case 7 : System.out.println("C����");
			break;
		case 6 : System.out.println("D����");
			break;
		default : System.out.println("F����");
			break;
		}
	}

}
