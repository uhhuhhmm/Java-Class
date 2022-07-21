import java.util.Scanner;

public class Book2Test {

	public static void main(String[] args) {
		Book2[] book = new Book2[2];	//배열의 선언과 생성

		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < book.length; i++) {
			System.out.println("Type the Title: ");
			String title = sc.nextLine();
			System.out.println("Type the Author: ");
			String author = sc.nextLine();
			
			book[i] = new Book2(title, author);
		}
		
		for(int i = 0; i<book.length; i++) {
			System.out.println(book[i].title + "  " + book[i].author);
		}
//		book[0] = new Book2("HarryPoter", "Harry");
//		book[1] = new Book2("NothingHill", "ME");
//		
//		System.out.println(book[0].title);
//		System.out.println(book[0].author);
//
//		System.out.println();
//		
//		System.out.println(book[1].title);
//		System.out.println(book[1].author);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
