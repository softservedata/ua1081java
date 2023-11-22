package com.softserve.edu11.practical;

public class Task3 {
    public static void main(String[] args) {
        String[] usernames = {"Olha_123",
                "An",
                "some text for example",
                "qqqqqqqqqqqqqqq",
                "Ольга"};
        for (String username : usernames) {
            String regex = "[a-zA-Z0-9_]{3,15}";
            if (username.matches(regex)) {
                System.out.println(username + " is valid");
            } else {
                System.out.println(username + " is not valid");
            }
        }

    }
}
