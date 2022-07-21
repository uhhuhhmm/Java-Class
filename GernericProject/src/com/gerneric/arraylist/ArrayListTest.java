package com.gerneric.arraylist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ArrayListTest {

	public static void main(String[] args) {
		//1ex iterator
//		ArrayList<Integer> list = new ArrayList();
//		list.add(new Integer(1));
//		
//		//System.out.println(list.get(0));
//		
//		//Gerneric화
//		Iterator<Integer> it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

		//1ex Map
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		scoreMap.put("김길동", 90);
		scoreMap.put("이자바", 50);
		scoreMap.put("박자바", 90);
		scoreMap.put("최길동", 70);
		scoreMap.put("이순신", 100);
		
//		Set<Map.Entry<String, Integer>> entrySet = scoreMap.entrySet();
//		Iterator<Map.Entry<String, Integer>> entries = entrySet.iterator();
//		
//		while(entries.hasNext()) {
//			Map.Entry<String, Integer> entry = entries.next();
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}
		//향상된 for문으로		
		for(Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
//		Set<String> keys = scoreMap.keySet();
//
//		Iterator<String> it = keys.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next()\);
//		}
				
	}

}
