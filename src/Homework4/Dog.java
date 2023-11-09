package Homework4;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public enum Breed {
        Labrador, Bigl, Buldog, Poodle,
        ;
    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Toby", Breed.Bigl, 3);
        Dog dog2 = new Dog("Jessy", Breed.Labrador, 9);
        Dog dog3 = new Dog("Lucky", Breed.Buldog, 5);

        Dog[] dogs = {dog1, dog2, dog3};

        boolean hasDuplicateNames = false;
        for (int i = 0; i < dogs.length - 1; i++) {
            for (int j = i + 1; j < dogs.length; j++) {
                if (dogs[i].name.equals(dogs[j].name)){
                    hasDuplicateNames = true;
                    break;
                }
            }
            if (hasDuplicateNames){
                break;
            }
        }
        if (hasDuplicateNames){
            System.out.println("Tho dogs have the same name");
        }else {
            Dog oldestDog = dogs[0];
            for (int i = 1; i <dogs.length; i++){
                if (dogs[i].age>oldestDog.age){
                    oldestDog=dogs[i];
                }
            }
            System.out.println("The oldest dog is " + oldestDog.name + " of bread " + oldestDog.breed);
        }
    }
}
