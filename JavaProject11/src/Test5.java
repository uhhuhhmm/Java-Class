
public class Test5 {

	public static void main(String[] args) {
		try {
			int[] intArray = new int[5];
			intArray[0] = 0;
				for(int i = 0; i < 5; i++) {
					intArray[i + 1] = i + 1 + intArray[i];
					System.out.println("intArray["+i+"]" + "=" + intArray[i]);
				}
		}catch(ArrayIndexOutOfBoundsException e) {
							
		}
	}			
}
