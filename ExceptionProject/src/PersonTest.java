
public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person(8012231111111L, 33);
		Person p2 = new Person(8012231111111L, 33);
		
		
			//주소값이 비교
		if(p1.equals(p2)) {
			System.out.println(p1);
			System.out.println(p2);
		}else {
			System.out.println("다른 객체");
		}
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}

}
