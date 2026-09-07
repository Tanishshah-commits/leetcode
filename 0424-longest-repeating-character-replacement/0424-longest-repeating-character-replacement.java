class Solution {
    public int max(int arr[]){
        int m = -1;
        for(int i = 0;i<arr.length;i++){
            m = Math.max(arr[i],m);
        }
        return m;
    }
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int j = 0;
        int res = 0;
        for(int i = 0;i<s.length();i++){
            arr[s.charAt(i) - 'A']++;
            int len = i-j+1;
            int diff = len - max(arr);
            while(diff>k){
                arr[s.charAt(j) - 'A']--;
                j++;
                len = i-j+1;
                diff = len - max(arr);
            }
            len = i-j+1;
            res = Math.max(res,len);
        }
        return res;
    }
}