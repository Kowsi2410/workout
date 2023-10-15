/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package charactercount;
import java.util.HashMap;
/**
 *
 * @author kowsi
 */
public class Charactercount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "Hello, world!";
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (char c : charCountMap.keySet()) {
            System.out.println("Character: '" + c + "' Count: " + charCountMap.get(c));
        }
    }
    
}
