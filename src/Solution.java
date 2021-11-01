class Solution {
    public int longestSubarray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int max = 0;
        boolean hasZero = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                hasZero = true;
                int[] newNums = removeElement(nums, i);
                max = Math.max(max, findLongest(newNums));
            }
        }
        if (!hasZero) {
           int[] newNums = removeElement(nums, 0);
            max = findLongest(newNums);
        }

        return max;
    }

    private int findLongest (int[] testNums) {
        int max = 0;
        int subArrLength = 0;
        for (int num : testNums) {
            if (num == 1) {
                subArrLength++;
            } else {
                if (subArrLength > max) {
                    max = subArrLength;
                }
                subArrLength = 0;
            }
            if (subArrLength > max) {
                max = subArrLength;
            }
        }
        return max;
    }

    private int[] removeElement (int[] nums, int index) {
        int[] newArray = new int[nums.length -1];
        System.arraycopy(nums, 0, newArray, 0, index);
        System.arraycopy(nums, index + 1, newArray, index, newArray.length - index);
        return newArray;
    }
}