
package anagramcheck;
import java.util.Arrays;
public class Anagramcheck {
    public static void main(String[] args) {
        
         String str1 = "listen";
        String str2 = "silent";

        boolean areAnagrams = checkIfAnagrams(str1, str2);

        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + areAnagrams);
    }

    public static boolean checkIfAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase for case-insensitive anagram check
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare the sorted arrays
        return Arrays.equals(arr1, arr2);
    }
    
}
