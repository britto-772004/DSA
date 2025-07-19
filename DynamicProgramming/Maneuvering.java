public class Maneuvering{
    public static void main(String[] args){
        int m = 2;
        int n = 3;
        int[] dp = new int[3];

        dp[0] = 1;
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                dp[j] = dp[j] + dp[j-1];
            }
        }

        System.out.println("Output : "+dp[n-1]);
    }
}