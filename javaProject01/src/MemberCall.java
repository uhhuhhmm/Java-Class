
public class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv;
	
	static void stM() {
		System.out.println(cv);
		//System.out.println(iv);
	}
	
	void inM() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void stM2() {
		stM();
		//inM();
	}
	
	void inM2() {
		stM();
		inM();
	}
}
