package a1016;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * ���ѹα�, ĳ����, ����, �������� ������ ����
 * HashMap�� ����ǵ��� �ϰ�, ȭ�����κ��� ���� �Է¹޾�
 * �ش� ������ ��µǵ��� �ϴ� ���α׷� �ۼ��ϱ�
 * 1.HashMap ��ü �����ϱ�
 * 2. ����� ������ map�� ����ϱ�
 * 3. Scanner ��ü ���� => ȭ���Է� �غ��ϱ�
 * 4. ȭ���Է¹ޱ�
 * 5. map���� ��������� ���� �˻��ϱ�
 * 		4,5���� ����
 * 		"����" �ԷµǸ� ���α׷� ����
 */
public class HashMapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> list = new HashMap<String,String>();
		
		list.put("���ѹα�", "����");
		list.put("ĳ����", "��Ÿ��");
		list.put("����", "����");
		list.put("������", "����");
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true){
			String n = scan.next();
			System.out.println("���� �Է��ϼ���");
			
			if(n.equals("����")){
				System.out.println("���α׷� ����");
				break;
			}
			else if(list.get(n)!=null){
				System.out.println(list.get(n));
			}else{
				System.out.println("��ϵ� ���� �ƴմϴ�");
			}
			
			
//			if(n.equals("���ѹα�")){
//				System.out.println(n+"�� ���� : " +list.get("���ѹα�"));
//			}
//			else if(n.equals("ĳ����")){
//				System.out.println(n+"�� ���� : " +list.get("ĳ����"));
//			}
//			else if(n.equals("����")){
//				System.out.println(n+"�� ���� : " +list.get("����"));
//			}
//			else if(n.equals("������")){
//				System.out.println(n+"�� ���� : " +list.get("������"));
//			}
//			else if(!(n.equals(list))){
//				System.out.println("�ٸ� ���� �Է��ϼ���");
//			}
			
		}
	}	
}
	

