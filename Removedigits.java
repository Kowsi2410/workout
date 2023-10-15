package removedigits;

/**
 *
 * @author kowsi
 */
public class Removedigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String str = "H3ll0 W0rld!";

        String result = removeDigits(str);

        System.out.println("Original string: " + str);
        System.out.println("String after removing digits: " + result);
    }

    public static String removeDigits(String str) {
        return str.replaceAll("\\d", ""); // Remove all digits using regular expression
    }
    
}
