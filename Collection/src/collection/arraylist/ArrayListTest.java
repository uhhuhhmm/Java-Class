package collection.arraylist;

import java.util.*;

public class ArrayListTest {
	
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		ArrayList<Integer> list = new ArrayList<Integer>(); //obj타입을 String으로 변경
//		int sum = 0;
//		list.add(1);
//		list.add(6);
//		list.add(3);
//		list.add(10);
//		list.add(5);
//		list.add(2);
//		list.add(7);
//		list.add(5);
//		list.add(9);
//		list.add(3);
//		
//		Collections.sort(list); //기본은 오름차순
//		
////		list.sort(c);
////		list.add(1);
////		list.add(new Double(4.3));
//		
//		//제네릭
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		//1 list 값을 출력한다
		//2 list 값을 모두 더해서 출력한다
		//parseInt 쓰는법
//		for(int i = 0; i < list.size(); i++) {
//			String it = (String)list.get(i);
//			System.out.println(it);
//		}
//		
//		for(int i = 0; i < list.size(); i++) {
//			String it = (String)list.get(i);
//			int num = Integer.parseInt(it);
//			sum += num;
//		}
//		System.out.println(sum);		
		
//		Integer i1 = new Integer(1);
//		list.add(i1);
//		list.add(new Integer(2));
//		list.add(new Integer(3));
//		list.add(new Integer(4));
//		list.add(new Integer(5));
		
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
		
		//AutoBoxing
//		int i = 10;
//		Integer it = 10;
//		Object obj = 10;
		
//		Object obj = i;	//직접적으로 안됨
//		i = obj;
		
//		Integer r1 = (Integer)list.get(0);
//		System.out.println(r1); //1 찍히는 이유는 Auto-parking
		
//		for(int i = 0; i < list.size(); i++) {
//			Integer it = (Integer)list.get(i);
//			System.out.println(it);
//		}
//		
//		System.out.println("========================");
//		
//		list.clear();
//		
//		for(int i = 0; i < list.size(); i++) {
//		Integer it = (Integer)list.get(i);
//		System.out.println(it);
//		}
		
//		for(int i = 0; i < list.size(); i++) {
//			list.remove(i);
//		}
		
//		list.remove(0);
		
//		for(int i = 0; i < list.size(); i++) {
//			Integer it = (Integer)list.get(i);
//			System.out.println(it);
//		}
		
		//Stack
//		Stack st = new Stack();
//		
//		st.push("0");
//		st.push("1");
//		st.push("2");
//		
//		while(!st.empty()) {	//비어있는지 확인
//			System.out.println((String)st.pop()); //pop 불러오기
//		}
		
		//Stack 실행구문
//		goURL("1.네이트");
//		goURL("2.구글");
//		goURL("3.네이버");
//		goURL("4.다음");
//		
//		printStatus();
//		
//		goBack();
//		printStatus();
//		
//		goBack();
//		printStatus();
//		
//		goForward();
//		printStatus();
//		
//		goURL("1.TIS");
//		printStatus();

		//반복자 패턴(Iterator)
		ArrayList list = new ArrayList(); //가장 많이 쓰이는 Collection
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		//1단계
		Iterator it = list.iterator();
		//읽는 방식의 표준화
		while(it.hasNext()) {	
		//값의 유무 체크해주는 역할 array는 순착적으로 들어오기 때문에 null 나오면 끝
			String s = (String)it.next();
			System.out.println(s);
		}
		
		
	}
	//Stack
//	public static void goURL(String url) {
//		back.push(url);
//		if(!forward.empty()) {
//			forward.clear();
//		}
//	}
//	public static void goBack() {
//		if(!back.empty()) {
//			forward.push(back.pop());
//		}
//	}
//	public static void goForward() {
//		if(!forward.empty()) {
//			back.push(forward.pop());
//		}
//	}
//	public static void printStatus() {
//		System.out.println("back : " + back);
//		System.out.println("forward : " + forward);
//		
//		System.out.println("현재 실행중인 화면 : " + back.peek());
//	}
	
	
	
}
