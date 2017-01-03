package a1008;
/*
 * finally : 정상적이거나, 예외발생시 모두 실행되는 블럭
 * 			중간에 return 구문을 만나도 꼭 실행되는 영역(절대 빼먹지 말고 실행해라는)
 * 정상 : 145
 * 2/0 : 1345
 */
public class ExceptionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.print(1);
			System.out.print(2/0);
		//	return;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(3);
			return;
		} finally {
			System.out.print(4);
		}
		System.out.print(5);
	}

}
