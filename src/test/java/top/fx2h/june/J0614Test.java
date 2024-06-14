package top.fx2h.june;

import junit.framework.TestCase;
import org.junit.Test;

public class J0614Test extends TestCase {

    @Test
    public void testMaxScore() {
        J0614 j = new J0614();
        int[] nums = {9,58,17,54,91,90,32,6,13,67,24,80,8,56,29,66,85,38,45,13,20,73,16,98,28,56,23,2,47,85,11,97,72,2,28,52,33};
        int x = 90;

        System.out.println(j.maxScore(nums, x));
    }
}