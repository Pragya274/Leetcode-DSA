class Solution {
    public int longestSubsequence(int[] nums) {
        int totalXor = 0;
        boolean hasNonZero = false;
        
        // Calculate the total XOR sum and check for any non-zero elements
        for (int num : nums) {
            totalXor ^= num;
            if (num != 0) {
                hasNonZero = true;
            }
        }
        
        // Case 1: Total XOR sum of the entire array is already non-zero
        if (totalXor != 0) {
            return nums.length;
        }
        
        // Case 2: Total XOR is 0, but there is at least one non-zero element
        if (hasNonZero) {
            return nums.length - 1;
        }
        
        // Case 3: All elements are 0, so no valid non-zero XOR subsequence exists
        return 0;
    }
}
