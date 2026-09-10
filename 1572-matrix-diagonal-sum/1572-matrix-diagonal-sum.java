class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int sum=0;
        //int row=0;
        //int col=n-1;
        for(int i=0;i<n;i++){
            sum+=mat[i][i];
            //sd
            if(i!=n-i-1){
            sum+=mat[i][n-1-i];
        }
        }
        return sum;
    }
}