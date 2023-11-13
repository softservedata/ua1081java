package Homework_05_Ivan;

// Subclass FlyingBird
class FlyingBird extends Bird {
    // Constructor for FlyingBird
    FlyingBird(String feathers, String laysEggs, String name) {
        super(feathers, laysEggs, name); // Call superclass constructor
    }

    // Implementation of fly method for FlyingBird
    @Override
    void fly() {
        System.out.println(getName() + " is flying.");
    }
}