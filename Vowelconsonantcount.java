
package vowelconsonantcount;
import java.util.Scanner;
public class Vowelconsonantcount {
    public static void main(String[] args) {
        String str;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            str = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive counting
        }
        
        int vowelCount = countVowels(str);
        int consonantCount = str.length() - vowelCount;

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    public static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    
}
