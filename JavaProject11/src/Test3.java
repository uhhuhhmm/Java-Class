import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		int[] number = new int[4];
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력 :");
		num = sc.nextInt();
		
		int max = number[0];
		for(int i = 0; i < number.length; i++) {
			num = sc.nextInt();
			number[i] = num;
			if(number[i] > max) {
				max = number[i];
			}
		}
		System.out.println("가장 큰 수는 : " + max);
	}

}
