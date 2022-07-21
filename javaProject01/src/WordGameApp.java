import java.util.Scanner;

public class WordGameApp {

	String startWord ="아버지";
	Scanner sc;
	Player[] players;
	
	
	public WordGameApp() {
		sc = new Scanner(System.in);
	}
	
	void createPlayers() {
		System.out.println("게임에 참가하는 인원은 몇명입니까?>> ");
		int nPlayers = sc.nextInt();
		players = new Player[nPlayers];
		
		for(int i = 0; i < nPlayers; i++) {
			System.out.println("참가자의 이름을 입력하세요");
			String name = sc.next();
			players[i] = new Player(name);
		}
	}
	
	void run() {
		System.out.println("끝말잇기 게임 실행");
		createPlayers();
		String lastWord = startWord;
		
		System.out.println("시작단어는 " + lastWord + "입니다");
		int next = 0;
		
		while(true) {
			String newWord = players[next].getWordFromUser();
			if(!players[next].checkSuccess(lastWord)) {
				System.out.println(players[next].getName() + "님이 졌습니다");
				break;
			}
			next++;
			next %= players.length; 
			lastWord = newWord;
		}
	}
	
}
