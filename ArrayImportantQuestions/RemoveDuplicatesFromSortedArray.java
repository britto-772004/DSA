import java.util.HashSet;

class Solution{
    int approach1(int[] array){
        int n = array.length;

        if(n<= 1){
            return n;
        }

        int newindex = 1;

        for(int i=1;i<n;i++){
            if(array[i-1] != array[i]){
                array[newindex++] = array[i];
            }
        }

        return newindex;
    }

    HashSet<Integer> approach2(int[] array){
        HashSet<Integer> set = new HashSet<>();

        int n = array.length;

        for(int i=0;i<n;i++){
            if(!set.contains(array[i])){
                set.add(array[i]);
            }
        }

        return set;
    }
}

public class RemoveDuplicatesFromSortedArray{
    public static void main(String[] args){
        Solution obj = new Solution();

        int[] array = {1,1,2,2,3,3};
        int newindex = obj.approach1(array);

        for(int i=0;i<newindex;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        HashSet<Integer> set = obj.approach2(array);
        System.out.println(set);
    }
}