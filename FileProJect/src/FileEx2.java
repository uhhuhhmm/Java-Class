import java.io.File;

public class FileEx2 {

	public static void main(String[] args) {
		//파일 경로의 정보
		File f = new File("C:\\Work\\javaworkspace\\Game");
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory() ? "[" + fileName + "]" : fileName);
		}
	}

}
