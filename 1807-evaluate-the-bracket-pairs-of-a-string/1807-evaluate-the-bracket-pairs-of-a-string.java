class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder sb = new StringBuilder(s);
        int st = 0;
        HashMap<String,String> map = new HashMap<>();
        for(int i = 0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        for(int i = 0;i<sb.length();i++){
            if(sb.charAt(i) == '(' ){
                st = i;
            }
            else if(sb.charAt(i) == ')'){
                String key = sb.substring(st+1,i);
                String nns = map.getOrDefault(key,"?");
                sb.replace(st,i+1,nns);
                i = st - 1;
            }
        }
        return sb.toString();

    }
}