package innerclass;

public class OuterTest {

	public static void main(String[] args) {
		Outer out = new Outer();
		//�ν��Ͻ� Ŭ���� ���� ���
		Outer.InstanceClass oi = out.new InstanceClass();
		System.out.println(oi.iv);
		
		//����ƽ Ŭ���� ���� ���
		System.out.println(Outer.StaticClass.cv);
		
		Outer.StaticClass os = new Outer.StaticClass();
		System.out.println(os.iv);
		
		
		
		
		
	}

}
