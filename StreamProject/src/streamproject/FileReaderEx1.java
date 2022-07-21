package streamproject;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {

	public static void main(String[] args) {
		//FileInputStream
		//FileReader
		
		try {
			FileInputStream fis = new FileInputStream("test.txt");
			FileReader fr = new FileReader("test.txt");
			
			int data = 0;

			while((data = fis.read()) != -1) {
				System.out.print((char)data);
			}
			
			fis.close();
			System.out.println();
			
			while((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
			
			fr.close();
				
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
