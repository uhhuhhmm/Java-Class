package com.build;

public class LiftableImpl implements Liftable {

	@Override
	public void liftOff() {
		System.out.println("�̷�");
	}

	@Override
	public void move() {
		System.out.println("�����δ�");
	}

	@Override
	public void stop() {
		System.out.println("����");
	}

	@Override
	public void land() {
		System.out.println("����");
	}

}
