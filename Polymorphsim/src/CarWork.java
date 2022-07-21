
public class CarWork {
	void doWork(Car c) {
		
		if(c instanceof FireEngine) {
			FireEngine fe = (FireEngine)c;
			fe.water();
		}
		
		if(c instanceof Ambulance) {
			Ambulance ab = (Ambulance)c;
			ab.siren();
		}
		
		
	}


























}
