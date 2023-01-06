package coll;
//Set interface
//순서가 없어요. 중복도 없어요

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set01 {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(10);
		set.add(5);
		set.add(7);
		set.add(10);
		set.add(2);
		//중복된 값은 하나의 데이터만 취급한다.
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.remove(10));	
		//인덱스가 없기떄문에 get도불가능 10을 입력하면 값10이 지워진다.
		//System.out.println(set.toArray());
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
		}
		
		//로또 만들어주세요
		//1 game
		Set<Integer> lotto = new HashSet<Integer>();
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random()*45)+1);
		}
		System.out.println("로또" + lotto);
		
		
		
		
		
	}

}
