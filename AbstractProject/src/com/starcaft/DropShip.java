package com.starcaft;

public class DropShip extends AirUnit implements Repairable {
	DropShip(){
		super(200);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "DropShip";
	}
	
	
	
}
