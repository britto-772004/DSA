
import java.lang.String;
import java.util.ArrayList;

public class CharacterCheck{

    static boolean check(ArrayList<String> list,String target){
        int length = list.size();
        for(int i=0;i<length;i++){
            if(list.get(i).equals(target)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        // StringBuilder str = new StringBuilder("britto");
        // char hi = str.charAt(0);
        // String output = Character.toString(hi);
        // System.out.println(hi);

        ArrayList<String> list = new ArrayList<>();
        list.add("britto");
        list.add("john");

        String target = "jommhn";
        System.out.println(check(list,target));
    }
}