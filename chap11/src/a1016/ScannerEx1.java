package a1016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(new File("data.txt")); //프로젝트에서 새로 파일
		int cnt = 0;
		int totalSum = 0;
		while(scan.hasNextLine()){
			String line = scan.nextLine();
			Scanner scan2 = new Scanner(line).useDelimiter("\\s*,\\s*"); // \s = 공백 *여러개 있어도 지워
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
