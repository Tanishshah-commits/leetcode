class Solution {
    public boolean check(boolean[][] a, int x, int y) {
        if (x >= a.length || y >= a[0].length || x < 0 || y < 0) {
            return false;
        }

        if (a[x][y]) {
            return false;
        }
        a[x][y] = true;
        return true;
    }
    public int[] lastVisitedCell(char[][] grid) {
        int i = 0;
        int j = 0;
        boolean[][] a = new boolean[grid.length][grid[0].length];
        a[0][0] = true;
        while(i<grid.length && j<grid[0].length){
            if(grid[i][j] == 'R'){
                if(check(a,i,j+1) == false){
                    return new int[]{i,j};
                }
                j++;
            }
            else if(grid[i][j] == 'D'){
                if(check(a,i+1,j) == false){
                    return new int[]{i,j};
                }
                i++;
            }
            else if(grid[i][j] == 'U'){
                if(check(a,i-1,j) == false){
                    return new int[]{i,j};
                }
                i--;
            }
            else{
                if(check(a,i,j-1) == false){
                    return new int[]{i,j};
                }
                j--;
            }
            
        }
        return new int[]{i,j};
    }
}