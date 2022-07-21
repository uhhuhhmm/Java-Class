package com.gerneric;

public class BoxTest2 {
	
	public static void main(String[] args) {
		//다형성을 이용한 제네릭, <>안에 참조형만 넣을 수 있음
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		//FruitBox<Toy> toyBox = new FruitBox<Toy>(); 상속관계가 아니기 때문에
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		//appleBox.add(new Grape()); apple grape는 아무 관계가 없기에
				
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(grapeBox);
	}
	
}
