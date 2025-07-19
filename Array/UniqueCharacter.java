import java.util.*;

public class UniqueCharacter{
    public static void main(String[] args){
        String str = "ababab";

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                int temp = map.get(str.charAt(i));
                map.put(str.charAt(i),temp+=1);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }

        System.out.println(map);

        Set<Character> set = map.keySet();

        String output = "";
        for(char kk : set){
            output +=kk;
        }
        System.out.println(output);
    }
}