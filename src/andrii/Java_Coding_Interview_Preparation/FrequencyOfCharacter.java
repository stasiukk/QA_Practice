package andrii.Java_Coding_Interview_Preparation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacter {
    /*
        Frequency of Character

        Create a method that will determine the frequency of every character in the given String
            parameter: String
            return: void

        Ex:
            input:
                frequencyOfCharacter("banana apple pie")
            output:
                {b=1, a=4, n=2,  =2, p=3, l=1, e=2, i=1}
     */

    public static void frequencyOfCharacter(String input){

        //Create a LinkedHashMap to store character counts in order
        Map<Character, Integer> charsCharacterMap = new LinkedHashMap<Character,Integer>();
        
        //Loop through each character in the string
        for (char c : input.toCharArray()) {
            //Update the frequency of the character in the map
            charsCharacterMap.put(c,charsCharacterMap.getOrDefault(c,0)+1);

            
        }
        //Print the frequency map
        System.out.println(charsCharacterMap);
    }

    public static void main(String[] args) {
        // Test the method with an example string
        frequencyOfCharacter("banana apple pie");
    }
}
