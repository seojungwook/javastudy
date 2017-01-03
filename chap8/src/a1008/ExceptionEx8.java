package a1008;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class ExceptionEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
	}

	private static void method1() {
		// TODO Auto-generated method stub
		method2();
	}

	private static void method2() {
		// TODO Auto-generated method stub
		try{
			throw new Exception("예외를 강제로 발생");
		}catch(Exception e){
			PrintStream s = null;
			try {
				FileOutputStream fos = new FileOutputStream("err.log",true);
				s = new PrintStream(fos);
				s.println(e.getMessage());
				e.printStackTrace(s);
			} catch(Exception e2){		
			}finally{
				s.close();
		}
	}
}
}