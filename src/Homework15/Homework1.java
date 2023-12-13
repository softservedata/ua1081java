package Homework15;

public class Homework1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrintThread("Hello"));
        Thread thread2 = new Thread(new PrintThread("My name is Bob"));
        Thread thread3 = new Thread(new PrintThread("Nice to meet you."));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (Exception ignored) {
        }

        thread3.start();
    }
}

class PrintThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + message);
        }
    }

    private final String message;

    public PrintThread(String message) {
        this.message = message;
    }
}
