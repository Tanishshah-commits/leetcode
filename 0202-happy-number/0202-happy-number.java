class Solution {
    public boolean isHappy(int n) {
        while(n>0){
            int a = n;
            int sum = 0;
            while(a>0){
                int l = a%10;
                sum += l*l;
                a = a/10;
            }
            if(sum == 1){
                return true;
            }
            else if(sum == 4 ||sum == 16||sum == 37||sum == 58||sum == 89||sum == 145||sum == 42||sum == 20 ){
                return false;
            }
            else{
                n = sum;
            }
        }
        return true;
    }
}