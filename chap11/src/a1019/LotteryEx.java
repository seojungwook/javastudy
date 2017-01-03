package a1019;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;


/*
 * 1 ~ 10000�������� ��ȣ�� ���� ���� �߿���
 * 1�� 1��, 2�� 2��, 3�� 3���� ��÷�ϴ� ���α׷�
 * 3����� ��÷. �ߺ��Ǹ� �ȵ�.
 * Set LinkedHashSet : ��������, �ߺ��Ұ�
 * Random
 * ArrayList(set)
 */
public class LotteryEx {
	public static void main(String[] args) {
		Set<Integer> lottory = new LinkedHashSet<Integer>();
	
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		int grade =3;
		while(lottory.size() < 6){
			if(lottory.size()==0 || lottory.size()==3||lottory.size()==5){
				System.out.println(grade + "�� ���� ��÷�մϴ�.");
				grade--;
			}
		
		int num = rand.nextInt(10000)+1;
		if(!lottory.add(num)) //�ߺ�������
			continue;
		System.out.println(num);
	}
		System.out.println();
		System.out.println("***���� ��÷ ��� ***");
		List<Integer> list = new ArrayList<Integer>(lottory);
		grade = 1;
		for(int i=list.size()-1; i>=0; i--){
			if(i==5 || i==4 || i==2){
				System.out.println();
				System.out.print(grade + "��:");
				grade++;
			}
			System.out.print(list.get(i)+",");
			}
		}
}
