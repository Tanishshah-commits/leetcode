class Solution {
    public int findComplement(int num) {
        int mask = Integer.highestOneBit(num) * 2 - 1;
        int ans = mask - num;
        return ans;
    }
}