
package patternoccurance;

public class Patternoccurance {
    public static void main(String[] args) {
        
        String str = "ababababa"; // Replace with the string you want to search
        String pattern = "aba";  // Replace with the pattern you want to count
        
        int occurrences = countPatternOccurrences(str, pattern);
        
        System.out.println("Number of occurrences of \"" + pattern + "\" in \"" + str + "\": " + occurrences);
    }

    public static int countPatternOccurrences(String str, String pattern) {
        int count = 0;
        int index = str.indexOf(pattern);
        while (index != -1) {
            count++;
            index = str.indexOf(pattern, index + 1);
        }
        return count;
    }
    
}
