package a1013;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullPath = "c:\\jdk1.5\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		int i = fullPath.lastIndexOf("\\");
		
		path = fullPath.substring(0,i);
		fileName = fullPath.substring(i+1);
		
	//	path = fullPath.substring(0,14);
	//	fileName = fullPath.substring(15);
		
		System.out.println("fullPath:" +fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);
	}

}
