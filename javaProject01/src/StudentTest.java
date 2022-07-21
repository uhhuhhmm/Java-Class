
public class StudentTest {

	public static void main(String[] args) {

		Student s = new Student("세오", 1, 1, 100, 60, 76 );
//		s.name = "세오";
//		s.ban = 1;
//		s.no = 1;
//		s.kor = 100;
//		s.eng = 60;
//		s.math =76;
		
		System.out.println(s.name);
		System.out.println(s.getTotal());
		System.out.println(s.getAverage());
		
			
	}

}

//이름 : 세오
//총점 : 236
//평균 : 78.7

