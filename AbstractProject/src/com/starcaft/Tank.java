package com.starcaft;

public class Tank extends GroundUnit implements Repairable {
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tank";
	}
	
	
}
