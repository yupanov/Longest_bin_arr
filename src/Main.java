public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int [] testArr = {0,1,1,1,0,1,1,0,1};
//        int [] testArr = {1,1,0,1};
//        int [] testArr = {1,1,1};
//        int [] testArr = {1,1,0,0,1,1,1,0,1};
        int [] testArr = {0,0,0};
        int result = solution.longestSubarray(testArr);
        System.out.println(result);
    }
}
