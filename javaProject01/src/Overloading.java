
public class Overloading {
	//�޼ҵ� �����ε�
	//1.�޼ҵ��� �̸��� �����ϴ�
	//2.�Ű������� �޶���Ѵ�(������ �ٸ��ų� �Ǵ� Ÿ���� �ٸ��ų�)
	//3.����Ÿ���� �������
	
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
//	} ������ �޼ҵ�� �����ε� �Ұ�
	
	
	
	
	
	
	
	
	
	
}
