package a1014;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * HashSet�� �̿��� �ζǹ�ȣ ������
 * Lotto 1 ~ 45������ �� �� 6�� ��÷
 * 
 * Collection : ��ü���� ����
 * 		�⺻�ڷ����� Collection�� ��ü ����� �ƴ�.
 * 		int -> Integer ��ü ���� (boxing)
 */
public class HashSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Set lotto = new HashSet();
		Set lotto = new TreeSet(); // ���ı���
	
		while(true){
			lotto.add((int)(Math.random()*45)+1);
			if(lotto.size()>=6) break;
		}
		System.out.println(lotto);
	}

}
