package Homework_05_Ivan;

// Abstract class Bird
abstract class Bird {
    private final String feathers;
    private final String laysEggs;
    private final String name; // Add a name characteristic

    // Constructor for Bird
    Bird(String feathers, String laysEggs, String name) {
        this.feathers = feathers;
        this.laysEggs = laysEggs;
        this.name = name; // Initialize the name
    }

    // Getter for feathers
    public String getFeathers() {
        return feathers;
    }

    // Getter for laysEggs
    public String laysEggs() {
        return laysEggs;
    }

    // Abstract method for fly
    abstract void fly();

    // Getter for name
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // Create an array of Bird objects with names
        Bird[] birds = new Bird[4];
        birds[0] = new FlyingBird("Blue", "Yes", "Eagle");
        birds[1] = new FlyingBird("Brown", "Yes", "Swallow");
        birds[2] = new NonFlyingBird("Black and White", "Yes", "Penguin");
        birds[3] = new NonFlyingBird("Brown", "Yes", "Kiwi");

        // Display information about each bird
        for (Bird bird : birds) {
            System.out.println("Name: " + bird.getName());
            System.out.println("Feathers: " + bird.getFeathers());
            System.out.println("Lays Eggs: " + bird.laysEggs());
            bird.fly();
            System.out.println();
        }
    }
}