
import java.util.*;
public class UniqueElements{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,4,5,1,2,0};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i< arr.length;i++){
            if(map.containsKey(arr[i])){
                int temp = map.get(arr[i]);
                map.put(arr[i],temp+=1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        Set<Integer> set = map.keySet();
        // System.out.println(set);
        System.out.println(set.size());
        for(int kk : set){
            System.out.println(kk + " : "+map.get(kk));
        }
    }
}