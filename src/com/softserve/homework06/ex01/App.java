package com.softserve.homework06.ex01;

public class App {
    public static void main(String[] args) {
        Bird[] birds = new Bird[]{
                new Eagle("white", true),
                new Swallow("blue-green", true),
                new Penguin("black-white", true),
                new Kiwi("brown", true)};

        for (Bird bird : birds) {
            bird.fly();
        }
    }
}

