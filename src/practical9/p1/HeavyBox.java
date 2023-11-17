package practical9.p1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class HeavyBox {
    private String name;
    private int weight;


    public HeavyBox(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nHeavyBox{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}