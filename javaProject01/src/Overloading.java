
public class Overloading {
	//메소드 오버로딩
	//1.메소드의 이름이 동일하다
	//2.매개변수는 달라야한다(갯수가 다르거나 또는 타입이 다르거나)
	//3.리턴타입은 상관없다
	
//	void add() {
//		
//		System.out.println(10);
//		System.out.println(12.4);
//		System.out.println("Hello");
//		
//	};
//	void add(int x) {};
//	void add(double x) {};
//	void add(int x, int y) {};
//	void add(int x, long y) {};
//	void add(long x, int y) {};
//	int add() {};
	
	int add(int x, int y) {
		return x + y;
	}
	
	long add(int x, long y) {
		return x + y;
	}
	
	long add(long x, int y) {
		return x + y;
	}
	
	int add(int[] arr) {
		int sum = 0;
		for(int num : arr) {
			sum += num;
		}
		return sum;
	}
	
	void concat(String ... str) {
		
		String concat = "";
		
		for(String s : str) {
			concat += s;
		}
		
		System.out.println(concat);
	}
	
//	void concat(int i, String ...strings str) {
//		
//	} 가변형 메소드는 오버로딩 불가
	
	
	
	
	
	
	
	
	
	
}
