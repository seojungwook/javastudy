package a1019;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
 * Random Ŭ���� : seed ���� ���� 
 * 					�ڷ������� ���� �߻� ����
 * 					���� �������� nextInt(n) : 0 ~ n-1
 * Math.random() : 0.0 ~ 0.9999999 ������ �� ����
 * 					seed�� ���� �ȵ�
 */
public class RandomEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		/*
		 * System.currentTimeMillis() : 
		 * 		1970�� ���ۺ��� ��������� �и��ʸ� 
		 * 		longŸ�� ����
		 */
		rand.setSeed(System.currentTimeMillis());
		Random rand2 = new Random();
	//	rand2.setSeed(System.currentTimeMillis()); //����� �ٸ��� �Ϸ��� +1
		rand2.setSeed(System.currentTimeMillis() +1);
		System.out.println("= rand =");
		for(int i=0; i<5; i++)
			System.out.println(i + ":" + rand.nextInt(100)); //0~99������ ���� �Ѱ���
		System.out.println();
		System.out.println("= rand2 =");
		for(int i=0; i<5; i++)
			System.out.println(i + ":" + rand2.nextInt(100));
		//�ζǹ�ȣ�� �����ϱ� (1~ 45) 6��
		//TreeSet�� �̿��Ͽ� �ߺ�����
		Random rand3 = new Random();
		Set<Integer> lotto = new TreeSet<Integer>();
		rand3.setSeed(System.currentTimeMillis());
		while(true){
			lotto.add(rand3.nextInt(45)+1);
			if(lotto.size()>5){ //size() : lotto ��ü���� ��ü�� ����
				System.out.println(lotto);
					break;
			}
		}
	}

}
