class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
          int[][] dp = new int[m + 1][n + 1];

        for (String str : strs) {
            int zeroCount = countZeros(str);
            int oneCount = str.length() - zeroCount;

            // Traverse in reverse to prevent overwriting
            for (int i = m; i >= zeroCount; i--) {
                for (int j = n; j >= oneCount; j--) {
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i - zeroCount][j - oneCount]);
                }
            }
        }
        return dp[m][n];
    }

    // Helper method to count number of '0's in a string
    private int countZeros(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '0') count++;
        }
        return count;
    }
}