class Solution {
    public Boolean right(int[] arr1, int[]arr2){
        for(int i = 0;i<256;i++){
            if(arr1[i] < arr2[i]){
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        if(t.length() == 0){
            return "";
        }
        int[] have = new int[256];
        int[] needed = new int[256];
        int j = 0;
        int start = 0;
        int res = Integer.MAX_VALUE;
        for(int i = 0;i<t.length();i++){
            needed[t.charAt(i)]++;
        }
        for(int i = 0;i<s.length();i++){
            have[s.charAt(i)]++;
            while(right(have,needed)){
                int len = i-j+1;
                if(res>len){
                    res = len;
                    start = j;
                }
                have[s.charAt(j)]--;
                j++;
            }
        }
        if(res == Integer.MAX_VALUE){
            return "";
        }

        return s.substring(start,res+start);
    }
}