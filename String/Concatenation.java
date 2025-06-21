public class Concatenation{

    String concatenation(String str1,String str2){
        String output="";
        
        // copy and paste the str1 to output 
        for(int j=0; j < str1.length();j++){
            output += str1.charAt(j);
        }

        // copy and paste the str2 to output 
        for(int j=0; j < str2.length();j++){
            output += str2.charAt(j);
        }

        return output;
        
    }

    public static void main(String[] args){

        String str1 = "hi";
        String str2 = "bro";

        Concatenation obj = new Concatenation();
        String output = obj.concatenation(str1,str2);
        System.out.println(output);
    }
}