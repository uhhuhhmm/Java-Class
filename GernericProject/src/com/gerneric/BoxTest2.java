package com.gerneric;

public class BoxTest2 {
	
	public static void main(String[] args) {
		//�������� �̿��� ���׸�, <>�ȿ� �������� ���� �� ����
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		//FruitBox<Toy> toyBox = new FruitBox<Toy>(); ��Ӱ��谡 �ƴϱ� ������
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		//appleBox.add(new Grape()); apple grape�� �ƹ� ���谡 ���⿡
				
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(grapeBox);
	}
	
}
