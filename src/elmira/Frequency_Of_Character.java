package elmira;


import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency_Of_Character {

    public static void frequencyOfCharacter(String input) {


        //   step 1 : asking printing  output is in "key and value" format so we can use
        //   LinkedHashMap<> format that let us print by order(not HashMap)
                //key-will be character
                //value-will be count of how many character occurs in the given String

        //   step2 : need to declare given String and HashMap

        String str = input;
        Map<Character, Integer> characterCount = new LinkedHashMap<>();
//           key       value


        //step 3 we are going to use for loop to go through each character in the string

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);

        //help us add character to map
            if (characterCount.containsKey(ch)) {
                characterCount.put(ch, characterCount.get(ch) + 1);
            } else {
                characterCount.put(ch, 1);
            }
        }

        // Print the result in "key=value" format
        System.out.println(characterCount);
    }

    public static void main(String[] args) {


        frequencyOfCharacter("banana apple pie");


    }



}
/*
Create a method that will determine the frequency of every character in the given String
            parameter: String
            return: void

        Ex:
            input:
                frequencyOfCharacter("banana apple pie")
            output:
                {b=1, a=4, n=2,  =2, p=3, l=1, e=2, i=1}
 */