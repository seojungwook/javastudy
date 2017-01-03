package chap4;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i,j;
	
		for(j=1; j<=3;j++){
			for(i=2;i<=4;i++){
				System.out.print(i + " * " + j + " = " + (i*j) +"\t");
				}
				System.out.println();
			}
			System.out.println();
		for(j=1; j<=3;j++){
			for(i=5;i<=7;i++){
				System.out.print(i + " * " + j + " = " + (i*j) +"\t");
				}
				System.out.println();
			}
				System.out.println();
		for(j=1; j<=3;j++){
				for(i=8;i<=9;i++){
					System.out.print(i + " * " + j + " = " + (i*j) +"\t");
				}
					System.out.println();*/
					
		
		  for(int i=2; i<=9; i+=3){
		  	for(int j=1;j<=3; j++){
		  System.out.print(i + " * " + j + " = " + (i*j) +"\t");
		  if(i!=8){
		  System.out.print((i+1)+" * "+j+" = "+((i+1)*j)+"\t");
		 System.out.println((i+2)+" * "+j+" = "+((i+2)*j)+"\t");
		  }else{
		  System.out.println((i+1)+" * "+j+" = "+((i+1)*j)+"\t");
		  }
		  }
		  System.out.println();
		 
			}
		}
}

		


