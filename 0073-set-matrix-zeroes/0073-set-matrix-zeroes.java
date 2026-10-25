class Solution {
    public void put(int[][] m,int a,int b){
        int j = 0;
        int i = 0;
        while(i<m[0].length){
            m[a][i] = 0;
            i++;
        }
        while(j<m.length){
            m[j][b] = 0;
            j++;
        }
    }
    public void setZeroes(int[][] matrix) {
        int[] r = new int[matrix.length];
        int[] c = new int[matrix[0].length];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    r[i] = -1;
                    c[j] = -1;
                }
            }
        }
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(r[i] == -1 || c[j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }

        // int[] a = new int[2*(matrix.length * matrix[0].length)];
        // int k = 0;
        // for(int i = 0;i<matrix.length;i++){                                                                                            
        //     for(int j = 0;j<matrix[0].length;j++){
        //         if(matrix[i][j] == 0){
        //             a[k] = i;
        //             a[k+1] = j;
        //             k+=2;
        //         }
        //     }
        // }
        // for(int i = 0;i<k;i+=2){
        //     put(matrix,a[i],a[i+1]);
        // }
    }
}