// Count Vowels and Consonants

// Input: "Java" → Output: Vowels: 2, Consonants: 2

import java.util.Scanner;

public class VowelsAndConsonants{

    static boolean elementPresentOrNot(char element , char arr[]){
        for(int i=0;i< arr.length;i++){
            if(element == arr[i]){
                return true;
            }
        }
        return false;
    }

    // to give the count of the vowels in the string 
    int vowels(String str){
        int count=0;

        char arr[] = {'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<str.length();i++){
            // if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
            //     count++;
            // }
            if(elementPresentOrNot(str.charAt(i),arr)){
                count++;
            }
            
        }
        return count;
    }


    // to give the count of the consonants in the string 

    int consonants(String str){
        char arr[] = {'a','e','i','o','u','A','E','I','O','U'};
        int count=0;
        for(int i=0;i<str.length();i++){
            // if( (str.charAt(i) > 64 && str.charAt(i) < 123) && (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'|| str.charAt(i) == 'u') ){
            //     count++;
            // }

            if((elementPresentOrNot(str.charAt(i),arr) == false ) && (str.charAt(i) > 64 && str.charAt(i) < 123)  ){
                count++;
            }
        }
        return count;
    }

    //main function
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = input.nextLine();

        VowelsAndConsonants obj = new VowelsAndConsonants();

        int vowels_count = obj.vowels(str);
        int consonants_count = obj.consonants(str);

        System.out.println("Vowels : "+ vowels_count+ " Consonants : "+consonants_count);
    }
}