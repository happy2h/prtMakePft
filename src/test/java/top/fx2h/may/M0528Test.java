package top.fx2h.may;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

public class M0528Test extends TestCase {

    @Test
    public void testFindPeaks() {
        M0528 m = new M0528();
        int[] mountain = new int[]{1,4,3,8,5};
        List<Integer> peaks = m.findPeaks(mountain);
        peaks.forEach(System.out::println);
    }
}