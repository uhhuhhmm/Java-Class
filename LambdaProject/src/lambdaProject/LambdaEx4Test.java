package lambdaProject;

import java.util.ArrayList;

public class LambdaEx4Test {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		for(int num : list) {
			System.out.println(num);
		}
		// void forEach(Consumer<T> action)
		list.forEach(i -> System.out.println(i + " "));
			//accept()��� �޼ҵ尡 �ڵ�ȣ���
		
	}

}
