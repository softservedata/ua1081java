package homework11.h2;

import java.util.Scanner;

class ReplaceSpaces{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input sentence: ");
        String sentence = scanner.nextLine();

        //спочатку так зробив
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < sentence.length()-1; i++) {
//           char currentChar = sentence.charAt(i);
//           if (currentChar == ' ' && sentence.charAt(i+1) == ' '){
//               continue;
//            }
//            stringBuilder.append(currentChar);
//        }
//        System.out.println(stringBuilder);

        //потім так
        String replaceSentence = sentence.replaceAll("\\s+", " ");
        System.out.println(replaceSentence);
    }
}