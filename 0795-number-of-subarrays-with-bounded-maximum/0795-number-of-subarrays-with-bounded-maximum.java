class Solution {

    public boolean inrange(int x, int a, int b) {
        return x >= a && x <= b;
    }

    public int numSubarrayBoundedMax(int[] nums, int left, int right) {

        int ans = 0;
        int prev = 0;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > right) {
                prev = 0;
                j = i + 1;
            }
            else if (inrange(nums[i], left, right)) {
                prev = i - j + 1;
            }
            ans += prev;
        }

        return ans;
    }
}