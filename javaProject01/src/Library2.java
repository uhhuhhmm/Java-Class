import java.util.Scanner;

public class Library2 {
	
	Library[] n = new Library[100];
	Library[] bn = new Library[5];
	Scanner sc = new Scanner(System.in);
	//1.ȸ������ 2.ȸ����� 3.�ݳ�  4.�뿩 5.����
	void info() {
		System.out.println("-----------");
		System.out.println("1.ȸ������ 2.ȸ����� 3.å���� 4.å��� 5.�ݳ� 6.�뿩 7.����");
		System.out.println("-----------");
		System.out.print("���� : ");
		
	}
	//ȸ������
	void createMember() {
		System.out.println("-----------");
		System.out.println("ȸ������");
		System.out.println("-----------");
		
		System.out.print("ȸ���� : ");
		String name = sc.next();
		
//		if(findAccount(name) != null) {
//			System.out.println("�ߺ� ȸ���� �����մϴ�");
//			return;
//		}
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		Library member = new Library(name, age);
		
		
		for(int i = 0; i < n.length; i++) {
			if(n[i] == null) {
				n[i] = member;
				
				System.out.println("ȸ�������� �Ϸ�ƽ��ϴ�");
				break;
			}
		}
	}
	
	//ȸ�����
	void memberList() {
		System.out.println("-----------");
		System.out.println("ȸ�� ���");
		System.out.println("-----------");
//		System.out.println("ȸ����ȣ  " + " ȸ���� " + " �ܾ�");
		
		for(int i = 0; i < n.length; i++) {
			if(n[i] == null) {
				break;
			}
			System.out.println(n[i].getName() + "\t" + n[i].getAge());
		}
	}
	
	
	
	//å����
	void creatBook() {
		System.out.println("-----------");
		System.out.println("å�� �Է�");
		System.out.println("-----------");
		
		System.out.print("å�� : ");
		String bname = sc.next();
			
//		if(findAccount(name) != null) {
//			System.out.println("�ߺ� ȸ������ �����մϴ�");
//			return;
//		}
		
		System.out.print("�۰� : ");
		String author = sc.next();
		
		Library book = new Library(bname, author);
		
		for(int i = 0; i < bn.length; i++) {
			if(bn[i] == null) {
				bn[i] = book;
				System.out.println("å���� �Էµƽ��ϴ�");
				break;
			}
		}
	}
		
	//å���
	void bookList() {
		System.out.println("-----------");
		System.out.println("å ���");
		System.out.println("-----------");
			
		for(int i = 0; i < bn.length; i++) {
			if(bn[i] == null) {
				break;
			}
			System.out.println(bn[i].getBname() + "\t" + bn[i].getAuthor());
		}
	}
	
	//�ݳ�
	void returnBook() {
		System.out.println("-----------");
		System.out.println("�ݳ�");
		System.out.println("-----------");
		
		System.out.print("�ݳ� å�� : ");
		String bname = sc.next();
		
		Library library = returnBook(bname);
		if(library == null) {
			System.out.println("å�� �����ϴ�");
			return;
		}
		
		if(library.getBname().equals(bname)) {
			System.out.println("�ݳ��� Ȯ�εƽ��ϴ�");
			return;
		}
		
//		library.setBalance(library.get() + balance);
//		System.out.println("�ݳ��� Ȯ�εƽ��ϴ�");
	}
	
	//�뿩
	void rentBook() {
		System.out.println("-----------");
		System.out.println("�뿩");
		System.out.println("-----------");
		
		System.out.print("å�� : ");
		String bname = sc.next();
		
//		System.out.println("��ݾ� : ");
//		int balance = sc.nextInt();
		
		Library library = returnBook(bname);
		if(library == null) {
			System.out.println("å�� �����ϴ�");
			return;
		}
				
//		account.setBalance(account.getBalance() - balance);
		System.out.println("å �뿩�Ͽ����ϴ�");
	}
		
	//å ��ȸ ���
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
