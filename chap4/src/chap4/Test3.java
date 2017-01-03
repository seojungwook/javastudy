package chap4;
//1+(1+2)+(1+2+3)...+(1+2+3...+10) 106p
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=10;i++){
			System.out.print("(");
			for(int j=1; j<=i; j++){
				sum+=j;
				System.out.print(j);
				if(j!=i)System.out.print("+");
			}
			if(i==10) System.out.print(")=");
			else System.out.print(")+");
		}
		System.out.println(sum);
	}

}
