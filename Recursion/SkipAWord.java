public class SkipAWord{

    static String skipaword(String str,String newstr){
        if(str.isEmpty()){
            // System.out.println(newstr);
            return newstr;
        }
        char ch = str.charAt(0);
        if(str.startsWith("apple")){
            return skipaword(str.substring(5),newstr );
        }
        else{
            return skipaword(str.substring(1),newstr+ch);
        }
    }
    public static void main(String[] args){
        String str = "aaapplec";
        String newstr = "";
        System.out.println(skipaword(str,newstr));
        // skipacharacter(str,newstr);
    }

}