package top.fx2h.may;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.cn/problems/find-the-peaks/
public class M0528 {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < mountain.length; ++i) {
            // 跳过边界
            if (i == 0 || i == mountain.length - 1) {
                continue;
            }
            int prevVal = mountain[i - 1];
            int currVal = mountain[i];
            int nxtVal = mountain[i + 1];
            if (currVal > prevVal && currVal > nxtVal) {
                res.add(i);
            }
        }
        return res;
    }
}
