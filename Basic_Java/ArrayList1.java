import java.util.ArrayList;

public class ArrayList1{
    public static void main(String[] args){

        int[] nums = {1,2,3,4};
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(nums.length);
        // create subsequence 

        // single size
        
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer> col = new ArrayList<>();
            col.add(nums[i]);
            list.add(col);
        }  
        
        // all element 
        ArrayList<Integer> col = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            col.add(nums[i]);
        }
        list.add(col);
        
        // three 

        for(int i=0;i<nums.length;i++){
            ArrayList<Integer> col1 = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if(j!=i){
                    col1.add(nums[j]);
                }
            }
            list.add(col1);
        }
        // second 

        for(int i=0;i<nums.length;i++){
            
            for(int j=0;j<nums.length;j++){
                
                if(i!=j){
                    ArrayList<Integer> col1 = new ArrayList<>();
                    col1.add(nums[i]);
                    col1.add(nums[j]);
                    list.add(col1);
                }
                
            }
            
        }
        
        System.out.println((list.toString()));
        
    }
}