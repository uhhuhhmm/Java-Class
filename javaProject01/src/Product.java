
public class Product {
	static int count = 0;
	int serialNo;
	{
		count++;
		serialNo = count;
		System.out.println("�ʱ�ȭ�� ȣ��");
	}
	
	Product(){
		System.out.println("������ ȣ��");
	}
	
	
	
}
