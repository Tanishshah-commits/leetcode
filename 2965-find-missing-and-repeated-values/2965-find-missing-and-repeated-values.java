class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        HashSet <Integer> set = new HashSet<>();
        int n = grid.length * grid.length;
        int sum = n*(n+1)/2;
        int sumgrid = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid.length;j++){
                sumgrid+= grid[i][j];
                if(set.contains(grid[i][j])){
                    ans[0] = grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }
        ans[1] = sum -( sumgrid - ans[0]);
        
        return ans;
        
    }
}