package innerclass;

public class OuterTest {

	public static void main(String[] args) {
		Outer out = new Outer();
		//인스턴스 클래스 생성 방식
		Outer.InstanceClass oi = out.new InstanceClass();
		System.out.println(oi.iv);
		
		//스태틱 클래스 생성 방식
		System.out.println(Outer.StaticClass.cv);
		
		Outer.StaticClass os = new Outer.StaticClass();
		System.out.println(os.iv);
		
		
		
		
		
	}

}
