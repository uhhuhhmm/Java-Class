package streamproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilecopyTest {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/streamproject/FilecopyTest.java");
			FileOutputStream fos = new FileOutputStream("Filecopy.bak");
			
			int data = 0;
			
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
			
			fis.close();
			fos.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
