import java.util.Scanner;

public class AlphabetHistogramApp {
	private int[] histoData = new int [26];
	
	public AlphabetHistogramApp() {
		for(int i = 0; i < histoData.length; i++) {
			histoData[i] = 0;
		}
	}
	
	// �Է� ���� �������κ��� ������׷��� ����Ÿ�� ����
	private void makeHistogram(String text) {
		String s = text;
		s = s.toUpperCase(); // �빮�ڷ� �ٲ�
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				int index = c - 'A';
				histoData[index]++;
			}
		}
	}
	
	// ������׷��� �׸�
	private void drawHistogram() {
		System.out.println("\t������׷��� �׸��ϴ�");
		for(int i = 0;  i < histoData.length; i++) {
			System.out.print((char)('A' + i));
			for(int j = 0; j < histoData[i]; j++) {
				System.out.print('-');
			}
			System.out.println();
		}
	}
	
	// ���� �Է� ���
	private String readString() {
		System.out.println("���� �ؽ�Ʈ�� �Է��ϰ� �����ݷ��� �Է��ϼ���");
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		while(true) {
			String line = sc.nextLine();
			if(line.charAt(0) == ';' && line.length() == 1) {
				break;
			}
			sb.append(line);
		}
		return sb.toString(); //StringŸ���� ���������
		
	}
	
	//���α׷� ����
	public void run() {
		String s = readString();
		makeHistogram(s);
		drawHistogram();
	}
}