package PracticalTasks7.Practical1;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(),
                new Cat(),
                new Dog(),
                new Dog()};
        for (Animal animal : animals){
            animal.voice();
            animal.feed();
            System.out.println();
        }
    }
}
