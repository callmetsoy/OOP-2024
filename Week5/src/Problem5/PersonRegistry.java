package Problem5;

import java.util.Vector;

public class PersonRegistry {
    private Vector<Person> people = new Vector<>();

    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public Vector<Person> getPeopleWithPets() {
        Vector<Person> peopleWithPets = new Vector<>();
        for (Person person : people) {
            if (person.hasPet()) {
                peopleWithPets.add(person);
            }
        }
        return peopleWithPets;
    }

    public Vector<Person> getPeopleWithoutPets() {
        Vector<Person> peopleWithoutPets = new Vector<>();
        for (Person person : people) {
            if (!person.hasPet()) {
                peopleWithoutPets.add(person);
            }
        }
        return peopleWithoutPets;
    }

    public void printAllPeopleDetails() {
        for (Person person : people) {
            System.out.println(person.toString() + " - " + person.getOccupation());
        }
    }
}
