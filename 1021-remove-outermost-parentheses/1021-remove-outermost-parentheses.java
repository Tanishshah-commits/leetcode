class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int c = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                if(c != 0){
                    sb.append(s.charAt(i));
                }
                c++;
            }
            else if(s.charAt(i) == ')' && c != 0){
                c--;
                if(c != 0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}