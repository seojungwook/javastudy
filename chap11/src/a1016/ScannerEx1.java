package a1016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(new File("data.txt")); //������Ʈ���� ���� ����
		int cnt = 0;
		int totalSum = 0;
		while(scan.hasNextLine()){
			String line = scan.nextLine();
			Scanner scan2 = new Scanner(line).useDelimiter("\\s*,\\s*"); // \s = ���� *������ �־ ����
			int sum = 0;
			while(scan2.hasNextInt()){
				sum+=scan2.nextInt();
			}
			System.out.println(line+", sum="+sum);
			totalSum += sum;
			cnt++;
		}
		System.out.println("Line:" + cnt + ", Total:" + totalSum);
	}

}
