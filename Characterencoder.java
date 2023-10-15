
package characterencoder;
import java.util.Scanner;

public class Characterencoder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to encode:");
        String inputString = scanner.nextLine();

        String encodedString = encodeString(inputString);
        System.out.println("Encoded string: " + encodedString);
    }

    public static String encodeString(String input) {
        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char original = input.charAt(i);
            char encodedChar = (char) (original + 2);
            encoded.append(encodedChar);
        }
        return encoded.toString();
    }
    
}
