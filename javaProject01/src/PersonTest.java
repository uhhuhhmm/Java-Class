
public class PersonTest {

	public static void main(String[] args) {
		
		//1.클래스를 정의 한다
		//2.객체를 생성한다 (메모리에 멤버를 할당)
		//3.참조변수를 통해 멤버변수나 메소드를 사용한다
		
		Person p1 = new Person();	//객체생성(메모리에 member변수나 메소드를 할당했다)
	//데이터 타입 변수이름(참조 변수)
		p1.name = "Hong Gildong";
		p1.age = 10;
		p1.job = "Developer";
				
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.job);
		
		p1.work();
		p1.leaveWork();
		
		Person p2 = new Person();
		p2.name = "Lee sin";
		p2.age = 99;
		p2.job = "WhereIgo";
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.job);
		
		p2.work();
		p2.leaveWork();
		
		p2 = p1;
		
		p1.name = "Park Gun";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		//내부적으로 Garbage Collection (자동 회수)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
