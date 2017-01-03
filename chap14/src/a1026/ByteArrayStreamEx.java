package a1026;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
 * ByteArrayInputStream ByteArrayOutputStream ¿¹Á¦
 */
public class ByteArrayStreamEx {
	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream(0);
		int data = 0;
		while((data=input.read())!=-1){
			output.write(data);
		}
		outSrc = output.toByteArray();
		System.out.println("input Source :" + Arrays.toString(inSrc));
		System.out.println("output Source :" + Arrays.toString(outSrc));
	}
}
