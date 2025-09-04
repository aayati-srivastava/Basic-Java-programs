import java.util.Scanner;

public class WordNewLine4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine()
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
        
        input.close();
    }
}