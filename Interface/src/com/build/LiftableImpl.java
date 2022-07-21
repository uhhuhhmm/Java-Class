package com.build;

public class LiftableImpl implements Liftable {

	@Override
	public void liftOff() {
		System.out.println("ÀÌ·ú");
	}

	@Override
	public void move() {
		System.out.println("¿òÁ÷ÀÎ´Ù");
	}

	@Override
	public void stop() {
		System.out.println("¸ØÃã");
	}

	@Override
	public void land() {
		System.out.println("Âø·ú");
	}

}
