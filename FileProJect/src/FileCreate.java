import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) {
//		File f = new File("C:\\Work\\javaworkspace\\Game\\src\\Bear.java");
		//�ٸ� ���
		File f = new File("C:\\Work\\javaworkspace\\Game\\src","Rabbit.java");
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
