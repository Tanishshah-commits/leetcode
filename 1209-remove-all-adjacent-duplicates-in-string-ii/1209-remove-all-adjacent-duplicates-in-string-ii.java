class Solution {
        class pair { 
        char ch; 
        int count; 
 
        pair(char ch, int count) { 
        this.ch = ch; 
        this.count = count; 
        } 
    }
    public String removeDuplicates(String s, int k) {
        Stack<pair> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i =0 ;i<s.length();i++){
            if(st.isEmpty()){
                st.push(new pair(s.charAt(i),1));
                continue;
            }
            if(st.peek().ch != s.charAt(i)){
                st.push(new pair(s.charAt(i) , 1));
                continue;
            }
            if(st.peek().ch == s.charAt(i)){
                st.peek().count++;
            }
            if(st.peek().count == k){
                st.pop();
            }
        }
        while(!st.isEmpty()){
                sb.append(st.peek().ch);
                if(st.peek().count == 1){
                    st.pop();
                }
                else{
                    st.peek().count--;
                }
            } 
        return sb.reverse().toString();
    }
}