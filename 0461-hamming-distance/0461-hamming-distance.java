class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        int a=x^y;
        while(a>0){
            if((a&1)!=0){
                count++;
            }
            a=a>>1;
        }
        return count;
    }
}