package com.softserve.Homework06.Task1;

public class Task1 {
    public static void main(String[] args) {
        FlyingBird flyingBird = new FlyingBird();
        NonFlyingBird nonFlyingBird = new NonFlyingBird();
        Swallow swallow = new Swallow();
        Eagle eagle = new Eagle();
        Kiwi kiwi = new Kiwi();
        Penguin penguin = new Penguin();
        System.out.println(flyingBird);
        flyingBird.fly();
        System.out.println(nonFlyingBird);
        nonFlyingBird.fly();
        System.out.println(eagle);
        eagle.fly();
        System.out.println(swallow);
        swallow.fly();
        System.out.println(kiwi);
        kiwi.fly();
        System.out.println(penguin);
        penguin.fly();
        //as for me it is better to use this way:
        // Bird[] birds = new Bird[] {
        //            new FlyingBird(),
        //            new NonFlyingBird(),
        //            new Swallow(),
        //            new Eagle(),
        //            new Kiwi(),
        //            new Penguin()
        //        };
        //
        //        for (Bird bird : birds) {
        //            System.out.println(bird);
        //            bird.fly();
        //        }
    }
}
