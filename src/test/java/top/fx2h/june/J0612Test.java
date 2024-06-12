package top.fx2h.june;

import junit.framework.TestCase;
import org.junit.Test;

public class J0612Test extends TestCase {

    @Test
    public void testAccountBalanceAfterPurchase() {
        J0612 j = new J0612();
        System.out.println(j.accountBalanceAfterPurchase(15));
    }
}