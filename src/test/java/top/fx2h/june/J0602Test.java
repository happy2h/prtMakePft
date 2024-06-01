package top.fx2h.june;

import junit.framework.TestCase;
import org.junit.Test;

public class J0602Test extends TestCase {

    @Test
    public void testDistributeCandies() {
        J0602 j = new J0602();
        int[] candyType = new int[]{6,6,6,6};
        System.out.println(j.distributeCandies(candyType));
    }
}