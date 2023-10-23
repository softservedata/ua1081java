import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the cost of a minute from Ukraine (USD)");
            int с1 = Integer.parseInt(br.readLine());
            System.out.println("How long was your call?(min)");
            int t1 = Integer.parseInt(br.readLine());

            System.out.println("Enter the cost of a minute from Poland (USD)");
            int с2 = Integer.parseInt(br.readLine());
            System.out.println("How long was your call?(min)");
            int t2 = Integer.parseInt(br.readLine());

            System.out.println("Enter the cost of a minute from Germany (USD)");
            int с3 = Integer.parseInt(br.readLine());
            System.out.println("How long was your call?(min)");
            int t3 = Integer.parseInt(br.readLine());

            System.out.println("The cost of a call from Ukraine " + с1*t1 + " USD");
            System.out.println("The cost of a call from Poland " + с2*t2 + " USD");
            System.out.println("The cost of a call from Germany " + с3*t3 + " 3" +
                    "USD");
            System.out.println("Total cost of all calls " + ((с1*t1)+(с2*t2)+(с3*t3)) + " USD");

    }
}