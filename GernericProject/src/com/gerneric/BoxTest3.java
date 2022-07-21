package com.gerneric;

public class BoxTest3 {

	public static void main(String[] args) {
		//와일드 카드
		//<? extends T>	: 와일드 카드의 상한제한 T와 그 자손만 가능
		//<? super T>	: 와일드 카드의 하한제한 T와 그 조상들만 가능
		//<?>			: 제한없음,잘 안씀
		
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		System.out.println(Juicer.<Fruit>makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
		//들어오는 매개변수의 Gerneric을 이용해서 유추를 하기 때문에 안써도 동작은 한다. 원래는 써야함
		
	}

}
