public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        System.out.println("Number of islands: " + numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        
        int numIslands = 0;
        int rows = grid.length, cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {  // Found an island
                    numIslands++;
                    dfs(grid, i, j);  // Sink the connected island using DFS
                }
            }
        }

        return numIslands;
    }

    private static void dfs(char[][] grid, int i, int j) {
        int rows = grid.length, cols = grid[0].length;

        // Boundary and water checks
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == '0') {
            return;
        }

        // Mark the current cell as visited by setting it to '0'
        grid[i][j] = '0';

        // Visit all 4 neighboring cells (up, down, left, right)
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}
