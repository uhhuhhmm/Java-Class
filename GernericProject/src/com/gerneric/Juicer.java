package com.gerneric;

public class Juicer {
									//Gerneric 타입을 제한, 매개변수의 상한
	static <T extends Fruit> Juice makeJuice(FruitBox<T> box) {
		String tmp = "";
						
		for(Fruit f : box.getList()) {
			tmp += f + " ";
			
		}
		return new Juice(tmp);
		
	}
	
}
