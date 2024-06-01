package top.fx2h.june;

public class J0601 {
    public int distributeCandies(int n, int limit) {
        int res = 0;
        for (int i = 0; i <= limit; ++i) {
            for (int j = 0; j <= limit; ++j ) {
                if (i + j > n) {
                    break;
                }
                if (n - i - j <= limit) {
                    res++;
                }
            }
        }
        return res;
    }
}
