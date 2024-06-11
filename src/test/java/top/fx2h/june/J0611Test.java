package top.fx2h.june;

import junit.framework.TestCase;
import org.junit.Test;

public class J0611Test extends TestCase {

    @Test
    public void testCountBattleships() {
        J0611 j = new J0611();
        char[][] board = {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};
        System.out.println(j.countBattleships(board));
    }
}