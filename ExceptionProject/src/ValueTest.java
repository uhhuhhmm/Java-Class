
public class ValueTest {

	public static void main(String[] args) {

		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
			//�ּҰ� ��
		if(v1.equals(v2)) {
			System.out.println("����");
		}
		
		if(v1 == v2) {
			System.out.println("����");
		}
	}

}
