package homework15.h1;

class Run1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
        }
    }
}
class Run2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("world!");
        }
    }
}
class Run3 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Everything be okay!");
        }
    }
}