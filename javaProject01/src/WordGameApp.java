import java.util.Scanner;

public class WordGameApp {

	String startWord ="�ƹ���";
	Scanner sc;
	Player[] players;
	
	
	public WordGameApp() {
		sc = new Scanner(System.in);
	}
	
	void createPlayers() {
		System.out.println("���ӿ� �����ϴ� �ο��� ����Դϱ�?>> ");
		int nPlayers = sc.nextInt();
		players = new Player[nPlayers];
		
		for(int i = 0; i < nPlayers; i++) {
			System.out.println("�������� �̸��� �Է��ϼ���");
			String name = sc.next();
			players[i] = new Player(name);
		}
	}
	
	void run() {
		System.out.println("�����ձ� ���� ����");
		createPlayers();
		String lastWord = startWord;
		
		System.out.println("���۴ܾ�� " + lastWord + "�Դϴ�");
		int next = 0;
		
		while(true) {
			String newWord = players[next].getWordFromUser();
			if(!players[next].checkSuccess(lastWord)) {
				System.out.println(players[next].getName() + "���� �����ϴ�");
				break;
			}
			next++;
			next %= players.length; 
			lastWord = newWord;
		}
	}
	
}
