class Solution {
    public boolean isopen(char i){
        return ((i == '(' )|| (i == '[') || (i=='{'));
    }
    public boolean isclose(char i){
        return ((i == ')' )|| (i == ']') || (i=='}'));
    }
    public boolean sametype(char a,char b){
        if(b == '('){
            return a ==')';
        }
        else if(b == '{'){
            return a == '}';
        }
        else{
            return a == ']';
        }
    }
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(isopen(s.charAt(i))){
                st.push(s.charAt(i));
                continue;
            }
            else if(st.isEmpty() && isclose(s.charAt(i))){
                return false;
            }
            else if(isclose(s.charAt(i)) && sametype(s.charAt(i),st.peek()) ){
                st.pop();
                continue;
            }
            else{
                return false;
            }
        }
        return st.isEmpty();
    }
}