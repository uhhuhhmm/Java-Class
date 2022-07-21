import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx3 {

	public static void main(String[] args) {
		
		File f = new File("C:\\Work\\javaworkspace\\Game");
		File[] files = f.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			File f1 = files[i];
			String name = f1.getName();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm a");
			String attribute = "";
			String size = "";
			
			if(files[i].isDirectory()) {
				attribute = "DIR";
			}else {
				size = f.length() + "";
				attribute += f.canRead() ? "R" : " ";
				attribute += f.canWrite() ? "W" : " ";
				attribute += f.isHidden() ? "H" : " ";
				
			}
			
			System.out.println(df.format(new Date(f.lastModified()))+ " "
					+ attribute + " " + size + " " + name);
		}
		
		


	}

}
