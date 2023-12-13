package PracticalTasks15;

public class TwoMessages {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, world");
            try {
                Thread.sleep(2000);
            } catch (Exception ignored) {
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Peace in the peace");
            try {
                Thread.sleep(3000);
            } catch (Exception ignored) {
            }
        }
        System.out.println("My name is ...");
    }
}
