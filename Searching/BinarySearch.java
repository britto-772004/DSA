public class BinarySearch{
    public static void main(String[] args){
        int arr[] = {1,3,4,5,6,7,8,9,12,23,34};
        int target = 122;

        BinarySearch obj = new BinarySearch();

        int index = obj.binarysearch(arr,target);
        if(index >= 0){
            System.out.println("Element present at : "+index);
        }
        else{
            System.out.println("Element not present ");
        }
    }

    public int binarysearch(int[] arr, int target){
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
}