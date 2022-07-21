
public class Initialize {
	//멤버변수의 초기화 방법
	//1.자동초기화, 2.명시적초기화, 3.생성자에 의한 초기화, 4.초기화 블럭에 의한 초기화
	int x;
	int y;
	static int cv = 300;
	
	{
		//인스턴스 변수 초기화 블럭
		x = 100;
		y = 200;
	}
	
	static {
		//클래스 변수 초기화 블럭
		cv = 500;
	}
	
	Initialize(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
