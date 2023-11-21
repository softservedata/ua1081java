package PracticalTasks9.Practical1;

import java.util.ArrayList;
import java.util.List;

public class MainArray {
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(20, "Products"));
        boxes.add(new HeavyBox(5, "Feathers"));
        boxes.add(new HeavyBox(17, "Tools"));
        boxes.add(new HeavyBox(45, "Books"));

        System.out.println("Initial info:");
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }
        HeavyBox firstBox = boxes.get(0);
        firstBox = new HeavyBox(firstBox.getWeight() + 1, firstBox.getContents());
        boxes.set(0, firstBox);
        if (!boxes.isEmpty()) {
            boxes.remove(boxes.size() - 1);
        }
        System.out.println("Info after changes:");
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }
        boxes.clear();

        System.out.println("Result:");
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }
    }
}