
// program to remove the duplicates and to store the unique elements 

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;

public class Hashmap{

    static HashMap<Integer,Integer> fillmap(int[] array){
        HashMap<Integer,Integer> map = new HashMap<>();

        // fill the hashmap with values of the array 
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                int temp = map.get(array[i]);
                map.put(array[i],temp+=1);
            }
            else{
                map.put(array[i],1);
            }
        }
        return map;
    }

    static ArrayList<Integer> uniqueElements(int[] array){
        
        HashMap<Integer,Integer> map = fillmap(array);

        Set<Integer> set = map.keySet();
        ArrayList<Integer> list = new ArrayList<>();

        for(int key : set){
            if(map.get(key) == 1){
                list.add(key);
            }
        }

        return list;
    }

    static Set<Integer> removeDuplicates(int[] array){
        HashMap<Integer,Integer> map = fillmap(array);

        Set<Integer> set = map.keySet();
        return set;
    }

    public static void main(String[] args){
        // HashMap<Integer,Integer> map = new HashMap<>();

        int[] array = {1,1,10,2,2,10,2,3,4,5,5};
        System.out.println(uniqueElements(array));
        System.out.println(removeDuplicates(array));
       
    }
}