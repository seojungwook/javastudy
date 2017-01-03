package a1008;
/*
 * ���� catch ���� ����
 * �߻��� ���ܺ��� �ٸ� ������ ���� �� �� �ִ�.
 * 
 * catch ������ ������ �ڼ�Exception  =>  �θ�Exception ������ ��ġ�ؾ� �Ѵ�.
 * ����ó�������� ����ó���� �ֻ��� Ŭ������ Exception Ÿ���� ���ϴܿ� ��ġ�Ǿ�� �Ѵ�.
 * 
 * Exception Ŭ���� : ��� ����Ŭ������ �θ�Ŭ������.
 * 					��� ����Ŭ������ Exception Ŭ������ ��ӹ޴´�.
 * 					��� ���� Ŭ������ Exception Ÿ������ ����ȯ�� �����ϴ�.
 */
public class ExceptionEx2 {
	public static void main(String[] args){
		System.out.println(1);
		try{
			//ArrayIndexOutOfBoundsException ���ܹ߻�
			System.out.println(args[0]); // args �� test �־���
			
			//ArithmeticException ���ܹ߻�
			System.out.println(2/1);
			
			//NumberFormatException ���ܹ߻�
			System.out.println(Integer.parseInt("g2"));
			String s = null;
			System.out.println(s.trim()); //nullPointerException ���� �߻�
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("��ɽ���� ���� �Է��ϼ���");
		} catch(ArithmeticException e){
			System.out.println("0���� ������ ������");
		} catch(NumberFormatException e){
			System.out.println("���ڸ� �Է��ϼ���");
		} catch(Exception e){ 					 // �� �ؿ� ��ġ@
			System.out.println("����� ���� ���");
		}
		System.out.println(4);
	}
}
