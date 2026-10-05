class Solution {
    public int maximumFrequency(HashMap<Integer,Integer> m){
        int key = -1;
        int mf = -1;
        for(Map.Entry<Integer,Integer> entry :m.entrySet()){
            if(entry.getValue() > mf){
                mf = entry.getValue();
                key = entry.getKey();
            }  
        }
        return key;
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] a = new int[k];
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int i = 0;i<k;i++){
            a[i] = maximumFrequency(map);
            map.remove(a[i]);
        }
        return a;
    }
}