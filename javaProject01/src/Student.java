
public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// getTotal() {����,����,���� ������ ����}
	int getTotal() {
		return kor + eng + math;
	}
	// getAverage() { 3������ ���(�Ҽ��� ��°¥������ �ݿø�) }
	float getAverage() {
		return (int)(getTotal() / 3f * 10 + 0.5f) / 10f; 
		//78.66
		//786.6666 + 0.5
		//787.1666
		//(int)787.1666
		//787 / 10f
		//78.7
	}
	
	
	
	
	
	
	
	
	
	
	
}
