package top.fx2h.june;

import junit.framework.TestCase;
import org.junit.Test;

public class J0607Test extends TestCase {

    @Test
    public void testMaxOperations() {
        J0607 j = new J0607();
        int[] nums = {3,2,6,1,4};
        System.out.println(j.maxOperations(nums));
    }
}