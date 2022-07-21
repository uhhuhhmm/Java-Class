public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[3];
	int i = 0;
	
	void buy(Product p) {
	      if(p.price > money) {
	         System.out.println("잔액이 부족합니다.");
	         return;
	      }
	      money -= p.price;
	      bonusPoint += p.bonusPoint;
	      
	      item[i++] = p;
	}
	int sum = 0;
	void summary() {
		for(int i = 0; i < item.length; i++) {
			sum += item[i].price;
			System.out.println(item[i] + "를 구매하셨습니다");
		}
		
		System.out.println("총 구매하신 금액은 : " + sum);
		System.out.println("남은 금액은 : " + money);
		System.out.println("보너스포인트는 : " + bonusPoint);
	}
}
