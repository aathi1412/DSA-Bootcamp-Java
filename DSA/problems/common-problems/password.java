
import java.util.*;
public class password {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String pass = s.nextLine();

         boolean hasLetter = pass.matches(".*[a-zA-Z].*");
        boolean hasDigit = pass.matches(".*\\d.*");
        boolean has_special_char = pass.matches("!@#$%^&*");
        

        if (hasLetter && hasDigit && has_special_char) {
            System.out.println("strong");
        } else {
            System.out.println("weak");
        }

        
    }
}
