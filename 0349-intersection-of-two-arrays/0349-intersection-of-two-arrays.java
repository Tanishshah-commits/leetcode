class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set = new HashSet<>();
        HashSet<Integer>ans = new HashSet<>();

        for(int i : nums1){
            set.add(i);
        }
        for(int i:nums2){
            if(set.contains(i)){
                ans.add(i);
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}