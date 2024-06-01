package top.fx2h.june;

import java.util.Arrays;

public class J0602 {
    public int distributeCandies(int[] candyType) {
        long typeSum = Arrays.stream(candyType).distinct().count();
        return (int) Math.min(typeSum, candyType.length / 2);
    }
}
