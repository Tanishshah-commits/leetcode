class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double avg= 0;
        double ans= Integer.MIN_VALUE;
        int j = 0;
        for(int i = 0;i<k;i++){
            sum +=nums[i]; 
        }
        avg = sum/k;
        for(int i = k;i<nums.length;i++){
            sum -= nums[j];
            sum += nums[i];
            ans = Math.max(ans,avg);
            avg = sum/k;
            j++;

        }
        return Math.max(ans,avg);
    }
}