public class SkipACharacter{

    static String skipacharacter(String str,String newstr){
        if(str.isEmpty()){
            // System.out.println(newstr);
            return newstr;
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return skipacharacter(str.substring(1),newstr );
        }
        else{
            return skipacharacter(str.substring(1),newstr+ch);
        }
    }
    public static void main(String[] args){
        String str = "aabbc";
        String newstr = "";
        System.out.println(skipacharacter(str,newstr));
        // skipacharacter(str,newstr);
    }

}