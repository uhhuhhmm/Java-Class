package streamproject;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx2 {

	public static void main(String[] args) {
		int sum = 0;
		int score = 0;
		int cnt = 0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {

			fis = new FileInputStream("score.dat");
			dis = new DataInputStream(fis);
			
			while(true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
				cnt++;
			}
			
		} catch (EOFException e) {
			System.out.println("������ ������ " + sum  + "�Դϴ�");
			System.out.println("������ ����� " + sum/cnt  + "�Դϴ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dis != null) {
					dis.close();
				}
			} catch(IOException e){
				e.printStackTrace();
			}
		}	
		
	}

}
