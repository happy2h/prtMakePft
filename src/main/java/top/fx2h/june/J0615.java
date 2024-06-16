package top.fx2h.june;

import java.util.Arrays;

public class J0615 {
    public int maximumBeauty2(int[] nums, int k) {
        int res = 0;
        int n = nums.length;
        Arrays.sort(nums);

        for (int left = 0, right = 0; right < n; ++right) {
            while(nums[right] - nums[left] >= 2 * k) {
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }

    public int maximumBeauty(int[] nums, int k) {
        int m = 0;
        for (int num : nums) {
            m = Math.max(m, num);
        }
        int[] diff = new int[m + 2];
        for (int num : nums) {
            diff[Math.max(num - k, 0)]++;
            diff[Math.min(num + k + 1, m + 1)]--;
        }
        int res = 0;
        int cnt = 0;
        for (int num : diff) {
            cnt += num;
            res = Math.max(res, cnt);
        }
        return res;
    }
}
