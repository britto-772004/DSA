// Remove Duplicates from a String

// Input: "banana" → Output: "ban"

import java.util.Scanner;

 public class RemoveDuplicates{

    static boolean elementPresentOrNot(char element , String str){
        for(int i=0;i< str.length();i++){
            if(element == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    String removedupicate(String str){
        String output = "";
        for(int i=0;i<str.length();i++){
            if(!elementPresentOrNot(str.charAt(i),output)){
                output += str.charAt(i);
            }

        }
        return output;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = input.nextLine();

        RemoveDupicates obj = new RemoveDupicates();
        String output = obj.removedupicate(str);

        System.out.println(output);
    }
}