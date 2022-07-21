
public class ArrayTest {

	public static void main(String[] args) {
//		int a,b,c,d,e;
//		a=10;
//		b=20;
//		c=30;
//		d=40;
//		e=50;
		
		//System.out.println(a);
		
		//배열 : 타입이 동일한 변수를 여러개 만드는 과정
		//배열은 데이터를 순차처리한다
		//배열은 생성시 크기를 정하면 크기가 변경되지 않는다
		//1차원 배열과 다차원 배열
		
//		int[] arr; // 배열 변수의 선언
//		arr = new int[5]; // 배열의 생성
		
//		int[] arr = new int[5];	 //선언과 생성

//		arr[0] = 10;	//배열의 초기화
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
//		int[] arr = {10,20,30,40,50}; // 선언, 생성, 초기화
//
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
//		int[] arr = {10,20,30,40,50,60,70,80,90};
		//크기가 정해진 곳에 for문
//		for(int i=0; i<5; i++) {
//			System.out.println(arr[i]);
//		}
		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//	중요	int[] arr2 = arr;	//특징 : 주소값이 옮겨짐
//		
//		for(int i=0; i<arr2.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//		int[] arr = new int[10];
		
		//반복문을 사용하여 1 ~ 10 까지 정수를 초기화
		//배열에 저장된 값의 합을 출력하는 코드 작성
		//ex
//		int[] arr = new int[10];
//		int sum = 0;
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = i + 1;
//			sum += arr[i];
//			System.out.println(arr[i]);
//		}
//		System.out.println(sum);
		
//		int[] arr = {9,23,43,5,13};
		
		//배열의 값 중에 최대값을 출력하세요
		
		//ex
//		int max = 0;
//		for(int i=0; i<5; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println(max);
		
		//예제
//		int max = arr[0];
//		
//		for(int i=1; i<arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		
//		System.out.println(max);
		
		//향상된 for문
//		for(변수 : 배열이름) {
//			실행문
//		}
		
		//출력, 반복에 대한 정의를 할 필요가 없음
//		for(int num : arr) {
//			System.out.println(num);
//		}
		
		//향상된 for문 문자도 가능
//		char[] cArr = {'a', 'b', 'c'};
//		
//		for(char c : cArr) {
//			System.out.println(c);
//		}

		//로또 만들기
		//1 ~ 45사이에 6개의 숫자를 맞춘다
		
		//난수(랜덤)
		//Math.random()	// 0.0 <= ? < 1.0	0.0 ~ 0.99999
		//System.out.println(Math.random());
		//(int)Math.random() * 난수의 총 갯수) + 난수의 가장 작은값

		
		
		
//		int ran = (int)(Math.random() * 45) + 1;
//		System.out.println(ran);
		
//		for(int i=0; i<6; i++) {
//			int ran = (int)(Math.random() * 45) + 1;
//			System.out.println(ran);
//		}
		
		//값의 교환(Swap) 임시 변수 필요
//		int temp;
//		int x = 10;
//		int y = 20;

//		temp = x; //1
//		x = y; 	  //2
//		y = temp; //3
		
//		System.out.println("x = " + x + ", y = " + y);
	
		//로또 만들기
//		int[] lotto = new int[45];
//		
//		for(int i=0; i<lotto.length; i++) {
//			lotto[i] = i + 1;
//			
////			System.out.println(lotto[i]);
//		}
//		for(int i=0; i<200; i++) {
//			
//			int ran = (int)(Math.random() * 45);
//			
//			int temp;
//			
//			temp = lotto[0];
//			lotto[0] = lotto[ran];
//			lotto[ran] = temp;
//		}
//		for(int i=0; i<6; i++) {
//			System.out.println(lotto[i]);
//		}
		
		
		//회문 : 토마토, 기러기, noon, level

//		char[] c = {'n','o','o','n'};
//		
//		int length = c. length;
//		boolean is = true;
//		
//		for(int i=0; i < length / 2; i++) {
//			if(c[i] != c[length-i-1]) {
//				is = false;
//				break;
//			}
//		}
//		
//		String s = is ? "회문입니다" : "회문이 아닙니다";
//		System.out.println(s);
		
		// 정렬 : 오름차순, 내림차순
		// 1,2,3,4		4,3,2,1
		
		int[] arr = { 3,7,2,8,5,9,1 };
		
		// 선택정렬 : 오름차순
		
//		for(int i = 0; i<arr.length-1; i++) {
//			for(int j = i + 1; j<arr.length;j++) {
//				if(arr[i] > arr[j]) {
//					int tmp;
//					tmp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = tmp;
//				}
//				
//			}
//		}
//		
//		for(int num : arr) {
//			System.out.print(num + ", ");
//		}
		
		// 선택정렬 : 내림차순
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = i + 1; j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					int tmp;
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
				
			}
		}
		
		for(int num : arr) {
			System.out.print(num + ", ");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}