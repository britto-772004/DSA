
// Input: "madam" → Output: true

public class Palindrome{

    boolean palindrome(String str){
        for(int i=0,j=str.length()-1; i<=j; i++,j--){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String str = "madam";

        Palindrome obj = new Palindrome();
        if(obj.palindrome(str)){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not palindrome");
        }
    }
}