package homework6.h1;

public class Penguin extends NonFlyingBird{
    private String feathers;
    private int laiEggs;

    public Penguin(String feathers, int laiEggs) {
        this.feathers = feathers;
        this.laiEggs = laiEggs;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                ", feathers='" + feathers + '\'' +
                ", laiEggs=" + laiEggs +
                '}';
    }
}
