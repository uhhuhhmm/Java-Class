import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx4Test {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;

		byte[] temp = new byte[4];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;

		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();	
		
		try {
			while(input.available() > 0) {
				int len = input.read(temp); //�迭 ũ�⸸ŭ �ҷ���
				output.write(temp, 0, len); //temp���� 0 index�������� len index����
			}
		}catch(IOException e) {
			
		}
		outSrc = output.toByteArray();
		
		System.out.println("Input src" + Arrays.toString(inSrc));
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("Output src" + Arrays.toString(outSrc));
	}

}
