// Longest Substring Without Repeating Characters

// Input: "abcabcbb" → Output: 3 ("abc")

import java.util.Scanner;

public class LongestNonRepeatingSubstring{
    
    static String longestnonrepeatingsubstring(String str){
        String[] strarr = new String[str.length()];

        String output = "";
        int count =0 ;

        for(int j=0; j< str.length();j++){
            output = "";
            count =0;
            for(int i=j+1;i<str.length();i++){
                if(str.charAt(j)== str.charAt(i)){
                    if(count == 1){
                        strarr[j]= output;
                    }
                }
                else{
                    output += str.charAt(i);
                    count++;
                }
            } 
            System.out.println("output : "+output);
        }

        // find the elements with height length
        int max_size = 0;
        int max_size_index = 0;
        for(int i=0;strarr[i] == null ;i++){
            if((strarr[i].length()) >=  max_size){
                max_size = strarr[i].length();
                max_size_index = i;
            }
        }

        return strarr[max_size_index];
    }
    
    public static void main(String[] args){
        String str = "abcabcbb";
        str = longestnonrepeatingsubstring(str);

        System.out.println("Size "+str.length()+" Substring : "+str);
    }
}