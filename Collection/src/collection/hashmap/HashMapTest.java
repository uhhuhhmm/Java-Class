package collection.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
//		HashMap map = new HashMap();
		//��ü�� ���� �޴´�
		//key, value
		//1ex
//		map.put("myId", "1234");
//		map.put("asdf", "1111");
//		map.put("asdf", "1234");
//		//key ���ο� ���� ������ ���ο� ������ ����,  unique
//		//value�� �ߺ��� �����
////		System.out.println(map);
//		//���̵� ��� ���߱�
//		Scanner sc =  new Scanner(System.in);
//		
//		boolean b = true;
//	
//		while(b) {
//			System.out.println("���̵� �Է� �� : ");
//			String id = sc.next();
//			
//			System.out.println("��й�ȣ �Է� �� : ");
//			String pwd = sc.next();
//		
//			if(!map.containsKey(id)) {
//				System.out.println("���̵� �������� �ʾ�");
//				continue;
//			}
//			
//			if(!map.get(id).equals(pwd)) {
//				System.out.println("�н����� Ʋ�Ⱦ�");
//				continue;
//			}else {
//				System.out.println("�Ƶں�� ������");
//				break;
//			}
//		}
		//ex2
		//map ���� ������� ���� ����
		HashMap map = new HashMap();
		
		map.put("���ڹ�", new Integer(90));
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(80));
		map.put("���ڹ�", new Integer(90));
		
		//set�� �̿��ؼ� key, value���� ������ �� ����
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		//Ŭ���� �ȿ� �������̽� ���� ����(����Ʈ ��ȣ�� ���ؼ�)
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();	
			//Map.Entry ����ؾ߸� key, value ��� ����
			
			System.out.println("�̸� : " + e.getKey());
			System.out.println("���� : " + e.getValue());
		}
		
		//key�� ���Ҷ� set ���
		set = map.keySet();
		it = set.iterator();
		
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		//value�� ���Ҷ� Collection ���
		Collection values = map.values();
		it = values.iterator();
		
		while(it.hasNext()) {
			Integer value = (Integer)it.next();
			System.out.println(value);
		}
		
		
	}

}
