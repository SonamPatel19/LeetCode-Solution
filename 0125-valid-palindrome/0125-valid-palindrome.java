  class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
       int n=s.length();
        char[] ch=s.toCharArray();
        String rev="";
        String str="";
        for(int j=n-1;j>=0;j--){
            if(Character.isLetterOrDigit(ch[j])){
           rev=rev+ch[j];
        }
        }
       for(int i=0;i<n;i++){
            if(Character.isLetterOrDigit(ch[i])){
          str=str+ch[i];
        }
        }
        return str.equals(rev);
    }
      
}