package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		//ex1
//		for(int i = 0; set.size() < 6; i++) {
//			int num = (int)(Math.random() * 45) + 1;
//			set.add(num);	//num <-����Ŭ������ ��
//							//�ڵ�ó�� autoboxing Integer��
//		}
//		//compare(int, int)
//		System.out.println(set); // ��������
		
		//ex2
//		set.add("b");
//		set.add("c");
//		set.add("g");
//		set.add("a");
//		set.add("z");
//		System.out.println(set);
		//String	//compareto �������̵� ������
		
		Student s1 = new Student("ȫ�浿",1,1,100,100,100);
		Student s2 = new Student("���ü�",1,2,100,80,90);
		Student s3 = new Student("���ڹ�",1,3,80,70,100);
		Student s4 = new Student("���ڹ�",1,4,60,90,100);
		Student s5 = new Student("���ڹ�",1,5,60,90,50);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
//		System.out.println(set);
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Student s = (Student)it.next();
			System.out.println(s);
		}
	}		
	//Ʈ���� �˾Ƽ� �������� ����
}
