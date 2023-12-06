package homework15.h3;

public class TreeThread implements Runnable {

    @Override
    public void run() {
        Thread two = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }
            Thread three = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread number three");
                }
            });
            three.start();
        });
        two.start();
    }

    public static void main(String[] args) {
        Runnable r1 = new TreeThread();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}