public class HouseRobber{

    static int max(int a, int b){
        if(a > b){
            return a;
        }
        return b;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,1};

        int[] dp = new int[arr.length];

        dp[0] = arr[0];
        dp[1] = max(arr[0],arr[1]);

        for(int i=2;i<dp.length;i++){
            dp[i] = max(dp[i-1],arr[i] + dp[i-2]);
        }

        System.out.println("Output : "+dp[arr.length-1]);

    }
}