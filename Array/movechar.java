public class movechar{
    public static void main(String[] args){
        StringBuilder str =new StringBuilder("aabaaab") ;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a'){
                for(int j=i+1;j<str.length();j++){
                    if(str.charAt(j) != 'a'){
                        char temp = str.charAt(i);
                        str.setCharAt(i,str.charAt(j));
                        str.setCharAt(j, temp);
                        break;
                    }
                    
                }
                System.out.println(str);
            }
        }

        System.out.println(str);


    }
}