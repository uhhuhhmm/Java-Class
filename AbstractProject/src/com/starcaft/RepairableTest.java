package com.starcaft;

public class RepairableTest {

	public static void main(String[] args) {
		Tank t = new Tank();
		SCV s = new SCV();
		Marine mr = new Marine();
		DropShip d = new DropShip();
		Medic md = new Medic();
				
		s.repair(t);
		s.repair(d);
		md.heal(mr);
		
		
		
	}

}
