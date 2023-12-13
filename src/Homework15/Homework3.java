package Homework15;

public class Homework3 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 start Thread 2");

            Thread thread2 = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }
                System.out.println("Thread 2 start Thread 3");

                Thread thread3 = new Thread(() -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread number three");
                    }
                });

                thread3.start();
                try {
                    thread3.join();
                } catch (Exception ignored) {
                }
            });

            thread2.start();
            try {
                thread2.join();
            } catch (Exception ignored) {
            }
        });

        thread1.start();
        try {
            thread1.join();
        } catch (Exception ignored) {
        }
    }
}
