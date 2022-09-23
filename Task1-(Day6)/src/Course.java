import java.util.ArrayList;

public class Course {
	
	int id;
	String name;
	String instructorName;
	ArrayList<Student> students;
	int rating;
	
	
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


	public String getInstructorName() {
		return instructorName;
	}


	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}


	public ArrayList<Student> getStudents() {
		return students;
	}


	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	Course(int id, String name, String inst){
		this.id = id;
		this.name = name;
		this.instructorName = inst;
		this.rating = 0;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", instructorName=" + instructorName + ", rating=" + rating
				+ "]";
	}


	

}
