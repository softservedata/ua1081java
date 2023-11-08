package practical7.p1;

public class Main{

    public static void main(String[] args) {

        Animal[] animals = new Animal[]{
                new Cat(),
                new Dog()
        };

        for (Animal animal: animals){
            animal.feed();
            animal.voice();
        }



    }
}