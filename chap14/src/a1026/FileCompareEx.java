package a1026;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 파일 두개의 이름을 콘솔에서 입력받아 파일의 내용이 같은지 비교하는 프로그램
 */
public class FileCompareEx {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String src,dst;
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		System.out.print("첫번째 파일 이름 입력");
		src = scan.nextLine();
		System.out.print("두번째 파일 이름 입력");
		dst = scan.nextLine();
		System.out.println(src + "파일과"+ dst + "파일 비교하기");
		try{
			fis1 = new FileInputStream(src);
			fis2 = new FileInputStream(dst);
			int len1 = fis1.available();
			int len2 = fis2.available();
			/*
			 * compareFile(...)
			 * 1.fis1, fis2의 크기가 같다.
			 * 2. 모든 내용이 같다.
			 * 1, 2 모두 만족하는 경우 true
			 */
			if(compareFile(fis1, fis2)){
				System.out.println(src+ "와"+ dst + "파일은 같다");
			}else {
				System.out.println(src + "와" + dst + "파일은 다르다");
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
		//두 파일의 길이가 다르냐?
		if(fis1.available() != fis2.available()){
			System.out.println("fis1.available() != fis2.available()");
			return false;
		}
		
		while(true){
			int data1, data2;
			data1 = fis1.read();
			data2 = fis2.read();
			// -1 : EOF(End of File) :파일의 끝
			// 둘다 -1이면 두파일 모두 다 읽었음.
			if(data1== -1 && data2 == -1){
				System.out.println("data1 == -1 && data2 == -1");
				break;
			}
			if(data1 != data2){ //내용이 다른경우
				System.out.println("data1!=data2");
				System.out.println(data1+ "," + data2);
				result =false;
				break;
			}
		}
		return result;
	}
}
