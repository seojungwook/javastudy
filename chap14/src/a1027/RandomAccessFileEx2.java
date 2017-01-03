package a1027;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * RandomAccessFile ���� 2
 */
public class RandomAccessFileEx2 {
	public static void main(String[] args) throws IOException {
				// ��ȣ, ����, ����, ����
		int score[] = {1, 100, 90, 90, //0, 4, 8, 12 ����Ʈ
					   2, 70, 90, 100, //16, 20 ....
					   3, 100,100, 100,//32, 36 ...
					   4, 70, 60, 80, //48, 52 ...
					   5, 70, 90, 100}; //64, 68 ...
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		RandomAccessFile ra = new RandomAccessFile("score.dat","rw");
	
		for(int num : score){
			ra.writeInt(num);
		}
		ra.seek(0);
		try{
			int seek = 4; //4����Ʈ
			int seek1 = 8;
			int seek2 = 12;
			int data = 0;
			while(true){	
				ra.seek(seek); //
				sum += ra.readInt();
				ra.seek(seek1);
				sum1 += ra.readInt();
				ra.seek(seek2);
				 //���������� 4����Ʈ �о�
				sum2 += ra.readInt();
				seek += 16;
				seek1 += 16;
				seek2 += 16;	
			}
		}catch(EOFException e){
			System.out.println("���� �հ�:" + sum);
			System.out.println("���� �հ�:" +sum1);
			System.out.println("���� �հ�:" +sum2);
			System.out.println("���� �б� �Ϸ�");
		}
		ra.close();
	}
}

