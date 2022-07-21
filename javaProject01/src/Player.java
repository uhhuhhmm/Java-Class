import java.util.Scanner;

public class Player {
	//�������
	String name;
	String word;
	Scanner sc;
	
	public Player(String name) {
		this.name = name;
		sc = new Scanner(System.in);
	}
	
	String getName() {
		return name;
	}
	
	String getWordFromUser() {			//���ϴ� ���
		System.out.println(name + ">>");
		word = sc.next();
		return word;
	}
	
	boolean checkSuccess(String lastWord) {
		int lastIndex = lastWord.length() -1;
		
		if(lastWord.charAt(lastIndex) == word.charAt(0)) {
			return true;
		}else {
			return false;
			
		}
	}
	
	
}
