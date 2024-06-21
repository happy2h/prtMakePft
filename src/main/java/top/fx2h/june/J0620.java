package top.fx2h.june;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class J0620 {
    public int countBeautifulPairs(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                int a = getFirstNum(nums[i]);
                int b = getLastNum(nums[j]);
                if (gcd(a, b)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private boolean gcd(int a, int b) {
        if (a == 1 || b == 1) {
            return true;
        }
        while (true) {
            int c = a % b;
            if (c == 0) {
                break;
            }
            a = b;
            b = c;
        }
        return b <= 1;
    }

    private int getFirstNum(int num) {
        int tmp = num;
        while (tmp >= 10) {
            tmp = tmp / 10;
        }
        return tmp;
    }

    private int getLastNum(int num) {
        return num % 10;
    }
}
