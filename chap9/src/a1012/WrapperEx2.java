package a1012;
/*
 * Character Ŭ���� ����
 */
public class WrapperEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] data = {'A','a','4','&'};
		for(char c : data){
			if(Character.isUpperCase(c))
				System.out.println(c + "�빮��");
			else if(Character.isLowerCase(c))
				System.out.println(c + "�ҹ���");
			else if(Character.isDigit(c))
				System.out.println(c + "����");
			else 
				System.out.println(c + "�Ϲ� ����");
			double d = 10.0/3;
			System.out.println("���ڰ� �ƴϴ�?" + Double.isNaN(d)); //false , ���ڴ�
			System.out.println("���Ѵ�/�Ҵ�?" + Double.isInfinite(10.0/0));
		}
	}
}
