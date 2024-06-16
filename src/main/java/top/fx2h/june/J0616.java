package top.fx2h.june;

import java.util.HashSet;
import java.util.Set;

public class J0616 {
    public int findLUSlength(String a, String b) {
        return !a.equals(b) ? Math.max(a.length(), b.length()) : -1;
    }
}
