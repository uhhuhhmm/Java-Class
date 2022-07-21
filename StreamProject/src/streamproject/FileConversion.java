package streamproject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileConversion {

	public static void main(String[] args) {
		try {
		
			FileReader fr = new FileReader("src/streamproject/FileConversion.java");
			FileWriter wr = new FileWriter("conversion.txt");

			int data = 0;
			
			while((data = fr.read()) != -1) {
				if(data != '\t' && data != '\n' && data != ' ' && data != '\r') {
					wr.write(data);
				}
				
			}
			
			fr.close();	
			wr.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
