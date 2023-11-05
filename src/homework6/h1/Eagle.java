package homework6.h1;

public class Eagle extends FlyingBird{
   private String feathers;
   private int laiEggs;

    public Eagle(String feathers, int laiEggs) {
        this.feathers = feathers;
        this.laiEggs = laiEggs;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                ", feathers='" + feathers + '\'' +
                ", laiEggs=" + laiEggs +
                '}';
    }
}


