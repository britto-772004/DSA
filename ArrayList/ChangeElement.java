import java.util.ArrayList;

public class ChangeElement{

    static void change(ArrayList<Integer> list){
        list.add(1);
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        change(list);
        System.out.println(list);

    }
}