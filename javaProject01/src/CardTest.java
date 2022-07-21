
public class CardTest {

	public static void main(String[] args) {
		
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.num = 6;
		
		System.out.println(c1.kind + " " + c1.num);
		System.out.println(c1.width + " " + c1.height);
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.num = 3;
		
		System.out.println(c2.kind + " " + c2.num);
		System.out.println(c2.width + " " + c2.height);
		
		c1.width = 50;
		c2.height = 80;
		
		System.out.println(c1.width + " " + c1.height);
		System.out.println(c2.width + " " + c2.height);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
