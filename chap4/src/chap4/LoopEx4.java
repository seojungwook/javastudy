package chap4;
/*
 *  ��ø �ݺ��� : �ݺ��� ���� �ݺ����� ������
 *  break : break�� ���� �ݺ���, switch�� ���
 *  continue : continue�� ���� �ݺ����� ������ ��� �̵�
 */
public class LoopEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=2; i<=9; i++){
			System.out.println("\n" + i + "��");
			for(j=2; j<=9;j++){
				//if(j==5)break;
				if(j==5) continue;
				System.out.println(i + " * " + j + " = " + (i*j));
				
			}
		}
	}
}
