class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        while(i<=j){
            while(i<=j && nums[j] == val){
                j--;
            }
            if(i<= j && nums[i] == val ){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                j--;
            }
            i++;
        }
        return j+1;
    }
}