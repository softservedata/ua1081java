package PracticalTasks7.Practical2;

abstract class Staff extends Person{

    public Staff(String name) {
        super(name);
    }

    @Override
    public void print() {

    }
    public abstract void salary();
}
