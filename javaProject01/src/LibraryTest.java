import java.util.Scanner;

public class LibraryTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Library2 ba = new Library2();
		boolean run = true;
		
		
		while(run) {
			ba.info();
			int sel = sc.nextInt();
			
			if(sel == 7) {
				run = false;
			}else if(sel == 1) {
				ba.createMember();
			}else if(sel == 2) {
				ba.memberList();
			}else if(sel == 3) {
				ba.creatBook();
			}else if(sel == 4) {
				ba.bookList();
			}else if(sel == 5) {
				ba.returnBook();
			}else if(sel == 6) {
				ba.rentBook();
			}
			
		}
		
		System.out.println("Closed");
	}

}