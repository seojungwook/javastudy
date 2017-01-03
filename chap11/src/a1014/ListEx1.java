package a1014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * List ����
 * : �߰� ������ ������. �ε���������� ��ġ ����
 * 	�����迭
 * 	
 * 	jdk5.0 ���Ŀ� ��� Collection ��ü�� ���׸��� ǥ���ؾ��Ѵ�.
 * 
 * ���
[1, 2, 5, 4, 0, 3]
1
2
5
4
0
3
[2, 5, 4]
[2, 4, 5]
2
4
5

 */
public class ListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
	
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(0);
		list.add(3);
		System.out.println(list);
		for(int i =0; i<list.size();i++){
			System.out.println(list.get(i));
		}
		List<Integer> list2 = new ArrayList<Integer>(list.subList(1,4));
		System.out.println(list2);
		//List ����
		//Collection �������̽�
		//Collections Ŭ����
		Collections.sort(list2); //list Ÿ�Ը� ���ü� �ִ�
		System.out.println(list2);
		//������ for���� Collection ��밡��
		for(Object o : list2)
			System.out.println(o);
	}
}
