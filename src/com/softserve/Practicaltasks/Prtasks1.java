import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Prtasks1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Hello, write your text:");
    String text = br.readLine();
    String text2 = br.readLine();
    String text3 = br.readLine();

    System.out.println(text3);
    System.out.println(text2);
    System.out.println(text);


    }
}
