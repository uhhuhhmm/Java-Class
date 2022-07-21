package com.starcaft;

public class SCV extends GroundUnit implements Repairable,Healable {
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			
			System.out.println(u + "의 수리를 완료 했습니다");
		}
		
	}
	
}
