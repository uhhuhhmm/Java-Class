import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
//		try {
//			
//		}catch(예외타입1) {
//			
//		}catch(예외타입2) {
//			
//		}catch(예외타입3) {
//			
//		}finally {	// finally 무조건 한번 실행
//			
//		}
		
//		try {
//			int number = 100;
//			int result = 0;
//			
//			for(int i = 0; i < 10; i++) {
//				result = number / (int)(Math.random() * 10);
//				System.out.println(result);
//			}
//		}catch(ArithmeticException e) {
//			System.out.println("0으로 나누지 마세요");
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}finally {
//			System.out.println("마지막으로 반드시 한번 실행한다");
//		}
		
		//예외 강제 발생
//		try {
//			throw new Exception("문제 발생");
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		//예외 선언하기
		//Method1();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("파일 이름 입력 : ");
		String filename = sc.next();
		try {
			File f = CreateFile(filename);
			System.out.println(f.getName() + "파일 생성");
		}catch(IOException e) {
			System.out.println("파일 생성이 안돼");
		}catch(Exception e) {
			System.out.println("파일 이름 확인");
		}
		
	}
	
	static File CreateFile(String filename) throws IOException, Exception {
		File f = null;
		
			if(filename == null || filename.equals("")){
				throw new Exception("파일명 이름이 안돼");
				//filename = "제목 없음.txt";
			}
			f = new File(filename);
			f.createNewFile();
			
			return f;
	}
	
//		}catch(IOException e) {
//			System.out.println("파일 생성이 안돼");
//		}catch(Exception e) {
//			filename = "제목 없음.txt";
//			try {
//				f = new File(filename);
//				f.createNewFile();
//			}catch(IOException e1) {
//				System.out.println("파일 생성이 안돼");
//			}
//		}finally {
//			return f;
//		}	
		
//		catch(Exception e) {
//			filename = "제목없음.txt";
//		}
		
//		finally {
//			File f = new File(filename);
//			//createNewFile(f);
//			return f;
//		}
	
	
//	static void createNewFile(File f) {
//		try {
//			f.createNewFile();
//		}catch(IOException e) {
//			System.out.println("파일 생성이 안돼");
//		}
//	}
	
	
	
//	static void Method1() throws Exception{
//		
//			Method2();
//		
//	}
//	
//	static void Method2() throws Exception{
//		
//		throw new Exception("흐흐");
//		
//	}
	
	
}
