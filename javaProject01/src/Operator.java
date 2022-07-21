
public class Operator {

	public static void main(String[] args) {
		
		// 산술연산자
		// +,-,*,/,%
		
//		int x = 5;
//		int y = 2;
//		
//		System.out.println("몫 : " + x / y);
//		System.out.println("나머지 : " + x % y);
		
		// 증감 연산자 : 변수에만 사용 가능
		// ++, --
		// 전치, 후치
		// 변수의 값을 1증가, 1감소
		
//		int x = 10;
//		++x;
//		System.out.println(x);
//		x++;
//		System.out.println(x);
		
//		int x = 10;
//		int y = 0;
//		y = y + x++;	// 전치 y = 11 , x = 11
//						// 후치 y = 10 , x = 11
//		System.out.println("x= " + x + ", y =" + y);
		
		//대입 : 변수에 값을 대입
		// :, +=, -=, *=, /=, %=, <<=,....
//		int x = 10;
//		int y = 10;
//		
//		y += x; // y = y + x
//		System.out.println(y);
		
		//비교연산자 :  두개의 값을 비교하여 결과를 true or false 취한다.
		//<,>,<=,>=,==,!=,===
		
//		int x = 10;
//		int y = 20;
//		
//		boolean b = x < y;
//		System.out.println(b);
//		b = x == y;
//		System.out.println(b);
//		b = x != y;
//		System.out.println(b);
	
		//논리연산자 : 조건이 두개 이상 일때
		// &&,||,!
		// 피연산자 true or false
		
		//AND 연산
//		모든 조건을 만족할 때만 결과가 true
//		true && true 	-> true
//		true && false 	-> false
//		false && true 	-> false
//		false && false 	-> false
		
//		int x = 10;
//		boolean result = x == 10 && x <= 0 && x != 10;	// true && true
//		System.out.println(result);
		
		//OR 연산
//		모든 조건이 만족되지 않을때만 false
//		true || true 	-> true
//		true || false 	-> t
//		false || true 	-> t
//		false || false 	-> f
		
//		result = x != 10 || x <= 0;
//		System.out.println(result);
		
//		boolean b = true;
//		b= !b;
//		System.out.println(b);
		
//		int x = 5;
//		
//		boolean result = x >= 1 && x <= 10;
//		System.out.println(result);
		
//		int x = 5;
//		boolean result = x < 1 || x > 10;
//		System.out.println(result);

		//조건연산자
		// 조건식 ? 결과1(t) : 결과2(f) 
		
//		int x = 10;
//		int y = 20;
//		
//		int result = x > y ? x : y;
//		System.out.println(result);
	
//		String z;
//		z = x < y ? "참":"거짓";
		
//		int apple = 123;
//		int basket = 10;
//		int numbasket = (int) Math.ceil((double)apple / basket);
//		System.out.println(numbasket + "개");
		
//		int appleNum = 123;
//		int bucketSize = 10;
		
//		int bucket = appleNum / bucketSize; //바구니의 갯수
//		int ext = appleNum % bucketSize;
//		ext = ext > 0 ? 1 : 0;
//		System.out.println(bucket + ext + "개");
		
//		int bucket = appleNum / bucketSize + (appleNum % bucketSize > 0 ? 1 : 0);
//		System.out.println(bucket + "개");

		//주어진 조건으로 식을 어케 만드는지
//		int num = 888;
//		int result = num / 10 * 10 + 1;
//		System.out.println(result);
		
//		int num = 24;
//		int multi = num <= 30 ? 30 : 0;
//		int result = multi -= num;
//		System.out.println(result);

//		int num = 24;
//		int result = 10 - num  % 10;
//		System.out.println(result);
		
		
		
	}

}
