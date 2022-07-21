import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		//파일의 경로에 대한 정보
		File f = new File("C:\\Program Files\\AMD\\atikmdag_dce.txt");
		String fileName = f.getName();
		int pos = fileName.indexOf(".");
		
		System.out.println("경로를 제외한 파일 이름 : " + f.getName());
		System.out.println("확장자를 제외한 파일 이름 : " + fileName.substring(0,pos));
		
		System.out.println(f.getPath());
			//위에 써있는 파일 경로 :P
		System.out.println(f.getCanonicalPath());
			//파일 실제 경로 :D
		System.out.println(f.getParent());
			//파일의 경로 위치 폴더 :S
		
	}

}
