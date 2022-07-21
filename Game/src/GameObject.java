
public abstract class GameObject {
	//�ѹ��� �̵��ϴ� �Ÿ� 
	protected int distance;
	//���� ��ġ
	protected int x, y;
	
	public GameObject(int x, int y, int distance, int appear) {
		super();
		this.x = x;
		this.y = y;
		this.distance = distance;
		
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public boolean collide(GameObject p) {
		
		if(this.x == p.getX() && this.y == p.getY()) {
			return true;
		}else {
			return false;
		}
	}
	
	protected abstract void move();
	protected abstract char getShape();
	
	
	
	
}
