import java.util.Scanner;
public class Var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� : �����͸� �����ϴ� ����
		//������Ÿ��(�ڷ���) ������
		
		//�⺻�ڷ��� : 8��
		
//		int x; 	// ������ ����
//		x = 10; // ������ �ʱ�ȭ
//		
//		System.out.println(x);
		
//		int x;
//		int y;
//		int z;
//		
//		x = 10;	// ���Կ�����
//		y = 20;
//		z = 30;
//		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
		
//		int x,y,z;
//		x = 10;
//		y = 20;
//		z = 30;
//		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
		
//		int x,y,z;
//		x=y=z=100;
//		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
		
//		Ŭ������ : HelloWorld1_$
//		������ : helloWorld1_$
//		�޼ҵ�� : helloWorld1_$()
//      ����� : PI1_$ �빮�ڷ� �ۼ� 		
		
//		final double PI = 3.14; // ���
//		PI = 3.1415; error
		
//		boolean b; // true, false
//		b = true;
//		System.out.println(b);
//		
//		byte bt = 10; // -128 ~ 127
//		short s = 10; // -32500 ~ 32500
//		int i = 10;   // -21�� ~ 21��
//		long l = 10L; // ����, ��� 13�ڸ�, ���̻� ��������
//		
//		char c = 'A'; // 0 ~ 65570
//		
//		float f = 3.14F;
//		double d = 3.14D; // ���̻� ��������
		
//		char c = 'A';
//		System.out.println(c);
//		
//		char c2 = 65;
//		System.out.println(c2);
//		
//		int i = 'A';
//		System.out.println(i);
//		
//		char han = '��';
//		System.out.println(han);
//		
//		int i2 = '��';
//		System.out.println(i2);
//		
//		char c3 = 44032;
//		System.out.println(c3);
//		
//		char c4 = 'B'; //66
//		char c5 = 'A'; //65
//		System.out.println(c4 - c5);
		
		//byte b = 128;
		//������ �⺻ Ÿ���� int���̴�.
		
		//float f = 3.14f;
		//�Ǽ��� �⺻���� double���̴�.
		//double d = 3.14;
		
//		int i = 85;
//		byte b;
//		b = i; error

		//���ڿ� ����
//		String s = "A";
//		String s2 = "ABC";
//		
//		System.out.println(s);
//		System.out.println(s2);

//		boolean : false
//		byte : 0
//		short : 0
//		int : 0
//		long : 0
//		char : ' ' //������ ��
//
//		float : 0.0f
//		double : 0.0

//		String : null

		//Ư������ : \n -> �ٹٲ�
		//���ͳ� : ������ ���Ǵ� ��
		//��� : final int MAX_VALUE = 100;
	
		//Ÿ�Ժ�ȯ (�� ��ȯ)
		//Ÿ���� ũ�� 
		//--------------------------------->�ڵ�����ȯ
//		byte(1)<short(2)<int(4)<long(8)<float(4)<double(8)
//				char(2) <
		// ��������ȯ <------------------------------
		
//		byte b = 85; //�ڵ��� ��ȯ int��
//		int i;
//		i = b;
		
//		int i = 85;
//		byte b;
//		b = (byte)i; //������ ��ȯ
//		System.out.println(b);
		
//		int i = 300;
//		byte b;
//		b = (byte)i;	//���� �ս�
//		System.out.println(b);
		
//		byte,short,char ������ ���� ����ȯ�� ����
		
//		byte b = 65;
//		char c;
//		c = (char)b;	//������ ��ȯ�� ����
//		System.out.println(c);
		
		//������ ������ �� ����ȯ �߻�
		// 3+4,3-4
		
//		byte b1 = 10;
//		byte b2 = 20;
		
//		byte c3 = (byte)(b1 + b2);	// byte + byte = (byte)int
		
//		int ������ ���� Ÿ���� ���� ����� int������ ����ȯ�ȴ�.
//		b + b = i
//		b + s = i
//		s + s = i
//		c + c = i
//		s + i = i
		
//		int������ ū Ÿ�Ե��� ū Ÿ������ ����ȯ�ȴ�.
//		s + l = l
//		i + l = l
//		l + f = f
//		f + d = d

		//String
		//String s = "java";
		//s + 1.8 : s + "1.8" -> "java1.8"
		//System.out.println(s + 1.8);
		
//		int age = 10;
//		System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
		
//		String toolName="JDK";
//		toolName = toolName + 1.8;
//		System.out.println("(3,5)");
//		System.out.println(toolName + "�� ��õ�");
		
		//Ű����κ��� �Էµ� ���� �޴´�.
//		Scanner sc = new Scanner(System.in);
//		
//		//sc.nextLine(); //���ڿ��� �Է� �޴´�.
//		//sc.nextInt();  //������ �Է� �޴´�.

//		System.out.println("�̸��� �Է��ϼ���: ");
//		String s = sc.nextLine();
//		System.out.println("����� �̸��� "+ s +"�Դϴ�.");
		
//		System.out.println("���̸� �Է��ϼ���: ");
//		int age = sc.nextInt();
//		System.out.println("����� ���̴� "+ age +"�Դϴ�.");
		
//		String name = scanner.next();
		
		
		
		
		
	}

}