package collection.arraylist;

import java.util.*;

public class ArrayListTest {
	
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		ArrayList<Integer> list = new ArrayList<Integer>(); //objŸ���� String���� ����
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
//		Collections.sort(list); //�⺻�� ��������
//		
////		list.sort(c);
////		list.add(1);
////		list.add(new Double(4.3));
//		
//		//���׸�
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		//1 list ���� ����Ѵ�
		//2 list ���� ��� ���ؼ� ����Ѵ�
		//parseInt ���¹�
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
		
//		Object obj = i;	//���������� �ȵ�
//		i = obj;
		
//		Integer r1 = (Integer)list.get(0);
//		System.out.println(r1); //1 ������ ������ Auto-parking
		
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
//		while(!st.empty()) {	//����ִ��� Ȯ��
//			System.out.println((String)st.pop()); //pop �ҷ�����
//		}
		
		//Stack ���౸��
//		goURL("1.����Ʈ");
//		goURL("2.����");
//		goURL("3.���̹�");
//		goURL("4.����");
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

		//�ݺ��� ����(Iterator)
		ArrayList list = new ArrayList(); //���� ���� ���̴� Collection
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		//1�ܰ�
		Iterator it = list.iterator();
		//�д� ����� ǥ��ȭ
		while(it.hasNext()) {	
		//���� ���� üũ���ִ� ���� array�� ���������� ������ ������ null ������ ��
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
//		System.out.println("���� �������� ȭ�� : " + back.peek());
//	}
	
	
	
}
