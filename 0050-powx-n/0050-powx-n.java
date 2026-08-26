class Solution {
    public double myPow(double x, int n) {
        if(x==1) return 1;
        if(n==0) return 1;
        if(x==0) return 0;
        if(x==-1 && n%2==0) return 1;
        if(x==-1 && n%2!=0) return -1;

        long bin = n;
        double ans = 1;
        if(n<0){
            x = 1/x;
            bin = -bin;
        }
        while(bin>0){
            if((bin & 1) == 1){
                ans = ans*x;
            }
            x = x*x;
            bin = bin >> 1;
        }
        return ans;

    }
}