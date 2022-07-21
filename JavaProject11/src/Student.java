
public class Student implements Comparable{
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student tmp = (Student)o; 
					return name.compareTo(tmp.name);
			
			
		}else {
			return 0;
		}
			
	}
	
	

}
