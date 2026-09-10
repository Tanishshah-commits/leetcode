class Solution {
    public boolean equal(int[] arr , int[] arr2){
        for(int i = 0;i<26;i++){
            if(arr[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[26];
        for(int i = 0;i<p.length();i++){
            arr[p.charAt(i) - 'a']++;
        }
        int winSize = p.length();
        for(int i = 0;i<=s.length() - p.length();i++){
            int k = i;
            int[] ans = new int[26];
            while(k<winSize+i){
                ans[s.charAt(k) - 'a']++;
                k++;
            }
            if(equal(arr,ans)){
                list.add(i);
            }
        }
        return list;
    }
}