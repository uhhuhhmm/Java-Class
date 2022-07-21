package collection.treeset;

public class Student implements Comparable{
	String name;
	int ban;
	int no;
	int kor,eng,math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return getTotal() / 3;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + ", getTotal()=" + getTotal() + ", getAverage()=" + getAverage() + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		//기본을 오름차순으로 잡아둠
		if(o instanceof Student) {
			Student other = (Student)o;		
											// 정렬하는 방법 
			//return this.no - other.no;	//this에서 other을 빼준다 ->오름차순
			//양수, 0, 음수
			
			//return other.no - this.no;		//other에서 this를 빼준다 ->내림차순
			//return (this.no - other.no) * -1; //내림차순 다른 방법							
			
			return this.name.compareTo(other.name); //오름차순 this가 앞에 있어서
													//* -1 하면 내림차순
			
		}
		return 0; //값은 상관없음
	}
	
	
}
