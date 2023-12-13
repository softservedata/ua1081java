package PracticalTasks15;

import java.util.stream.Stream;

public class IStudyJava {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("I study Java");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
        }
    }
}
