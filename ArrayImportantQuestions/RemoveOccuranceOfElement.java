import java.util.Arrays;

class Solution{
    int approach1(int[] array,int k){
        int count = 0;
        int n = array.length;
        for(int i=0;i<n;i++){
            if(array[i] == k ){
                for(int j = i+1;j<n;j++){
                    if(array[j] != k){
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        count++;
                        break;
                    }
                }
            }
        }
        return (n - count);
    }
}


public class RemoveOccuranceOfElement{
    public static void main(String[] args){
        Solution obj = new Solution();

        int[] array = {2,1,1,3,4};
        int k = 1;
        System.out.println("output count : "+obj.approach1(array,k));
        System.out.println(Arrays.toString(array));
    }
}