package practical7.p1;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Says woof!");
    }

    @Override
    public void feed() {
        System.out.println("Eats meat");

    }
}
