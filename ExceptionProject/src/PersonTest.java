
public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person(8012231111111L, 33);
		Person p2 = new Person(8012231111111L, 33);
		
		
			//�ּҰ��� ��
		if(p1.equals(p2)) {
			System.out.println(p1);
			System.out.println(p2);
		}else {
			System.out.println("�ٸ� ��ü");
		}
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}

}
