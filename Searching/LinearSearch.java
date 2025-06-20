public class LinearSearch{
    public static void main(String[] args){
        int[] arr = {2,5,3,1,5,7,4,5,3,1};
        int target = 1;
        LinearSearch obj = new LinearSearch();
        int index = obj.linearsearch(arr,target);
        if(index >= 0){
            System.out.println("Element present at : "+index);
        }
        else{
            System.out.println("Element not present ");
        }
        
    }
    public int linearsearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i; // we have to send the index position of the target element 
            }
        }
        return -1; // no element present
    }
}