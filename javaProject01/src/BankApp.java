import java.util.Scanner;

public class BankApp {
	
	Account[] acc = new Account[100];
	Scanner sc = new Scanner(System.in);
	//1.���»��� 2.���¸�� 3.����  4.��� 5.����
	void info() {
		System.out.println("-----------");
		System.out.println("1.���»��� 2.���¸�� 3.����  4.��� 5.����");
		System.out.println("-----------");
		System.out.print("���� : ");
		
	}
	//���»���
	void createAccount() {
		System.out.println("-----------");
		System.out.println("���� ����");
		System.out.println("-----------");
		
		System.out.print("���¹�ȣ : ");
		String ano = sc.next();
		
		if(findAccount(ano) != null) {
			System.out.println("�ߺ� ���°� �����մϴ�");
			return;
		}
		
		System.out.print("������ : ");
		String owner = sc.next();
		System.out.print("�ʱ��Աݾ� : ");
		int balance = sc.nextInt();
		
		Account account = new Account(ano, owner, balance);
		
		for(int i = 0; i < acc.length; i++) {
			if(acc[i] == null) {
				acc[i] = account;
				System.out.println("���� ���� �Ϸ�ƽ��ϴ�");
				break;
			}
		}
	}
	
	//���¸��
	void accountList() {
		System.out.println("-----------");
		System.out.println("���� ���");
		System.out.println("-----------");
		System.out.println("���¹�ȣ  " + " ���¸� " + " �ܾ�");
		
		for(int i = 0; i < acc.length; i++) {
			if(acc[i] == null) {
				break;
			}
			System.out.println(acc[i].getAno() + "\t" + acc[i].getOwner() + "\t" + acc[i].getBalance());
		}
	}
	
	//����
	void deposit() {
		System.out.println("-----------");
		System.out.println("����");
		System.out.println("-----------");
		
		System.out.print("���¹�ȣ : ");
		String ano = sc.next();
		
		System.out.println("���ݾ� : ");
		int balance = sc.nextInt();
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("���°� �������� �ʽ��ϴ�");
			return;
		}
		
		account.setBalance(account.getBalance() + balance);
		System.out.println("������ �Ա� �ƽ��ϴ�");
	}
	
	//���
	void withdraw() {
		System.out.println("-----------");
		System.out.println("���");
		System.out.println("-----------");
		
		System.out.print("���¹�ȣ : ");
		String ano = sc.next();
		
		System.out.println("��ݾ� : ");
		int balance = sc.nextInt();
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("���°� �������� �ʽ��ϴ�");
			return;
		}
		if(account.getBalance() < balance) {
			System.out.println("���ݾ��� ���� �մϴ�");
			return;
		}
		account.setBalance(account.getBalance() - balance);
		System.out.println("����� �ƽ��ϴ�");
	}
		
	//���� ��ȸ ���
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
