package a1027;

import java.io.File;
import java.io.IOException;

/*
 * FileŬ���� ����
 * 	���Ͽ� ���� ����(��ġ, ũ���)�� �����ϴ� Ŭ����
 * 	���뿡 ���� ������ Stream�� ��.
 */
public class FileEx {
	public static void main(String[] args) throws IOException {
		String filePath = "c:\\";
		File f1 = new File(filePath);
		//list() : ������ ��������� �̸����� ����
		String list[] = f1.list();
		for(String f : list){
			/*
			 * new File(filePath, f)
			 * filePath : parentPath
			 * f		: ������ �̸�
			 */
			File f2 = new File(filePath, f);
			if(f2.isDirectory()){
				System.out.printf("%s : ���丮 %n",f);
			}else{ //f2.isFile() �����̾�?(�������)
				System.out.printf("%s : ����(%,dbyte) %n",f,f2.length());
			}
		}
		File f3 = new File("c:\\temp");
		//boolean mkdir() : ������ ����
		System.out.println("c:\\temp ���� ���� : " + f3.mkdir());
		File f4 = new File("c:\\temp\\test.txt");
		System.out.println(f4.getName() + "���ϻ���?" + f4.createNewFile());
		System.out.println("�����̸� :" + f4.getName());
		System.out.println("�������� :" + f4.getParent());
		File f5 = new File("text.txt");
		System.out.println("�����н� : " + f5.getAbsolutePath());
		System.out.println("����н� : " + f5.getPath());
		System.out.println("�������� : " + f5.getParent());
		System.out.println("�����̸� : " + f5.getName());
		System.out.println(f4.lastModified());
		File f6 = new File("c:\\temp\\test.txt");
		File f7 = new File("c:\\temp\\test1.txt");
		System.out.println("�̸� ���� :" + f6.renameTo(f7));
		
		
	}
}
