import java.util.Scanner;
public class Var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 : 데이터를 저장하는 공간
		//데이터타입(자료형) 변수명
		
		//기본자료형 : 8개
		
//		int x; 	// 변수의 선언
//		x = 10; // 변수의 초기화
//		
//		System.out.println(x);
		
//		int x;
//		int y;
//		int z;
//		
//		x = 10;	// 대입연산자
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
		
//		클래스명 : HelloWorld1_$
//		변수명 : helloWorld1_$
//		메소드명 : helloWorld1_$()
//      상수명 : PI1_$ 대문자로 작성 		
		
//		final double PI = 3.14; // 상수
//		PI = 3.1415; error
		
//		boolean b; // true, false
//		b = true;
//		System.out.println(b);
//		
//		byte bt = 10; // -128 ~ 127
//		short s = 10; // -32500 ~ 32500
//		int i = 10;   // -21억 ~ 21억
//		long l = 10L; // 음수, 양수 13자리, 접미사 생략가능
//		
//		char c = 'A'; // 0 ~ 65570
//		
//		float f = 3.14F;
//		double d = 3.14D; // 접미사 생략가능
		
//		char c = 'A';
//		System.out.println(c);
//		
//		char c2 = 65;
//		System.out.println(c2);
//		
//		int i = 'A';
//		System.out.println(i);
//		
//		char han = '가';
//		System.out.println(han);
//		
//		int i2 = '가';
//		System.out.println(i2);
//		
//		char c3 = 44032;
//		System.out.println(c3);
//		
//		char c4 = 'B'; //66
//		char c5 = 'A'; //65
//		System.out.println(c4 - c5);
		
		//byte b = 128;
		//정수의 기본 타입은 int형이다.
		
		//float f = 3.14f;
		//실수의 기본형은 double형이다.
		//double d = 3.14;
		
//		int i = 85;
//		byte b;
//		b = i; error

		//문자열 형식
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
//		char : ' ' //조심할 것
//
//		float : 0.0f
//		double : 0.0

//		String : null

		//특수문자 : \n -> 줄바꿈
		//리터널 : 변수에 사용되는 값
		//상수 : final int MAX_VALUE = 100;
	
		//타입변환 (형 변환)
		//타입의 크기 
		//--------------------------------->자동형변환
//		byte(1)<short(2)<int(4)<long(8)<float(4)<double(8)
//				char(2) <
		// 강제형변환 <------------------------------
		
//		byte b = 85; //자동형 변환 int로
//		int i;
//		i = b;
		
//		int i = 85;
//		byte b;
//		b = (byte)i; //강제형 변환
//		System.out.println(b);
		
//		int i = 300;
//		byte b;
//		b = (byte)i;	//값의 손실
//		System.out.println(b);
		
//		byte,short,char 무조건 강제 형변환만 가능
		
//		byte b = 65;
//		char c;
//		c = (char)b;	//강제형 변환만 가능
//		System.out.println(c);
		
		//연산을 수행할 때 형변환 발생
		// 3+4,3-4
		
//		byte b1 = 10;
//		byte b2 = 20;
		
//		byte c3 = (byte)(b1 + b2);	// byte + byte = (byte)int
		
//		int 형보다 작은 타입의 연산 결과는 int형으로 형변환된다.
//		b + b = i
//		b + s = i
//		s + s = i
//		c + c = i
//		s + i = i
		
//		int형보다 큰 타입들은 큰 타입으로 형변환된다.
//		s + l = l
//		i + l = l
//		l + f = f
//		f + d = d

		//String
		//String s = "java";
		//s + 1.8 : s + "1.8" -> "java1.8"
		//System.out.println(s + 1.8);
		
//		int age = 10;
//		System.out.println("제 나이는 " + age + "살 입니다.");
		
//		String toolName="JDK";
//		toolName = toolName + 1.8;
//		System.out.println("(3,5)");
//		System.out.println(toolName + "이 출시됨");
		
		//키보드로부터 입력된 값을 받는다.
//		Scanner sc = new Scanner(System.in);
//		
//		//sc.nextLine(); //문자열을 입력 받는다.
//		//sc.nextInt();  //정수를 입력 받는다.

//		System.out.println("이름을 입력하세요: ");
//		String s = sc.nextLine();
//		System.out.println("당신의 이름은 "+ s +"입니다.");
		
//		System.out.println("나이를 입력하세요: ");
//		int age = sc.nextInt();
//		System.out.println("당신의 나이는 "+ age +"입니다.");
		
//		String name = scanner.next();
		
		
		
		
		
	}

}
