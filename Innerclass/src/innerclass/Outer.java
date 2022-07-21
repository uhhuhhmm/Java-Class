package innerclass;

public class Outer {
	//내부클래스 (inner class)
	//1. 인스턴스 클래스
	//2. 스태틱 클래스
	//3. 지역 클래스
	//4. 익명 클래스
	
	//인스턴스 클래스
	class InstanceClass{
		int iv = 100;
		//static int cv = 200; 스택틱 변수는 사용할 수 없다
		final static int cv = 200; //inner class안에는 final를 꼭 붙여야함
	}
	
	//스태틱 클래스
	static class StaticClass{
		int iv = 500;
		static int cv = 200;
	}
	
	//지역 클래스
	void Method() {
		class LocalClass{
			int iv = 100;
			//static int cv = 200;
			final static int cv = 200; //static은 final 넣어야함
		}
	}
	
	
	
}
