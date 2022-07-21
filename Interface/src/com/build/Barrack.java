package com.build;

public class Barrack extends Building implements Liftable {
	LiftableImpl lt = new LiftableImpl();

	@Override
	public void liftOff() {
		lt.liftOff();
	}

	@Override
	public void move() {
		lt.move();
	}

	@Override
	public void stop() {
		lt.stop();
	}

	@Override
	public void land() {
		lt.land();
	}
	
	
}
