
public class OverloadingTest {

	public static void main(String[] args) {

		Overloading ol = new Overloading();
		
		System.out.println(ol.add(3,4));
		System.out.println(ol.add(4,5L));
		System.out.println(ol.add(6L,5));
		
		int[] arr = {1,2,3,4,5};
		System.out.println(ol.add(arr));
		
		ol.concat("a","b","c","d","e");
		ol.concat(new String[] {"H","e","l","l","o"});
			
		
		
		
		
		
	}

}
