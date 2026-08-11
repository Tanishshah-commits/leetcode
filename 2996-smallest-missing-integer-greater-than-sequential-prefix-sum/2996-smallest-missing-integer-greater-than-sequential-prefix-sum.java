import java.util.HashSet;

class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        int j = 0;

        while (j + 1 < nums.length && nums[j + 1] == nums[j] + 1) {
            j++;
            sum += nums[j];
        }

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        while (set.contains(sum)) {
            sum++;
        }

        return sum;
    }
}