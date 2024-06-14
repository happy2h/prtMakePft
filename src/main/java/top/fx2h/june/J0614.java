package top.fx2h.june;

import java.util.Arrays;

public class J0614 {
    public long maxScore(int[] nums, int x) {
        long[] maxProfit = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        long res = nums[0];
        // 设置初始值
        maxProfit[nums[0] % 2] = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            int isEven = nums[i] % 2;
            long cur = Math.max(nums[i] + maxProfit[isEven], nums[i] + maxProfit[1 - isEven] - x);
            res = Math.max(res, cur);
            maxProfit[isEven] = Math.max(maxProfit[isEven], cur);
        }
        return res;
    }

}
