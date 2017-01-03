package a1027;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("sample.txt");
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readBoolean()); //true
		System.out.println(dis.readInt()); //1234
		System.out.println(dis.readChar()); //A
		System.out.println(dis.readDouble()); //123.45

	}
}
