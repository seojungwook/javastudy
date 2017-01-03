package a1027;
/*
 * PrintStream 예제 2
 * printf() 메서드 예제 
 * 		- jdk5.0 이후버전에서만 사용이 가능
 * 		- 형식제어문자를 사용
 * 		- String.format() 메서드와 사용방법이 동일
 */
public class PrintStreamEx2 {
	public static void main(String[] args) {
		//char 출력 : %c
		//%n : \n과 같다.
		System.out.printf("%c%n",'A'); //A
		System.out.printf("%5c%n",'A'); //5자리를 확보하고 'A' 오른쪽정렬
		System.out.printf("%-5c%n",'A'); //5자리를 확보하고 'A' 왼쪽정렬
		
		//정수 출력 : %d(10진정수), %o(8진정수), %x(16진정수);
		System.out.printf("%d%n",12345); //12345
		System.out.printf("%,d%n",12345); //12,345
		System.out.printf("%o%n",12345); //30071
		System.out.printf("%x%n",12345); //3039
		System.out.printf("%x%n",255); //ff
		System.out.printf("%X%n",255); //FF
		System.out.printf("%10d%n",12345); //10자리 확보 12345
		System.out.printf("%010d%n",12345); //10자리 확보 0000012345

		//실수 출력 : %f, %g(근사실수), %e(지수실수)
		System.out.printf("%f%n",12.12745);
		System.out.printf("%.2f%n",12.12745);
		System.out.printf("%g%n",12.12745);
		System.out.printf("%e%n",12.12745);
		System.out.printf("%10.2f%n",12.12745); //10자리확보 소수점2자리까지(우측정렬)
		System.out.printf("%-10.2f%n",12.12745); //10자리확보 소수점2자리까지(좌측정렬)
		System.out.printf("%010.2f%n",12.12745);
		
		//문자열 : %s
		System.out.printf("%s%n","홍길동");
		System.out.printf("%d,%s%n%s%n",100,"홍길동","이몽룡");// 100,홍길동
															   // 이몽룡  <=이대로나와
		//논리형 : %b
		System.out.printf("%b%n",true);
		//255 숫자를 8진수로 출력하기
		System.out.printf("10진수:%d, 8진수:%o%n",255,255);
		String f = String.format("10진수:%d, 8진수:%o%n",255,255);
		System.out.println(f);
	}
}
