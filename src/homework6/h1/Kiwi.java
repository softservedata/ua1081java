package homework6.h1;

public class Kiwi extends NonFlyingBird{
    private String feathers;
    private int laiEggs;

    public Kiwi(String feathers, int laiEggs) {
        this.feathers = feathers;
        this.laiEggs = laiEggs;
    }

    @Override
    public String toString() {
        return "Kiwi{" +
                ", feathers='" + feathers + '\'' +
                ", laiEggs=" + laiEggs +
                '}';
    }


}
