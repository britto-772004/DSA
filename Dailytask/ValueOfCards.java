public class ValueOfCards{

    static int GetTotalPoints(int a,int b,int c,int d){
        int[] arr = {0,1,0,0,0,0,0,0,0,2,1,3,0,0};

        int sum =0;
        sum+=arr[a];
        sum+=arr[b];
        sum+=arr[c];
        sum+=arr[d];

        return sum;
    }
    
    public static void main(String[] args){
        
        System.out.println("Output : "+GetTotalPoints(11,9,1,5));


    }
}