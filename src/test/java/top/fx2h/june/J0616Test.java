package top.fx2h.june;

import junit.framework.TestCase;
import org.junit.Test;

public class J0616Test extends TestCase {

    @Test
    public void testFindLUSlength() {
        J0616 j = new J0616();
        String a = "aefawfawfawfaw";
        String b = "aefawfeawfwafwaef";

        System.out.println(j.findLUSlength(a, b));
    }
}