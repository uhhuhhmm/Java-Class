
public class FighterTest {

	public static void main(String[] args) {
		Fighter ft = new Fighter();
		ft.move(10, 20);
		ft.attack(null);
		
		if(ft instanceof Fightable) {
			System.out.println("상속 관계에 있다");
		}
		
		if(ft instanceof Movable) {
			System.out.println("상속 관계에 있다");
		}
		
		if(ft instanceof Attackable) {
			System.out.println("상속 관계에 있다");
		}
	}

}
