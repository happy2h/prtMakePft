package top.fx2h.june;

public class J0609 {
    public int maxCoins(int[] nums) {
        // 动态规划
        int n = nums.length;
        int[][] dp = new int[n + 2][n + 2];
        int[] val = new int[n + 2];
        val[0] = val[n + 1] = 1;

        for (int i = 1; i <= n; ++i) {
            val[i] = nums[i - 1];
        }

        // 开始搜索
        for (int i = n - 1; i >= 0; --i) {
            for (int j = i + 2; j <= n + 1; ++j) {
                for (int k = i + 1; k < j; ++k) {
                    int sum = val[i] * val[k] * val[j];
                    sum += dp[i][k] + dp[k][j];
                    dp[i][j] = Math.max(sum, dp[i][j]);
                }
            }
        }
        return dp[0][n + 1];
    }
}
