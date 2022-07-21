import java.util.Scanner;
public class Loop {

	public static void main(String[] args) {
		
		//반복문 : 특정 실행문장을 여러번 반복해서 실행한다.
		//for, while, do ~ while
		
//		for(초기값 1; 조건식 2; 증감값 4) {
//			실행문 3
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

		//무한루프
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
		//*라서 0 넣으면 안됨
//		int factor = 1;
//		for(int i=1; i<=5; i++) {
//			factor = factor * i;
//		}
//		System.out.println(factor);
		
		// 1 ~ 10 정수의 짝수에 합과 홀수에 합을 각각 구하라
		// 단 반복문은 한번만 사용 가능
		
//		int sum = 0;
//		int jum = 1;
//		for (int i=0, j=1; i<=10; i+=2, j+=2) {
//			sum = sum + i;
//			jum = jum + j;
//			System.out.println(jum);
//		}
//		System.out.println(jum);
//		System.out.println(sum);
		
		//정답
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
		
//		while(조건식) {
//			실행문
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
		
		//while 1 ~ 10까지 합을 구하시오
//		int i = 1;
//		int sum = 0;
//		while(i<=10) {
//			sum = sum + i;
//			i++;			
//		}
//		System.out.println(sum);
		
//		do {
//			실행문
//		}while(조건식);
		
//		int num = 5;
//		do {
//			System.out.println(num);
//		}while(num == 10);
		
//		int i = 1;
//		do {
//			System.out.println("i = " + i);
//			i++;
//		}while(i <= 10);
		
		//무한
//		int i = 1;
//		do {
//			System.out.println("i = " + i);
//			i++;
//		}while(true);
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("1 ~ 5 중에 하나를 입력하세요(0입력하면 반복문 종료) : ");
		
		//do while문
//		int sel;
//		do {
//			System.out.println("1 ~ 5 중에 하나를 입력하세요(0입력하면 반복문 종료) : ");
//			sel = sc.nextInt();
//			
//			if(sel == 1) {
//				System.out.println("1번 선택");
//			}else if(sel == 2) {
//				System.out.println("2번 선택");
//			}else if(sel == 3) {
//				System.out.println("3번 선택");
//			}else if(sel == 4) {
//				System.out.println("4번 선택");
//			}else if(sel == 5) {
//				System.out.println("5번 선택");
//			}
//		}while(sel != 0);
		
		//while문
//		while(sel != 0) {
//			if(sel == 1) {
//				System.out.println("1번 선택");
//			}else if(sel == 2) {
//				System.out.println("2번 선택");
//			}else if(sel == 3) {
//				System.out.println("3번 선택");
//			}else if(sel == 4) {
//				System.out.println("4번 선택");
//			}else if(sel == 5) {
//				System.out.println("5번 선택");
//			}
//		System.out.println("1 ~ 5 중에 하나를 입력하세요(0입력하면 반복문 종료) : ");
//		sel = sc.nextInt();
//		}
//		System.out.println("반복문 종료");
		
		//자판기 프로그램
		//1.콜라(1200원) 2.사이다(1300원) 3.커피(2200원)
		//1 ~ 3중에 하나를 선택하세요
		//초기자금 10000원으로 설정
		//System.exit(0) 프로그램 종료 명령어
		//초기자금이 더 이상 음료수를 살 수 없게 되면 프로그램 종료
		
		//Practice
//		int cola = 1200;
//		int cyda = 1300;
//		int coffee = 2200;
//		int money, choice, change = 0;
//		
//		System.out.println("금액 입력하세요.");
//		money = sc.nextInt();
//		
//		System.out.println("구매할 물품을 선택하세요.");
//		System.out.println("1.콜라(1200원) 2.사이다(1300원) 3.커피(2200원)");
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
//				System.out.println("잔액이 부족합니다.");
//			
//			}	
//		
//		}
//			System.out.println("잔돈" + change + "원");
		//예제
//		int money = 10000;
//		
//		while(true) {
//			
//			System.out.println("1.콜라(1200원) 2.사이다(1300원) 3.커피(2200원) 4.종료");
//			int sel = sc.nextInt();
//			
//			if(money < 1200 || sel == 4) {
//				System.out.println("자판기 종료");
//				System.exit(0);
//			}
//						
//			if(sel == 1) {
//				if(money >= 1200) {
//					money -= 1200;
//					System.out.println("콜라를 구매하셨습니다");
//				}else {
//					System.out.println("잔액이 부족합니다");
//				}
//			}else if(sel == 2) {
//				if(money >= 1300) {
//					money -= 1300;
//					System.out.println("사이다를 구매하셨습니다");
//			}else {
//					System.out.println("잔액이 부족합니다");
//				}
//			}else if(sel == 3) {
//				if(money >= 2200) {
//					money -= 2200;
//					System.out.println("커피를 구매하셨습니다");
//				}else {
//					System.out.println("잔액이 부족합니다");
//				}
//			}
//			System.out.println("잔액은 " + money + "원 입니다");
//		}
		
		//중첩 for문
//		for() {
//			for() {
//				
//			}
//		}
		
//		for(int i=1; i<=5; i++) {		// 5 * 3 = 15
//			실행문을 5번 반복
//			for(int j=1; j<=9; j++) {	// 3
//				실행문을 3번 반복
				
//				내용 총 15번 실행
//				System.out.println("i = " + i + " " + "j = " + j);
//			}
//		}
		
//	
//		*****		5(행) * 5 (열)
//		*****
//		*****
//		*****
//		*****
//	
		
		//나열
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
//			for(int j=1; j<=i; j++) {	//반복의 횟수 : 1,2,3,4,5
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
//		for(int i=1; i<=5; i++) {	// i = 1,2,3,4,5
//			for(int j=1; j<=i; j++) {	//*반복의 횟수 : 1,2,3,4,5
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
//			for(int j=1; j<=6-i; j++) {	//*반복의 횟수 : 5,4,3,2,1
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
		
		//예제
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
		
		//반복문의 제어
		// break, continue
//		for(int i=1; i<=10; i++) { //10번 반복
//			if(i==5) {
//				break;	//반복문의 강제 종료
//			}
//			System.out.println(i);
//		}
		
//		for(int i=1; i<=10; i++) { //10번 반복
//			if(i % 2 == 1) {
//				continue;	//조건식으로 다시 돌아가라, 실행문 제어
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
		
		//1부터 값을 더해 나간다.
		//합이 100보다 큰 시점이 되면 반복문을 종료한다.
		//그 때 마지막에 더 해진 숫자는 얼마인가?
			
		//practice
		//for문은 코드가 길어짐
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
		
		//예제
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
			
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		
		//예제
//		int sum = 0;
//		int totalsum = 0;
//		
//		for(int i=1; i<=10; i++) {
//			sum += i;	// 0+1, 1+2, 1+2+3
//			totalsum += sum;	// 1, 1+(1+2), 1+(1+2)+(1+2+3)
//		}
//		System.out.println(sum);
//		System.out.println(totalsum);
					
		//1+(-2)+3+(-4)+. . .과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.	
		
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
			
		//예제
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