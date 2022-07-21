public class BuyerTest {

	public static void main(String[] args) {
			      
	      Tv t = new Tv();
	      Computer c = new Computer();
	      Audio a = new Audio();
	      Buyer buyer = new Buyer();
	           
	      buyer.buy(t);
	      buyer.buy(c);
	      buyer.buy(a);
	      
	      buyer.summary();
	      
	}

}
