package practical7.p1;

class Cat implements Animal{

    @Override
    public void voice() {
        System.out.println("Says meow!");
    }

    @Override
    public void feed() {
        System.out.println("Eats fish");

    }
}