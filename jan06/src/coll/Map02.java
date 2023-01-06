package coll;

import java.util.*; // 유틸이 많아지면 힘드므로 *로 잡아서 필요할떄 그떄그떄 시스템이 알아서 그것만 가져온다

/*
 * List : 중복 허용하고, 순서가 있음.
 * Set : 중복 허용 안하고, 순서도 없음.
 * Map : key-value로 저장하고, key는 순서/중복이 없음.
 * 
 */

//map (746p)
public class Map02 {
	public static void main(String[] args) {
		//poseidon, 01234567
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("poseidon", "01234567");
		map.put("test", "test");
		map.put("test01", "test0101");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			
			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();
			
			System.out.println("입력하신 아이디는 "+ id);
			System.out.println("암호는 "+ pw);
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("정상적으로 로그인 되었습니다.");
					break;
				}else {
					System.out.println("비밀번호가 일치하지않습니다.");
				}
			}else {
				System.out.println("입력하신 아이디가 존재하지않습니다.");
			}
			
		}
		sc.close();
		
		
		
	}
}
