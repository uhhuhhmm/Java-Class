import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է� : ");
		String id = sc.next();
		System.out.println("�н����� �Է� : ");
		String pw = sc.next();
		try {
			login(id, pw);
		}catch(NoExistIDException e) {
			System.out.println(e.getMessage());
		}catch(WrongPassword e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws NoExistIDException, WrongPassword {
		String fid = "abc";
		String fpw = "1234";
		if(!id.equals(fid)) {
			throw new NoExistIDException("���̵� ���� ����");
		}
		
		if(!password.equals(fpw)) {
			throw new NoExistIDException("�н����尡 Ʋ��");
		}
		
		System.out.println("�α���");
		
	}
	
}
