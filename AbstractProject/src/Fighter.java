
public class Fighter implements Fightable{

	@Override
	public void attack(Unit u) {
		System.out.println("공격한다");
		
	}

	@Override
	public void move(int x, int y) {
		System.out.println("이동한다");
	}
	
}
