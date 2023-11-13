package Homework_05_Ivan;

class NonFlyingBird extends Bird {
    // Constructor for NonFlyingBird
    NonFlyingBird(String feathers, String laysEggs, String name) {
        super(feathers, laysEggs, name); // Call superclass constructor
    }

    // Implementation of fly method for NonFlyingBird
    @Override
    void fly() {
        System.out.println(getName() + " cannot fly.");
    }
}