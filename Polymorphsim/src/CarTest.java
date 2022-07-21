
public class CarTest {

	public static void main(String[] args) {
		
		CarWork cw = new CarWork();
		FireEngine fe = new FireEngine();
		Ambulance ab = new Ambulance();
		
		cw.doWork(fe);
		cw.doWork(ab);
		
		
//		Car car = null;
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;	//참조형의 기본 값은 null
//		
//		fe.water();
//		car = fe;	// 5개 -> 4개
//		
////		if(car instanceof 클래스명: 부모클래스,자식클래스)
//		if(car instanceof FireEngine) {
//			FireEngine fe1 = (FireEngine)car;	// 4개 -> 5개
//			fe1.water();
//		}
//		if(car instanceof Ambulance) {
//			
//		}
			
		
		
		
		
	
//		//car.water(); 참조형의 특징
//		fe2 = (FireEngine)car;	//강제형변환 4개 -> 5개
//		fe2.water();
		
//		Car car = new Car();
//		Car car2 = null;
//		FireEngine fe = null;
		
//		car.drive();
		//fe = (FireEngine)car; // 4개 -> 5개
		//fe.drive();
//		car2 = fe;
		
		
		
	}

}
