import java.util.Scanner;
public class rev {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
       // String input = scanner.nextLine();
       String input= "I Love  Java Progrmming";
        String[] words = input.trim().split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        System.out.println(reversedSentence.toString().trim());
    }
}

