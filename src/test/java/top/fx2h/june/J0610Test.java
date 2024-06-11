package top.fx2h.june;

import junit.framework.TestCase;
import org.junit.Test;

public class J0610Test extends TestCase {

    @Test
    public void testNumRescueBoats() {
        J0610 j = new J0610();
        int[] people = {3,5,3,4};
        int limit = 3;
        System.out.println(j.numRescueBoats(people, limit));
    }
}