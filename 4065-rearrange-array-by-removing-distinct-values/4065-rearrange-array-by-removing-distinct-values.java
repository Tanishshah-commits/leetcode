class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        while(!map.isEmpty()){

            for(int j = 0; j < list.size(); j++){

                int key = list.get(j);

                ans[i++] = key;

                int freq = map.get(key) - 1;

                if(freq == 0){
                    map.remove(key);
                    list.remove(j);
                    j--;
                }
                else{
                    map.put(key, freq);
                }
            }
        }
        return ans;
    }
}