package Homework15;

public class Homework2 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 + LOCK 1");
                try {
                    Thread.sleep(1000);
                } catch (Exception ignored) {}
                synchronized (lock2) {
                    System.out.println("Thread 1 + LOCK 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2 + LOCK 2");
                try {
                    Thread.sleep(1000);
                } catch (Exception ignored) {}
                synchronized (lock1) {
                    System.out.println("Thread 2 + LOCK 1");
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (Exception ignored) {}

        System.out.println("End of LOCK");
    }
}
