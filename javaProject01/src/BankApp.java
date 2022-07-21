import java.util.Scanner;

public class BankApp {
	
	Account[] acc = new Account[100];
	Scanner sc = new Scanner(System.in);
	//1.계좌생성 2.계좌목록 3.예금  4.출금 5.종료
	void info() {
		System.out.println("-----------");
		System.out.println("1.계좌생성 2.계좌목록 3.예금  4.출금 5.종료");
		System.out.println("-----------");
		System.out.print("선택 : ");
		
	}
	//계좌생성
	void createAccount() {
		System.out.println("-----------");
		System.out.println("계좌 생성");
		System.out.println("-----------");
		
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		
		if(findAccount(ano) != null) {
			System.out.println("중복 계좌가 존재합니다");
			return;
		}
		
		System.out.print("계좌주 : ");
		String owner = sc.next();
		System.out.print("초기입금액 : ");
		int balance = sc.nextInt();
		
		Account account = new Account(ano, owner, balance);
		
		for(int i = 0; i < acc.length; i++) {
			if(acc[i] == null) {
				acc[i] = account;
				System.out.println("계좌 생성 완료됐습니다");
				break;
			}
		}
	}
	
	//계좌목록
	void accountList() {
		System.out.println("-----------");
		System.out.println("계좌 목록");
		System.out.println("-----------");
		System.out.println("계좌번호  " + " 계좌명 " + " 잔액");
		
		for(int i = 0; i < acc.length; i++) {
			if(acc[i] == null) {
				break;
			}
			System.out.println(acc[i].getAno() + "\t" + acc[i].getOwner() + "\t" + acc[i].getBalance());
		}
	}
	
	//예금
	void deposit() {
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		
		System.out.println("예금액 : ");
		int balance = sc.nextInt();
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("계좌가 존재하지 않습니다");
			return;
		}
		
		account.setBalance(account.getBalance() + balance);
		System.out.println("예금이 입금 됐습니다");
	}
	
	//출금
	void withdraw() {
		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");
		
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		
		System.out.println("출금액 : ");
		int balance = sc.nextInt();
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("계좌가 존재하지 않습니다");
			return;
		}
		if(account.getBalance() < balance) {
			System.out.println("예금액이 부족 합니다");
			return;
		}
		account.setBalance(account.getBalance() - balance);
		System.out.println("출금이 됐습니다");
	}
		
	//계좌 조회 기능
	Account findAccount(String ano) {
		Account account = null;
		
		for(int i = 0; i < acc.length; i++) {
			if(acc[i] != null) {
				if(acc[i].getAno().equals(ano)) {
					account = acc[i];
					break;
				}
			}
		}
		return account;
	}
	
	






}
