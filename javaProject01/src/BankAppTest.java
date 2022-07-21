import java.util.Scanner;

public class BankAppTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BankApp ba = new BankApp();
		boolean run = true;
		
		
		while(run) {
			ba.info();
			int sel = sc.nextInt();
			
			if(sel == 5) {
				run = false;
			}else if(sel  == 1) {
				ba.createAccount();
			}else if(sel == 2) {
				ba.accountList();
			}else if(sel == 3) {
				ba.deposit();
			}else if(sel == 4) {
				ba.withdraw();
			}
			
		}
		
		System.out.println("업무가 종료 됐습니다");
	}

}
