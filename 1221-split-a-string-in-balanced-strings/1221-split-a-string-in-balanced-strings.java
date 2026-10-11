class Solution {
    public int balancedStringSplit(String s) {
        int n=s.length();
        if(n<=1){
            return 0;
        }
        int ans=0;
        int l=0;
        int r=0;
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='L'){
             l++;
           }
           else if(s.charAt(i)=='R'){
            r++;
           }
           if(l==r){
            ans++;
           }
        }
        return ans;
    }
}