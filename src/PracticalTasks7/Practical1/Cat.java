package PracticalTasks7.Practical1;

public class Cat implements Animal{
    @Override
    public void voice() {
        System.out.println("The cat voice is - Meow.");
    }

    @Override
    public void feed() {
        System.out.println("Feed cats fish.");
    }
}
