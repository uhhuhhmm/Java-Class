
public class Circle {
	int r;
	Point centre;
	
	public Circle(int r, Point centre) {
		this.r = r;
		this.centre = centre;
	}
	
	void draw() {
		System.out.println(r + "  " + centre.x + "  " + centre.y);
	}
	
	
	
	
}
