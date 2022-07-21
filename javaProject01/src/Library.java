
public class Library {
	String bname;
	String name;
	int age;
	String author;
	int mbnum;
	
	
	public Library(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Library(String bname, String author) {
		this.bname = bname;
		this.author = author;
	}
	
	
	String getBname() {
		return bname;
	}

	void setBname(String bname) {
		this.bname = bname;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getAge() {
		return age;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	String getAuthor() {
		return author;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	
	int getMbnum() {
		return mbnum;
	}
	
	void setMbnum(int mbnum) {
		this.mbnum = mbnum;
	}
	
	
	
}
