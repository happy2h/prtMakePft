package top.fx2h.june;

import java.util.Arrays;

public class J0610 {
    public int numRescueBoats(int[] people, int limit) {
        // 双指针
        int left = 0;
        int right = people.length - 1;
        int cnt = 0;
        // 数组排序
        Arrays.sort(people);

        // 开始计数
        while (left < right) {
            int minWeight = people[left];
            int maxWeight = people[right];
            int twoPeopleWeightSum = minWeight + maxWeight;
            if (twoPeopleWeightSum <= limit) {
                left++;
                right--;
            } else {
                right--;
            }
            cnt++;
        }
        return left == right ? cnt + 1 : cnt;
    }
}
