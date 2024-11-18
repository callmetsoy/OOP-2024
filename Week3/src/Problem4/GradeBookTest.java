package Problem4;

import Problem1.Student;

public class GradeBookTest {
    public static void main(String[] args) {


        Course course = new Course("C5101", "Object-oriented Programming and Design", 3, "None");


        Student[] students = new Student[4];
        students[0] = new Student("A");
        students[1] = new Student("B");
        students[2] = new Student("C");
        students[3] = new Student("D");


        GradeBook gradeBook = new GradeBook(course, students);


        System.out.println(gradeBook.displayMessage());

        gradeBook.addGrades(students);


        gradeBook.displayGradeReport();
    }
}
