package top.fx2h.june;

import junit.framework.TestCase;
import org.junit.Test;

public class J0606Test extends TestCase {

    @Test
    public void testMinimumSteps() {
        J0606 j = new J0606();
        String s = "101010";
        System.out.println(j.minimumSteps(s));
    }
}