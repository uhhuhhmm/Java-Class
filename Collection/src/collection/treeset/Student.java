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
		//�⺻�� ������������ ��Ƶ�
		if(o instanceof Student) {
			Student other = (Student)o;		
											// �����ϴ� ��� 
			//return this.no - other.no;	//this���� other�� ���ش� ->��������
			//���, 0, ����
			
			//return other.no - this.no;		//other���� this�� ���ش� ->��������
			//return (this.no - other.no) * -1; //�������� �ٸ� ���							
			
			return this.name.compareTo(other.name); //�������� this�� �տ� �־
													//* -1 �ϸ� ��������
			
		}
		return 0; //���� �������
	}
	
	
}
