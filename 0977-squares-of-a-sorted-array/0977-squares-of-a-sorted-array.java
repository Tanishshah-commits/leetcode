class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] a = new int[n];
        int m = 0;
        int[] b = new int[n];
        int l = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] >= 0){
                a[m] = nums[i];
                m++;
            }
            else{
                b[l] = nums[i];
                l++;
            }
        }
        if(l == 0){
            for(int i = 0;i<n;i++){
                nums[i] = nums[i] * nums[i];
            }
            return nums;
        }
        else if(m == 0){
            for(int f = 0;f<n;f++){
                nums[f] = nums[f] * nums[f];
            }
            int p = 0;
            int q = n -1;
            while(p<q){
                int temp = nums[p];
                nums[p] = nums[q];
                nums[q]  = temp;
                p++;
                q--;
            }
            return nums;
        }
        else{
            int p = 0;
            int q = 0;
            int f = 0;
            int x = 0;
            int y = l -1;
            for(int h = 0;h<m;h++){
                a[h] = a[h] * a[h];
            }
            for(int h = 0;h<l;h++){
                b[h] *= b[h];
            }
            while(x<y){
                int temp = b[x];
                b[x] = b[y];
                b[y] = temp;
                x++;
                y--;
            }
            while(p<m && q<l){
                if(a[p] < b[q]){
                    nums[f] = a[p];
                    p++;
                }
                else{
                    nums[f] = b[q];
                    q++;
                }
                f++;
            }
            while(p<m){
                nums[f] = a[p];
                p++;
                f++;
            }
            while(q<l){
                nums[f] = b[q];
                q++;
                f++;
            }
        }
        return nums;
    }
}