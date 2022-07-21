import java.util.Scanner;

public class Player {
	//멤버변수
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
	
	String getWordFromUser() {			//말하는 기능
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
