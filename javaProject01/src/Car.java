
public class Car {
	
	//변수
	String color;
	String gearType;
	int door;
	
	//생성자는 클래스 안에 정의된다
	//생성자의 형식	: 클래스 이름() {}
	//생성자의 역할	: 멤버 변수를 초기화한다
	//생성자의 종류	: 기본 생성자, 일반 생성자,
	//모든 클래스는 기본 생성자를 가진다 (안 쓸 경우는 생략의 경우)
	//객체를 생성하는 시점에 단 한번만 실행된다
	//생성자는 생성자간 호출이 가능하다
	//생성자 오버로드(생성자를 같은 이름으로 여러개 만드는 것)
//	Car(){		//기본 생성자
//				쓰던 안쓰던 기본구성
//	}
	
	Car(){
		this("Red", "Auto", 3);
	}
	//매개변수(생성자의 변수 이름이 같을 때는 this를 사용한다)
	Car(String color){
		this(color,"Auto", 5);
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
		
	//Method 메소드
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
