package com.softserve.Homework11.Task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter sentence: ");
        String string = scanner.nextLine();
        List<String> strings = new ArrayList<>(Arrays.asList(string.split(" ")));
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String word = iterator.next();
            if(word.isEmpty()){
                iterator.remove();
            }
        }
        //strings.removeIf(String::isEmpty);// your while in Java 8
        String allSentence = "";
        for (String str: strings) {
            allSentence=allSentence.concat(str);
            allSentence=allSentence.concat(" ");
        }
        System.out.println(strings);
        System.out.println(allSentence);
    }
}
