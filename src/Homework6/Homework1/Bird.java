package Homework6.Homework1;

abstract class Bird {
    public String Feathers;
    private boolean laysEggs;

    public Bird(String feathers, boolean laysEggs) {
        Feathers = feathers;
        this.laysEggs = laysEggs;
    }

    abstract void fly();
}

class FlyingBird extends Bird {
    public FlyingBird(String feathers, boolean laysEggs) {
        super(feathers, laysEggs);
    }

    @Override
    void fly() {
        System.out.println("It's a flying bird.");
    }
}

class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, boolean laysEggs) {
        super(feathers, laysEggs);
    }

    @Override
    void fly() {
        System.out.println("This is not a flying bird.");
    }
}

class Eagle extends FlyingBird {
    public Eagle(String feathers, boolean laysEggs) {
        super(feathers, laysEggs);
    }

    @Override
    void fly() {
        System.out.println("Eagle it's a flying bird.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Swallow extends FlyingBird {
    public Swallow(String feathers, boolean laysEggs) {
        super(feathers, laysEggs);
    }

    @Override
    void fly() {
        System.out.println("Swallow it's a flying bird.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Penguin extends NonFlyingBird {
    public Penguin(String feathers, boolean laysEggs) {
        super(feathers, laysEggs);
    }

    @Override
    void fly() {
        System.out.println("Penguin this is not a flying bird.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Kiwi extends NonFlyingBird {
    public Kiwi(String feathers, boolean laysEggs) {
        super(feathers, laysEggs);
    }

    @Override
    void fly() {
        System.out.println("Kiwi this is not a flying bird.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class BirdMain {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("Dark brown", true);
        Swallow swallow = new Swallow("Dark blue and pale beige", true);
        Penguin penguin = new Penguin("Black and white", true);
        Kiwi kiwi = new Kiwi("Brown and gray", true);
        Bird[] array = new Bird[]{eagle, swallow, penguin, kiwi};

        for (Bird bird : array) {
            bird.fly();
            System.out.println("Feathers: " + bird.Feathers + "\n");
        }
    }
}