import java.util.Scanner;
public class Loop {

	public static void main(String[] args) {
		
		//�ݺ��� : Ư�� ���๮���� ������ �ݺ��ؼ� �����Ѵ�.
		//for, while, do ~ while
		
//		for(�ʱⰪ 1; ���ǽ� 2; ������ 4) {
//			���๮ 3
//		}
		
//		1-2-3-4-(2-3-4)-(2-3-4)
		
//		for(int i=1; i<=10; i++) {	// i = 1,2,3,4,5,6 ...10
//			System.out.println(i + ". Hello");
//		}
		
//		for(int i=10; i>=1; i--) {	// i = 10,9,8,7,6,5,4,3,2,1,0
//			System.out.println(i + ". Hello");
//		}
		
//		for(int i=1; i<=10; i+=2) {	// i = i + 2
//			System.out.println("i = " + i);
//		}
		
//		for(int i=1, j=10; i<=10; i++, j--) {
//			System.out.println("i= " + i + " j = " + j);
//		}

		//���ѷ���
//		for(;;)	{
//			System.out.println("Hello");
//		}
		
		//0+1+2+3+4+5+6+7+8+9+10
		
//		int sum = 0;
//		for(int i=1; i<=10; i++) {	// i = 1,2,3,4,5,6,7,8,9,10
//			sum = sum + i;			// sum = 0 + 1 -> 1 + 2 -> 3 + 3
//		}
//		System.out.println("sum = " + sum);
		
		//5! = 5x4x3x2x1;
		//*�� 0 ������ �ȵ�
//		int factor = 1;
//		for(int i=1; i<=5; i++) {
//			factor = factor * i;
//		}
//		System.out.println(factor);
		
		// 1 ~ 10 ������ ¦���� �հ� Ȧ���� ���� ���� ���϶�
		// �� �ݺ����� �ѹ��� ��� ����
		
//		int sum = 0;
//		int jum = 1;
//		for (int i=0, j=1; i<=10; i+=2, j+=2) {
//			sum = sum + i;
//			jum = jum + j;
//			System.out.println(jum);
//		}
//		System.out.println(jum);
//		System.out.println(sum);
		
		//����
//		int odd = 0;
//		int even = 0;
//		
//		for(int i=1; i<=10; i++) {
//			if(i % 2 == 1) {
//				odd += i;
//			}else {
//				even += i;
//			}
//		}
//		System.out.println(odd);
//		System.out.println(even);
		
//		while(���ǽ�) {
//			���๮
//		}
		
//		for(int i=1; i<=10; i++) {	// i = 1,2,3,4,5,6,7,8,9,10
//		System.out.println(i + ". Hello");
		
		
//		int i = 1;
//		while(i<=10) {	// i = 1,2,3,4,5,6,7,8,9,10,11
//			System.out.println(i + "Hello");
//			i++;
//		}
		
//		int i = 10;
//		while(i>=0) {
//			System.out.println(i + "Hello");
//			i--;
//		}
		
//		while(true) {
//			System.out.println(". Hello");
//		}
		
		//while 1 ~ 10���� ���� ���Ͻÿ�
//		int i = 1;
//		int sum = 0;
//		while(i<=10) {
//			sum = sum + i;
//			i++;			
//		}
//		System.out.println(sum);
		
//		do {
//			���๮
//		}while(���ǽ�);
		
//		int num = 5;
//		do {
//			System.out.println(num);
//		}while(num == 10);
		
//		int i = 1;
//		do {
//			System.out.println("i = " + i);
//			i++;
//		}while(i <= 10);
		
		//����
//		int i = 1;
//		do {
//			System.out.println("i = " + i);
//			i++;
//		}while(true);
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("1 ~ 5 �߿� �ϳ��� �Է��ϼ���(0�Է��ϸ� �ݺ��� ����) : ");
		
		//do while��
//		int sel;
//		do {
//			System.out.println("1 ~ 5 �߿� �ϳ��� �Է��ϼ���(0�Է��ϸ� �ݺ��� ����) : ");
//			sel = sc.nextInt();
//			
//			if(sel == 1) {
//				System.out.println("1�� ����");
//			}else if(sel == 2) {
//				System.out.println("2�� ����");
//			}else if(sel == 3) {
//				System.out.println("3�� ����");
//			}else if(sel == 4) {
//				System.out.println("4�� ����");
//			}else if(sel == 5) {
//				System.out.println("5�� ����");
//			}
//		}while(sel != 0);
		
		//while��
//		while(sel != 0) {
//			if(sel == 1) {
//				System.out.println("1�� ����");
//			}else if(sel == 2) {
//				System.out.println("2�� ����");
//			}else if(sel == 3) {
//				System.out.println("3�� ����");
//			}else if(sel == 4) {
//				System.out.println("4�� ����");
//			}else if(sel == 5) {
//				System.out.println("5�� ����");
//			}
//		System.out.println("1 ~ 5 �߿� �ϳ��� �Է��ϼ���(0�Է��ϸ� �ݺ��� ����) : ");
//		sel = sc.nextInt();
//		}
//		System.out.println("�ݺ��� ����");
		
		//���Ǳ� ���α׷�
		//1.�ݶ�(1200��) 2.���̴�(1300��) 3.Ŀ��(2200��)
		//1 ~ 3�߿� �ϳ��� �����ϼ���
		//�ʱ��ڱ� 10000������ ����
		//System.exit(0) ���α׷� ���� ��ɾ�
		//�ʱ��ڱ��� �� �̻� ������� �� �� ���� �Ǹ� ���α׷� ����
		
		//Practice
//		int cola = 1200;
//		int cyda = 1300;
//		int coffee = 2200;
//		int money, choice, change = 0;
//		
//		System.out.println("�ݾ� �Է��ϼ���.");
//		money = sc.nextInt();
//		
//		System.out.println("������ ��ǰ�� �����ϼ���.");
//		System.out.println("1.�ݶ�(1200��) 2.���̴�(1300��) 3.Ŀ��(2200��)");
//		choice = sc.nextInt();
//		
//		if(choice == 1 && money>cola) {
//			change = money - cola;
//			}
//		else if(choice == 2 && money>cyda) {
//			change = money - cyda;
//			}
//		else if(choice == 3 && money>coffee) {
//			change = money - coffee;
//			}
//		else {
//			change = money;
//			}
//		while(change <= 10000) {
//			if(choice == 1 && money>cola) {
//				change = money - cola;
//				}
//			else if(choice == 2 && money>cyda) {
//				change = money - cyda;
//				}
//			else if(choice == 3 && money>coffee) {
//				change = money - coffee;
//				}
//			else {
//				change = money;
//			}
//				System.out.println("�ܾ��� �����մϴ�.");
//			
//			}	
//		
//		}
//			System.out.println("�ܵ�" + change + "��");
		//����
//		int money = 10000;
//		
//		while(true) {
//			
//			System.out.println("1.�ݶ�(1200��) 2.���̴�(1300��) 3.Ŀ��(2200��) 4.����");
//			int sel = sc.nextInt();
//			
//			if(money < 1200 || sel == 4) {
//				System.out.println("���Ǳ� ����");
//				System.exit(0);
//			}
//						
//			if(sel == 1) {
//				if(money >= 1200) {
//					money -= 1200;
//					System.out.println("�ݶ� �����ϼ̽��ϴ�");
//				}else {
//					System.out.println("�ܾ��� �����մϴ�");
//				}
//			}else if(sel == 2) {
//				if(money >= 1300) {
//					money -= 1300;
//					System.out.println("���̴ٸ� �����ϼ̽��ϴ�");
//			}else {
//					System.out.println("�ܾ��� �����մϴ�");
//				}
//			}else if(sel == 3) {
//				if(money >= 2200) {
//					money -= 2200;
//					System.out.println("Ŀ�Ǹ� �����ϼ̽��ϴ�");
//				}else {
//					System.out.println("�ܾ��� �����մϴ�");
//				}
//			}
//			System.out.println("�ܾ��� " + money + "�� �Դϴ�");
//		}
		
		//��ø for��
//		for() {
//			for() {
//				
//			}
//		}
		
//		for(int i=1; i<=5; i++) {		// 5 * 3 = 15
//			���๮�� 5�� �ݺ�
//			for(int j=1; j<=9; j++) {	// 3
//				���๮�� 3�� �ݺ�
				
//				���� �� 15�� ����
//				System.out.println("i = " + i + " " + "j = " + j);
//			}
//		}
		
//	
//		*****		5(��) * 5 (��)
//		*****
//		*****
//		*****
//		*****
//	
		
		//����
//		for(int i=1; i<=9; i++) {	// 8		i = 2,3,4,5,6,7,8,9	
//			for(int j=2; j<=9; j++) {	// 9	j = 1,2,3,4,5,6,7,8,9
//				
//				System.out.print(j + "*" + i + "=" + i*j + "	");
//			}
//			
//			System.out.println("");
//		}
		
//		*
//		**
//		***
//		****
//		*****
		
//		for(int i=1; i<=5; i++) {	// i = 1,2,3,4,5
//			for(int j=1; j<=i; j++) {	//�ݺ��� Ƚ�� : 1,2,3,4,5
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
//		for(int i=1; i<=5; i++) {	// i = 1,2,3,4,5
//			for(int j=1; j<=i; j++) {	//*�ݺ��� Ƚ�� : 1,2,3,4,5
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
//		*****
//		****
//		***
//		**
//		*
		
//		for(int i=1; i<=5; i++) {	// i = 1,2,3,4,5
//			for(int j=1; j<=6-i; j++) {	//*�ݺ��� Ƚ�� : 5,4,3,2,1
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
//			*
//		   **
//		  ***
//		 ****
//		*****
		
//		for(int i=1; i<=5; i++) {	// 5
//			for(int j=1; j<=5; j++) {	// 5
//				if(i + j < 6) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//		}
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				if(i <= j) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println("");
//		}
		
//			*
//		   ***
//		  *****
//		 *******
//		*********  
		//practice
//		for(int i=1; i<=9; i+=2) {
//			for(int j=0; j<9; j++) {
//				if(i <= j) {
//					System.out.print(" ");
//				}else{
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//		}
		
//		for(int i=0; i<5; i++) {
//			for(int j=1; j<5-i; j++) {
//				System.out.print(" ");
//				}for(int k=0; k<i*2+1; k++) {
//					System.out.print("*");
//				}
//				System.out.println();
//		}
		
		//����
//		for (int i=1; i<=5; i++) {
//			for(int j=1; j<=5+i-1; j++) {
//				if(i + j < 6) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//		}
		
		//�ݺ����� ����
		// break, continue
//		for(int i=1; i<=10; i++) { //10�� �ݺ�
//			if(i==5) {
//				break;	//�ݺ����� ���� ����
//			}
//			System.out.println(i);
//		}
		
//		for(int i=1; i<=10; i++) { //10�� �ݺ�
//			if(i % 2 == 1) {
//				continue;	//���ǽ����� �ٽ� ���ư���, ���๮ ����
//			}
//			System.out.println(i);
//		}
		
		//break
//		int i = 0;
//				
//		while(true) {
//			
//			if(i >= 100) {
//				break;
//			}
//			
//			System.out.println(i);
//			i++;
//		}
		
		//1���� ���� ���� ������.
		//���� 100���� ū ������ �Ǹ� �ݺ����� �����Ѵ�.
		//�� �� �������� �� ���� ���ڴ� ���ΰ�?
			
		//practice
		//for���� �ڵ尡 �����
//		int i = 1;
//		int sum = 0;
//		while(true) {
//			for(i=1; i<=100; i++) {
//				sum += i;
//				System.out.println(i + sum);
//				
//			}
//			if(sum > 100) {
//				break;
//			}
//		}
		
		//����
//		int i = 1;
//		int sum = 0;
//		
//		while(true) {
//			sum += i;
//			if(sum > 100) {
//				System.out.println("i = " + i + " sum = " + sum);
//				break;
//			}
//			i++;
//		}
			
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)�� ����� ����Ͻÿ�.
		
		//����
//		int sum = 0;
//		int totalsum = 0;
//		
//		for(int i=1; i<=10; i++) {
//			sum += i;	// 0+1, 1+2, 1+2+3
//			totalsum += sum;	// 1, 1+(1+2), 1+(1+2)+(1+2+3)
//		}
//		System.out.println(sum);
//		System.out.println(totalsum);
					
		//1+(-2)+3+(-4)+. . .�� ���� ������ ��� ���س����� ��, ����� ���ؾ� ������ 100�̻��� �Ǵ��� ���Ͻÿ�.	
		
		//practice
//		int sum1 = 0;
//		int sum2 = -2;
//		
//		while(true) {
//			for(int i=1; i<=100; i+=2) {
//				sum2 -= 2;
//				sum2 += sum1;
//				System.out.println(sum2);
//			}
//			if (sum2 <= 100) {
//				break;
//			}
//
//			System.out.println(sum2);	
//		}	
			
		//����
//		int sum = 0;
//		int num = 0;
//		int sign = 1;
//		int i = 1;
//		
//		while(true) {
//			num = i * sign; // 1*1, 2*-1, 3*1
//			sum += num;	// 1 + (-2) + 3
//			if(sum >= 100) {
//				break;
//			}
//			i++;
//			sign = -sign;
//		}
//		System.out.println(num);
//		System.out.println(sum);
			
//		int num = 12345;	// 1+2+3+4+5	45678-> 4+5+6+7+8
//		int sum = 0;

//		while(num > 0) {
//			sum += num%10;	
//			num = num/10;
//		}
//		System.out.println(sum);
		
//		for(int i=10000; i>0; i/=10) {
//			sum+=num/i;
//			System.out.println(num);
//			num=num-num/i*i;
//		}
		
		
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}