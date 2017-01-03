package a1027;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Scanner;
import java.util.Vector;

/*
 * Ŀ�ǵ�������κ��� ���� ������ �̸��� �Է¹ް�, 
 * �� ���ϵ��� ������� ���ļ� ���ο� ������ ����� ���� ���α׷�(FileMergeTest.java)�� �ۼ�
 * �� ��ĥ ������ �������� ������ ���� �ʴ´�.
 * java FileMergeTest result.txt 1.txt 2.txt 3.txt
 */
public class Test4 {
	public static void main(String[] args) throws IOException {
		if(args.length<=2){
			System.out.println("java FileMergeTest merge_file file1 file2 file3");
			return;
		}
		FileOutputStream fos = new FileOutputStream(args[0]);
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		for(int i=1; i<args.length; i++){
			v.add(new FileInputStream(args[i]));
		}
		SequenceInputStream si = new SequenceInputStream(v.elements());
		int data = 0;
		while((data=si.read())!=-1){
			fos.write(data);
		}
		si.close();
		fos.flush();
		fos.close();
	
	}
}
