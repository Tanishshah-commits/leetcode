class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int flag = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target){
                list.add(i);
                flag = 1;
            }
            if(nums[i] != target && flag == 1){
                break;
            }
        }
        
        return list;
    }
}