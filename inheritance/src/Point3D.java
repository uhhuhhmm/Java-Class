
public class Point3D extends Point2 {
//	int x = 100;
//	int y = 200;
	int z;
	
//	Point3D(){
//		super(); //super 부모
//				 //this 자기자신
//	}
	
	public Point3D(int x, int y, int z) {
		super(x, y);	//자식 생성자에서 부모 생성자를 호출해줘야함,가장 첫번째라인에 생성
		this.z = z;
	}
	
	//메소드 오버라이딩
	//1. 상속관계가 필수
	//2. 메소드 이름과 매개변수 형태가 완전 동일
	String getLocation() {	//메소드 오버라이딩
		return x + ", " + y + ", " + z;
	}
	
	

	void smethod() {
		System.out.println(super.x);
		System.out.println(super.y);
		System.out.println(this.x);
		System.out.println(this.y);
	}

}
