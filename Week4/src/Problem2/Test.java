package Problem2;

import java.util.Scanner;
import java.util.Vector;

public class Test {

    public static void main(String[] args) {
        Vector<Person> people = new Vector<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an action:" + "\n" + "1. Add a new person (Person, Student or Staff)" + "\n" + "2. Show information about all added people" + "\n" + "3. Exit" + "\n");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.println("What type of person would you like to add? (Person | Student | Staff): ");
                String type = scanner.nextLine();

                System.out.println("Enter name:");
                String name = scanner.nextLine();

                System.out.println("Enter address:");
                String address = scanner.nextLine();

                if (type.equalsIgnoreCase("Person")) {
                    Person person = new Person(name, address);
                    people.add(person);
                    System.out.println("Person added!");

                } else if (type.equalsIgnoreCase("Student")) {
                    System.out.println("Enter program:");
                    String program = scanner.nextLine();

                    System.out.println("Enter year:");
                    int year = scanner.nextInt();

                    System.out.println("Enter fee:");
                    double fee = scanner.nextDouble();
                    scanner.nextLine(); 

                    Student student = new Student(name, address, program, year, fee);
                    people.add(student);
                    System.out.println("Student added!");

                } else if (type.equalsIgnoreCase("Staff")) {
                    System.out.println("Enter school:");
                    String school = scanner.nextLine();

                    System.out.println("Enter pay:");
                    double pay = scanner.nextDouble();
                    scanner.nextLine(); 

                    Staff staff = new Staff(name, address, school, pay);
                    people.add(staff);
                    System.out.println("Staff added!");

                } else {
                    System.out.println("Invalid type ! Choose person | student | staff");             
                }

            } else if (choice == 2) {
                if (people.isEmpty()) {
                    System.out.println("No people added.");
                } else {
                    for (Person person : people) {
                        System.out.println(person);
                        
                    }
                }

            } else if (choice == 3) {
                System.out.println("Exiting the program...");
                break;

            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
