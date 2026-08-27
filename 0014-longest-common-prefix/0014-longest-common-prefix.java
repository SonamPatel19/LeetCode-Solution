class Solution {
    public String longestCommonPrefix(String[] strs) {
            int n=strs.length;
            if(n==0){
                return "";
            }
            String ans=strs[0];
            for(int i=1;i<n;i++){
                while(!strs[i].startsWith(ans)){
                    ans=ans.substring(0,ans.length()-1);
                    if(ans.length()==0){
                        return "";
                    }
                }
            }
            return ans;
    }
}