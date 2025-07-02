public class SearchInTwodArray{
    static void linearsearch(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == target){
                    System.out.println("Element found at the position : "+i +","+j);
                    return;
                }
            }
        }
        System.out.println("Element not found ");
    }

    public static void main(String[] args){
        int[][] arr = {{1,2},{3,4}};
        int target  = 3;
        linearsearch(arr,target);
    }
}