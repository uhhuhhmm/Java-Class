package collection.hashset;

import java.util.HashSet;

public class PersonTest {

	public static void main(String[] args) {
		
		//hashset equals 중요한 역할
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		
		
		//다른 객체
		Person p1 = new Person("hong",10);
		Person p2 = new Person("hong",10);
		set.add(p1);
		set.add(p2);
		
		System.out.println(set);
		
	}

}
