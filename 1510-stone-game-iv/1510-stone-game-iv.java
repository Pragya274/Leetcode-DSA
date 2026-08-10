class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                // If we can move to a state where the opponent loses (dp[i - j*j] is false), 
                // then the current player can win from state i.
                if (!dp[i - j * j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[n];
    }
}
