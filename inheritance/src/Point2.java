
public class Point2 {
	int x;
	int y;
	
//	Point2(){	//object�θ�
//		super();
//	}			
	
	
	
	public Point2(int x, int y) {
		super();			//�ʱ�ȭ�� �ϰ� �����ڸ� ������ super�� �� �־������
		this.x = x;
		this.y = y;
	}
	
	
	String getLocation() {
		return x + ", " + y;
	}

	
	
	
	
	
	
	
	
	
}
