class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if((!st.isEmpty()) &&(s.charAt(i) == '#')){
                st.pop();
                continue;
            }
            if(s.charAt(i) != '#'){
                st.push(s.charAt(i));
            }   
        }
        for(int i = 0;i<t.length();i++){
            if((!st1.isEmpty()) &&( t.charAt(i) == '#')){
                st1.pop();
                continue;
            }
            if(t.charAt(i) != '#'){
                st1.push(t.charAt(i));
            }
        }

        if(st.size() != st1.size()){
            return false;
        }
        while((!st.isEmpty()) && (!st1.isEmpty())){
            if(st.pop() != st1.pop()){
                return false;
            }
        }
        return true;
    }
}