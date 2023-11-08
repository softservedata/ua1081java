package practical7.p2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Teacher("Eva");
        people[1] = new Cleaner("Taras");
        people[2] = new Student("Bob");
        people[3] = new Student("Oleg");

        for (Person p : people) {
            p.print();
            if (p instanceof Teacher || p instanceof Cleaner) {
                ((Staff) p).salary();

            }
        }


    }
}