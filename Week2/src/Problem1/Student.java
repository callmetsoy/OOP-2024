package Problem1;

public class Student {
    private String name;
    private int id;
    private int yearOfStudy;
    public static int nextId = 1;
    private double grade; 
    
    
    public Student(String name, int yearOfStudy) {
        this.name = name;
        this.yearOfStudy = yearOfStudy;
        this.id = nextId;
        nextId++;
    }

    public Student(String name) {
        this.name = name;
        this.yearOfStudy = 0;
        this.id = nextId;
        nextId++;
    }

 
    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }
    public void incrementYearOfStudy() {
        yearOfStudy++;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public String toString() {
        return name + " " + id;
    }
}
