package a1013;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<20; i++)
			System.out.print(getRand(1,-3)+",");
	}

	 static int getRand(int from, int to) {
		int max = Math.max(from, to);
		int min = Math.min(from, to);
		int t = max - min;

		return (int)(Math.random()*(t+1))+min;
	}

}
