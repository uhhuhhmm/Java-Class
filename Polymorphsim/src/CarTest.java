
public class CarTest {

	public static void main(String[] args) {
		
		CarWork cw = new CarWork();
		FireEngine fe = new FireEngine();
		Ambulance ab = new Ambulance();
		
		cw.doWork(fe);
		cw.doWork(ab);
		
		
//		Car car = null;
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;	//�������� �⺻ ���� null
//		
//		fe.water();
//		car = fe;	// 5�� -> 4��
//		
////		if(car instanceof Ŭ������: �θ�Ŭ����,�ڽ�Ŭ����)
//		if(car instanceof FireEngine) {
//			FireEngine fe1 = (FireEngine)car;	// 4�� -> 5��
//			fe1.water();
//		}
//		if(car instanceof Ambulance) {
//			
//		}
			
		
		
		
		
	
//		//car.water(); �������� Ư¡
//		fe2 = (FireEngine)car;	//��������ȯ 4�� -> 5��
//		fe2.water();
		
//		Car car = new Car();
//		Car car2 = null;
//		FireEngine fe = null;
		
//		car.drive();
		//fe = (FireEngine)car; // 4�� -> 5��
		//fe.drive();
//		car2 = fe;
		
		
		
	}

}
