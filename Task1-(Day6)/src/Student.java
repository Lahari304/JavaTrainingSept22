import java.util.ArrayList;

public class Student{
	
	int id;
	String name;
	ArrayList<Course> enrolledIn;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Course> getEnrolledIn() {
		return enrolledIn;
	}
	public void setEnrolledIn(ArrayList<Course> enrolledIn) {
		this.enrolledIn = enrolledIn;
	}
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
}
