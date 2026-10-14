class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > num * 9) {
            return "";
        } 
        int[] arr = new int[num];
        StringBuilder sb = new StringBuilder();
        int a = sum/9;
        int m = 0; 
        while(a>0 && m<num){
            arr[m] = 9;
            sum = sum - 9;
            a--;
            m++;  
        }
        if(sum>0 && num>m){
            arr[m] = sum;
            m++;
        }
        for(int x:arr){
            sb.append(x);
        }
        return sb.toString();
    }
}