
public class ArrayTest {

	public static void main(String[] args) {
//		int a,b,c,d,e;
//		a=10;
//		b=20;
//		c=30;
//		d=40;
//		e=50;
		
		//System.out.println(a);
		
		//�迭 : Ÿ���� ������ ������ ������ ����� ����
		//�迭�� �����͸� ����ó���Ѵ�
		//�迭�� ������ ũ�⸦ ���ϸ� ũ�Ⱑ ������� �ʴ´�
		//1���� �迭�� ������ �迭
		
//		int[] arr; // �迭 ������ ����
//		arr = new int[5]; // �迭�� ����
		
//		int[] arr = new int[5];	 //����� ����

//		arr[0] = 10;	//�迭�� �ʱ�ȭ
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
//		int[] arr = {10,20,30,40,50}; // ����, ����, �ʱ�ȭ
//
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
//		int[] arr = {10,20,30,40,50,60,70,80,90};
		//ũ�Ⱑ ������ ���� for��
//		for(int i=0; i<5; i++) {
//			System.out.println(arr[i]);
//		}
		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//	�߿�	int[] arr2 = arr;	//Ư¡ : �ּҰ��� �Ű���
//		
//		for(int i=0; i<arr2.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//		int[] arr = new int[10];
		
		//�ݺ����� ����Ͽ� 1 ~ 10 ���� ������ �ʱ�ȭ
		//�迭�� ����� ���� ���� ����ϴ� �ڵ� �ۼ�
		//ex
//		int[] arr = new int[10];
//		int sum = 0;
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = i + 1;
//			sum += arr[i];
//			System.out.println(arr[i]);
//		}
//		System.out.println(sum);
		
//		int[] arr = {9,23,43,5,13};
		
		//�迭�� �� �߿� �ִ밪�� ����ϼ���
		
		//ex
//		int max = 0;
//		for(int i=0; i<5; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println(max);
		
		//����
//		int max = arr[0];
//		
//		for(int i=1; i<arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		
//		System.out.println(max);
		
		//���� for��
//		for(���� : �迭�̸�) {
//			���๮
//		}
		
		//���, �ݺ��� ���� ���Ǹ� �� �ʿ䰡 ����
//		for(int num : arr) {
//			System.out.println(num);
//		}
		
		//���� for�� ���ڵ� ����
//		char[] cArr = {'a', 'b', 'c'};
//		
//		for(char c : cArr) {
//			System.out.println(c);
//		}

		//�ζ� �����
		//1 ~ 45���̿� 6���� ���ڸ� �����
		
		//����(����)
		//Math.random()	// 0.0 <= ? < 1.0	0.0 ~ 0.99999
		//System.out.println(Math.random());
		//(int)Math.random() * ������ �� ����) + ������ ���� ������

		
		
		
//		int ran = (int)(Math.random() * 45) + 1;
//		System.out.println(ran);
		
//		for(int i=0; i<6; i++) {
//			int ran = (int)(Math.random() * 45) + 1;
//			System.out.println(ran);
//		}
		
		//���� ��ȯ(Swap) �ӽ� ���� �ʿ�
//		int temp;
//		int x = 10;
//		int y = 20;

//		temp = x; //1
//		x = y; 	  //2
//		y = temp; //3
		
//		System.out.println("x = " + x + ", y = " + y);
	
		//�ζ� �����
//		int[] lotto = new int[45];
//		
//		for(int i=0; i<lotto.length; i++) {
//			lotto[i] = i + 1;
//			
////			System.out.println(lotto[i]);
//		}
//		for(int i=0; i<200; i++) {
//			
//			int ran = (int)(Math.random() * 45);
//			
//			int temp;
//			
//			temp = lotto[0];
//			lotto[0] = lotto[ran];
//			lotto[ran] = temp;
//		}
//		for(int i=0; i<6; i++) {
//			System.out.println(lotto[i]);
//		}
		
		
		//ȸ�� : �丶��, �ⷯ��, noon, level

//		char[] c = {'n','o','o','n'};
//		
//		int length = c. length;
//		boolean is = true;
//		
//		for(int i=0; i < length / 2; i++) {
//			if(c[i] != c[length-i-1]) {
//				is = false;
//				break;
//			}
//		}
//		
//		String s = is ? "ȸ���Դϴ�" : "ȸ���� �ƴմϴ�";
//		System.out.println(s);
		
		// ���� : ��������, ��������
		// 1,2,3,4		4,3,2,1
		
		int[] arr = { 3,7,2,8,5,9,1 };
		
		// �������� : ��������
		
//		for(int i = 0; i<arr.length-1; i++) {
//			for(int j = i + 1; j<arr.length;j++) {
//				if(arr[i] > arr[j]) {
//					int tmp;
//					tmp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = tmp;
//				}
//				
//			}
//		}
//		
//		for(int num : arr) {
//			System.out.print(num + ", ");
//		}
		
		// �������� : ��������
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = i + 1; j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					int tmp;
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
				
			}
		}
		
		for(int num : arr) {
			System.out.print(num + ", ");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}