package Problem4;

import java.util.Scanner;

import Problem1.Student;

public class GradeBook {
	private Course course;
	private Student[] students;
	private double max = Integer.MIN_VALUE;
	private double min = Integer.MAX_VALUE;
	private double total;
	private int sum;
	private String bestStudent;
	private String worstStudent;
	private int bestId;
	private int worstId;
	
	public GradeBook(Course course, Student[] students) {
		this.course = course;
		this.students = students;
	}
	
	public String displayMessage() {
		return "Welcome to the grade book for " + course.getName() + " " + course.getDescription() + " !";
	}
	
	
	public void addGrades(Student[] students) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.print("Student " + students[i].getName() + ": ");
            double grade = input.nextDouble();
            students[i].setGrade(grade);  	
            }
        input.close();
	}
	
	public String determineClassAverage() {
		for(int i = 0; i < students.length; i++) {
			double grade = students[i].getGrade();
			sum += grade;
		}
		total = students.length;
		return "Class average is " + sum / total + ". ";
	}
	
	public String determineMin() {
		for(int i = 0; i < students.length; i++) {
			if(students[i].getGrade() < min) {
				min = students[i].getGrade();
				worstStudent = students[i].getName();
				worstId = students[i].getId();
			}
		}
		return "Lowest grade is " + min + " (Student " + worstStudent + ", " +  worstId +"). ";	
	}
	public String determineMax() {
		for (int i = 0; i < students.length; i++){
			if(students[i].getGrade() > max) {
				max = students[i].getGrade();
				bestStudent = students[i].getName();
				bestId = students[i].getId();
			}	
		}
		return "Highest grade is " + max + " (Student " + bestStudent + ", " +  bestId +"). ";
 		
	}
	public void outputBarChart() {
		    int[] grades = new int[11]; 
		    for (int i = 0; i < students.length; i++) {
		        int gradeIndex = (int) students[i].getGrade() / 10;
		        if (gradeIndex >= 10) {  
		            gradeIndex = 10;
		        }
		        grades[gradeIndex]++;
		    }

		    System.out.println("Grades distribution:");
		    for (int i = 0; i < grades.length; i++) {
		        if (i == 10) {
		            System.out.print("  100: ");  
		        } else {
		            System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);  
		        for (int j = 0; j < grades[i]; j++) {
		            System.out.print('*');
		        }
		        System.out.println();
		        }
		    
		    }

	}
	
	public void displayGradeReport() {
		System.out.println(displayMessage());
		System.out.println(determineClassAverage());
		System.out.println(determineMin());
		System.out.println(determineMax());
		outputBarChart();
	}
}