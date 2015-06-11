public class Solution {
    public int numIslands(char[][] grid) {
         if(grid == null || grid.length ==0 || grid[0].length == 0)
	        return 0;
	        int result = 0;
	        int row = grid.length;
	        int col = grid[0].length;
	       
	        boolean[][] flagMatrix = new boolean[row][col];
	        for(int i = 0; i < row; i++)
	        	for(int j = 0; j < col; j ++){
	        		if(grid[i][j] =='1' && !flagMatrix[i][j]){
	        			result++;
	        			explore(grid,flagMatrix,i,j);
	        		}
	        	}
	        return result;
	 }
	 private void explore(char[][] grid, boolean[][] flagMatrix,int i,int j){
		 flagMatrix[i][j] = true;
		 //ио
		 if(0<= i-1 && grid[i-1][j] =='1' && !flagMatrix[i-1][j])
			 explore(grid,flagMatrix,i-1,j);
		 //об
		 if( i+1 < grid.length && grid[i+1][j] =='1' && !flagMatrix[i+1][j])
			 explore(grid,flagMatrix,i+1,j);
		 //вС
		 if(0<= j-1 && grid[i][j-1] =='1' && !flagMatrix[i][j-1])
			 explore(grid,flagMatrix,i,j-1);
		 //ср
		 if(j+1 < grid[0].length && grid[i][j+1] =='1' && !flagMatrix[i][j+1])
			 explore(grid,flagMatrix,i,j+1);
	 }
}