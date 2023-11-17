package practical9.p1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox("box1", 17));
        boxes.add(new HeavyBox("box2", 19));
        boxes.add(new HeavyBox("box3", 21));
        boxes.add(new HeavyBox("box4", 33));
        boxes.add(new HeavyBox("box5", 41));

        for (HeavyBox box : boxes) {
            System.out.println(box);
        }

        boxes.get(0).setWeight(1);
        System.out.println("Changed weight: " + boxes);

        boxes.remove(boxes.size() - 1);
        // boxes.remove(boxes.lastIndexOf(boxes)-1);
        System.out.println("Removed last box" + boxes);

        boxes.removeAll(boxes);
        System.out.println("Remove all: " + boxes);


    }
}
