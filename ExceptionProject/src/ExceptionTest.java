import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
//		try {
//			
//		}catch(����Ÿ��1) {
//			
//		}catch(����Ÿ��2) {
//			
//		}catch(����Ÿ��3) {
//			
//		}finally {	// finally ������ �ѹ� ����
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
//			System.out.println("0���� ������ ������");
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}finally {
//			System.out.println("���������� �ݵ�� �ѹ� �����Ѵ�");
//		}
		
		//���� ���� �߻�
//		try {
//			throw new Exception("���� �߻�");
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		//���� �����ϱ�
		//Method1();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �̸� �Է� : ");
		String filename = sc.next();
		try {
			File f = CreateFile(filename);
			System.out.println(f.getName() + "���� ����");
		}catch(IOException e) {
			System.out.println("���� ������ �ȵ�");
		}catch(Exception e) {
			System.out.println("���� �̸� Ȯ��");
		}
		
	}
	
	static File CreateFile(String filename) throws IOException, Exception {
		File f = null;
		
			if(filename == null || filename.equals("")){
				throw new Exception("���ϸ� �̸��� �ȵ�");
				//filename = "���� ����.txt";
			}
			f = new File(filename);
			f.createNewFile();
			
			return f;
	}
	
//		}catch(IOException e) {
//			System.out.println("���� ������ �ȵ�");
//		}catch(Exception e) {
//			filename = "���� ����.txt";
//			try {
//				f = new File(filename);
//				f.createNewFile();
//			}catch(IOException e1) {
//				System.out.println("���� ������ �ȵ�");
//			}
//		}finally {
//			return f;
//		}	
		
//		catch(Exception e) {
//			filename = "�������.txt";
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
//			System.out.println("���� ������ �ȵ�");
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
//		throw new Exception("����");
//		
//	}
	
	
}
