class Solution {
    public int climbStairs(int n) {
        if( n<=3)   return n;
        int cur =0, r1=1,r2=2;
        for( int i=3;i<=n;i++){
            cur = r1+r2;
            r1=r2;
            r2=cur;
        }
        return cur;
    }
}