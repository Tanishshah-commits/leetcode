class Solution {
    public int minimumPushes(String word) {
        int n = 0;
        if(word.length() <= 8){
            return word.length();
        }
        else if(word.length() > 8 && word.length() < 16){
            n = word.length() % 8;
            return( 8 +( 2*n));
        }
        else if(word.length() >= 16 && word.length() < 24){
            n = word.length() % 8;
            return(24 + (3*n));
        }
            n = word.length() % 8;
            return (48 +( 4*n));
 
    }
}