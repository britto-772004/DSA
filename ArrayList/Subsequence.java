import java.util.ArrayList;

public class Subsequence{

    static void subsequence(ArrayList<ArrayList<Integer>> list , int element ){
        int size = list.size();
        for(int i=0;i<size;i++){
            list.add((list.get(i).add(element)));
            System.out.println(list);
        }

        // return list;
    }

    public static void main(String[] args){

        int[] array = {1,2,3};

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        for(int i=0;i<array.length;i++){
            subsequence(list,array[i]);
            
        }

        System.out.println(list);
    }
}