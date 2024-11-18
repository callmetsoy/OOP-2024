package Problem5;

public class Student extends Person {
	private String university;
	private String faculty;
	
	public Student(String name, int age, String u, String f) {
		super(name, age);
		this.university = u;
		this.faculty = f;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String u) {
		this.university = u;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String f){
		this.faculty = f;
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || !(o instanceof Student)) return false;
		Student student = (Student) o;
		return super.equals(student) && faculty.equals(student.faculty) && university.equals(student.university);
	}
	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (university != null? university.hashCode(): 0);
		result = 31 * result + (faculty != null? faculty.hashCode(): 0);
		return result;
	}
	@Override
	public String getOccupation() {
		return "Student studies at the faculty " + faculty + " at " + university;
	}
	@Override
	public String toString() {
		return "[Student] " + super.toString() + "| University: " + university + "| Faculty " + faculty + "]";
	}
}

