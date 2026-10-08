class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>s1=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

              if( !s1.isEmpty() && s1.peek()==ch){
                    s1.pop();
                }
            else{
                s1.push(ch);
            }
        }
        while(!s1.isEmpty()){
            sb.append(s1.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}