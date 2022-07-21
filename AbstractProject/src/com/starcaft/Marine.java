package com.starcaft;

public class Marine extends GroundUnit implements Healable {
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Marine";
	}
	
	
}
