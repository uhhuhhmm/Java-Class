
public class PersonTest {

	public static void main(String[] args) {
		
		//1.Ŭ������ ���� �Ѵ�
		//2.��ü�� �����Ѵ� (�޸𸮿� ����� �Ҵ�)
		//3.���������� ���� ��������� �޼ҵ带 ����Ѵ�
		
		Person p1 = new Person();	//��ü����(�޸𸮿� member������ �޼ҵ带 �Ҵ��ߴ�)
	//������ Ÿ�� �����̸�(���� ����)
		p1.name = "Hong Gildong";
		p1.age = 10;
		p1.job = "Developer";
				
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.job);
		
		p1.work();
		p1.leaveWork();
		
		Person p2 = new Person();
		p2.name = "Lee sin";
		p2.age = 99;
		p2.job = "WhereIgo";
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.job);
		
		p2.work();
		p2.leaveWork();
		
		p2 = p1;
		
		p1.name = "Park Gun";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		//���������� Garbage Collection (�ڵ� ȸ��)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
