package coll;
//Map<K, V> : Key 중복 X, Value 중복 가능

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Map01 {
	public static void main(String[] args) {
		//E, T, K, V
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//저장 put(K, V)
		map.put("홍길동", 12);
		map.put("김길동", 30);
		map.put("이길동", 20);
		map.put("박길동", 10);
		map.put("최길동", 50);
		map.put("홍길동", 100);
		
		System.out.println(map);
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("www", "www");
		
		//출력 get(K)
		
		System.out.println(map.get("이길동"));
		System.out.println(map.get("없는거"));//없다 null
		
		//있는지 물어보기
		System.out.println(map.containsKey("이길동"));	// key값으로
		System.out.println(map.containsKey("이길동1"));
		
		System.out.println(map.containsValue(100));	// value값으로
		System.out.println(map.containsValue(1000));
		
		//지우기 remove(K)
		System.out.println(map.remove("이길동"));
		System.out.println(map);
		
		System.out.println(map.size());
		
		//1. map -> set -> list
		//2. map -> set === iterator
		
		Set<String> map2set = map.keySet();//key만 뽑아서 set형식으로
		System.out.println(map2set);
		//[박길동, 김길동, 홍길동, 최길동] map를 set으로 변환
		List<String> set2List = new ArrayList<String>(map2set);
		//set을 list로 변환
		System.out.println(set2List);
		
		for (int i = 0; i < set2List.size(); i++) {
			System.out.print("K : "+set2List.get(i));
			Integer value = map.get(set2List.get(i));
			System.out.println(", V : "+value);
		}
		
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.print("K : "+key);
			System.out.println(", V : "+ map.get(it.next()));
		}
		
		
		
		
		
		
	}
}
