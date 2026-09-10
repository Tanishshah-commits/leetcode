class Solution {
    public boolean equal(int[] arr,int[] ans){
        for(int i = 0;i<26;i++){
            if(arr[i] != ans[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) { 
        if(s1.length()>s2.length()){
            return false;
        }
        int[] arr = new int[26];
        for(int i = 0;i<s1.length();i++){
            arr[s1.charAt(i) - 'a']++;
        }
        for(int i = 0;i<=s2.length() - s1.length();i++){
            int[] ans = new int[26];
            for(int k = i;k<s1.length()+ i ;k++){
                ans[s2.charAt(k) - 'a']++;

            }
            if(equal(arr,ans)){
                return true;
            }
                       
        }       
        return false;
    }       
}       