class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        StringBuilder ans=new StringBuilder();
        int i=n-1;
        while(i>=0){
            int digit=num.charAt(i)-'0';
            if(digit%2!=0){
                return num.substring(0,i+1);
            }
            i--;
        }
        return ans.toString();
    }
}