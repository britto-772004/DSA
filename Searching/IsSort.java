public class IsSort{

    static int linearsearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i; // we have to send the index position of the target element 
            }
        }
        return -1; // no element present
    }

    static int binarysearch(int[] arr, int target){
        int left_index = 0;
        int right_index = arr.length - 1;
        int mid;
        while(left_index <= right_index){
            mid = (left_index + right_index) / 2;

            if(arr[mid] == target){
                return mid;
            } 
            else if(arr[mid] > target){
                right_index = mid -1;
            }
            else {
                left_index = mid + 1;
            }
        }
        return -1;
    }

    static boolean issort(int[] array){
        for(int i=0;i<array.length -1 ;i++){
            if(array[i] > array[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {1,3,2,5,4};
        int key = 5;

        if(issort(arr)){
            int output = linearsearch(arr,key);
            System.out.println("Element Found at index : "+output);
        }
        else{
            int output = binarysearch(arr,key);
            System.out.println("Element Found at index : "+output);
        }
    }

}