class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans =0;
        int p = 1;
        int j = 0;
        if(k <= 1){
            return 0;
        }
        for(int i = 0;i<nums.length;i++){
            p = p * nums[i];
            while(p>=k){
                p = p/nums[j];
                j++;
            }
            ans += i - j + 1;
        }
        return ans;
    }
}