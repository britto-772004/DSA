

public class SlidingWindow{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        // largest three sum;
        int j=2;
        int sum=0;
        int result = 0;
        for(int i=0;j<arr.length;i++){
            for(int k=j; k>=i ; k--){
                sum +=arr[k];
            }
            j++;
            if(result < sum){
                result = sum;
            }
            sum = 0;
        }

        System.out.println("anser: "+result);
    }
}