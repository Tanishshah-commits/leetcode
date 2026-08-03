class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                char c = Character.toLowerCase(ch);
                str.append(c);
                sb.append(c);
            }
        }
        int i = 0;
        int j = str.length() - 1;
        while(i<j){
            char temp = str.charAt(i);
            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, temp);
            i++;
            j--;
        }
       return str.toString().equals(sb.toString());
        

    }
}