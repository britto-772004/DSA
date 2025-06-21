// Input: "listen", "silent" → Output: true



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

    public static void main(String[] args){
        String str1 = "listen";
        String str2 = "silent";

        Anagram obj = new Anagram();
        if(obj.anagram(str1,str2)){
            System.out.println("It is anagram ");
        }
        else{
            System.out.println("It is not anagram");
        }
    }
}