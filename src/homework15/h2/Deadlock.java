package homework15.h2;

public class Deadlock {
    synchronized void method1(Deadlock deadlock) {
        System.out.println("Thread 1: method1");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        deadlock.method2(this);
    }

    synchronized void method2(Deadlock deadlock) {
        System.out.println("Thread 2: method2");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        deadlock.method1(this);
    }


    public static void main(String[] args) {
        Deadlock r1 = new Deadlock();
        Deadlock r2 = new Deadlock();

        Thread t1 = new Thread(() -> r1.method1(r2));
        Thread t2 = new Thread(() -> r2.method2(r1));

        t1.start();
        t2.start();
    }
}
