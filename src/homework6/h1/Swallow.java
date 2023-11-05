package homework6.h1;

public class Swallow extends FlyingBird{
    private String feathers;
    private int laiEggs;

    public Swallow(String feathers, int laiEggs) {
        this.feathers = feathers;
        this.laiEggs = laiEggs;
    }

    @Override
    public String toString() {
        return "Swallow{" +
                ", feathers='" + feathers + '\'' +
                ", laiEggs=" + laiEggs +
                '}';
    }
}

