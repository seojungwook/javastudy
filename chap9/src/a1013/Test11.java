package a1013;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2){
			System.out.println("숫자 두개를 커맨드라인에 입력");
			return;
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		for(int i=num1; i<=num2; i++){
			for(int j=1; j<10; j++){
				System.out.println(i +"*" + j + "=" + i*j);
				
			}
			System.out.println();
		}
	}

}
