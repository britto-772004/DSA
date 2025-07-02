import java.util.Scanner;

public class GuessGame{

    // binary search 
    static void binarysearch(int[] arr){
        Scanner input = new Scanner(System.in);
        int left = 0;
        int right = arr.length - 1;
        int key ;
        int mid;
        int flag = 1;
        while(left <= right){
            mid = (left + right)/2;
            System.out.println("I guessed the number is "+arr[mid]);
            System.out.println("1. higher ");
            System.out.println("2. lower ");
            System.out.println("3. equal ");
            System.out.print("Enter the choice : ");
            key = input.nextInt();
            if(key == 3){
                System.out.println("I guessed the number is "+arr[mid]);
                flag = 0;
                break;
            }
            else if(key == 2){
                right = mid -1;
            }
            else{
                left = mid +1;
            }
        }
        if(flag == 1){
            System.out.println("Guessed number is not between 1 - 10 ");
        }
        
    }

    public static void main(String[] args){
        // Scanner input = new Scanner(System.in);

        int[] arr ={1,2,3,4,5,6,7,8,9,10};

        System.out.println("Guess the number between 1 - 10");
        binarysearch(arr); 
    }
}