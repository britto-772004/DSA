import java.util.Arrays;

class Solution{
    void approach1(int[] array){

        int pivotelement = Integer.MIN_VALUE;
        int pivotelementposition = -1;

        int n = array.length;

        for(int j = n-1;j>=1;j--){
            if(array[j] > array[j-1]){
                pivotelement = array[j-1];
                pivotelementposition = j-1;
                break;
            }
        }

        // System.out.println("Pivot element : "+pivotelement);
        // System.out.println("Pivot element position : "+pivotelementposition);

        if(pivotelementposition == -1){
            reverse(array,0);
            return;
        }

        // finding first largest number and their position and swap 

        int totalelement = array[pivotelementposition+1];
        int totalelementposition = pivotelementposition +1;
        int temptotal;
        for(int i=pivotelementposition + 2;i<n;i++){
            if(array[i] > pivotelement ){
                temptotal = array[i];
                // System.out.println("temp total :"+temptotal);
                if(temptotal < totalelement){
                    totalelement = temptotal;
                    totalelementposition = i;
                    // System.out.println("total element : "+totalelement);
                }
            }
        }

        // System.out.println("total element  : "+totalelement);
        // System.out.println("total element position : "+totalelementposition);

        int temp = array[pivotelementposition];
        array[pivotelementposition] = array[totalelementposition];
        array[totalelementposition] = temp;

        reverse(array,pivotelementposition+1);
        
    }
    static void reverse(int[] array,int startindex){
        int n = array.length;

        int left = startindex;
        int right = n - 1;
        while(left < right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }
}

public class NextPermutation{
    public static void main(String[] args){
        Solution obj = new Solution();

        int[] array = {1, 2, 3, 6, 5, 4};
        obj.approach1(array);

        System.out.println(Arrays.toString(array));
    }
}