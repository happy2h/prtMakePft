package top.fx2h.june;

import junit.framework.TestCase;
import org.junit.Test;

public class J0620Test extends TestCase {

    @Test
    public void testCountBeautifulPairs() {
        J0620 j = new J0620();
        int[] nums = new int[]{756,1324,2419,495,106,111,1649,1474,2001,1633,273,1804,2102,1782,705,1529,1761,1613,111,186,412};
        System.out.println(j.countBeautifulPairs(nums));
    }
}