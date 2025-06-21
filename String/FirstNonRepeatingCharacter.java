// Find the First Non-Repeating Character

// Input: "aabbcdde" → Output: "c"

import java.util.Scanner;

public class FirstNonRepeatingCharacter{

    static boolean iselementpresentinthearray(char character,String str){
        int count = 0;

        for(int i=0;i<str.length();i++){
            if(character == str.charAt(i) ){
                count++;
            }
        }
        if(count == 1){
            return true;
        }
        return false;
    }

    static char firstnonrepeatingcharacter(String str){
        char output = '0' ;
        for(int i=0;i<str.length();i++){
            if(iselementpresentinthearray(str.charAt(i),str)){
                output = str.charAt(i);
                break;
            }
        }
        return output;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = input.nextLine();
        // String str = "ddffrrp";
        char output = firstnonrepeatingcharacter(str);
        System.out.println(output);
    }
}