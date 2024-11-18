package Problem5;

public class PhDStudent extends Person{
	private String program;
	
	public PhDStudent(String n, int a, String p) {
		super(n, a);
		this.program = p;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String p) {
		this.program = p;
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o!= null || !(o instanceof PhDStudent)) return false;
		PhDStudent phd = (PhDStudent) o;
		return super.equals(phd) && program.equals(phd.program);
	}
	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (program != null? program.hashCode(): 0);
		return result;
	}
	@Override
	public String getOccupation(){
		return "PhD Student's program: " + program;
	}
	@Override
	public String toString() {
		return "[PhD Student] " + super.toString() + "| Program: " + program + "]";
	}
	public void assignPet(Animal pet) {
        if (!(pet instanceof Dog)) {
            super.assignPet(pet);
        } else {
            System.out.println("PhD Students cannot have dogs as pets.");
        }
    }
}
