package chap5;
/*
 *교재 132쪽 System.arraycopy() 메서드 예제 
 */
public class ArrayEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] abc ={'A','B','C','D'};
		char[] number = {'0','1','2','3','4','5','6','7','8','9'};
		//abc로 하면 이상한 값나오고 내용을 보기위해 문자열로 만듦
		System.out.println(new String(abc));
		System.out.println(new String(number));
		
		char[] result = new char[abc.length + number.length];
		//abc 0번지부터 복사해서 result 0번지부터 4개 복사
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(number, 0, result, abc.length, number.length);
		System.out.println(new String(result));
		System.arraycopy(abc, 0, number, 0, abc.length);
		System.out.println(new String(number));
		System.arraycopy(abc, 0, number, 6, 3);
		System.out.println(new String(number));
	}

}
