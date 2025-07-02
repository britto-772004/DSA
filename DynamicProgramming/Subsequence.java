import java.util.ArrayList;

public class Subsequence{
    static void updatesubsequence(ArrayList<ArrayList<Integer>> list,int number){
        int size = list.size();

        for(int i=0;i<size;i++){
            ArrayList<Integer> newlist = new ArrayList<>();
            // newlist = ;
            // newlist.add(list.get(i));
            // list.add(newlist);
        }
    }
    

    static ArrayList<ArrayList<Integer>> subsquence(int[] arr){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            updatesubsequence(list,arr[i]);
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        ArrayList<ArrayList<Integer>> list = subsquence(arr);
        System.out.println("Output : "+list);
    }
}