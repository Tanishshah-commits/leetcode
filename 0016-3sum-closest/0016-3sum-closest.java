class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int sum2 = 0;
        for(int i = 0;i<n-2;i++){
            int j = i+1;
            int k = nums.length - 1;
            while(j<k){
                sum = nums[i] + nums[j] + nums[k];
                int diff =  Math.abs(sum - target);
                    if(min > diff){
                        min  = diff;
                        sum2 = sum;
                    }
                if(sum == target){
                    return sum;
                }
                else if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return sum2;
    }
}