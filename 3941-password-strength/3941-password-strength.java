class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> set = new HashSet<>();
        int points = 0;
        for(int i = 0;i<password.length();i++){
            set.add(password.charAt(i));
        }
        for(char x:set){
            int a = (int)x;
            if(a>=97 && a<=122){
                points += 1;
            }
            else if(a>=65 && a<=90){
                points += 2;
            }
            else if(a>=48 && a<=57){
                points += 3;
            }
            else{
                points += 5;
            }
        }
        return points;
    }
}