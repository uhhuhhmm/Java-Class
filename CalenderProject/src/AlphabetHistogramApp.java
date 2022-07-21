import java.util.Scanner;

public class AlphabetHistogramApp {
	private int[] histoData = new int [26];
	
	public AlphabetHistogramApp() {
		for(int i = 0; i < histoData.length; i++) {
			histoData[i] = 0;
		}
	}
	
	// 입력 받은 문장으로부터 히스토그램의 데이타를 만듦
	private void makeHistogram(String text) {
		String s = text;
		s = s.toUpperCase(); // 대문자로 바꿈
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				int index = c - 'A';
				histoData[index]++;
			}
		}
	}
	
	// 히스토그램을 그림
	private void drawHistogram() {
		System.out.println("\t히스토그램을 그립니다");
		for(int i = 0;  i < histoData.length; i++) {
			System.out.print((char)('A' + i));
			for(int j = 0; j < histoData[i]; j++) {
				System.out.print('-');
			}
			System.out.println();
		}
	}
	
	// 문장 입력 기능
	private String readString() {
		System.out.println("영문 텍스트를 입력하고 세미콜론을 입려하세요");
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		while(true) {
			String line = sc.nextLine();
			if(line.charAt(0) == ';' && line.length() == 1) {
				break;
			}
			sb.append(line);
		}
		return sb.toString(); //String타입을 맞춰줘야함
		
	}
	
	//프로그램 실행
	public void run() {
		String s = readString();
		makeHistogram(s);
		drawHistogram();
	}
}