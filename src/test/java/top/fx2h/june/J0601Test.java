package top.fx2h.june;

import junit.framework.TestCase;
import org.junit.Test;

public class J0601Test extends TestCase {

    @Test
    public void testDistributeCandies() {
        J0601 j = new J0601();
        int n = 3;
        int limit = 3;
        System.out.println(j.distributeCandies(n, limit));
    }
}