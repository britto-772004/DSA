
class Solution{

    static int max(int number1,int number2){
        if(number1 > number2){
            return number1;
        }
        return number2;
    }

    int approach1(int[] array){
        int totalcount = 0 ;
        int tempcount = 0;
        for(int i=0;i< array.length;i++){
            if(array[i] != 1){
                totalcount = max(totalcount,tempcount);
                tempcount = 0;            
            }
            else{
                tempcount++;
            }
        }

        return totalcount;
    }
}

public class MaximumConsecutive1s{
    public static void main(String[] args){
        Solution obj = new Solution();

        int[] array = {1,0,1,1,0,1,1,1,0,0};
        System.out.println("Maximum consecutive 1's : "+obj.approach1(array));
    }
}