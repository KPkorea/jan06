package str;

import java.io.CharArrayReader;
import java.util.Arrays;
import java.util.List;

//스트링 문자열 String
public class Str01 {
	public static void main(String[] args) {
		
		String str = "100";
		String str2 = new String("100");//원래 형태
		
		char ch = 'A';
		str = str + ch + 150;	//연결
		
		System.out.println(str);//100A150
		
		int num = 100 + 150;	//계산
		
		str2 = "A" + 127;	
		//문자 + 숫자 = 문자
		//문자 + 문자 = 문자
		//숫자 + 문자 = 문자
		//숫자 + 숫자 = 숫자
		
		System.out.println(str2);
		
		str2 = 1+ 2 +3 + "A";
		System.out.println(str2);	//6A
		
		str2 = "2" + 1 + 2 + 3 + "A";
		System.out.println(str2);	//2123A
		
		str2 = "2" + (1 + 2 + 3) + "A";
		System.out.println(str2);	//26A
		
		str2 = "안녕하세요.";
		
		char[] hi = str2.toCharArray();
		System.out.println(Arrays.toString(hi));
		//[안, 녕, 하, 세, 요, .]
		
		System.out.println(str2.charAt(0));
		//문자열 잘라내기(char)형태
		System.out.println(str2.indexOf("안"));//0 0번쨰 index에 있음
		System.out.println(str2.indexOf("가"));//-1 없다는 의미
		
		
		List<String> hiList = Arrays.asList(str2);
		System.out.println(hiList);
		//[안녕하세요.]
		
		String str3 = new String(hi, 1, 2);
		System.out.println(str3);
		
		
		str3 = "sadfagwihowargwrg";
		System.out.println("g 가 몇개 ?");
		int count = 0;
		for (int i = 0; i < str3.length(); i++) {
			if(str3.charAt(i) == 'g') {
				count +=1;
			}	
		}
		System.out.println("총 : "+ count + "개");
		
		
		str3 = "Hi5";
//		is가 들어가면 확인하는 작업을 수행
		System.out.println(Character.isAlphabetic('A'));	//알파벳인지
		System.out.println(Character.isDigit('5'));			//숫자인지
		System.out.println(Character.isUpperCase('A'));		//대문자인지
		System.out.println(Character.isLowerCase('a'));		//소문자인지
		
		System.out.println(Character.isAlphabetic(str3.charAt(0)));
		System.out.println(Character.isAlphabetic(str3.charAt(1)));
		System.out.println(Character.isAlphabetic(str3.charAt(2)));
		
		System.out.println(Character.isDigit(str3.charAt(0)));
		System.out.println(Character.isDigit(str3.charAt(1)));
		System.out.println(Character.isDigit(str3.charAt(2)));
		
		System.out.println(str3.contains("cat"));//해당 단어를 포함하는지 확인할때
		System.out.println(str3.contains("Hi"));
		
		str3 = str3.concat("입니다.");	//이어붙이기
		System.out.println(str3);	//Hi5입니다.
		
		System.out.println(str3.endsWith("니다.")); //해당 문자열로 끝나는지 확인
		
		String email = "wisejia@naver.com";
		System.out.println(email.endsWith(".com"));
		
		String str1 = new String("Hi");
		str2 = new String("Hi");
		
		System.out.println(str1 == str2);	//같은 인스턴스(객체)를 사용하는지 비교
		//불변성, immortal
		System.out.println(str1.equals(str2));	//값의 같음을 비교
		
		str1 = "안녕하세요";
		
		
		//자꾸 삭제되었다가 생성되는 메모리형태를 보완하기위해 사용되는명령
		StringBuffer sb = new StringBuffer();	
		sb.append("날씨가 참 좋네요.");
		sb.append("하하하하");
		
		System.out.println(sb.toString());	//toString : 진짜로 스트링으로 바꿔준다
		
		System.out.println(email.indexOf("@"));	//@의 위치를 알려준다.
		
		//wisejia@naver.com
		String str4 = email.substring(0 , 7);
		System.out.println(str4);
		
		String server = email.substring(8 , email.length());
		System.out.println(server);
		
		//실제 email로 넣어서 id와 도메인 분리
		
		email = "nanason777@gmail.com";
		String id = email.substring(0 , email.indexOf("@"));
		server = email.substring(email.indexOf("@") +1 , email.length());;
		System.out.println(id);
		System.out.println(server);
		
		
		
		
		
		
	}
}
