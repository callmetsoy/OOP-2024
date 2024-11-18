package Problem5;

public class Test{
	public static void main(String[] args) {
        PersonRegistry registry = new PersonRegistry();

        Employee john = new Employee("John", 30, "Tech Corp", "Developer");
        Student alice = new Student("Alice", 20, "State University", "Computer Science");
        PhDStudent bob = new PhDStudent("Bob", 28, "AI Ethics");

        Cat whiskers = new Cat("Whiskers", 3);
        Dog buddy = new Dog("Buddy", 5);
        Bird whoppy = new Bird("Whoopy", 3);
        
        john.assignPet(buddy);
        alice.assignPet(whiskers);

        registry.addPerson(john);
        registry.addPerson(alice);
        registry.addPerson(bob);
        
        System.out.println("Initial state:");
        registry.printAllPeopleDetails();

        System.out.println("\nLeaving pets for care:");
        PetCare.leavePetForCare(john, alice, whoppy);
        PetCare.leavePetForCare(alice, bob, whiskers);

        System.out.println("\nAfter leaving pets:");
        registry.printAllPeopleDetails();

        System.out.println("\nReturning pets from care:");
        PetCare.returnPetFromCare(john, alice, buddy);
        PetCare.returnPetFromCare(alice, bob, whiskers);

        System.out.println("\nFinal state:");
        registry.printAllPeopleDetails();
    }
}