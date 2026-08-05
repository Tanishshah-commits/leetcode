class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sa = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0;i<s.length();i++){
            sa[s.charAt(i) - 'a']++; 
        }
        for(int i = 0;i<s.length();i++){
            sa[t.charAt(i) - 'a']--; 
        }
        for(int i = 0;i<26;i++){
            if(sa[i] != 0){
                return false;
            }
        }
        return true;
    }
}