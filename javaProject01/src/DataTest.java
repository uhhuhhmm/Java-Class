
public class DataTest {

	public static void main(String[] args) {

		int[] arr = {10};
		
		System.out.println(arr[0]);
		
		change(arr);
		
		System.out.println(arr[0]);
		
//		Data d = new Data();
//		d.x = 10;	// int x = 10;
//		System.out.println(d.x);
//		������
//		change(d);
//		
//		System.out.println(d.x);
//		�⺻��
//		change(d.x);
//		
//		System.out.println(d.x);
		
	}
	
	static void change(int[] arr) {	//�迭 ������
		arr[0] = 500;
		System.out.println("change() x =  " + arr[0]);
	}

//	static void change(Data d) { //������
//		d.x = 1000;
//		System.out.println("change() x = " + d.x);
//	}
	
//	static void change(int x) {  //�⺻��
//		x = 1000;
//		System.out.println("change() x =  " + x);
//	}
	
	
}
