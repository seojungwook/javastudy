package a1026;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * ���� �ΰ��� �̸��� �ֿܼ��� �Է¹޾� ������ ������ ������ ���ϴ� ���α׷�
 */
public class FileCompareEx {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String src,dst;
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		System.out.print("ù��° ���� �̸� �Է�");
		src = scan.nextLine();
		System.out.print("�ι�° ���� �̸� �Է�");
		dst = scan.nextLine();
		System.out.println(src + "���ϰ�"+ dst + "���� ���ϱ�");
		try{
			fis1 = new FileInputStream(src);
			fis2 = new FileInputStream(dst);
			int len1 = fis1.available();
			int len2 = fis2.available();
			/*
			 * compareFile(...)
			 * 1.fis1, fis2�� ũ�Ⱑ ����.
			 * 2. ��� ������ ����.
			 * 1, 2 ��� �����ϴ� ��� true
			 */
			if(compareFile(fis1, fis2)){
				System.out.println(src+ "��"+ dst + "������ ����");
			}else {
				System.out.println(src + "��" + dst + "������ �ٸ���");
			}
		} catch(IOException e){
			e.printStackTrace();
		}finally{
			if(fis1 != null) fis1.close();
			if(fis2 != null) fis2.close();
		}
	}

	private static boolean compareFile(FileInputStream fis1, FileInputStream fis2) throws IOException {
		// TODO Auto-generated method stub
		boolean result = true;
		//�� ������ ���̰� �ٸ���?
		if(fis1.available() != fis2.available()){
			System.out.println("fis1.available() != fis2.available()");
			return false;
		}
		
		while(true){
			int data1, data2;
			data1 = fis1.read();
			data2 = fis2.read();
			// -1 : EOF(End of File) :������ ��
			// �Ѵ� -1�̸� ������ ��� �� �о���.
			if(data1== -1 && data2 == -1){
				System.out.println("data1 == -1 && data2 == -1");
				break;
			}
			if(data1 != data2){ //������ �ٸ����
				System.out.println("data1!=data2");
				System.out.println(data1+ "," + data2);
				result =false;
				break;
			}
		}
		return result;
	}
}
