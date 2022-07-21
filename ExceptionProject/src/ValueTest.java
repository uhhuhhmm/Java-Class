
public class ValueTest {

	public static void main(String[] args) {

		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
			//주소값 비교
		if(v1.equals(v2)) {
			System.out.println("같다");
		}
		
		if(v1 == v2) {
			System.out.println("같다");
		}
	}

}
