package top.fx2h.june;

import java.util.*;

public class J0613 {
    public long findMaximumElegance(int[][] items, int k) {
        Arrays.sort(items, (a, b) -> b[0] - a[0]);
        long res = 0L;
        long profit = 0L;
        // 使用栈来存出现两次以上并且利润最小的元素
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        HashSet<Integer> categorySet = new HashSet<>();
        for (int i = 0; i < items.length; ++i) {
            if (i < k) {
                profit += items[i][0];
                if (!categorySet.add(items[i][1])) {
                    stack.push(items[i][0]);
                }
            } else if (!stack.isEmpty() && categorySet.add(items[i][1])) {
                profit += items[i][0] - stack.pop();
            }
            res = Math.max(res, profit + (long) categorySet.size() * categorySet.size());
        }

        return res;
    }
}
