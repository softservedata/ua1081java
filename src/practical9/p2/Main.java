package practical9.p2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int a = 10;
        Random random = new Random();
        for (int i = 0; i < a; i++) {
            list.add(random.nextInt(a));
        }
        System.out.println("Original list: " + list);

        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (element == list.get(j)) {
                    list.remove(j);
                }
            }
            for (int j = i + 1; j < list.size(); j++) {
                if (element == list.get(j)) {
                    list.remove(j);
                }
            }
        }
        System.out.println("     New list: " + list);

    }
}