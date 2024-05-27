package top.fx2h.may;

import java.util.Arrays;

//2028. 找出缺失的观测数据
// https://leetcode.cn/problems/find-missing-observations/
class M0527 {
    public int[] missingRolls(int[] rolls, int mean, int n) {

        //先计算数字综合
        int m = rolls.length;
        int sum = (m + n) * mean;
        int observeSum = Arrays.stream(rolls).sum();
        // 观测值大于所有数字之和
        if (observeSum > sum) {
            return new int[]{};
        }

        int remainSum = sum - observeSum;
        int remainMax = n * 6;

        // 剩余和不在剩下值可以拼凑的范围内
        if (remainSum > remainMax || remainSum < n) {
            return new int[]{};
        }

        // 拼返回的数组 数值均匀分布设有i个x，j个（x+1）
        // 可以推导出j，remainSum和n之间的关系
        // j = s - nx
        for (int x = 1; x <= 6; ++x) {
            int j = remainSum - n * x;
            if (0 <= j && j <= n) {
                int[] res = new int[n];
                int i = 0;
                while (i < j) {
                    res[i++] = x + 1;
                }
                while (i < n) {
                    res[i++] = x;
                }
                return res;
            }
        }
        return new int[]{};
    }
}
