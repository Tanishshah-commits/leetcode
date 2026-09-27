class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int a = 0;
        for(int i = 0;i<4;i++){
            int l1 = num1 % 10;
            int l2 = num2 % 10;
            int l3 = num3 % 10;
            int min = Math.min(l1,Math.min(l2,l3));
            a += min * (int)Math.pow(10,i);
            num1 = num1/10;
            num2 = num2/10;
            num3 = num3/10;
        }
        return a;

    }
}