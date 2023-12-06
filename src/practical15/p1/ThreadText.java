package practical15.p1;

class ThreadText extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(i + " I study Java");
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static void main(String[] args) {
        Thread t1 = new ThreadText();
        t1.start();
    }
}