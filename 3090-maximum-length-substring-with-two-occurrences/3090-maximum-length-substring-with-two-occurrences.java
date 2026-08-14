class Solution {
    public int maximumLengthSubstring(String s) {
        int maxLen = 0;
        int left = 0;
        // Frequency array to keep track of lowercase English letters (26 characters)
        int[] count = new int[26];
        
        // Expand the window using the right pointer
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            count[rightChar - 'a']++;
            
            // If the character frequency exceeds 2, shrink the window from the left
            while (count[rightChar - 'a'] > 2) {
                char leftChar = s.charAt(left);
                count[leftChar - 'a']--;
                left++;
            }
            
            // Calculate the maximum valid window size found so far
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}
