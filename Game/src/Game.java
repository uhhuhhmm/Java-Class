
public class Game {
	public static final int MAX_X = 20;
	public static final int MAX_Y = 10;
	public static final int MAX_FISH = 20;
	private char map[][] = new char[MAX_Y][MAX_X];
	private GameObject[] m = new GameObject[4];
	int state; //0: 게임중 1: Monster 승리 2: Human 승리
	
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
		System.out.println("** Bear의 Fish 먹기 게임을 시작합니다 **");
		update();
		draw(); // 초기 게임 맵을 보여준다
		
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
	
	//맵에 bear fish 표시
	private void update() {
		for(int i = m.length - 1; i >= 0; i--) {
			map[m[i].getY()][m[i].getX()] = m[i].getShape();
		}
	}
	//맵
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
