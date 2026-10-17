class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] arr = new int[2];
        int sum = 0;
        int line = 1;
        for(int i = 0;i<s.length();i++){
                int ch = (int) s.charAt(i);
                sum += widths[ch - 97];
            if(sum>100){
                line++;
                sum = widths[ch - 97];
            }
        }
        arr[0] = line;
        arr[1] = sum;
        return arr;
    }
}