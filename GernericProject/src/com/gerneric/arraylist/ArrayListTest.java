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
//		//Gernericȭ
//		Iterator<Integer> it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

		//1ex Map
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		scoreMap.put("��浿", 90);
		scoreMap.put("���ڹ�", 50);
		scoreMap.put("���ڹ�", 90);
		scoreMap.put("�ֱ浿", 70);
		scoreMap.put("�̼���", 100);
		
//		Set<Map.Entry<String, Integer>> entrySet = scoreMap.entrySet();
//		Iterator<Map.Entry<String, Integer>> entries = entrySet.iterator();
//		
//		while(entries.hasNext()) {
//			Map.Entry<String, Integer> entry = entries.next();
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}
		//���� for������		
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
