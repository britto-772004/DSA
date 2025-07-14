public class CheckMaxElement{
    
    static int checkmax(int[] array1,int[] array2){
        int output = 0 ;

        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1.length;j++){
                if(array1[i] > array2[j]){
                    output++;
                    break;
                }
            }
        }

        return output;
    }
    
    public static void main(String[] args){
        int[] arr1 = {10,20,30,40,50,60,70,80,90,100};
        int[] arr2 = {5,15,25,35,45,55,65,75,85,95};

        System.out.println(checkmax(arr1,arr2));

    }
}