
public class SutaCard {
	int num;
	boolean isKwang;	//true : K, false : ����
	
	SutaCard(){
		this(1, true);
//		this.num = 1;
//		this.isKwang = true;
	}
	
	SutaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		return num + (isKwang ? "K":"");
	}
}

//��°��
//3
//1k