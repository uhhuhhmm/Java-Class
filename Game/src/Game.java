
public class Game {
	public static final int MAX_X = 20;
	public static final int MAX_Y = 10;
	public static final int MAX_FISH = 20;
	private char map[][] = new char[MAX_Y][MAX_X];
	private GameObject[] m = new GameObject[4];
	int state; //0: ������ 1: Monster �¸� 2: Human �¸�
	
	Game() {
		for(int i = 0; i < MAX_Y; i++) {
			for(int j  = 0; j < MAX_X; j++) {
				map[i][j] = '.';
			}
		}
		
		m[0] = new Bear(0, 0, 1, 3);
		m[1] = new Fish(5, 5, 2);
		
		
		state = 0;
			
	}
	
	public void run() {
		System.out.println("** Bear�� Fish �Ա� ������ �����մϴ� **");
		update();
		draw(); // �ʱ� ���� ���� �����ش�
		
		while(!doesEnd()) {
			clear();
			for(int i = 0; i < m.length; i++) {
				m[i].move();
			}
			update();
			draw();
		}
		System.out.println("FISH DIED");
	}
	
	private void clear() {
		for(int i = 0; i < m.length; i++) {
			map[m[i].getY()][m[i].getX()] = '.';
		}
	}
	
	//�ʿ� bear fish ǥ��
	private void update() {
		for(int i = m.length - 1; i >= 0; i--) {
			map[m[i].getY()][m[i].getX()] = m[i].getShape();
		}
	}
	//��
	private void draw() { 
		System.out.println();
		
		for(int i = 0; i < MAX_Y; i++) {
			for(int j = 0; j < MAX_X; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	
	private boolean doesEnd() {
		
		if(m[0].collide(m[1])) {
			return true;
		}
		 return false;
	}
}
