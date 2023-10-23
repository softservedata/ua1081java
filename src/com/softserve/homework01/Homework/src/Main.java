import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Hello, What is your name?");
       String name = br.readLine();
       System.out.println("Hello "+ name + ", Where do you live?");
       String name2 = br.readLine();
       System.out.println("Hello, " + name );
       System.out.println("You live in " + name2 );




    }
}