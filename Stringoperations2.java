
package stringoperations2;
import java.util.Scanner;

public class Stringoperations2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
     Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("Enter the operation you want to perform:");
        System.out.println("1. Print the first character of each word in a sentence");
        System.out.println("2. Print the first 2 characters of each word in a sentence");
        System.out.println("3. Print words starting with a particular letter or string");
        System.out.println("4. Print words ending with a particular letter or string");
        System.out.println("5. Print words containing a particular letter or string");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                // Print the first character of each word in a sentence
                String[] words = sentence.split(" ");
                for (String word : words) {
                    System.out.print(word.charAt(0) + " ");
                }
                System.out.println();
            }

            case 2 -> {
                // Print the first 2 characters of each word in a sentence
                String[] words = sentence.split(" ");
                for (String word : words) {
                    if (word.length() >= 2) {
                        System.out.print(word.substring(0, 2) + " ");
                    } else if (word.length() == 1) {
                        System.out.print(word.charAt(0) + " ");
                    }
                }
                System.out.println();
            }

            case 3 -> {
                // Print words starting with a particular letter or string
                String startingString = scanner.next();
                for (String word : sentence.split(" ")) {
                    if (word.startsWith(startingString)) {
                        System.out.println(word);
                    }
                }
            }

            case 4 -> {
                // Print words ending with a particular letter or string
                String endingString = scanner.next();
                for (String word : sentence.split(" ")) {
                    if (word.endsWith(endingString)) {
                        System.out.println(word);
                    }
                }
            }

            case 5 -> {
                // Print words containing a particular letter or string
                String containingString = scanner.next();
                for (String word : sentence.split(" ")) {
                    if (word.contains(containingString)) {
                        System.out.println(word);
                    }
                }
            }

            default -> System.out.println("Invalid option");
        }
    }
}

