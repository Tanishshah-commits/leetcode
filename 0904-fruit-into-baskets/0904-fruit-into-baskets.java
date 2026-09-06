class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans= 0;
        int j = 0;
        for(int i = 0;i<fruits.length;i++){
            if(map.containsKey(fruits[i])){
                map.put(fruits[i],map.get(fruits[i]) + 1);

            }
            else{
                map.put(fruits[i] ,1);
            }
            while(map.size()>2){
                map.put(fruits[j] , map.get(fruits[j]) - 1);
                if(map.get(fruits[j]) == 0){
                    map.remove(fruits[j]);
                }
                j++;
            }

        }
        for(Integer value:map.values()){
            ans+=value;
        }
        return ans;
        
    }
}