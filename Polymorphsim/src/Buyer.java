public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[3];
	int i = 0;
	
	void buy(Product p) {
	      if(p.price > money) {
	         System.out.println("�ܾ��� �����մϴ�.");
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
			System.out.println(item[i] + "�� �����ϼ̽��ϴ�");
		}
		
		System.out.println("�� �����Ͻ� �ݾ��� : " + sum);
		System.out.println("���� �ݾ��� : " + money);
		System.out.println("���ʽ�����Ʈ�� : " + bonusPoint);
	}
}
