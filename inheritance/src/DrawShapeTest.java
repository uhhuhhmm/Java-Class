
public class DrawShapeTest {

	public static void main(String[] args) {
		Point p = new Point(5, 5);
		Circle c = new Circle(10, p);
		c.draw();
		
		Point[] p3 = {
				new Point(4, 5),
				new Point(6, 7),
				new Point(8, 9)
		};
		Triangle t = new Triangle(p3);
		t.draw();
		
		
		
		
	}

}
