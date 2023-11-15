package PracticalTasks7.Practical1;

import PracticalTasks7.Practical1.Animal;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("The dog voice is - Woof.");
    }

    @Override
    public void feed() {
        System.out.println("Feed dog meat.");
    }
}
