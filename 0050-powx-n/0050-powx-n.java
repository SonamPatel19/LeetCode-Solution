class Solution {
    static double fastPower(double x,int n){
        if(n==1) return x;
        if(n==0) return 1;
         double smaller=fastPower(x,n/2);

         if(n%2==0)
         return smaller*smaller;
         else
         return smaller*smaller*x;
    }
    public double myPow(double x, int n) {
        if(n>=0){
            return fastPower(x,n);
        }
        else//n<0
        return 1/fastPower(x,n);
    }
}