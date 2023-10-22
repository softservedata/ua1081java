import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 1. Flower bed is shaped like a circle. Calculate its perimeter and area. Input the radius from the console, and output obtained results.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, input the radius value in cm: ");
        double radius = Double.parseDouble(br.readLine());

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter is: " + perimeter + " сm");
        System.out.println("Area is: " + area + " cm^2");
    }
} */

/*2. Define two String variables name and address. Output question "What is your name? to the console.
Read the value of name and output next question: “Where do you live, (name)?“ to the console.
Read the value of address from the console and output the complete information.

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name? ");
        String name = br.readLine();
        System.out.println("Where do you live, " + name + "?");
        String address = br.readLine();
        System.out.println("Your name is " + name + ". You live in " + address + ".");
    }
} */


/*3. Three phone calls were made from different countries, each with a different cost per minute (c1, c2, and c3) and duration (t1, t2, and t3).
Input all the source data from the console, calculate the cost of each call and the total cost, and output the results to the console.*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please input the cost for the first call (UAH per minute)");
        double c1 = Double.parseDouble(br.readLine());
        System.out.println("Please input the cost for the second call (UAH per minute)");
        double c2 = Double.parseDouble(br.readLine());
        System.out.println("Please input the cost for the third call (UAH per minute)");
        double c3 = Double.parseDouble(br.readLine());

        System.out.println("Please input the duration of the first call (minutes)");
        double t1 = Double.parseDouble(br.readLine());
        System.out.println("Please input the duration of the second call (minutes)");
        double t2 = Double.parseDouble(br.readLine());
        System.out.println("Please input the duration of the third call (minutes)");
        double t3 = Double.parseDouble(br.readLine());

        double total= (c1 * t1) + (c2 * t2) + (c3 * t3);
        System.out.println("Total cost for all three calls is: " + total + " UAH.");
    }
}