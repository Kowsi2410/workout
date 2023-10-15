
package wordcount;

public class Wordcount {

    public static void main(String[] args) {
        
         String str = "This is a sample string with some words."; // Replace with the string you want to count words in
        
        int wordCount = countWords(str);
        
        System.out.println("Number of words in the string: " + wordCount);
    }

    public static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
    
}
