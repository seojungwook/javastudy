package a1013;

public class Test4 {
	static void printGraph(int[] dataArr, char ch){

	//	for(int i:dataArr){   개선된 for문
	//		for(int j=0;j<i;j++)
		for(int i=0; i<dataArr.length; i++){
			for(int j=0; j<dataArr[i]; j++){
				System.out.print(ch);
			}
			System.out.println(dataArr[i]);
		}
		
	}	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		printGraph(new int[]{3,7,1,4},'*');
	}

}
