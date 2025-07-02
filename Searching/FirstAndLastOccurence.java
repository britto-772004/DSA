public class FirstAndLastOccurence{

    static void linearsearch(int[] arr,int key){
        int first = -1;
        int last = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]== key){
                if(first == -1){
                    first = i;
                    last = i;
                }
                else{
                    last = i;
                }
            }
        }
        System.out.println("first and last occurence :" + first +" and " +last);
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,1,4,1};
        linearsearch(arr,1);
    }
}