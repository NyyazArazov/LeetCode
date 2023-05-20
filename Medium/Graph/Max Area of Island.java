class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length == 0){
            return 0;
        }
        int maxArea = 0;
        int area = 0;
        for(int i = 0 ; i<grid.length;i++){
            for(int j = 0; j<grid[i].length;j++){
                if(grid[i][j] == 1){
                maxArea = Math.max(maxArea, dfs(grid,i,j));
                }
            }
        }
        return maxArea;
    }

    public int dfs(int[][] grid, int i , int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j] == 0 ) return 0;

        
        int area = 1;
        grid[i][j] = 0;
        area += dfs(grid, i+1,j)+dfs(grid, i-1,j)+dfs(grid, i , j+1)+dfs(grid, i , j-1);
        return area;
    }


}
