package practical9.p3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();

        int length = 10;
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            myCollection.add(random.nextInt(30));
        }
        System.out.println("Original myCollection: " + myCollection);

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(myCollection.get(i));
            }
        }
        System.out.println("newCollection " + newCollection);

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(i);
            }
        }
        //after the first time, if there are two in a row, it does not delete
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(i);
            }
        }
        System.out.println("myCollection removed greater then 20: " + myCollection);

        myCollection.set(2, 1);
       // myCollection.set(8, -3);
        myCollection.set(5, -4);
        System.out.println("Position: " + myCollection.indexOf(1) + " value of element = " + myCollection.get(2));
        System.out.println("Position: " + myCollection.indexOf(-4) + " value of element = " + myCollection.get(5));
        //System.out.println("Position: " + myCollection.indexOf(-3) + " value of element = " + myCollection.get(8));


        Collections.sort(myCollection);
        System.out.println("After sort: " + myCollection);


    }
}