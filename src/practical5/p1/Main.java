package practical5.p1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] name = {"Bob", "Ivan", "Oleg", "Olga"};
        String tmp;
        for (int i = 0; i < name.length - 1; i++) {
            for (int j = i + 1; j < name.length; j++) {
                if ((name[i].compareTo(name[j]) < 0)) {
                    tmp = name[i];
                    name[i] = name[j];
                    name[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(name));

        int[] nums = {5, 6, 15, 14, 85};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int average = sum / 5;
        System.out.println(average);

        System.out.println("Enter the number which you looking for: ");
        Scanner sc = new Scanner(System.in);
        String lookingName = sc.nextLine();
        for (String x : name) {
            if (x.equals(lookingName)) {
                System.out.println("Yor name " + lookingName + " present in the list");
            }
        }


    }
}