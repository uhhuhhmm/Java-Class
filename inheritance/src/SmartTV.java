
public class SmartTV extends Tv{
	boolean smart;
	
	void smartStart() {
		if(smart) {
			System.out.println("인터넷 기능 작동");
		}
	}
}
