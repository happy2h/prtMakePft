package top.fx2h.june;

import junit.framework.TestCase;
import org.junit.Test;

public class J0615Test extends TestCase {

    @Test
    public void testMaximumBeauty() {
        J0615 j = new J0615();
        int[] nums = {4,6,1,2};
        int k = 2;
        System.out.println(j.maximumBeauty(nums, k));
    }
}