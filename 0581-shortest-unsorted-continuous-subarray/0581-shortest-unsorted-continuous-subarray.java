class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int start = -1;
        int end = -1;
        for(int i =  0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                start = i;
                break;
            }
        }
        if(start == -1){
            return 0;
        }
        for(int i = nums.length-1;i>=0;i--){
            if(nums[i]<nums[i-1]){
                end = i;
                break;
            }
        }
        int min = nums[start];
        int max = nums[start];
        for(int i = start;i<=end;i++){
            min = Math.min(nums[i],min);
            max = Math.max(nums[i],max);
        }
        for(int i = start - 1;i>=0;i--){
            if(min < nums[i]){
                start = i;
            }
        }
        for(int i = end+1;i<nums.length;i++){
            if(max > nums[i]){
                end = i;
            }
        }
        return end-start+1;
    }
}