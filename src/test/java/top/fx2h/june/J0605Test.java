package top.fx2h.june;

import junit.framework.TestCase;
import org.junit.Test;

public class J0605Test extends TestCase {

    @Test
    public void testResultArray() {
        J0605 j = new J0605();
        int[] nums = {2,1,3,3};
        j.resultArray(nums);
    }
}