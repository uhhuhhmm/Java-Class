import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력 : ");
		String id = sc.next();
		System.out.println("패스워드 입력 : ");
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
			throw new NoExistIDException("아이디가 존재 안함");
		}
		
		if(!password.equals(fpw)) {
			throw new NoExistIDException("패스워드가 틀림");
		}
		
		System.out.println("로그인");
		
	}
	
}
