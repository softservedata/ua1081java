package homework9.h1;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int a = 10;
        /*for (int i = 0; i < 10; i++) {
            System.out.println("Enter number end pres enter: ");
            myCollection.add(i, scanner.nextInt());
        }*/
        for (int i = 0; i < a; i++) {
            myCollection.add(random.nextInt(-20, 20));
        }
        System.out.println("Original myCollection    " + myCollection);

        Integer min = Collections.min(myCollection);
        Integer indexMin = myCollection.indexOf(min);
        Integer max = Collections.max(myCollection);
        Integer indexMax = myCollection.indexOf(max);
        Collections.swap(myCollection, indexMax, indexMin);
        System.out.println("myCollection after swap: " + myCollection);

        for (int i = 0; i<myCollection.size(); i++){
            if (myCollection.get(i)<0){
                myCollection.add(myCollection.indexOf(myCollection.get(i)), random.nextInt(100,999) );
                break;
            }
        }
        System.out.println("myCollection insert number: " + myCollection);

        ListIterator<Integer> iterator = myCollection.listIterator();
        for (int i = 0; i < myCollection.size(); i++) {
            if (iterator.hasNext()) {
                Integer next = iterator.next();
                if (next > 0) {
                    if (iterator.hasNext()) {
                        Integer next1 = iterator.next();
                        if (next1 < 0) {
                            iterator.previous();
                            iterator.add(0);
                        }
                    }
                } else {
                    if (iterator.hasNext()) {
                        Integer next1 = iterator.next();
                        if (next1 > 0) {
                            iterator.previous();
                            iterator.add(0);
                        }
                    }
                }

        }
        }
        System.out.println("myCollection after insert zero: " + myCollection);


        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int k=5;
        for (int i=0; i<k; i++){
            list1.add(i,myCollection.get(i));
        }
        for (int i=k; i<myCollection.size(); i++){
            int j=0;
            list2.add(j,myCollection.get(i));
        }
        System.out.println("list1 " + list1);
        System.out.println("list2 " + list2);


        for (int i=myCollection.size()-1; i>=0; i--) {
            if (myCollection.get(i)%2 == 0) {
                myCollection.remove(i);
                break;
            }
            if (myCollection.get(i) % 2 != 0 && i == myCollection.size()) {
                    System.out.println("There is no even element");
                }
            }

        System.out.println("myCollection remove even: " + myCollection);

        Integer mini = Collections.min(myCollection);
        Integer indexMini = myCollection.indexOf(min);
        myCollection.remove(indexMini + 1);
        System.out.println("Remove element following the first minimum " + myCollection);


    }
}