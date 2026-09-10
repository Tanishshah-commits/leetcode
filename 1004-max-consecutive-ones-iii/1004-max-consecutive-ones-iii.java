class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = k;
        int res = -1;
        int len = -1;
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                l--;
            }
            while(l < 0){
                if(nums[j] == 0){
                    l++;
                }
                j++;
                
            }
            len = i - j + 1;
            res = Math.max(len,res);
        }
        return res;
    }
}