import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx3Test {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;

		byte[] temp = new byte[4];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;

		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();	
	
		System.out.println("input src: " + Arrays.toString(inSrc));
		
		try{
			while(input.available() > 0 ) {	//10 -> 6 -> 2 -> 0
				input.read(temp);	//read(byte[] temp) 0,1,2,3 -> 4,5,6,7 -> 8,9
				output.write(temp);	// 0,1,2,3 -> 4,5,6,7 -> 8,9,6,7 temp에 있던 값 그대로 유지
			
				outSrc = output.toByteArray();
				printArrays(temp, outSrc);
			}
		}catch(IOException e) {
			
		}
	}
	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("output src : " + Arrays.toString(outSrc));
	}
}
