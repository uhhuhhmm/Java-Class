
public class Point2 {
	int x;
	int y;
	
//	Point2(){	//object부모
//		super();
//	}			
	
	
	
	public Point2(int x, int y) {
		super();			//초기화를 하고 생성자를 생성시 super를 꼭 넣어줘야함
		this.x = x;
		this.y = y;
	}
	
	
	String getLocation() {
		return x + ", " + y;
	}

	
	
	
	
	
	
	
	
	
}
