package a1012;
/*
 * "hey boys, hey girls hey anybody who will listen to me"
 * 문자 중에서 'a'부터 'z' 까지가 각각 몇 개 존재하는지 출력하고 비율을 조사하시오
 * 이때 공백과, 은 비율계산시 제외 하십시오.
 */
public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hey boys, hey girls hey anybody who will listen to me";
		char x[] = new char[26];
		float cnt=0;
		int cnt1=0;
		char y = 97;
		
			for(int i=0; i<26;i++){
				x[i]= y;
				y++;
			}
			for(int i=0; i<x.length;i++){
				for(int a=0; a<s.length();a++){
					
					if(x[i]==s.charAt(a)){ 
						cnt++;
						cnt1++;
					}
			}
				System.out.print(x[i] +"개수 :" + cnt1 + "개" + "\t");
				System.out.println("비율 : "+ cnt1+ "/42  "+(int)((cnt/42)*100) + "%");
				cnt=0;
				cnt1=0;
			}
		
	/*	int cnt[] = new int[26];
		char ch;
		int tot = 0;
		for(int i=0; i<msg.length(); i++){
			if(Character.isAlpahbetic(msg.charAt(i))){
				tot++;
				cnt[msg.charAt(i)-'a']++;
			}
		}
		for(int i=0; i<26; i++){
			ch=(char)('a'+1);
			System.out.println(ch+"->"+cnt[i] + ", 비율: " +cnt[i] +
					Math.round(cnt[i]*100/tot)+ "%");
		}*/
	}
}
