    import java.util.ArrayList;
    import java.util.List;

    public class SubsequenceGeneratorIterative {

        public static List<List<Integer>> generateSubsequences(int[] arr) {
            List<List<Integer>> allSubsequences = new ArrayList<>();
            int n = arr.length;
            int numSubsequences = 1 << n; // 2^n subsequences

            for (int i = 0; i < numSubsequences; i++) {
                List<Integer> currentSubsequence = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) > 0) { // Check if j-th bit is set
                        currentSubsequence.add(arr[j]);
                    }
                }
                allSubsequences.add(currentSubsequence);
            }
            return allSubsequences;
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3,4,5};
            List<List<Integer>> result = generateSubsequences(array);
            System.out.println("All subsequences: " + result);
        }
    }