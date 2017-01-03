package a1019;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phoneNumArr = {
				"012-3456-7890",
				"099-2456-7890",
				"088-2346-9870",
				"013-3456-7890"
		};
		
		ArrayList list = new ArrayList();
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.print(">>");
			String input = s.nextLine().trim();
			
			if(input.equals("")){
				continue;
			}else if(input.equalsIgnoreCase("Q")){
				System.exit(0);
			}
				
			 Pattern pattern = Pattern.compile(input);
			 for(String str : phoneNumArr){
			 Matcher m = pattern.matcher(str.replace("-",""));
			 if(m.find())
			 list.add(str);
			 }
			 
			/*String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
			Pattern p = Pattern.compile(pattern);
			for(int i=0; i<phoneNumArr.length; i++){
			Matcher m = p.matcher(phoneNumArr[i]);
			
			while(m.find()){
				String str = m.group(1) + m.group(2) + m.group(3);
				if(str.matches(".*"+ input +".*"))
					list.add(phoneNumArr[i]);
				}
			}*/
			if(list.size()>0){
				System.out.println(list);
				list.clear();
			}else{
				System.out.println("일치하는 번호가 없습니다.");
			}
		}
	}

}
