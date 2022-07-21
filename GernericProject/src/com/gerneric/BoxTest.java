package com.gerneric;

public class BoxTest {

	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
		//Box<Grape> GrapeBox = new Box<Apple>(); //error
		
		fruitBox.add(new Fruit());	
		fruitBox.add(new Apple());	// Gerneric������ ��Ӱ��� ���� ���� : ������
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		//appleBox.add(new Toy());	//Ÿ�� ����ġ
		
		toyBox.add(new Toy());
		//toyBox.add(new Apple());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}

}
