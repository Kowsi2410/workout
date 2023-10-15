
package capitalizefirstletter;

/**
 *
 * @author kowsi
 */
public class Capitalizefirstletter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sentence = "this is a sample sentence to capitalize the first letter of each word.";

        String capitalizedSentence = capitalizeFirstLetterOfEachWord(sentence);

        System.out.println("Original sentence: " + sentence);
        System.out.println("Capitalized sentence: " + capitalizedSentence);
    }

    public static String capitalizeFirstLetterOfEachWord(String sentence) {
        StringBuilder result = new StringBuilder();

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                // Capitalize the first letter of the word
                char firstChar = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1).toLowerCase();

                // Append the capitalized word to the result
                result.append(firstChar).append(restOfWord).append(" ");
            }
        }

        return result.toString().trim();
    }
    
}
