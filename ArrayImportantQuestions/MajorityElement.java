
import java.util.HashMap;
class Solution{
    int approach1(int[] array){
        HashMap<Integer,Integer> map = new HashMap<>();

        int n = array.length;

        for(int i=0;i<n;i++){
            if(map.containsKey(array[i])){
                int temp = map.get(array[i]);
                map.put(array[i],temp+=1);
            }
            else{
                map.put(array[i],1);
            }
        }
        int totaltemp = 0;
        int majorityelment = -1;
        for(int key : map.keySet()){
            int temp = map.get(key);
            if(temp > totaltemp){
                totaltemp = temp;
                majorityelment = key;
            }
        }

        if(totaltemp > (n/2)){
            return majorityelment;
        }
        return -1;
    }

    // moore's voting algorithm
    int approach2(int[] arr){
        int n = arr.length;
        int candidate = -1;
        int count = 0;

        // Find a candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } 
            else if (num == candidate) {
                count++;
            }
            else {
                count--;
            }
        }

        // Validate the candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
	
      	// If count is greater than n / 2, return 
      	// the candidate; otherwise, return -1
        if (count > n / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
}

public class MajorityElement{
    public static void main(String[] args){
        Solution obj = new Solution();

        int[] array = {1};
        System.out.println("Majority element is : "+obj.approach1(array));
    }
}