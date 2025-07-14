public class MinMax{

    void minmax(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Smallest : "+min);
        System.out.println("Largest : "+max);
    }

    public static void main(String[] args){
        int[] array = {10,0,19,-1};
        MinMax obj = new MinMax();
        obj.minmax(array);
    }
}