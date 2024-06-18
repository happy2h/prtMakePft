package top.fx2h.june;

import junit.framework.TestCase;
import org.junit.Test;

public class J0618Test extends TestCase {

    @Test
    public void testDiscountPrices() {
        J0618 j = new J0618();
        System.out.println(j.discountPrices("1 2 $3 4 $5 $6 7 8$ $9 $10$", 50));
    }
}