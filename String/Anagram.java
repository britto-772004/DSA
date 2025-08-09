// Input: "listen", "silent" → Output: true

import java.util.HashMap;
import java.util.*;

public class Anagram{

    boolean anagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int flag ;
        for(int i=0;i< str1.length();i++){
            flag = 0;
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                return false;
            }
        }
        return true;
    }

    boolean anagram_2(String str1,String str2){
        HashMap<Character,Integer> map = new HashMap<>();
        
        StringBuilder sb = new StringBuilder(str2);
        int temp;
        for(int i=0;i<str1.length();i++){
            if(map.containsKey(str1.charAt(i)) ){
                temp = map.get(str1.charAt(i));
                map.put(str1.charAt(i),temp+=1); 
            }
            else{
                map.put(str1.charAt(i),1);
            }
        }
        // System.out.println(map);

        for(int i=0;i<str2.length();i++){
            char tempstr = str2.charAt(i);
            if(map.containsKey(tempstr)){
                temp = map.get(tempstr);
                map.put(tempstr,temp-=1);
            }
            else{
                return false;
            }
        }
        
        Set<Character> set = new HashSet<Character>();
        set = map.keySet();
        for(Character element : set){
            if(map.get(element) != 0){
                return false;
            }
            else{
                temp = map.get(element);
                map.put(element,temp-=1);
            }
        }
        return true;
    } 

    public static void main(String[] args){
        String str1 = "aaabb";
        String str2 = "aaabb";

        Anagram obj = new Anagram();
        if(obj.anagram_2(str1,str2)){
            System.out.println("It is anagram ");
        }
        else{
            System.out.println("It is not anagram");
        }
    }
}