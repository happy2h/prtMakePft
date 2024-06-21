package top.fx2h.june;

import java.util.*;

public class J0619 {
    public int maxIncreasingCells(int[][] mat) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];

        for (int i = 0; i < mat.length; ++i) {
            for (int j = 0; j < mat[0].length; ++j) {
                map.putIfAbsent(mat[i][j], new ArrayList<>());
                map.get(mat[i][j]).add(new int[]{i, j});
            }
        }

        List<Integer> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);

        for (int key : keyList) {
            List<int[]> pos = map.get(key);
            List<Integer> res = new ArrayList<>(pos.size());
            for (int[] arr : pos) {
                res.add(Math.max(row[arr[0]], col[arr[1]]) + 1);
            }
            for (int i = 0; i < pos.size(); ++i) {
                int[] arr = pos.get(i);
                int d = res.get(i);
                row[arr[0]] = Math.max(d, row[arr[0]]);
                col[arr[1]] = Math.max(d, col[arr[1]]);
            }
        }
        return Arrays.stream(row).max().getAsInt();
    }

}
