import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press 9. You can now see whitespace characters in your code.
public class Prtasks2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input first number");
        int x = Integer.parseInt(br.readLine());
        System.out.println("Imput second number");
        int y = Integer.parseInt(br.readLine());
        System.out.println("Input third number");
        int z  = Integer.parseInt(br.readLine());

        System.out.println("Average is " + ((x + y + z)/3));



    }
}
