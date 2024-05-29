package top.fx2h.may;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class M0529 {
//    https://leetcode.cn/problems/find-longest-special-substring-that-occurs-thrice-i/
    public int maximumLength(String s) {
        // 先找出最大的连续字符串长度
        int curMax = 0;
        int prvMax = 0;
        char prvChar = s.charAt(0);
        Map<Integer, List<Character>> charShowMap = new HashMap<>();

        // 算长度和最大次数
        for (int i = 0; i < s.length(); ++i) {
            char curChar = s.charAt(i);
            if (curChar == prvChar) {
                curMax++;
            } else {
                List<Character> list = charShowMap.getOrDefault(curMax, new ArrayList<>());
                list.add(prvChar);
                charShowMap.put(curMax, list);
                curMax = 1;
            }
            prvMax = Math.max(prvMax, curMax);
            prvChar = curChar;
        }

        List<Character> list = charShowMap.getOrDefault(curMax, new ArrayList<>());
        list.add(prvChar);
        charShowMap.put(curMax, list);

        List<Character> maxMap = charShowMap.getOrDefault(prvMax, Collections.emptyList());
        List<Character> secMaxMap = charShowMap.getOrDefault(prvMax - 1, Collections.emptyList());

        Map<Character, Long> map1 = maxMap.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        if (map1.values().stream().anyMatch(count -> count >= 3)) {
            return prvMax;
        }

        if (map1.entrySet().stream().anyMatch(e -> e.getValue() > 1)) {
            return prvMax - 1 > 0 ? prvMax - 1 : -1;
        }

        Map<Character, Long> map2 = secMaxMap.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        if (map2.values().stream().anyMatch(count -> count >= 3)) {
            return prvMax - 1;
        }
        if (map2.entrySet().stream().filter(e -> e.getValue() >= 1).anyMatch(e -> map1.containsKey(e.getKey()))) {
            return prvMax - 1;
        }

        return prvMax - 2 > 0 ? prvMax - 2 : -1;
    }
}
