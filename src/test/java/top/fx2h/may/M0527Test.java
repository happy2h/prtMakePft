package top.fx2h.may;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

public class M0527Test extends TestCase {

    @Test
    public void testMissingRolls() {
        M0527 m0527 = new M0527();
        int[] rolls = new int[]{1,1,1,1,1,1,1,1,1,1};
        int mean = 1;
        int n = 1;

        int[] res = m0527.missingRolls(rolls, mean, n);
        Arrays.stream(res).forEach(System.out::println);
    }
}