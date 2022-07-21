package innerclass;

public class Outer {
	//����Ŭ���� (inner class)
	//1. �ν��Ͻ� Ŭ����
	//2. ����ƽ Ŭ����
	//3. ���� Ŭ����
	//4. �͸� Ŭ����
	
	//�ν��Ͻ� Ŭ����
	class InstanceClass{
		int iv = 100;
		//static int cv = 200; ����ƽ ������ ����� �� ����
		final static int cv = 200; //inner class�ȿ��� final�� �� �ٿ�����
	}
	
	//����ƽ Ŭ����
	static class StaticClass{
		int iv = 500;
		static int cv = 200;
	}
	
	//���� Ŭ����
	void Method() {
		class LocalClass{
			int iv = 100;
			//static int cv = 200;
			final static int cv = 200; //static�� final �־����
		}
	}
	
	
	
}
