package top.fx2h.june;

public class J0607 {
    public int maxOperations(int[] nums) {
        int preSum = 0;
        int cnt = 0;
        for (int i = 1; i < nums.length; i+=2) {
            int curSum = nums[i - 1] + nums[i];
            if (i == 1) {
                preSum = curSum;
                cnt++;
                continue;
            }
            if (preSum == curSum) {
                cnt++;
            } else {
                break;
            }
        }
        return cnt;
    }
}
