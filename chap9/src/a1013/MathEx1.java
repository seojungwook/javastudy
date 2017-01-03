package a1013;
/*
 * MathŬ���� : ��ġ��� ���� �޼������ ����
 * 	final Ŭ�����̰�, ��ü�����Ұ�(�������� ���������� private)
 * 	=> ��� ����� static �̹Ƿ� Math.����� ȣ�Ⱑ��
 * 	�������� ����
 * 	PI : ������
 * 	E  : �ڿ��α�
 */
public class MathEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ﰢ�Լ�
		//������ ������ ���� �ƴϰ� ���� ����
		System.out.println(Math.sin(Math.PI/2));  //1.0
		System.out.println(Math.toDegrees(Math.PI/2));  //90.0
		System.out.println(Math.toRadians(60));  //1.0471975511965976
		System.out.println(Math.cos(Math.toRadians(60))); //0.5000000000000001
		
		System.out.println(Math.log(Math.E)); //1
		System.out.println(Math.sqrt(25)); //5
		//�ٻ�����
		System.out.println(Math.ceil(3.4)); //������ ū �ٻ����� //4.0 (double)
		System.out.println(Math.ceil(-3.4)); // -3.0
		System.out.println(Math.floor(3.4)); //������ ���� �ٻ����� //3.0
		System.out.println(Math.floor(-3.4)); //-4.0
		System.out.println(Math.rint(3.4)); // ���� ����� ���� // 3.0
		System.out.println(Math.rint(-3.4)); // -3.0
		//����
		System.out.println(Math.pow(2, 3)); //8
		//�ݿø�
		System.out.println(Math.round(3.7)); //4
		System.out.println(Math.round(-3.7)); //-4
		//���밪
		System.out.println(Math.abs(-3.4)); //3.4
		//ū��, ������
		System.out.println(Math.max(10, 20)); //20
		System.out.println(Math.min(10, 20)); //10
		
	}
}
