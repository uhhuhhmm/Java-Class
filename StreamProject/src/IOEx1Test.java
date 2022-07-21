import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx1Test {

	public static void main(String[] args) {

		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data = 0;
		
		//read() -> 1����Ʈ�� �о�´�
		while((data = input.read()) != -1) {
			output.write(data);	// write(int b)
		}
		
		outSrc = output.toByteArray();
		
		System.out.println("Input src" + Arrays.toString(inSrc));
		System.out.println("Output src" + Arrays.toString(outSrc));
	}
	

}
