import java.util.Scanner;
public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 조건문 : 프로그램을 실행 유무를 판단할 때
		//if , switch
		
//		if(조건식 /*true or false*/) {
//			실행문;
//		}
		
//		int age = 25;
//		
//		if(age >= 20) {
//			System.out.println("성인 입니다.");
//		}
		
//		if(조건식) {
//			실행문1;
//		}else {
//			실행문2;
//		}
		
//		int age = 10;
//		if(age >= 20) {
//			System.out.println("성인 입니다.");
//		}else {
//			System.out.println("미성년자 입니다.");
//		}
		
//		if(조건식) {
//			실행문1
//		}else if(조건식) {
//			실행문2
//		}else if(조건식) {
//			실행문3
//		}else if(조건식) {
//			실행문4
//		}else if(조건식) {
//			실행문5
//		}else {
//			실행문6
//		}
		
//		int num = 6;
//		if(num == 1) {
//			System.out.println(num);
//		}
//		if(num == 1) {
//			System.out.println(num);
//		}else if(num == 2) {
//			System.out.println(num);
//		}else if(num == 3) {
//			System.out.println(num);
//		}else if(num == 4) {
//			System.out.println(num);
//		}else if(num == 5) {
//			System.out.println(num);
//		}else {
//			System.out.println("조건 불일치");
//		}
//		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수를 입력하세요(0 ~ 100) : ");
//		int score = sc.nextInt();
//		
//		if(score >= 90 && score <= 100) {
//			System.out.println("A학점");
//		}else if(score >= 80 && score < 90) {
//			System.out.println("B학점");
//		}else if(score >= 70 && score < 80) {
//			System.out.println("C학점");
//		}else if(score >= 60 && score < 70) {
//			System.out.println("D학점");
//		}else if(score >= 0 && score < 60){
//			System.out.println("F학점");
//		}else if(score > 100 && score < 0){
//			System.out.println("입력 오류");
//		}
//		정답
//		if(score < 0 || score > 100) {
//			System.out.println("점수 입력 오류");
//		}
//		else if(score >= 90 && score <= 100) {
//			System.out.println("A학점");
//		}else if(score >= 80 && score < 90) {
//			System.out.println("B학점");
//		}else if(score >= 70 && score < 80) {
//			System.out.println("C학점");
//		}else if(score >= 60 && score < 70) {
//			System.out.println("D학점");
//		}else {
//			System.out.println("F학점");
//		}
		
		//중첩if문
//		if() {
//			if() {
//				
//			}
//		}else {
//			if() {
//				
//			}
//		}
		
//		int num = 6;
		
//		if(num % 2 == 0) {
//			if(num % 3 == 0) {
//				System.out.println("2와 3의 배수입니다.");
//			}
//		}else {
//			System.out.println("공통 배수가 아닙니다.");
//		}
		
//		if(num % 2 == 0 && num % 3 == 0) {
//			System.out.println("2와 3의 배수입니다.");
//		}else {
//			System.out.println("공통 배수가 아닙니다.");
//		}
		
//		switch(값) { // 등가연산 == 만 수행 , switch값 : 숫자,문자,문자열, 변수, 실수는 불가능
//		case 값1 : 실행문장1; // case의 값은 동일하고 추가로 변수는 사용불가
//		break;
//		case 값2 : 실행문장2;
//		break;
//		case 값3 : 실행문장3;
//		break;
//		default: 실행문장4 // 필요하면
//		}
	
		//int num = 3;
		//char c = 'A';
//		String s = "C";
		
//		switch(s) {
//		case "A": System.out.println(s);
//		break;
//		case "B": System.out.println(s);
//		break;
//		case "C": System.out.println(s);
//		break;
//		default: System.out.println("잘못 입력 하셨습니다.");
//		}
		
//		String s1 = "A";
//		String s2 = "A";
//		//문자열은 꼭 .equals로 비교
//		if(s1.equals(s2)) {
//		
//			System.out.println("같다");
//		}
		
//		String s1 = "A";
//	
//		if(s1.equals("A")) {
//			System.out.println("같다");
//		}
//		if("A".equals(s1)) {
//			System.out.println("같다");
//		}
		//Switch 범위문에 사용할 수 없음

		//가위바위보
//		Scanner scan=new Scanner(System.in);
//		int a = scan.nextInt();
//		System.out.println("가위(0),바위(1),보(2) 입력 : ");
//		
//		//철수
//		if(a==0) {
//			System.out.println("철수 : 가위");
//		}
//		if(a==1) {
//			System.out.println("철수 : 바위");
//		}
//		if(a==2) {
//			System.out.println("철수 : 보");
//		}
//
//		//영희
//		if(a==0) {
//			System.out.println("영희 : 가위");
//		}
//		if(a==1) {
//			System.out.println("영희 : 바위");
//		}
//		if(a==2) {
//			System.out.println("영희 : 보");
//		}
//
//		//
//		if(a==0) {
//			System.out.println("이김");
//		}
//		if(a==1) {
//			System.out.println("짐");
//		}
//		if(a==2) {
//			System.out.println("비김");
//		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.println("철수 >>");
		String cheolsu = sc.nextLine();
		System.out.println("영희 >>");
		String Younghee = sc.nextLine();
		
		if(cheolsu.equals("가위")) {
			if(Younghee.equals("가위")) {
				System.out.println("비김");
			}else if(Younghee.equals("바위")) {
				System.out.println("영희 이김");
			}else {
				System.out.println("철수 이김");
			}
		}else if(cheolsu.equals("바위")) {
			if(Younghee.equals("가위")) {
				System.out.println("철수 이김");
			}else if(Younghee.equals("바위")) {
				System.out.println("비김");
			}else {
				System.out.println("영희 이김");
			}
		}else if(cheolsu.equals("보")) {
			if(Younghee.equals("가위")) {
				System.out.println("영희 이김");
			}else if(Younghee.equals("바위")) {
				System.out.println("철수 이김");
			}else {
				System.out.println("비김");
			}
		}
		
		sc.close();
	
	
	
	
	
	
	
	
	
	}
}

