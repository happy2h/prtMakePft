package top.fx2h.june;

public class J0621 {
    public int temperatureTrend(int[] temperatureA, int[] temperatureB) {
        int max = 0;
        int right = 0;
        int left = 0;
        for (int i = 1; i < temperatureA.length; ++i) {
            int stateA = Integer.compare(temperatureA[i], temperatureA[i - 1]);
            int stateB = Integer.compare(temperatureB[i], temperatureB[i - 1]);
            if (stateA == stateB) {
                right++;
            } else {
                max = Math.max(max, right - left);
                left = right;
            }
        }
        return Math.max(max, right - left);
    }
}
