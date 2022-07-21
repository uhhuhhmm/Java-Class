
public class Person {
	long id;
	int age;
	
	Person(long id, int age){
		this.id = id;
		this.age = age;
	}
	
	@Override //변수를 비교
	public boolean equals(Object obj) {
		Person other = ((Person)obj);
		if(obj instanceof Person) {
			return this.id == other.id && this.age == other.age;
		}else {
			return false;
		}

	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return (id + "" + age).hashCode();
	}
	
	
	
	
}
