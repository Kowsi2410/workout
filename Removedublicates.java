/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package removedublicates;
import java.util.LinkedHashSet;
/**
 *
 * @author kowsi
 */
public class Removedublicates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String str = "programming";

        String result = removeDuplicates(str);

        System.out.println("Original string: " + str);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            set.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (Character character : set) {
            result.append(character);
        }

        return result.toString();
    }
    
}
