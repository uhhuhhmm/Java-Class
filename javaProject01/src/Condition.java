import java.util.Scanner;
public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���ǹ� : ���α׷��� ���� ������ �Ǵ��� ��
		//if , switch
		
//		if(���ǽ� /*true or false*/) {
//			���๮;
//		}
		
//		int age = 25;
//		
//		if(age >= 20) {
//			System.out.println("���� �Դϴ�.");
//		}
		
//		if(���ǽ�) {
//			���๮1;
//		}else {
//			���๮2;
//		}
		
//		int age = 10;
//		if(age >= 20) {
//			System.out.println("���� �Դϴ�.");
//		}else {
//			System.out.println("�̼����� �Դϴ�.");
//		}
		
//		if(���ǽ�) {
//			���๮1
//		}else if(���ǽ�) {
//			���๮2
//		}else if(���ǽ�) {
//			���๮3
//		}else if(���ǽ�) {
//			���๮4
//		}else if(���ǽ�) {
//			���๮5
//		}else {
//			���๮6
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
//			System.out.println("���� ����ġ");
//		}
//		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������ �Է��ϼ���(0 ~ 100) : ");
//		int score = sc.nextInt();
//		
//		if(score >= 90 && score <= 100) {
//			System.out.println("A����");
//		}else if(score >= 80 && score < 90) {
//			System.out.println("B����");
//		}else if(score >= 70 && score < 80) {
//			System.out.println("C����");
//		}else if(score >= 60 && score < 70) {
//			System.out.println("D����");
//		}else if(score >= 0 && score < 60){
//			System.out.println("F����");
//		}else if(score > 100 && score < 0){
//			System.out.println("�Է� ����");
//		}
//		����
//		if(score < 0 || score > 100) {
//			System.out.println("���� �Է� ����");
//		}
//		else if(score >= 90 && score <= 100) {
//			System.out.println("A����");
//		}else if(score >= 80 && score < 90) {
//			System.out.println("B����");
//		}else if(score >= 70 && score < 80) {
//			System.out.println("C����");
//		}else if(score >= 60 && score < 70) {
//			System.out.println("D����");
//		}else {
//			System.out.println("F����");
//		}
		
		//��øif��
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
//				System.out.println("2�� 3�� ����Դϴ�.");
//			}
//		}else {
//			System.out.println("���� ����� �ƴմϴ�.");
//		}
		
//		if(num % 2 == 0 && num % 3 == 0) {
//			System.out.println("2�� 3�� ����Դϴ�.");
//		}else {
//			System.out.println("���� ����� �ƴմϴ�.");
//		}
		
//		switch(��) { // ����� == �� ���� , switch�� : ����,����,���ڿ�, ����, �Ǽ��� �Ұ���
//		case ��1 : ���๮��1; // case�� ���� �����ϰ� �߰��� ������ ���Ұ�
//		break;
//		case ��2 : ���๮��2;
//		break;
//		case ��3 : ���๮��3;
//		break;
//		default: ���๮��4 // �ʿ��ϸ�
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
//		default: System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
//		}
		
//		String s1 = "A";
//		String s2 = "A";
//		//���ڿ��� �� .equals�� ��
//		if(s1.equals(s2)) {
//		
//			System.out.println("����");
//		}
		
//		String s1 = "A";
//	
//		if(s1.equals("A")) {
//			System.out.println("����");
//		}
//		if("A".equals(s1)) {
//			System.out.println("����");
//		}
		//Switch �������� ����� �� ����

		//����������
//		Scanner scan=new Scanner(System.in);
//		int a = scan.nextInt();
//		System.out.println("����(0),����(1),��(2) �Է� : ");
//		
//		//ö��
//		if(a==0) {
//			System.out.println("ö�� : ����");
//		}
//		if(a==1) {
//			System.out.println("ö�� : ����");
//		}
//		if(a==2) {
//			System.out.println("ö�� : ��");
//		}
//
//		//����
//		if(a==0) {
//			System.out.println("���� : ����");
//		}
//		if(a==1) {
//			System.out.println("���� : ����");
//		}
//		if(a==2) {
//			System.out.println("���� : ��");
//		}
//
//		//
//		if(a==0) {
//			System.out.println("�̱�");
//		}
//		if(a==1) {
//			System.out.println("��");
//		}
//		if(a==2) {
//			System.out.println("���");
//		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.println("ö�� >>");
		String cheolsu = sc.nextLine();
		System.out.println("���� >>");
		String Younghee = sc.nextLine();
		
		if(cheolsu.equals("����")) {
			if(Younghee.equals("����")) {
				System.out.println("���");
			}else if(Younghee.equals("����")) {
				System.out.println("���� �̱�");
			}else {
				System.out.println("ö�� �̱�");
			}
		}else if(cheolsu.equals("����")) {
			if(Younghee.equals("����")) {
				System.out.println("ö�� �̱�");
			}else if(Younghee.equals("����")) {
				System.out.println("���");
			}else {
				System.out.println("���� �̱�");
			}
		}else if(cheolsu.equals("��")) {
			if(Younghee.equals("����")) {
				System.out.println("���� �̱�");
			}else if(Younghee.equals("����")) {
				System.out.println("ö�� �̱�");
			}else {
				System.out.println("���");
			}
		}
		
		sc.close();
	
	
	
	
	
	
	
	
	
	}
}
