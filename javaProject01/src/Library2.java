import java.util.Scanner;

public class Library2 {
	
	Library[] n = new Library[100];
	Library[] bn = new Library[5];
	Scanner sc = new Scanner(System.in);
	//1.회원생성 2.회원목록 3.반납  4.대여 5.종료
	void info() {
		System.out.println("-----------");
		System.out.println("1.회원생성 2.회원목록 3.책생성 4.책목록 5.반납 6.대여 7.종료");
		System.out.println("-----------");
		System.out.print("선택 : ");
		
	}
	//회원생성
	void createMember() {
		System.out.println("-----------");
		System.out.println("회원가입");
		System.out.println("-----------");
		
		System.out.print("회원명 : ");
		String name = sc.next();
		
//		if(findAccount(name) != null) {
//			System.out.println("중복 회원가 존재합니다");
//			return;
//		}
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		Library member = new Library(name, age);
		
		
		for(int i = 0; i < n.length; i++) {
			if(n[i] == null) {
				n[i] = member;
				
				System.out.println("회원가입이 완료됐습니다");
				break;
			}
		}
	}
	
	//회원목록
	void memberList() {
		System.out.println("-----------");
		System.out.println("회원 목록");
		System.out.println("-----------");
//		System.out.println("회원번호  " + " 회원명 " + " 잔액");
		
		for(int i = 0; i < n.length; i++) {
			if(n[i] == null) {
				break;
			}
			System.out.println(n[i].getName() + "\t" + n[i].getAge());
		}
	}
	
	
	
	//책생성
	void creatBook() {
		System.out.println("-----------");
		System.out.println("책명 입력");
		System.out.println("-----------");
		
		System.out.print("책명 : ");
		String bname = sc.next();
			
//		if(findAccount(name) != null) {
//			System.out.println("중복 회원ㅁ가 존재합니다");
//			return;
//		}
		
		System.out.print("작가 : ");
		String author = sc.next();
		
		Library book = new Library(bname, author);
		
		for(int i = 0; i < bn.length; i++) {
			if(bn[i] == null) {
				bn[i] = book;
				System.out.println("책명이 입력됐습니다");
				break;
			}
		}
	}
		
	//책목록
	void bookList() {
		System.out.println("-----------");
		System.out.println("책 목록");
		System.out.println("-----------");
			
		for(int i = 0; i < bn.length; i++) {
			if(bn[i] == null) {
				break;
			}
			System.out.println(bn[i].getBname() + "\t" + bn[i].getAuthor());
		}
	}
	
	//반납
	void returnBook() {
		System.out.println("-----------");
		System.out.println("반납");
		System.out.println("-----------");
		
		System.out.print("반납 책명 : ");
		String bname = sc.next();
		
		Library library = returnBook(bname);
		if(library == null) {
			System.out.println("책이 없습니다");
			return;
		}
		
		if(library.getBname().equals(bname)) {
			System.out.println("반납이 확인됐습니다");
			return;
		}
		
//		library.setBalance(library.get() + balance);
//		System.out.println("반납이 확인됐습니다");
	}
	
	//대여
	void rentBook() {
		System.out.println("-----------");
		System.out.println("대여");
		System.out.println("-----------");
		
		System.out.print("책명 : ");
		String bname = sc.next();
		
//		System.out.println("출금액 : ");
//		int balance = sc.nextInt();
		
		Library library = returnBook(bname);
		if(library == null) {
			System.out.println("책이 없습니다");
			return;
		}
				
//		account.setBalance(account.getBalance() - balance);
		System.out.println("책 대여하였습니다");
	}
		
	//책 조회 기능
	Library returnBook(String bname) {
		Library library = null;
		
		for(int i = 0; i < bn.length; i++) {
			if(bn[i] != null) {
				if(bn[i].getBname().equals(bname)) {
					library = bn[i];
					break;
				}
			}
		}
		return library;
	}
	
	






}
