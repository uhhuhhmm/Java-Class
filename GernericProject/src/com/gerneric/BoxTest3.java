package com.gerneric;

public class BoxTest3 {

	public static void main(String[] args) {
		//���ϵ� ī��
		//<? extends T>	: ���ϵ� ī���� �������� T�� �� �ڼո� ����
		//<? super T>	: ���ϵ� ī���� �������� T�� �� ����鸸 ����
		//<?>			: ���Ѿ���,�� �Ⱦ�
		
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		System.out.println(Juicer.<Fruit>makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
		//������ �Ű������� Gerneric�� �̿��ؼ� ���߸� �ϱ� ������ �Ƚᵵ ������ �Ѵ�. ������ �����
		
	}

}
