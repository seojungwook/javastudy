package chap5;
/*
 * 가변배열을 사용하여 결과
 * 46
 * 47 37
 * 48 38 29
 * 49 39 30 22
 * 50 40 31 23 16
 * 51 41 32 24 17 11
 * 52 42 33 25 18 12 7
 * 53 43 34 26 19 13 8 4
 * 54 44 35 27 20 14 9 5 2
 * 55 45 36 28 21 15 10 6 3 1
 */
public class ArrayEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr2= new int[10][];
		
		//가변배열 생성
			for(int i=0; i<arr2.length;i++){
				arr2[i] = new int[i+1];
			}
			int num=0;
			for(int j=9; j>=0; j--){
				for(int i=j; i<arr2.length;i++){
				arr2[i][j] = ++num;
				}
			}
		for(int i=0; i<arr2.length;i++){
			for(int j=0; j<arr2[i].length;j++){
				System.out.printf("%4d",arr2[i][j]);
				
			}
			System.out.println();
		}
	}
}
