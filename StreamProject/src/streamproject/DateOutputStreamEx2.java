package streamproject;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DateOutputStreamEx2 {

	public static void main(String[] args) {
		int[] score = {100,90,95,85,50};
		int sum = 0;
		
		try {
			FileOutputStream fos = new FileOutputStream("score.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			
			for(int i = 0; i < score.length; i++) {
				dos.writeInt(score[i]);
//				sum += score[i];
			}
//			dos.writeInt(sum);
//			dos.writeInt(sum/5);
//			
//			System.out.println("Array Sum : " + sum);
//			System.out.println("Array Average : " + sum/5);
						
			dos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
