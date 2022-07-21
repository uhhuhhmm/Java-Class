
public class Triangle {
	Point[] p = new Point[3];
	//포함관계
	public Triangle(Point[] p) {
		this.p = p;
	}
	
	void draw() {
		System.out.println(p[0].x + "  " + p[0].y);
		System.out.println(p[1].x + "  " + p[1].y);
		System.out.println(p[2].x + "  " + p[2].y);
				
	}
	
}
