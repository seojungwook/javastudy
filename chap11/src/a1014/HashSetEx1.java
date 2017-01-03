package a1014;

import java.util.HashSet;
import java.util.Set;

/*426p
 * HashSet����
 * : �ߺ��Ұ�, ���� ��
 * 
 * boolean add(Object) : ��ü�� �߰��ϴ� ���
 * 		        true : �߰� ����
 * 				false : �߰� ����
 * ���
 *  [1, 1, 2, 3, 4]
	[2, 3, 4]
	[4]
	
	
 */
public class HashSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object objArr[] = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet(); 
		Set set2 = new HashSet();
		Set set3 = new HashSet();
		
		for(int i=0; i<objArr.length;i++){
			if(!set.add(objArr[i]))
				if(!set2.add(objArr[i]))
					set3.add(objArr[i]);
		}
		System.out.println(set);
		System.out.println(set2);
		System.out.println(set3);
		
		for(Object o : set)
			System.out.println(o);
	}

}
