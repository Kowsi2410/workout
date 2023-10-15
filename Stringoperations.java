/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringoperations;
import java.util.Scanner;
/**
 *
 * @author kowsi
 */
public class Stringoperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("Enter the operation you want to perform:");
        System.out.println("1. Print Upper case characters in the string");
        System.out.println("2. Count Lower case characters in the string");
        System.out.println("3. Create a new string with digits first and then characters");
        System.out.println("4. Remove spaces in the string");
        System.out.println("5. Reverse the case of string");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1: // Print Upper case characters in Java
                for (int i = 0; i < inputString.length(); i++) {
                    char c = inputString.charAt(i);
                    if (Character.isUpperCase(c)) {
                        System.out.print(c + " ");
                    }
                }
                System.out.println();
                break;

            case 2: // Count Lower case characters in Java
                int lowerCount = 0;
                for (int i = 0; i < inputString.length(); i++) {
                    char c = inputString.charAt(i);
                    if (Character.isLowerCase(c)) {
                        lowerCount++;
                    }
                }
                System.out.println("Lowercase character count: " + lowerCount);
                break;

            case 3: // Create new string with digits first and then characters
                StringBuilder digitString = new StringBuilder();
                StringBuilder charString = new StringBuilder();

                for (int i = 0; i < inputString.length(); i++) {
                    char c = inputString.charAt(i);
                    if (Character.isDigit(c)) {
                        digitString.append(c);
                    } else {
                        charString.append(c);
                    }
                }
                String newString = digitString.toString() + charString.toString();
                System.out.println("New String: " + newString);
                break;

            case 4: // Remove spaces in a string
                String stringWithoutSpaces = inputString.replaceAll("\\s", "");
                System.out.println("String without spaces: " + stringWithoutSpaces);
                break;

            case 5: // Reverse the case of string in Java
                StringBuilder reversedCaseString = new StringBuilder();
                for (int i = 0; i < inputString.length(); i++) {
                    char c = inputString.charAt(i);
                    if (Character.isUpperCase(c)) {
                        reversedCaseString.append(Character.toLowerCase(c));
                    } else if (Character.isLowerCase(c)) {
                        reversedCaseString.append(Character.toUpperCase(c));
                    } else {
                        reversedCaseString.append(c);
                    }
                }
                System.out.println("Reversed case string: " + reversedCaseString.toString());
                break;

            default:
                System.out.println("Invalid option");
        }
    }
}

    
    

