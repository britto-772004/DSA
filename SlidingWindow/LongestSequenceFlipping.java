public class LongestSequenceFlipping{

    static int max(int a, int b){
        if(a>b){
            return a;
        }
        return b;
    }

    static int flip1(int[] arr,int k){
        int ws = 0;
        int zc = 0;
        int maxones = 0;
        for(int we = 0; we < arr.length; we++){
            if(arr[we] == 0){
                zc++;
            }
            while(zc > k){
                if(arr[ws] == 0){
                    zc--;
                }
                ws++;
            }

            maxones = max(maxones,(we - ws +1));
        }

        return maxones;
    }
    public static void main(String[] args){
        int[] arr = {1,0,1,1,0,1,1,1};

        System.out.println(flip1(arr,1));
    }
}