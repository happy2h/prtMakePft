package top.fx2h.june;

import junit.framework.TestCase;
import org.junit.Test;

public class J0621Test extends TestCase {

    @Test
    public void testTemperatureTrend() {
        int[] temperatureA = {5,10,16,-6,15,11,3};
        int[] temperatureB = {16,22,23,23,25,3,-16};
        J0621 j = new J0621();
        System.out.println(j.temperatureTrend(temperatureA,temperatureB));
    }
}