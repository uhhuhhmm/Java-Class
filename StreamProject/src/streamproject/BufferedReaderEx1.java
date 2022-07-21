package streamproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx1 {

	public static void main(String[] args) {

		try {
			
			FileReader fr = new FileReader("src/streamproject/BufferedReaderEx1.java");
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			for(int i = 1; (line = br.readLine()) != null; i++) {
				if(line.indexOf(";") != -1) {
					System.out.println(i + ":" + line);
				}
				
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
