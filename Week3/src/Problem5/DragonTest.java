package Problem5;

import java.util.Vector;

public class DragonTest {
    public static void main(String[] args) {
        
    	Vector<Person> people = new Vector<>();
        DragonLaunch dragonLaunch = new DragonLaunch(people);

        dragonLaunch.kidnap(new Person("Person1", Gender.B));
        dragonLaunch.kidnap(new Person("Person2", Gender.G));
        dragonLaunch.kidnap(new Person("Person3", Gender.B));
        dragonLaunch.kidnap(new Person("Person4", Gender.G));

        boolean result = dragonLaunch.willDragonEatOrNot();

        System.out.println(dragonLaunch.toString());
        System.out.println("Will the dragon eat? " + result);
        
        Vector<Person> people2 = new Vector<>();
        DragonLaunch dragonLaunch2 = new DragonLaunch(people2);

        dragonLaunch2.kidnap(new Person("Person5", Gender.G));
        dragonLaunch2.kidnap(new Person("Person6", Gender.B));
        dragonLaunch2.kidnap(new Person("Person7", Gender.G));
        dragonLaunch2.kidnap(new Person("Person8", Gender.B));

        boolean result2 = dragonLaunch2.willDragonEatOrNot();

        System.out.println(dragonLaunch2.toString());
        System.out.println("Will the dragon eat? " + result2);
    }
}