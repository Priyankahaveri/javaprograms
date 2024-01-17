package javaprograms;
import java.util.Scanner;

public class CharacterDigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        
        int charCount = 0;
        int digitCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (Character.isLetter(ch)) {
                charCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

       
        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of digits: " + digitCount);

        scanner.close();
    }
}
