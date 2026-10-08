class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>s1=new Stack<>();
        String str1="";
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
            str1=s1.pop()+str1;
        }
        return str1;
    }
}