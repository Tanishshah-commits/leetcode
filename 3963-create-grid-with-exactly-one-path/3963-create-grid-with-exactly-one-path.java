class Solution {
    public String[] createGrid(int m, int n) {
        String[][] ans = new String[m][n];
        String[] a = new String[m];
        int l = 0;
        int i = 0;
        int j = 0;
        while(i<m-1){
            ans[i][j] = ".";
            i++;
        }
        while(j<n-1){
            ans[i][j] = ".";
            j++;
        }
        ans[i][j] = ".";
        for(int g = 0;g<m;g++){
            String s = "";
            for(int h = 0;h<n;h++){
                if(ans[g][h] == null){
                    s+="#";
                }
                else{
                    s+=".";
                }
            }
            a[l] = s;
            l++;
        }
        return a;
    }
}