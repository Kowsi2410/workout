
package palindromecheck;

public class Palindromecheck {
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "radar";  // Replace with the string you want to check
        boolean isPalindrome = checkPalindrome(str);
        
        System.out.println("Is \"" + str + "\" a palindrome? " + isPalindrome);
    }

    public static boolean checkPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
}
