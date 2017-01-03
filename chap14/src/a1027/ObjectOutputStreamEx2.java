package a1027;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("object2.ser")); //°´Ã¼ÀÚÃ¼¸¦ º¸³»
		UserInfo2 sc1 = new UserInfo2();
		UserInfo2 sc2 = new UserInfo2();
		oos.writeObject(sc1);
		oos.writeObject(sc2);
		System.out.println("°í°´ 1 " + sc1);
		System.out.println("°í°´ 2 " + sc2);
	}
}

