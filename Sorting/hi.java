class Solution {
    static char kthCharacter(int k) {
        String word = "a";
        char temp;
        int size =word.length();
        System.out.println("size : "+size);
        while(size < k){
            for(int i=0;i<size;i++){
                temp = word.charAt(i);
                temp = (char)(temp +1);
                word += temp;
                System.out.println("word : "+word);
            }
            size = word.length();

        }
        return word.charAt(k-1);
    }

    public static void main(String[] args){
        char output = kthCharacter(5);
        System.out.println(output);
    }
}