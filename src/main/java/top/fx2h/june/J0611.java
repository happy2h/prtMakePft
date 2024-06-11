package top.fx2h.june;

public class J0611 {
    private int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    public int countBattleships(char[][] board) {
        // dfs
        int res = 0;
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (board[i][j] == '.' || visited[i][j]) continue;
                res++;
                help(board, i, j, visited);
            }
        }
        return res;
    }

    private void help(char[][] board, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return;
        if (board[i][j] == '.' || visited[i][j]) return;
        visited[i][j] = true;
        for (int[] dir : dirs) {
            int x = dir[0];
            int y = dir[1];
            help(board, i + x, j + y, visited);
        }
    }
}
