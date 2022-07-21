package collection.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
//		HashMap map = new HashMap();
		//객체로 값을 받는다
		//key, value
		//1ex
//		map.put("myId", "1234");
//		map.put("asdf", "1111");
//		map.put("asdf", "1234");
//		//key 새로운 값을 받으면 새로운 값으로 나옴,  unique
//		//value는 중복을 허용함
////		System.out.println(map);
//		//아이디 비번 맞추기
//		Scanner sc =  new Scanner(System.in);
//		
//		boolean b = true;
//	
//		while(b) {
//			System.out.println("아이디 입력 좀 : ");
//			String id = sc.next();
//			
//			System.out.println("비밀번호 입력 좀 : ");
//			String pwd = sc.next();
//		
//			if(!map.containsKey(id)) {
//				System.out.println("아이디가 존재하지 않아");
//				continue;
//			}
//			
//			if(!map.get(id).equals(pwd)) {
//				System.out.println("패스워드 틀렸엉");
//				continue;
//			}else {
//				System.out.println("아뒤비번 맞음ㅋ");
//				break;
//			}
//		}
		//ex2
		//map 값은 순서대로 들어가지 않음
		HashMap map = new HashMap();
		
		map.put("김자바", new Integer(90));
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("안자바", new Integer(90));
		
		//set을 이용해서 key, value값을 가져올 수 있음
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		//클래스 안에 인터페이스 선언 가능(데이트 보호를 위해서)
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();	
			//Map.Entry 사용해야만 key, value 사용 가능
			
			System.out.println("이름 : " + e.getKey());
			System.out.println("점수 : " + e.getValue());
		}
		
		//key만 원할땐 set 사용
		set = map.keySet();
		it = set.iterator();
		
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		//value만 원할땐 Collection 사용
		Collection values = map.values();
		it = values.iterator();
		
		while(it.hasNext()) {
			Integer value = (Integer)it.next();
			System.out.println(value);
		}
		
		
	}

}
