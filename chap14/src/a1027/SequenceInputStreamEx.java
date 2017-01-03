package a1027;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Vector;

/*
 * SequenceInputStream 예제
 *   : 여러개의 InputStream을 합하여 하나의 스트림으로 만드는 스트림
 *   
 *   생성자
 *   SequenceInputStream(InputStream, InputStream) : 2개의 InputStream을 합친 스트림을 만들때
 *   SequenceInputStream(Enumeration e) : 3개이상의 InputStream을 합친 스트림을 만들때
 */
public class SequenceInputStreamEx {
	public static void main(String[] args) throws IOException {
		byte[] arr1 = {0,1,2};
		byte[] arr2 = {3,4,5};
		byte[] arr3 = {6,7,8};
		byte[] outSrc = null;
		Vector v = new Vector();
		v.add(new ByteArrayInputStream(arr1));
		v.add(new ByteArrayInputStream(arr2));
		v.add(new ByteArrayInputStream(arr3));
		SequenceInputStream input = new SequenceInputStream(v.elements());
//		SequenceInputStream input = new SequenceInputStream( //2개로 쓸때
//		new ByteArrayInputStream(arr1), new ByteArrayInputStream(arr2));
	
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		int data = 0;
		while((data = input.read()) != -1){
			output.write(data);
		}
		outSrc = output.toByteArray();
		System.out.println("Input Source1:" + Arrays.toString(arr1));
		System.out.println("Input Source2:" + Arrays.toString(arr2));
		System.out.println("Input Source3:" + Arrays.toString(arr3));
		System.out.println("Output Source:" + Arrays.toString(outSrc));
	}
}
