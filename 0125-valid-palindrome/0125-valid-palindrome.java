  class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]","");
       int n=s.length();
        char[] ch=s.toCharArray();
        int i=0;
        int j=n-1;
        while(i<j){
            if(ch[i]!=ch[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
      
}