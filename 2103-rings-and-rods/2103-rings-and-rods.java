class Solution {
    public int countPoints(String rings) {
        HashMap<Character,HashSet<Character>> map = new HashMap<>();
        int ans = 0;
        for(int i = 0;i<rings.length() - 1;i+=2){
            if(map.containsKey(rings.charAt(i+1))){
                map.get(rings.charAt(i+1)).add(rings.charAt(i));
            }
            else{
                HashSet<Character> set = new HashSet<>();
                set.add(rings.charAt(i));
                map.put(rings.charAt(i+1),set);
            }
        }
        for(HashSet<Character> set : map.values()) {
            if (set.size() == 3){
                ans++;
            }
        }
        return ans;
    }
}