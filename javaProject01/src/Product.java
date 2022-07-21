
public class Product {
	static int count = 0;
	int serialNo;
	{
		count++;
		serialNo = count;
		System.out.println("초기화블럭 호출");
	}
	
	Product(){
		System.out.println("생성자 호출");
	}
	
	
	
}
