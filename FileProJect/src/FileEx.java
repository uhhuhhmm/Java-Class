import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		//������ ��ο� ���� ����
		File f = new File("C:\\Program Files\\AMD\\atikmdag_dce.txt");
		String fileName = f.getName();
		int pos = fileName.indexOf(".");
		
		System.out.println("��θ� ������ ���� �̸� : " + f.getName());
		System.out.println("Ȯ���ڸ� ������ ���� �̸� : " + fileName.substring(0,pos));
		
		System.out.println(f.getPath());
			//���� ���ִ� ���� ��� :P
		System.out.println(f.getCanonicalPath());
			//���� ���� ��� :D
		System.out.println(f.getParent());
			//������ ��� ��ġ ���� :S
		
	}

}
