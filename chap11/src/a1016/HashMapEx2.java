package a1016;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 대한민국, 캐나다, 영국, 스위스의 수도를 각각
 * HashMap에 저장되도록 하고, 화면으로부터 나라를 입력받아
 * 해당 수도가 출력되도록 하는 프로그램 작성하기
 * 1.HashMap 객체 생성하기
 * 2. 나라와 수도를 map에 등록하기
 * 3. Scanner 객체 생성 => 화면입력 준비하기
 * 4. 화면입력받기
 * 5. map에서 나라명으로 수도 검색하기
 * 		4,5번은 연속
 * 		"종료" 입력되면 프로그램 종료
 */
public class HashMapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> list = new HashMap<String,String>();
		
		list.put("대한민국", "서울");
		list.put("캐나다", "오타와");
		list.put("영국", "런던");
		list.put("스위스", "베른");
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true){
			String n = scan.next();
			System.out.println("나라를 입력하세요");
			
			if(n.equals("종료")){
				System.out.println("프로그램 종료");
				break;
			}
			else if(list.get(n)!=null){
				System.out.println(list.get(n));
			}else{
				System.out.println("등록된 나라가 아닙니다");
			}
			
			
//			if(n.equals("대한민국")){
//				System.out.println(n+"의 수도 : " +list.get("대한민국"));
//			}
//			else if(n.equals("캐나다")){
//				System.out.println(n+"의 수도 : " +list.get("캐나다"));
//			}
//			else if(n.equals("영국")){
//				System.out.println(n+"의 수도 : " +list.get("영국"));
//			}
//			else if(n.equals("스위스")){
//				System.out.println(n+"의 수도 : " +list.get("스위스"));
//			}
//			else if(!(n.equals(list))){
//				System.out.println("다른 나라를 입력하세요");
//			}
			
		}
	}	
}
	

