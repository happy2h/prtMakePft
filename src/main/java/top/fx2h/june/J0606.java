package top.fx2h.june;

public class J0606 {
    public long minimumSteps(String s) {
        int lastOneIdx = s.length() - 1;
        long cost = 0L;
        int idx = s.length() - 1;

        while (idx >= 0) {
            char cur = s.charAt(idx);
            if (cur == '1') {
                cost += lastOneIdx - idx;
                lastOneIdx--;
            }
            idx--;
        }
        return cost;
    }
}
