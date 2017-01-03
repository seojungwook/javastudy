package a1027;

import java.io.File;
import java.io.IOException;

/*
 * File클래스 예제
 * 	파일에 대한 정보(위치, 크기등)를 관리하는 클래스
 * 	내용에 대한 관리는 Stream이 함.
 */
public class FileEx {
	public static void main(String[] args) throws IOException {
		String filePath = "c:\\";
		File f1 = new File(filePath);
		//list() : 파일의 하위목록의 이름들을 리턴
		String list[] = f1.list();
		for(String f : list){
			/*
			 * new File(filePath, f)
			 * filePath : parentPath
			 * f		: 파일의 이름
			 */
			File f2 = new File(filePath, f);
			if(f2.isDirectory()){
				System.out.printf("%s : 디렉토리 %n",f);
			}else{ //f2.isFile() 파일이야?(같은얘기)
				System.out.printf("%s : 파일(%,dbyte) %n",f,f2.length());
			}
		}
		File f3 = new File("c:\\temp");
		//boolean mkdir() : 폴더로 생성
		System.out.println("c:\\temp 폴더 생성 : " + f3.mkdir());
		File f4 = new File("c:\\temp\\test.txt");
		System.out.println(f4.getName() + "파일생성?" + f4.createNewFile());
		System.out.println("파일이름 :" + f4.getName());
		System.out.println("상위폴더 :" + f4.getParent());
		File f5 = new File("text.txt");
		System.out.println("절대패스 : " + f5.getAbsolutePath());
		System.out.println("상대패스 : " + f5.getPath());
		System.out.println("상위폴더 : " + f5.getParent());
		System.out.println("파일이름 : " + f5.getName());
		System.out.println(f4.lastModified());
		File f6 = new File("c:\\temp\\test.txt");
		File f7 = new File("c:\\temp\\test1.txt");
		System.out.println("이름 변경 :" + f6.renameTo(f7));
		
		
	}
}
