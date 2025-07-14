public class ReverseTheString{

    static String reversethestring(String str){
        String output = "";

        String[] strarr = str.split(" ");

        for(int i=0;i<strarr.length;i++){
            for(int j= (strarr[i]).length() -1 ; j>=0;j--){
                output += strarr[i].charAt(j);
            }
            output +=" ";
        }

        return output;
    }

    public static void main(String[] args){
        String str = "this is test";
        System.out.println(reversethestring(str));
    }
}