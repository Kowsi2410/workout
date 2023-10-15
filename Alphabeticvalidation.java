
package alphabeticvalidation;

/**
 *
 * @author kowsi
 */
public class Alphabeticvalidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String str1 = "HelloWorld"; // Contains only alphabetic characters
        String str2 = "Hello123"; // Contains non-alphabetic characters

        System.out.println("Is \"" + str1 + "\" alphabetic? " + isAlphabetic(str1));
        System.out.println("Is \"" + str2 + "\" alphabetic? " + isAlphabetic(str2));
    }

    public static boolean isAlphabetic(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
    
}
