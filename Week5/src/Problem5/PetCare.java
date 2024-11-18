package Problem5;

public class PetCare {
	public static void leavePetForCare(Person owner, Person caretaker, Animal pet) {
        if (!owner.getPets().contains(pet)) {
            System.out.println("Owner doesn't have this pet to leave for care.");
            return;
        }
        if (caretaker instanceof PhDStudent && pet instanceof Dog) {
        	System.out.println("PhD Students cannot take care of dogs.");
        	return;
        }
        owner.removePet(pet);
        caretaker.assignPet(pet);
        System.out.println(owner.getName() + " left their pet " + pet.getName() + " with " + caretaker.getName() + " for care.");
    }

    public static void returnPetFromCare(Person owner, Person caretaker, Animal pet) {
        if (!caretaker.getPets().contains(pet)) {
            System.out.println("Caretaker doesn't have this pet to return.");
            return;
        }
        caretaker.removePet(pet);
        owner.assignPet(pet);
        System.out.println(caretaker.getName() + " returned the pet " + pet.getName() + " to " + owner.getName() + ".");
    }
}   
