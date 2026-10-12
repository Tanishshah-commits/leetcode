class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        ArrayList <Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i =2;i<=n;i++){
            int flag = 0;
            for(int j = 2;j*j <= i;j++){
                if(i%j == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                sum += i;
                if(sum>s){
                    break;
                }
                list.add(i);
            }
        }
        return list;
    }
}