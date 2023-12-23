package com.softserve.edu.HW9.Task1;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>(10);
        List<Integer> myCollectionCopy = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(100) - 50);
        }

        myCollectionCopy.addAll(myCollection.subList(0, 10));

        System.out.println("The elements in myCollection are:");
        for (int value : myCollection) {
            System.out.print(value + " ");
        }

        System.out.println("\n\nSwap the maximum and minimum elements in the list:");

        Collections.swap(myCollection, myCollection.indexOf(Collections.min(myCollection)), myCollection.indexOf(Collections.max(myCollection)));

        for (int value : myCollection) {
            System.out.print(value + " ");
        }


        System.out.println("\n\nInsert a random three-digit number before the first negative element of the list:");
        for(int value: myCollection){
            if(value<0){
                myCollection.add(myCollection.indexOf(value), random.nextInt(100));
                myCollection.add(myCollection.indexOf(value), random.nextInt(100));
                myCollection.add(myCollection.indexOf(value), random.nextInt(100));
                break;
            }
            else{break;}
        }

        for (int value : myCollection) {
            System.out.print(value + " ");
        }

        System.out.println("\n\nInsert a zero between all neighboring elements collection myCollection with different signs:");

        List<Integer> myNewCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size() - 1; i++) {
            myNewCollection.add(myCollection.get(i));

            if (Math.signum(myCollection.get(i)) != Math.signum(myCollection.get(i + 1))) {
                myNewCollection.add(0);
            }
        }

        myNewCollection.add(myCollection.get(myCollection.size() - 1));

        for (int value : myNewCollection) {
            System.out.print(value + " ");
        }

        System.out.println("\n\nCopy the first k elements of the myCollection to the list1, in direct order, and the rest to the\r\n" + //
                "list2 in reverse order:");

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        System.out.print("Input k, please: ");
        int k = sc.nextInt();

        list1.addAll(myCollection.subList(0, k));
        list2.addAll(myCollection.subList(k, myCollection.size()));
        Collections.reverse(list2);
        

        System.out.println("\nlist1:");
        for (int value : list1) {
            System.out.print(value + " ");
        }

        System.out.println("\n\nlist2:");
        for (int value : list2) {
            System.out.print(value + " ");
        }



        System.out.println("\n\nIn a list myCollection remove the last even element (if there are even elements in the list). If there is no such element, display a message:");

        List<Integer> reversedMyCollection = new ArrayList<>();

        reversedMyCollection.addAll(myCollectionCopy.subList(0, 10));
        Collections.reverse(reversedMyCollection);

        for (int value : reversedMyCollection) {
            if(value%2==0){
                reversedMyCollection.remove(reversedMyCollection.indexOf(value));
                break;
            }
            else{System.out.println("No even nums.");}
        }
        Collections.reverse(reversedMyCollection);

        System.out.println("old list");
        for (int value : myCollectionCopy) {
            System.out.print(value + " ");
        }
        System.out.println("\nnew list");
        for (int value : reversedMyCollection) {
            System.out.print(value + " ");
        }


        System.out.println("\n\nRemove from the list myCollection the element following the first minimum. If the minimum element is the last one, nothing needs to be removed:");

        boolean temp = false;
        for(int value: myCollectionCopy){
            int min = Collections.min(myCollectionCopy);

            if((value == min)&&(!temp)){ temp = true; continue;}
            if(temp){myCollectionCopy.remove(myCollectionCopy.indexOf(value));}
        }

        for (int value : myCollectionCopy) {
            System.out.print(value + " ");
        }

        sc.close();

    }
}
