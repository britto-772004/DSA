public class MaxSubArray{

    static int max(int a,int b){
        if(a > b){
            return a;
        }
        return b;
    }

    static int maxsubarray(int[] array){
        int currentsum = array[0];
        int maxsum = array[0];

        for(int i=1;i< array.length;i++){
            currentsum =  max(array[i],currentsum + array[i]);
            maxsum = max(currentsum,maxsum);
        }

        return maxsum;
    }
    public static void main(String[] args){
        int[] array = {7,-1,-6,4,3,8};
        System.out.println(maxsubarray(array));
    }
}