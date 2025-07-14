import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates{

    static ArrayList<Integer> removeduplicates(int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        int j = array[0];
        int size = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] == array[j]){
                if(size == 1 ){
                    list.add(array[i]);
                    size=0;
                    j = array[i];
                }
                size++;
            }
        }
        System.out.println(list);

        return list;
    }

    public static void main(String[] args){
        int[] array = {1,1,2,2};

        System.out.println((removeduplicates(array)));

    }
}